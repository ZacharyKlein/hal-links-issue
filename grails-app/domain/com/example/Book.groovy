package com.example


import grails.rest.*

@Resource(readOnly = false, formats = ['json', 'xml'])
class Book {

    String title

    static belongsTo = [author: Author]

}