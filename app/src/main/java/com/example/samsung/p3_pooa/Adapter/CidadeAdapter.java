package com.example.samsung.p3_pooa.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.samsung.p3_pooa.Activity.CidadeDestaque;
import com.example.samsung.p3_pooa.R;

import java.util.List;

/**
 * Created by Samsung on 11/09/2017.
 */

public class CidadeAdapter extends RecyclerView.Adapter {

    private List<CidadeDestaque> cidadeDestaques;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    public CidadeAdapter(List<CidadeDestaque> cidadeDestaques, Context context, ClickRecyclerViewListener clickRecyclerViewListener) {

        this.cidadeDestaques = cidadeDestaques;
        this.context = context;
        this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_cidade, parent, false);
        LivroViewHolder cidadeViewHolder = new LivroViewHolder(view);
        return cidadeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        CidadeViewHolder holder = (CidadeViewHolder) viewHolder;

        CidadeDestaque cidadeDestaque = cidadeDestaques.get(position) ;

        holder.nomeCidade.setText(cidadeDestaque.getNomeCidade());
        holder.Estado.setText(cidadeDestaque.getEstado());
        holder.latitude.setText(cidadeDestaque.getLatitude());
        holder.longitude.setText(cidadeDestaque.getLongitude());
        Log.i("------XXXXXXXXX--", cidadeDestaque.getNomeCidade());


    }

    @Override
    public int getItemCount() {

        return cidadeDestaques.size();
    }

    private void updateItem(int position) {

    }

    // Método responsável por remover um usuário da lista.
    private void removerItem(int position) {

    }

    public class LivroViewHolder extends RecyclerView.ViewHolder {

        private final TextView nomeLivro;
        private final TextView nomeAutor;
        private final TextView descricao;


        public LivroViewHolder(View itemView) {
            super(itemView);
            nomeCidade = (TextView) itemView.findViewById(R.id.nomeCidade);
            nomeEstado = (TextView) itemView.findViewById(R.id.nomEstado);
            latitude = (TextView) itemView.findViewById(R.id.latitude);
            longitude = (TextView) itemView.findViewById(R.id.longitude);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(cidadeDestaques.get(getLayoutPosition()));

                }
            });


        }
    }
}
