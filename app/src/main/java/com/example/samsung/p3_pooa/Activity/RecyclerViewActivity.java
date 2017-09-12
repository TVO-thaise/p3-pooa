package com.example.samsung.p3_pooa.Activity;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.samsung.p3_pooa.Adapter.CidadeAdapter;
import com.example.samsung.p3_pooa.Adapter.ClickRecyclerViewListener;
import com.example.samsung.p3_pooa.R;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Samsung on 11/09/2017.
 */

public class RecyclerViewActivity  extends AppCompatActivity implements ClickRecyclerViewListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view);

        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.rv_Cidade);

        recyclerView.setAdapter(new CidadeAdapter(getCidades(),this,this));
        RecyclerView.LayoutManager layout = new LinearLayoutManager(this,
                LinearLayoutManager.VERTICAL, false);

        recyclerView.setLayoutManager(layout);

    }

    private List<CidadeDestaque> getCidades(){
        List<CidadeDestaque> cidadeDestaques = new ArrayList<CidadeDestaque>();
        int i =0;
        for(i=0;i<=20;i++){
            String iv = String.valueOf(i);
            CidadeDestaque cidades = new CidadeDestaque("CidadeDestaque".concat(iv),"Estado".concat(iv),"Latitude".concat(iv), "Longitude".concat(iv));
            cidadeDestaques.add();
        }
        return cidadeDestaques;

    }

    @Override
    public void onClick(Object object) {
        CidadeDestaque cidadeDestaque = (CidadeDestaque) object;
        Intent intent = new Intent(this, CidadeDestaque.class);
        intent.putExtra("cidadeDestaque", cidadeDestaque);
        startActivity(intent);

    }
}