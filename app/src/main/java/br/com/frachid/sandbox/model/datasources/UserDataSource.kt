package br.com.frachid.sandbox.model.datasources

import br.com.frachid.sandbox.model.models.UserModel
import io.realm.Realm
import io.realm.RealmResults

class UserDataSource {

    fun saveUser(name: String, email: String) {
        val realm = Realm.getDefaultInstance()
        val tsLong = System.currentTimeMillis() / 1000
        val ts = tsLong.toString()
        realm.executeTransaction {
            it.insertOrUpdate(UserModel().apply {
                id = ts
                this.name = name
                this.email = email
            }
            )
        }
    }

    fun getUsers(): List<UserModel>? {
        val realm = Realm.getDefaultInstance()
        var users: RealmResults<UserModel>? = null
        realm.executeTransaction {
            users = it.where(UserModel::class.java).findAll()
        }
        return if (users != null && users?.isValid == true){
            users?.toList()
        } else {
            listOf<UserModel>()
        }
    }

}