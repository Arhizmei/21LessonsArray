package com.zmei.a21lessonsarray

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.zmei.a21lessonsarray.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var bind : ActivityMainBinding
    var invest = arrayOf(1233, 4444, 2222, 5555, 90000, 550)
    var earn = arrayOf(1200, 33, 234,44,22222,4444)

    override fun onCreate(savedInstanceState: Bundle?) {
        bind = ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(bind.root)

        val names = resources.getStringArray(R.array.names)
    }
}