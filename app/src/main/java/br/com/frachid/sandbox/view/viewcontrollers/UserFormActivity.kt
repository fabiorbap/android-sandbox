package br.com.frachid.sandbox.view.viewcontrollers

import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.design.widget.Snackbar
import br.com.frachid.sandbox.R
import br.com.frachid.sandbox.viewmodel.UserFormViewModel
import kotlinx.android.synthetic.main.activity_user_form.*

class UserFormActivity : BaseActivity() {

    private val viewModel by lazy{  ViewModelProviders.of(this).get(UserFormViewModel::class.java) }

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_user_form)
        setupToolbar(showBackButton = true, toolbarTitle = getString(R.string.user_forms_title))
        super.onCreate(savedInstanceState)
    }

    override fun onStart() {
        onButtonTap()
        super.onStart()
    }

    private fun onButtonTap(){
        addUserButton.setOnClickListener {
            onAddUser()
            clearForms()
            Snackbar.make(rootContainer, getString(R.string.user_added_successfully), Snackbar.LENGTH_SHORT)
                    .show()
        }
    }

    private fun clearForms(){
        userListNameEditText.setText("")
        userListEmailEditText.setText("")
    }

    private fun onAddUser(){
        viewModel.saveUser(name = userListNameEditText.text.toString(), email = userListEmailEditText.text.toString())
    }

}