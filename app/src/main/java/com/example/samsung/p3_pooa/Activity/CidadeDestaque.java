package com.example.samsung.p3_pooa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.EditText;

import com.example.samsung.p3_pooa.Adapter.CidadeAdapter;
import com.example.samsung.p3_pooa.Model.Cidade;
import com.example.samsung.p3_pooa.R;

import java.util.List;

import io.realm.Realm;

/**
 * Created by Samsung on 11/09/2017.
 */

public class CidadeDestaque extends AppCompatActivity {

    private Realm realm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cidade_destaque);
        Intent intent = getIntent();
        Cidade cidade = (Cidade) intent.getSerializableExtra("cidade");
        EditText nome = (EditText) findViewById(R.id.et_nome_cidade);
        EditText estado = (EditText) findViewById(R.id.et_estado_cidade);
        EditText latitude = (EditText) findViewById(R.id.et_latitude_cidade);
        EditText longitude = (EditText) findViewById(R.id.et_longitude_cidade);


        nome.setText(cidade.getNomeCidade());
        estado.setText(cidade.getEstado());
        latitude.setText(cidade.getLatitude());
        longitude.setText(cidade.getLongitude());

    }
    realm = Realm.getDefaultInstance();

    return (List)realm.where(CidadeDestaque.class).findAll();

    protected void onResume() {
        super.onResume();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Cidade);

        recyclerView.setAdapter(new CidadeAdapter(getCidades(),this,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

    }




}
