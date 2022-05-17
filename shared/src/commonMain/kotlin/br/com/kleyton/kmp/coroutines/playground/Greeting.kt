package br.com.kleyton.kmp.coroutines.playground

class Greeting {
    fun greeting(): String {
        return "Hello, ${Platform().platform}!"
    }
}