package br.com.lojinha;

import br.com.lojinha.enums.Tamanho;
import br.com.lojinha.pojo.ItemIncluso;
import br.com.lojinha.pojo.Produto;
import br.com.lojinha.pojo.ProdutoInternacional;
import br.com.lojinha.pojo.ProdutoNacional;

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
        itensInclusos.add(primeiroItemIncluso); //0

        ItemIncluso segundoItemIncluso = new ItemIncluso("jogo", 3);
        itensInclusos.add(segundoItemIncluso); //1

        ItemIncluso terceiroItemIncluso = new ItemIncluso("cabo de energia", 2);
        itensInclusos.add(terceiroItemIncluso); //2

        meuProduto.setItensInclusos(itensInclusos);


        //System.out.println(meuProduto.getItensInclusos().size()); //COMANDO PARA PUXAR TOTAL DE ITENS DA LISTA//
        //System.out.println(meuProduto.getItensInclusos().get(1)) - COMANDO PARA PUXAR O NUMERO DO ITEM DA LISTA//

        System.out.println(meuProduto.getItensInclusos().get(1));
        System.out.println(meuProduto.getValor());
        System.out.println(meuProduto.getTamanho());
        System.out.println(meuProduto.getMarca());

        System.out.println(meuProduto.getItensInclusos().get(0).getNome());
        System.out.println(meuProduto.getItensInclusos().get(0).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(1).getNome());
        System.out.println(meuProduto.getItensInclusos().get(1).getQuantidade());
        System.out.println(meuProduto.getItensInclusos().get(2).getNome());
        System.out.println(meuProduto.getItensInclusos().get(2).getQuantidade());

        System.out.println("<começando a mostrar os itens");
        for (ItemIncluso ItemAtual : meuProduto.getItensInclusos()){
            System.out.println(ItemAtual.getNome());
            System.out.println(ItemAtual.getQuantidade());
        }

        System.out.println("Acabaram os itens");


        ProdutoNacional meuProdutoNacional = new ProdutoNacional("Sony", Tamanho.MEDIO);
        meuProdutoNacional.setImpostoNacional(0.55789);
        System.out.println(meuProdutoNacional.getImpostoNacional());
        System.out.println(meuProdutoNacional.getMarca());

        ProdutoInternacional meuProdutoInternacional = new ProdutoInternacional("Sony",Tamanho.MEDIO);
        meuProdutoInternacional.setValor(-99.99);
    }
}

