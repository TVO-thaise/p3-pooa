package com.example.samsung.p3_pooa.Adapter;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.samsung.p3_pooa.Model.Cidade;
import com.example.samsung.p3_pooa.Model.PontoTuristico;
import com.example.samsung.p3_pooa.R;

import java.util.List;

/**
 * Created by Samsung on 12/09/2017.
 */

public class PontoTuristicoAdapter extends RecyclerView.Adapter {

    private List<PontoTuristico> pontoTuristicos;
    private Context context;
    private static ClickRecyclerViewListener clickRecyclerViewListener;

    public PontoTuristicoAdapter(List<PontoTuristico> pontoTuristicos, Context context, ClickRecyclerViewListener clickRecyclerViewListener) {

        this.pontoTuristicos = pontoTuristicos;
        this.context = context;
        this.clickRecyclerViewListener = clickRecyclerViewListener;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent,
                                                      int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.item_pontoturistico, parent, false);
        PontoTuristicoAdapter.PontoTuristicoViewHolder pontoTuristicoViewHolder = new PontoTuristicoAdapter.PontoTuristicoViewHolder(view);
        return pontoTuristicoViewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder viewHolder,
                                 int position) {

        PontoTuristicoAdapter.PontoTuristicoViewHolder holder = (PontoTuristicoAdapter.PontoTuristicoViewHolder) viewHolder;

        PontoTuristico pontoTuristico = pontoTuristicos.get(position) ;

        holder.nomePontoTuristico.setText(pontoTuristico.getNomePontoTuristico());
        holder.Estado.setText(pontoTuristico.getEstado());
        holder.latitude.setText(pontoTuristico.getLatitude());
        holder.longitude.setText(pontoTuristico.getLongitude());
        holder.Azimute.setText(pontoTuristico.getAzimute());
        Log.i("------XXXXXXXXX--", pontoTuristico.getNomePontoTuristico());


    }

    @Override
    public int getItemCount() {

        return pontoTuristicos.size();
    }

    private void updateItem(int position) {

    }

    // MÃ©todo responsÃ¡vel por remover um usuÃ¡rio da lista.
    private void removerItem(int position) {

    }

    public class PontoTuristicoViewHolder extends RecyclerView.ViewHolder {

        private final TextView nomePontoTuristico;
        private final TextView Estado;
        private final TextView latitude;
        private final TextView longitude;
        private final TextView Azimute;



        public PontoTuristicoViewHolder(View itemView) {
            super(itemView);
            nomePontoTuristico = (TextView) itemView.findViewById(R.id.nomePontoTuristico);
            Estado = (TextView) itemView.findViewById(R.id.Estado);
            latitude = (TextView) itemView.findViewById(R.id.latitude);
            longitude = (TextView) itemView.findViewById(R.id.longitude);
            Azimute = (TextView) itemView.findViewById(R.id.azimute);
            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    clickRecyclerViewListener.onClick(pontoTuristicos.get(getLayoutPosition()));

                }
            });


        }
    }
}
