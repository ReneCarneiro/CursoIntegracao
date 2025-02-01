package com.impacta.cursointegracao.controller;

import com.impacta.cursointegracao.service.ProdutoSvc;

public class ProdutoQLCtrl {

    private final ProdutoSvc produtoService;

    public ProdutoQLCtrl(ProdutoSvc produtoService) {
        this.produtoService = produtoService;
    }

//    @QueryMapping
//    public Produto produtoPorCodigo(@Argument String codigo) {
//        System.out.printf("GraphQL query: %s\n", codigo);
//        return produtoService.RecuperarProduto(codigo);
//    }
}
