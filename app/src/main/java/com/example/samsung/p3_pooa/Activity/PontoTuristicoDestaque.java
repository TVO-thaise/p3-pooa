package com.example.samsung.p3_pooa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.EditText;

import com.example.samsung.p3_pooa.R;

/**
 * Created by Samsung on 12/09/2017.
 */

public class PontoTuristicoDestaque extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pontoTuristico_destaque);
        Intent intent = getIntent();
        PontoTuristico  pontoTuristico = (PontoTuristico) intent.getSerializableExtra("pontoTuristico");
        EditText nome = (EditText) findViewById(R.id.et_nome_pontoTuristico);
        EditText estado = (EditText) findViewById(R.id.et_estado_pontoTuristico);
        EditText latitude = (EditText) findViewById(R.id.et_latitude_pontoTuristico);
        EditText longitude = (EditText) findViewById(R.id.et_longitude_pontoTuristico);
        EditText azimute = (EditText) findViewById(R.id.et_azimute_pontoTuristico);


        nome.setText(pontoTuristico.getNomePontoTuristico());
        estado.setText(pontoTuristico.getEstado());
        latitude.setText(pontoTuristico.getLatitude());
        longitude.setText(pontoTuristico.getLongitude());
        azimute.setText(pontoTuristico.getAzimute());

    }



}
