package com.impacta.cursointegracao.service.exception;

public class CodigoProdutoObrigatorioException  extends RuntimeException {

    public CodigoProdutoObrigatorioException() {
            super("O codigo do produto é campo obrigatorio");
        }
}
