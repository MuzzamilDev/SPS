package com.app.sps.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        val root: View = initViewBindingAndView()

        return root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        setUpViewsAndFunctions(view)
        attachListeners()
    }

    abstract fun initViewBindingAndView(): View

    abstract fun setUpViewsAndFunctions(view: View)

    abstract fun attachListeners()
}