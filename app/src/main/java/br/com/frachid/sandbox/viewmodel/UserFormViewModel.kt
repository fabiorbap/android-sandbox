package br.com.frachid.sandbox.viewmodel

import android.arch.lifecycle.ViewModel
import br.com.frachid.sandbox.model.services.UserService

class UserFormViewModel : ViewModel() {

    private val userService by lazy { UserService() }

    fun saveUser(name: String, email: String){
        userService.saveUser(name, email)
    }

}