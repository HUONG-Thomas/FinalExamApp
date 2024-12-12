package com.example.finalexamapp

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.graphics.Paint
import android.util.AttributeSet
import android.view.View

class CustomView(context: Context, attrs: AttributeSet) : View(context, attrs) {
    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        canvas?.drawColor(Color.CYAN)
        val paint = Paint()
        paint.color = Color.BLACK
        paint.textSize = 50f
        canvas?.drawText("Vue personnalisée!", 50f, 50f, paint)
    }
}
