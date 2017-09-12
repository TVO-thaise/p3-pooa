package com.example.samsung.p3_pooa.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.samsung.p3_pooa.R;

public class Usuario extends  extends AppCompatActivity {

    private String nome, email;
    private char telefone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_usuario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char getTelefone() {
        return telefone;
    }

    public void setTelefone(char telefone) {
        this.telefone = telefone;
    }
}