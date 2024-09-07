package com.loiane.estruturadados.vetor;

import java.util.Arrays;

public class Vetor {
    private String[] elementos;
    private int tamanho;

    public Vetor(int capacidade){
        this.elementos = new String[capacidade];
        this.tamanho = 0;
    }

//    Criando o método para adicionar um elemento

//    Opção 1: Não é uma boa maneira para adicionar elementos,
//    especialmente em Arrays extensos
//    public void adiciona(String elemento){
//        for(int i = 0; i < this.elementos.length; i++){
//            if(this.elementos[i] == null) {
//                this.elementos[i] = elemento;
//                break;
//            }
//        }
//    }

//    Opção 2: trabalhando com tratamento de erros
//    public void adiciona(String elemento) throws Exception{
//
//        if(this.tamanho < this.elementos.length){
//            this.elementos[this.tamanho] = elemento;
//            this.tamanho++;
//        } else {
//            throw new Exception("Vetor já está cheio, não é possível adicionar mais elementos");
//        }
//    }

//    Opcao 3: utilizando boolean
    public boolean adiciona(String elemento){

        if(this.tamanho < this.elementos.length){
            this.elementos[this.tamanho] = elemento;
            this.tamanho++;
            return true;
        }
        return false;
    }

    public int tamanho(){
        return this.tamanho;
    }

    public String toString(){

        StringBuilder s = new StringBuilder();

        s.append("[");

        for(int i = 0; i < this.tamanho - 1; i++){
            s.append(this.elementos[i]);
            s.append(", ");
        }

        if(this.tamanho > 0){
            s.append(this.elementos[this.tamanho - 1]);
        }

        s.append("]");

        return s.toString();
    }
}
