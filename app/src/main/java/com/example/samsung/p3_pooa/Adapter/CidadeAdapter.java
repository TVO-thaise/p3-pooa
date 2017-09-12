package com.example.samsung.p3_pooa.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.samsung.p3_pooa.Activity.CidadeDestaque;
import com.example.samsung.p3_pooa.Model.Cidade;
import com.example.samsung.p3_pooa.R;

import java.util.List;

/**
 * Created by Samsung on 11/09/2017.
 */

public class CidadeAdapter extends RecyclerView.Adapter {

    private List<Cidade> cidades;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    public CidadeAdapter(List<Cidade> cidades, Context context, ClickRecyclerViewListener clickRecyclerViewListener) {

        this.cidades = cidades;
        this.context = context;
        this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_cidade, parent, false);
        CidadeViewHolder cidadeViewHolder = new CidadeViewHolder(view);
        return cidadeViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        CidadeViewHolder holder = (CidadeViewHolder) viewHolder;

        Cidade cidade = cidades.get(position) ;

        holder.nomeCidade.setText(cidade.getNomeCidade());
        holder.Estado.setText(cidade.getEstado());
        holder.latitude.setText(cidade.getLatitude());
        holder.longitude.setText(cidade.getLongitude());
        Log.i("------XXXXXXXXX--", cidade.getNomeCidade());


    }

    @Override
    public int getItemCount() {

        return cidades.size();
    }

    private void updateItem(int position) {

    }

    // MÃ©todo responsÃ¡vel por remover um usuÃ¡rio da lista.
    private void removerItem(int position) {

    }

    public class CidadeViewHolder extends RecyclerView.ViewHolder {

        private final TextView nomeCidade;
        private final TextView Estado;
        private final TextView latitude;
        private final TextView longitude;



        public CidadeViewHolder(View itemView) {
            super(itemView);
            nomeCidade = (TextView) itemView.findViewById(R.id.nomeCidade);
            Estado = (TextView) itemView.findViewById(R.id.Estado);
            latitude = (TextView) itemView.findViewById(R.id.latitude);
            longitude = (TextView) itemView.findViewById(R.id.longitude);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(cidades.get(getLayoutPosition()));

                }
            });


        }
    }
}
