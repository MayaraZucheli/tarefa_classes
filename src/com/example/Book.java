package com.example;

public class Book {

    private int tamanho;
    private String modelo;
    private String tipo;

    public Book(int tamanho, String modelo, String tipo) {
        this.tamanho = tamanho;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    public int getTamanho() {
        return tamanho;
    }
    
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    
    public String getModelo() {
        return modelo;
    }
    
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    
    public String getTipo() {
        return tipo;
    }
    
    public void setTipo(String tipo) {
         this.tipo = tipo;
    }
}
    
