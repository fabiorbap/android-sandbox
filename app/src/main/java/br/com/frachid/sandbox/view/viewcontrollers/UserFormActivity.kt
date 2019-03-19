package br.com.frachid.sandbox.view.viewcontrollers

import android.os.Bundle
import br.com.frachid.sandbox.R

class UserFormActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_user_form)
        setupToolbar(showBackButton = true, toolbarTitle = getString(R.string.user_forms_title))
        super.onCreate(savedInstanceState)
    }

}