package br.unicentro.appestudantes.model;

public class Carro {
    private String marca;
    private String modelo;
    private double preco;
    private int ano;

    public Carro(String marca, String modelo, double preco, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.preco = preco;
        this.ano = ano;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public double getPreco() { return preco; }
    public int getAno() { return ano; }

    @Override
    public String toString() {
        return marca + " " + modelo + " (" + ano + ") - R$ " +preco;
}
}