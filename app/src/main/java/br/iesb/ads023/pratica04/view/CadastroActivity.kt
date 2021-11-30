package br.iesb.ads023.pratica04.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import br.iesb.ads023.pratica04.R

class CadastroActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cadastro)
        setTitle("Novo Contato")

        val botao = findViewById<Button>(R.id.btnCancelar)
        val botao2 = findViewById<Button>(R.id.btnSalvar)

        botao.setOnClickListener{
            finish()
        }

        botao2.setOnClickListener{
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
    }
}