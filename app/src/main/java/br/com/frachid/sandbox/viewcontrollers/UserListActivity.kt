package br.com.frachid.sandbox.viewcontrollers

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import br.com.frachid.sandbox.R
import kotlinx.android.synthetic.main.activity_user_list.*

class UserListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_user_list)
        setupFAB()
        setupToolbar()
        super.onCreate(savedInstanceState)
    }

    private fun setupFAB() {
        userListAddUser.setOnClickListener {
            startActivity(Intent(this, UserFormActivity::class.java))
        }
    }

    private fun setupToolbar(){
        supportActionBar?.let {
            with(it) {
                title = getString(R.string.user_list_title)
                setDisplayHomeAsUpEnabled(true)
            }
        }
    }

    override fun onOptionsItemSelected(item: MenuItem?): Boolean {
        if (item?.itemId == android.R.id.home){
            onBackPressed()
            return true
        }
        return super.onOptionsItemSelected(item)
    }

}