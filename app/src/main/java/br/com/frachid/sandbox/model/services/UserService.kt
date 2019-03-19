package br.com.frachid.sandbox.model.services

import br.com.frachid.sandbox.model.datasources.UserDataSource

class UserService {

    var userDataSource = UserDataSource()

    fun saveUser(name: String, email: String){
        userDataSource.saveUser(name, email)
    }

}