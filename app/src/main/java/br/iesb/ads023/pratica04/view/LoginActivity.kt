package br.iesb.ads023.pratica04.view

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import br.iesb.ads023.pratica04.R

class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

       //val texto = findViewById<TextView>(R.id.txtEmail)
        val botao = findViewById<Button>(R.id.btnEntrar)


        botao.setOnClickListener{
            val intent = Intent(this, ListaActivity::class.java)
            startActivity(intent)
            //texto.text = "Clicou!"
            //botao.isEnabled = false
        }
    }




}