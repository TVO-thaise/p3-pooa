package com.example.samsung.p3_pooa.Activity;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.samsung.p3_pooa.Model.PontoTuristico;
import com.example.samsung.p3_pooa.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button cidadeBT = (Button) findViewById(R.id.bt_cidades);
        Button pontoTuristicoBT = (Button) findViewById(R.id.bt_pt);

        cidadeBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), CidadeDestaque.class);
                startActivity(intent);

            }
        });
        pontoTuristicoBT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), PontoTuristico.class);
                startActivity(intent);

            }
        });
    }



        private Context getContext(){
            return this;
        }
}
