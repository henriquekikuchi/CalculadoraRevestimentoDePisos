package br.com.kikuchi.henrique.revestimentodepisos.views;

import br.com.kikuchi.henrique.revestimentodepisos.domain.Piso;
import br.com.kikuchi.henrique.revestimentodepisos.enums.TipoPiso;

import java.util.Scanner;

public class PisoView {
    private TipoPiso tipoDePiso;

    public Piso criarNovoPiso(){
        System.out.println("--------- Novo Piso ---------");
        askTipoDePiso();
        Piso piso = new Piso(tipoDePiso);
        return piso;
    }

    private void askTipoDePiso(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Qual o tipo de piso deseja colocar?: ");
        for (TipoPiso tipo : TipoPiso.values()){
            System.out.printf("%d - %s%n", tipo.ordinal(), tipo.name());
        }
        System.out.print("#~: ");
        int tipoOrdinal = sc.nextInt();
        if (tipoOrdinal < 0 || tipoOrdinal > TipoPiso.values().length ){
            System.out.println("Tipo de piso invalido!");
            askTipoDePiso();
        } else {
            this.tipoDePiso = TipoPiso.values()[tipoOrdinal];
        }

    }
}
