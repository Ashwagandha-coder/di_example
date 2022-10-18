package com.example.di_example

class SampleWithConstructor {

    private val d: D

    constructor(d: D) {

        this.d = d

    }


}

class D {

    private val e: E

    constructor(e: E) {

        this.e = e

    }



}
class E()