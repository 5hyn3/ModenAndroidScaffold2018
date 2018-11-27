package com.examle.modenandroidscaffold2018

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.Navigation


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)
    }

    override fun onBackPressed() {
        val controller = Navigation.findNavController(this, R.id.nav_host_fragment)
        if (!controller.popBackStack())
            finish()
    }
}
