package org.example.project.domain

class Platform(name: String, val age: Int) {
    var name: String = name
        get() = "toto $field"
        set(value) {
            field = "newname $value"
        }
}

fun getPlatform(name: String, age: Int) = Platform(name, age)