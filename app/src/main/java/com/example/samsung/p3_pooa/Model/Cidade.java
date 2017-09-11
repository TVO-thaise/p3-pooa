package com.example.samsung.p3_pooa.Model;

import java.io.Serializable;

/**
 * Created by Samsung on 11/09/2017.
 */

public class Cidade implements Serializable {

    private final String nomeCidade;
    private final String Estado;
    private final String latitude;
    private final String longitude;


    public Cidade(String nomeCidade, String Estado, String latitude, String longitude) {

        this.nomeCidade = nomeCidade;
        this.Estado = Estado;
        this.latitude = latitude;
        this.longitude = longitude;

    }

    public String getNomeCidade() {
        return nomeCidade;
    }

    public String getEstado() {
        return Estado;
    }

    public String getLatitude() {
        return latitude;
    }

    public String getLongitude() {
        return longitude;
    }



}