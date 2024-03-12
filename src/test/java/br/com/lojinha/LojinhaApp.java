package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);
        meuProduto.setTamanho(Tamanho.MEDIO);

        List<ItemIncluso> itensInclusos = new ArrayList<>();

        ItemIncluso primeiroItemIncluso = new ItemIncluso("controle",2);
        itensInclusos.add(primeiroItemIncluso); //1

        ItemIncluso segundoItemIncluso = new ItemIncluso("jogo", 3);
        itensInclusos.add(segundoItemIncluso); //2

        ItemIncluso terceiroItemIncluso = new ItemIncluso("cabo de energia", 2);
        itensInclusos.add(terceiroItemIncluso); //3

        meuProduto.setItensInclusos(itensInclusos);


        //System.out.println(meuProduto.getItensInclusos().size()); //COMANDO PARA PUXAR TOTAL DE ITENS DA LISTA//
        //System.out.println(meuProduto.getItensInclusos().get(1)) - COMANDO PARA PUXAR O NUMERO DO ITEM DA LISTA//

        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());

    }
}

