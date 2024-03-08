package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.Produto;

import java.util.ArrayList;
import java.util.List;

public class LojinhaApp {
    public static void main(String[] args) {
        Produto meuProduto = new Produto("Nestle", Tamanho.MEDIO);
        meuProduto.setNome("Play Station 4");
        meuProduto.setValor(30);
        meuProduto.setTamanho(Tamanho.MEDIO);

        List<String> itensInclusos = new ArrayList<>();
        itensInclusos.add("2 controles");
        itensInclusos.add("3 jogos");
        itensInclusos.add("2 cabos de energia");
        //meuProduto.setItensInclusos(itensInclusos);



        //System.out.println(meuProduto.getItensInclusos().size()); //COMANDO PARA PUXAR TOTAL DE ITENS DA LISTA//
        //System.out.println(meuProduto.getItensInclusos().get(1)) - COMANDO PARA PUXAR O NUMERO DO ITEM DA LISTA//

        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());

    }
}

