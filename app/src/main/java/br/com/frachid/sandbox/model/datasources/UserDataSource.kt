package br.com.frachid.sandbox.model.datasources

import br.com.frachid.sandbox.model.models.User
import io.realm.Realm

class UserDataSource {

    fun saveUser(name: String, email: String) {
        val realm = Realm.getDefaultInstance()
        val tsLong = System.currentTimeMillis() / 1000
        val ts = tsLong.toString()
        realm.executeTransaction {
            it.insertOrUpdate(User().apply {
                id = ts
                this.name = name
                this.email = email
            }
            )
        }
    }

}