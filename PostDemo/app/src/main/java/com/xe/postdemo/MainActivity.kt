package com.xe.postdemo

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View

/**
 * Created by 86188 on 2021/8/26.
 */
class MainActivity: AppCompatActivity() {
    companion object {
        var TAG: String = "MainActivity"
    }
    var mView: View? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//        mView = findViewById(R.id.my_view);
        mView = MyView(this)
        mView?.post(Runnable {
             Log.d(TAG,"在 post 方法中获取 View 的宽--" + mView?.getWidth())
        })
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG,"----onResume---")
        Log.d(TAG,"在 onResume 方法中获取 View 的宽--" + mView?.getWidth())
    }
}