package br.com.kikuchi.henrique.revestimentodepisos.views;

import br.com.kikuchi.henrique.revestimentodepisos.domain.Comodo;

import java.util.Scanner;

public class ComodoView {
    private String nome;
    private float largura;
    private float comprimento;

    public Comodo criarNovoComodo(){
        System.out.println("--------- Novo Comodo ---------");
        askNome();
        askLargura();
        askComprimento();
        Comodo comodo = new Comodo(nome, largura, comprimento);
        return comodo;
    }

    private void askNome(){
        System.out.println("Digite um nome para o comodo: ");
        System.out.print("#~: ");
        String nome = new Scanner(System.in).nextLine();
        if (!nome.isBlank() || !nome.isEmpty()) {
            this.nome = nome;
        } else {
            askNome();
        }

    }

    private void askLargura(){;
        System.out.println("Digite a largura do comodo: ");
        System.out.print("#~: ");
        float largura = new Scanner(System.in).nextFloat();
        if (largura > 0){
            this.largura = largura;
        } else {
            askLargura();
        }
    }

    private void askComprimento(){
        System.out.println("Digite o comprimento do comodo: ");
        System.out.print("#~: ");
        float comprimento = new Scanner(System.in).nextFloat();
        if (comprimento > 0.0){
            this.comprimento = comprimento;
        } else {
            askComprimento();
        }
    }
}
