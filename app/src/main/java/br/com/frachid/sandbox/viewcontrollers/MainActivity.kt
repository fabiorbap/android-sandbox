package br.com.frachid.sandbox.viewcontrollers

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import br.com.frachid.sandbox.R
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupButtons()
    }

    private fun setupButtons(){
        appButton.setOnClickListener {
            startActivity(Intent(this, UserListActivity::class.java))
        }
        componentsButton.setOnClickListener {
            startActivity(Intent(this, ComponentListActivity::class.java))
        }
    }
}
