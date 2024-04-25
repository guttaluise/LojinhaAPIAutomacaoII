package dataFactory;

import pojo.ComponentePojo;
import pojo.PordutoPojo;

import java.util.ArrayList;
import java.util.List;

public class ProdutoDataFactory {
    public static PordutoPojo criarProdutoComumComOValorIgualA (double valor){
        PordutoPojo produto = new PordutoPojo();
        produto.setProdutoNome("Play Station 5");
        produto.setProdutoValor(valor);

        List<String> cores = new ArrayList<>();
        cores.add("preto");
        cores.add("branco");

        produto.setProdutoCores(cores);
        produto.setProdutoUrlMock("");

        List<ComponentePojo> componentes = new ArrayList<>();

        ComponentePojo componente = new ComponentePojo();
        componente.setComponenteNome(" Controle");
        componente.setComponenteQuantidade(2);
        componentes.add(componente);

        ComponentePojo segundoComponente = new ComponentePojo();
        componente.setComponenteNome(" Memory Card");
        componente.setComponenteQuantidade(1);
        componentes.add(segundoComponente);

        produto.setComponentes(componentes);

        return produto;

    }
}
