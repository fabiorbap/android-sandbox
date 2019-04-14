package br.com.frachid.sandbox

import android.os.Bundle
import br.com.frachid.sandbox.view.viewcontrollers.BaseActivity

class CellsStorybookActivity: BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        setContentView(R.layout.activity_cells_storybook)
        setupToolbar(true, "Cells")
        super.onCreate(savedInstanceState)
    }

}