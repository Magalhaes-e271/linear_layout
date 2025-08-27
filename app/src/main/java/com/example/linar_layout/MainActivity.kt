package com.example.linar_layout

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        };
        var email = findViewById<EditText>(R.id.EditTextEmail).text;
  var senha = findViewById<EditText>(R.id.EditTextSenha).text
        var bntlogar = findViewById<Button>(R.id.ButtonLogin)
        var bntcadastro = findViewById<Button>(R.id.ButtonCadastro)

        bntlogar.setOnClickListener {
            Toast.makeText(this, email, Toast.LENGTH_LONG).show()
            if ((email.toString()) == ("email@gmail.com") && senha.toString().equals("123")){
                var intent = Intent(this,activity_tela2 :: class.java);
                startActivity(intent);
            } else {
                Toast.makeText(this, "usuario ou senha ivalido", Toast.LENGTH_LONG).show()
            }

        }

    }
}