package com.example.samsung.p3_pooa.Model;

import java.io.Serializable;

/**
 * Created by Samsung on 12/09/2017.
 */

public class PontoTuristico implements Serializable {

    private final String nomePontoTuristico;
    private final String Estado;
    private final String latitude;
    private final String longitude;
    private final String Azimute = null;


    public PontoTuristico(String nomeCidade, String Estado, String latitude, String longitude,Integer azimute) {

        this.nomePontoTuristico = nomeCidade;
        this.Estado = Estado;
        this.latitude = latitude;
        this.longitude = longitude;
        this.Azimute = azimute;

    }

    public String getNomePontoTuristicoe() {
        return nomePontoTuristico;
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

    public Integer getAzimute() { return  Azimute; }



