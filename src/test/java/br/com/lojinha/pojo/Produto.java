package br.com.lojinha.pojo;

import br.com.lojinha.enums.Tamanho;

import java.util.List;

public class Produto {
    private String nome;
    private String marca;
    private double valor;
    private List<ItemIncluso> itensInclusos;
    private Tamanho tamanho;

    public Produto (String marcaInicial, Tamanho tamanhoInicial) {
        this.marca = marcaInicial;
        this.tamanho = tamanhoInicial;
    }

    public Produto(String nestle){
        this.marca = "Sony";
        // construtor serve para definir comandos que serao iniciados durante a instanciação
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        if (novoValor > 0) {
            this.valor = novoValor;
        } else {
            throw new IllegalArgumentException ("Valores devem ser maiores que 0");

        }
    }

    public String getNome() {

        return this.nome;
    }

    public void setNome(String novoNome) {

        this.nome = novoNome;
    }
    
    public String getMarca() {

        return this.marca;
    }
    
    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }
    public List<ItemIncluso> getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(List<ItemIncluso> novoItensInclusos) {
        this.itensInclusos = novoItensInclusos;
    }

    public Tamanho getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(Tamanho novotamanho) {
            this.tamanho = novotamanho;

    }


}




