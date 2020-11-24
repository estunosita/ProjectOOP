package com.example.uts_project

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.uts_project.helper.Constant
import com.example.uts_project.helper.PrefHelper
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(){
    lateinit var prefHelper: PrefHelper

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        prefHelper = PrefHelper(this)
        textUsername.text = prefHelper.getString( Constant.PREF_USERNAME )

        buttonLogout.setOnClickListener {
            prefHelper.clear()
            showMessage( "Keluar" )
            moveIntent()
    }
        button2.setOnClickListener {
            val intent = Intent(this, CalculatorActivity::class.java)
            startActivity(intent)
        }

        btn_news.setOnClickListener {
            val news = Intent(this, NewsActivity::class.java)
            startActivity(news)
        }


        btn_profile.setOnClickListener {
            val about = Intent(this, ProfileActivity::class.java)
            startActivity(about)
        }
    }
    private fun moveIntent(){
        startActivity(Intent(this, LoginActivity::class.java))
        finish()
    }
    private fun showMessage(message: String) {
        Toast.makeText(applicationContext, message, Toast.LENGTH_SHORT).show()
    }
}







