package br.com.frachid.sandbox.viewmodel

import android.arch.lifecycle.ViewModel
import br.com.frachid.sandbox.model.models.UserModel
import br.com.frachid.sandbox.model.services.API

class UserListViewModel : ViewModel() {

    private val userService by lazy { API() }

    // TODO use live data and make view observe it
    fun getUsers(): List<UserModel>?{
        return userService.getUsers()
    }

}