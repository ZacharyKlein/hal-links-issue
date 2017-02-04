package hal.links

import com.example.Author
import com.example.Book

class BootStrap {

    def init = { servletContext ->

        def author = new Author(name: "Bob").save()

        def book1 = new Book(title: 'abc1', author: author).save()
        def book2 = new Book(title: 'abc2', author: author).save()
        def book3 = new Book(title: 'abc3', author: author).save()
        def book4 = new Book(title: 'abc4', author: author).save()

    }
    def destroy = {
    }
}
