package br.com.frachid.sandbox.view.viewcontrollers

import android.support.v7.app.AppCompatActivity
import android.view.MenuItem

open class BaseActivity : AppCompatActivity() {

    fun setupToolbar(showBackButton: Boolean? = true, toolbarTitle: String = ""){
        supportActionBar?.let {
            with(it) {
                title = toolbarTitle
                setDisplayHomeAsUpEnabled(showBackButton ?: false)
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