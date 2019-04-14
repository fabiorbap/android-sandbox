package br.com.frachid.sandbox

import android.os.Bundle
import br.com.frachid.sandbox.view.viewcontrollers.BaseActivity

class FormsStorybookActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_forms_storybook)
        setupToolbar(true, "Forms")
        super.onCreate(savedInstanceState)
    }

}