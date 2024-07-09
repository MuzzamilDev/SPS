package com.app.sps.base

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //Initialize Views and ViewBinding
        setContentView(initViewBindingAndView())
        //Initialize Variables and Functioanality
        setUpViewsAndFunctions()
        //Listeners
        attachListeners()
    }


    abstract fun initViewBindingAndView(): View

    abstract fun setUpViewsAndFunctions()

    abstract fun attachListeners()

}