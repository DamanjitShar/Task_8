package com.daman.task_8

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment

class MyFragment : Fragment() {

    private var name: String? = null
    private var number = 0
    private var initView : View ?= null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        initView =  inflater.inflate(R.layout.fragment_my, container, false)
        return initView
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        updateDisplay()
    }

    fun updateData(name: String) {
        this.name = name
        updateDisplay()
    }

    fun incrementNumber(view: View) {
        number++
        updateDisplay()
    }

    fun decrementNumber(view: View) {
        number--
        updateDisplay()
    }

    private fun updateDisplay() {
        val nameTextView = initView?.findViewById(R.id.nameTextView)
        nameTextView.text = "Name: $name"
        val numberTextView = initView?.findViewById(R.id.numberTextView)
        numberTextView.text = "Number: $number"
    }
}
