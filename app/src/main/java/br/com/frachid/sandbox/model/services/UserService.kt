package br.com.frachid.sandbox.model.services

import br.com.frachid.sandbox.model.datasources.UserDataSource
import br.com.frachid.sandbox.model.models.UserModel

class UserService {

    var userDataSource = UserDataSource()

    fun saveUser(name: String, email: String){
        userDataSource.saveUser(name, email)
    }

    fun getUsers(): List<UserModel>?{
        return userDataSource.getUsers()
    }

}