package org.senac.mandasms

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val context = this
        btn_explicit.setOnClickListener {
            val intent = Intent(context, MainActivity::class.java)
                startActivity(intent)
                finish()
        }

        btn_implicit.setOnClickListener {
            val intent = Intent(Intent.ACTION_SEND)
                intent.putExtra(Intent.EXTRA_TEXT, "Olá, Seja Bem Vindo ao App")
                intent.type = "text/plain"

            startActivity(intent)
        }
    }
}
