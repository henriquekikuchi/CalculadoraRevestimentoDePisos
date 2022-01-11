package br.com.kikuchi.henrique.revestimentodepisos.controller;

import br.com.kikuchi.henrique.revestimentodepisos.domain.Comodo;
import br.com.kikuchi.henrique.revestimentodepisos.domain.Piso;
import br.com.kikuchi.henrique.revestimentodepisos.views.ComodoView;
import br.com.kikuchi.henrique.revestimentodepisos.views.PisoView;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class OrcamentoDePisos {
    private List<Comodo> comodos;
    private ComodoView comodoView;
    private PisoView pisoView;


    public OrcamentoDePisos(){
        comodos = new ArrayList<Comodo>();
        comodoView = new ComodoView();
        pisoView = new PisoView();
    }

    public void menu(){
        System.out.println("--------- Orçamento de pisos ---------");
        System.out.println("[I] Iniciar");
        System.out.println("[R] Relatorio");
        System.out.println("[S] Sair");
        System.out.print("#~: ");
        String option = new Scanner(System.in).next();
        switch (option.toUpperCase()){
            case "I":
                iniciarPrograma();
                break;
            case "R":
                imprimirRelatorio();
                break;
            case "S":
                System.out.println("SAINDO DO PROGRAMA!");
                System.exit(0);
                break;
            default:
                menu();
        }
    }

    public void iniciarPrograma(){
        String option = "s";
        System.out.println("--------- Cadastro ---------");
        do {
            Comodo comodo = comodoView.criarNovoComodo();
            Piso piso = pisoView.criarNovoPiso();
            comodo.setPiso(piso);
            comodos.add(comodo);
            System.out.println("-------------------");
            System.out.println("Cadastrar novos comodos? [S/N] ");
            System.out.print("#~: ");
            option = new Scanner(System.in).next();
        } while (option.equalsIgnoreCase("s"));
        menu();
    }

    public void imprimirRelatorio(){
        System.out.println("------ RELATORIO ------");
        for (Comodo comodo : comodos){
            System.out.println(comodo.toString());
            System.out.println("-------------------");
        }
        menu();
    }
}
