package br.com.kikuchi.henrique.revestimentodepisos.domain;

import br.com.kikuchi.henrique.revestimentodepisos.enums.TipoPiso;

public class Comodo {
    private String nome;
    private float largura;
    private float comprimento;
    private Piso piso;

    public Comodo(){}

    public Comodo(String nome, float largura, float comprimento){
        this.nome = nome;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public double areaDoComodo(){
        return this.largura * this.comprimento;
    }

    public Piso getPiso(){
        return this.piso;
    }

    public void setPiso(Piso piso){
        this.piso = piso;
    }

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public float getLargura() {
        return largura;
    }

    public void setLargura(float largura) {
        this.largura = largura;
    }

    public float getComprimento() {
        return comprimento;
    }

    public void setComprimento(float comprimento) {
        this.comprimento = comprimento;
    }

    @Override
    public String toString() {
        String stringRepr = "Comodo: " + getNome() + "\n" +
                "Largura: " + getLargura() + "\nComprimento: " + getComprimento() + "\n" +
                "Piso: " + piso.getTipoDePiso().name() + "\nQuantidade necessaria: " + areaDoComodo() + "m²";
        return stringRepr;
    }
}
