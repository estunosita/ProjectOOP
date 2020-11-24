package com.example.uts_project

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_calculator.*
import kotlinx.android.synthetic.main.activity_profile.*
import kotlinx.android.synthetic.main.activity_profile.toolbar

class CalculatorActivity : AppCompatActivity() {
    private val hitung=Hitung()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        setSupportActionBar(toolbar)
        supportActionBar?.apply {
            title = "Hasil"

            setDisplayHomeAsUpEnabled(true)
            setDisplayShowHomeEnabled(true)
        }
        val num1 = id_num1.text
        val num2 = id_num2.text

        btn_kali.setOnClickListener {
            val hasil = hitung.kali(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }
        btn_tambah.setOnClickListener{
            val hasil=hitung.tambah(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }

        btn_kurang.setOnClickListener{
            val hasil=hitung.kurang(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }

        btn_bagi.setOnClickListener{
            val hasil=hitung.bagi(num1.toString().toDouble(), num2.toString().toDouble())
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("HASIL", hasil.toString())
            startActivity(intent)
        }

        btn_keluar.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }

    class Hitung {
        var result = 0.0

        fun kali(p: Double, l: Double): Double {
            this.result = p * l
            return p * l
        }
        fun tambah(p: Double, l: Double): Double {
            this.result = p + l
            return p + l
        }
        fun bagi(p: Double, l: Double): Double {
            this.result = p / l
            return p / l
        }
        fun kurang(p: Double, l: Double): Double {
            this.result = p - l
            return p - l
        }
    }
    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }
}


