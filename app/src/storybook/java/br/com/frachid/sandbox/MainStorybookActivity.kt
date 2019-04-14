package br.com.frachid.sandbox

import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import br.com.frachid.sandbox.view.viewcontrollers.BaseActivity
import kotlinx.android.synthetic.storybook.activity_main_storybook.*

class MainStorybookActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_main_storybook)
        setupToolbar(showBackButton = false, toolbarTitle = "MainStorybookActivity")
        setupButtons()
        super.onCreate(savedInstanceState)
    }

    private fun setupButtons(){
        formsButton.setOnClickListener {
            startActivity(Intent(this, FormsStorybookActivity::class.java))
        }
        cellsButton.setOnClickListener {
            startActivity(Intent(this, CellsStorybookActivity::class.java))
        }
    }

}