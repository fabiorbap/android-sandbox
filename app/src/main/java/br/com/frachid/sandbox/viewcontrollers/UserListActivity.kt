package br.com.frachid.sandbox.viewcontrollers

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import br.com.frachid.sandbox.R
import kotlinx.android.synthetic.main.activity_user_list.*

class UserListActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_user_list)
        setupFAB()
        setupToolbar(showBackButton = true, toolbarTitle = getString(R.string.user_list_title))
        super.onCreate(savedInstanceState)
    }

    private fun setupFAB() {
        userListAddUser.setOnClickListener {
            startActivity(Intent(this, UserFormActivity::class.java))
        }
    }

}