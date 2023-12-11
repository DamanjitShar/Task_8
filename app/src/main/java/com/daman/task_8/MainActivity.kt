
package com.daman.task_8

import android.os.Bundle
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun passDataToFragment(view: android.view.View) {
        val name = findViewById<EditText>(R.id.editText).text.toString()
        val fragment = supportFragmentManager.findFragmentById(R.id.fragmentContainer) as MyFragment?
        fragment?.updateData(name)
    }
}
