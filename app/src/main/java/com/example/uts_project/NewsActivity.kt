package com.example.uts_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_news.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.toolbar

class NewsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_news)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "News"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        newssatu.setOnClickListener {
            val intent = Intent(this, BeritasatuActivity::class.java)
            startActivity(intent)
        }
        txt_tittlesatu.setOnClickListener {
            val intent = Intent(this, BeritasatuActivity::class.java)
            startActivity(intent)
        }
        newsdua.setOnClickListener {
            val intent = Intent(this, BeritaduaActivity::class.java)
            startActivity(intent)
        }
        txt_tittledua.setOnClickListener {
            val intent = Intent(this, BeritaduaActivity::class.java)
            startActivity(intent)
        }
        newstiga.setOnClickListener {
            val intent = Intent(this, BeritatigaActivity::class.java)
            startActivity(intent)
        }
        txt_tittletiga.setOnClickListener {
            val intent = Intent(this, BeritatigaActivity::class.java)
            startActivity(intent)
        }
    }


    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}

