package zFormaçãoBASICA.List.Test;

import zFormaçãoBASICA.List.Domain.Test.Produto;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestList01 {
    public static void main(String[] args) {
        List<Produto> produtos = new ArrayList<>();

        produtos.add(new Produto("Arroz", 40));
        produtos.add(new Produto("Carne", 20.4));
        produtos.add(new Produto("Eixo de aço inox",6.5));
        produtos.add(new Produto("detergente", 3.5));
        produtos.add(new Produto("bone", 1.5));

        Collections.sort(produtos);
        for (Produto pr: produtos){
            System.out.println(pr);
        }
    }

}
