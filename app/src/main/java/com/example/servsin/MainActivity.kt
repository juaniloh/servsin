package com.example.servsin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    private fun changeFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().replace(androidx.fragment.R.id.fragment_container_view_tag, fragment)
            .commit()
    }
}