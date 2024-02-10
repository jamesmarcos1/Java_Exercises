package com.example.animais;

public class Cachorro extends Animal {
    
    @Override
    public void emitirSom() {
        System.out.println("AU AU");
    }

    public void abanarRabo() {
        System.out.println("Cachorro abanando o rabo");
    }

}
