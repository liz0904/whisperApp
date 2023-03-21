package com.example.whisperapp.login

import io.realm.RealmObject

open class Person(var id:String="",
                  var pwd:String="",
                  var email:String="")
    : RealmObject() {
}