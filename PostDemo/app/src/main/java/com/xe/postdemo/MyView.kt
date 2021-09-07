package com.xe.postdemo

import android.content.Context
import android.graphics.Canvas
import android.graphics.Color
import android.support.annotation.Nullable
import android.util.AttributeSet
import android.util.Log
import android.view.View

/**
 * Created by 86188 on 2021/8/26.
 */
class MyView: View {

    constructor(context: Context): super(context) {

    }

    constructor(context: Context,@Nullable attrs: AttributeSet): super(context,attrs) {

    }
    constructor(context: Context,@Nullable attrs: AttributeSet,defStyleAttr: Int): super(context,attrs,defStyleAttr) {

    }

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)
        Log.d(MainActivity.TAG,"------onMeasure--")
    }

    override fun onLayout(changed: Boolean, left: Int, top: Int, right: Int, bottom: Int) {
        super.onLayout(changed, left, top, right, bottom)
        Log.d(MainActivity.TAG,"------onLayout--")
    }

    override fun onDraw(canvas: Canvas?) {
        super.onDraw(canvas)
        Log.d(MainActivity.TAG,"------onDraw--")
    }
}