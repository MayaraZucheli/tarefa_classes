package com.example;

public class Main {
    public static void main(String[] args) {
        Book myBook = new Book(14, "brochura", "scifi");

            System.out.println("Tamanho do livro: " + myBook.getTamanho());
            System.out.println("Modelo do livro: " + myBook.getModelo());
            System.out.println("Tipo do livro: " + myBook.getTipo());
    } 
}
