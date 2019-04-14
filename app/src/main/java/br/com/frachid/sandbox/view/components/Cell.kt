package br.com.frachid.sandbox.view.components

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.widget.LinearLayout
import br.com.frachid.sandbox.R
import kotlinx.android.synthetic.main.component_cell.view.*

class Cell @JvmOverloads constructor(context: Context, attrs: AttributeSet? = null, defStyleAttr: Int = 0 ): LinearLayout(context, attrs, defStyleAttr) {

    init {
        LayoutInflater.from(context).inflate(R.layout.component_cell, this, true)
        context.theme.obtainStyledAttributes(
                attrs,
                R.styleable.Cell,
                0, 0).apply {

            try {
                cellTopText.text = getString(R.styleable.Cell_topText)
                cellBottomText.text = getString(R.styleable.Cell_bottomText)
            } finally {
                recycle()
            }
        }
    }

    fun setTopText(text: String){
        cellTopText.text = text
    }

    fun setBottomText(text: String){
        cellBottomText.text = text
    }

}