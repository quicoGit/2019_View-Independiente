package com.plumbaria.e_4_6_viewindependiente

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.drawable.ShapeDrawable
import android.graphics.drawable.shapes.OvalShape
import android.util.AttributeSet
import android.view.View

class MyView(context:Context, attrs:AttributeSet): View(context,attrs) {
    private lateinit var figura:ShapeDrawable
    init {
        figura = ShapeDrawable(OvalShape())
        figura.paint.color = Color.BLUE
    }

    override fun onSizeChanged(w: Int, h: Int, oldw: Int, oldh: Int) {
        super.onSizeChanged(w, h, oldw, oldh)
        figura.setBounds(0,0,w,h)
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        figura.draw(canvas)
    }
}