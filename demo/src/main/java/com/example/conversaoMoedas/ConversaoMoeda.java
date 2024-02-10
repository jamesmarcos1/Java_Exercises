package com.example.conversaoMoedas;

public class ConversaoMoeda implements ConversaoFinanceira {
    
    @Override
    public void converterDolarParaReal(double valorDolar) {
        double cotacaoDolar = 4.80;
        double valorReal = valorDolar * cotacaoDolar;
        System.out.println(String.format("O valor em reais é R$%.2f", valorReal));
    }
    
}
