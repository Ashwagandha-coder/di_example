package com.example.di_example

class SimpleSample {

    private lateinit var b: B

    fun doSome() {
        b = B()

    }

}

class B {

    private lateinit var c: C

    fun doSome() {

        c = C()

    }



}

class C