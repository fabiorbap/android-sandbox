package br.com.frachid.sandbox.model.models

import io.realm.RealmObject
import io.realm.annotations.Index
import io.realm.annotations.PrimaryKey

class User : RealmObject() {

    @Index
    @PrimaryKey
    var id: String? = ""
    var name: String? = ""
    var email: String = ""

}