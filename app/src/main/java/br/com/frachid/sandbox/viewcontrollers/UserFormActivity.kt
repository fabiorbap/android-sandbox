package br.com.frachid.sandbox.viewcontrollers

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.MenuItem
import br.com.frachid.sandbox.R

class UserFormActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_user_form)
        setupToolbar()
        super.onCreate(savedInstanceState)
    }

    private fun setupToolbar(){
        supportActionBar?.let {
            with(it) {
                title = getString(R.string.user_forms_title)
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