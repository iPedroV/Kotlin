package br.iesb.ads023.pratica04.view

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.ListView
import br.iesb.ads023.pratica04.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

class ListaActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_lista)
        setTitle("@Contatinhos")

        val lista = findViewById<ListView>(R.id.lstContatos)
        val contatos = arrayOf("Contato 5", "Contato 6", "Contato 7")
        val adaptador = ArrayAdapter<String>(this, android.R.layout.simple_expandable_list_item_1, contatos)
        lista.setAdapter(adaptador)

        val botao = findViewById<FloatingActionButton>(R.id.fabAdiciona)


        botao.setOnClickListener{
            val intent = Intent(this, CadastroActivity::class.java)
            startActivity(intent)
            //texto.text = "Clicou!"
            //botao.isEnabled = false
        }
    }
}