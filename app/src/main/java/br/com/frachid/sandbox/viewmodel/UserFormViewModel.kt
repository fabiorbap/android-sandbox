package br.com.frachid.sandbox.viewmodel

import android.arch.lifecycle.ViewModel
import br.com.frachid.sandbox.model.services.API

class UserFormViewModel : ViewModel() {

    private val userService by lazy { API() }

    fun saveUser(name: String, email: String){
        userService.saveUser(name, email)
    }

}