package com.example


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Author {

    String name

    static hasMany = [books: Book]

}