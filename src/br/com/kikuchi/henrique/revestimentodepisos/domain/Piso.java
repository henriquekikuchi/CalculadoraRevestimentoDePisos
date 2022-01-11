package br.com.kikuchi.henrique.revestimentodepisos.domain;

import br.com.kikuchi.henrique.revestimentodepisos.enums.TipoPiso;

import java.util.Scanner;

public class Piso {
    private TipoPiso tipoDePiso;

    public Piso(){}

    public Piso(TipoPiso tipoDePiso){
        this.tipoDePiso = tipoDePiso;
    }

    public TipoPiso getTipoDePiso() {
        return tipoDePiso;
    }

    public void setTipoDePiso(TipoPiso tipoDePiso) {
        this.tipoDePiso = tipoDePiso;
    }
}
