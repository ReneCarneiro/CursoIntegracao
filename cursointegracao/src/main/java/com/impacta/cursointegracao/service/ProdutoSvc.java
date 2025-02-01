package com.impacta.cursointegracao.service;

import com.impacta.cursointegracao.Dto.ProdutoDto;
import com.impacta.cursointegracao.Dto.ProdutoListDto;
import com.impacta.cursointegracao.domain.Produto;
import com.impacta.cursointegracao.repository.DescricaoRepository;
import com.impacta.cursointegracao.repository.ProdutoRepository;
import com.impacta.cursointegracao.service.exception.ResourceNotFoundException;
import org.hibernate.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Map;
import java.util.Optional;

@Service
public class ProdutoSvc {

    @Autowired
    private ProdutoRepository produtoRepository;
    @Autowired
    private DescricaoRepository descricaoRepository;


    public Produto findById(Long id) {
        Optional<Produto> obj = produtoRepository.findById(id);
        return obj.orElseThrow(() -> new ResourceNotFoundException(id));
    }

    public Produto update(Long id, Produto obj) {
        Produto entity = produtoRepository.getReferenceById(id);
        updateData(entity, obj);
        return produtoRepository.save(entity);
    }

    private void updateData(Produto entity, Produto obj) {
        entity.setCodigo(obj.getCodigo());
        entity.setDescricao(obj.getDescricao());
        entity.setSKU(obj.getSKU());
        entity.setCategoria(obj.getCategoria());
    }

    @Transactional(readOnly = true)
    public List<ProdutoListDto> findAll() {
        List<Produto> result = produtoRepository.findAll();
        return result.stream().map(x -> new ProdutoListDto(x)).toList();
    }

    public Produto salvar(Produto produto) {
        return produtoRepository.save(produto);
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }

    private final Map<String, Produto> dados;

    public ProdutoSvc(Map<String, Produto> dados) {
        this.dados = dados;
    }

    // metodo para inserir um novo produto
//    public Produto InserirProduto(Produto produto)
//            throws CodigoProdutoObrigatorioException, DescricaoProdutoObrigatorioException {
//        produto.setId(UUID.randomUUID());
//
//        if (produto.getCodigo() == null || produto.getCodigo().isEmpty()) {
//            throw new CodigoProdutoObrigatorioException();
//        }
//
//        if (produto.getDescricao() == null || produto.getDescricao().isEmpty()) {
//            throw new DescricaoProdutoObrigatorioException();
//        }
//
//        // implementacao idempotente
//        if (this.dados.containsKey(produto.getCodigo())) {
//            produto = this.dados.get(produto.getCodigo());
//        } else {
//            this.dados.put(produto.getCodigo(), produto);
//        }
//
//        return produto;
//    }

    // metodo para buscar um produto pelo codigo
//    public Produto RecuperarProduto(String codigo) {
//        if (!this.dados.containsKey(codigo)) {
//            return null;
//        }
//
//        return this.dados.get(codigo);
//    }
//
//    // metodo para retornar uma lista com todos os produtos
//    public Collection<Produto> RecuperarListaProdutos() {
//        return this.dados.values();
//    }

    // metodo para atualizar um produto pelo codigo
//    public Produto AtualizarProduto(String codigo, Produto produto) throws DescricaoProdutoObrigatorioException {
//        if (!this.dados.containsKey(codigo)) {
//            return null;
//        }
//
//        if (produto.getDescricao() == null || produto.getDescricao().isEmpty()) {
//            throw new DescricaoProdutoObrigatorioException();
//        }

    // atualiza apenas os campos recebidos no payload
//        Produto produtoAux = this.dados.get(codigo);
//
//        if (produto.getDescricao() != null && !produto.getDescricao().isEmpty()) {
//            produtoAux.setDescricao(produto.getDescricao());
//        }
//
//        this.dados.replace(codigo, produtoAux);
//
//        return produtoAux;
//    }

    // metodo para excluir um produto pelo codigo
//    public Produto ExcluirProduto(String codigo) {
//        if (!this.dados.containsKey(codigo)) {
//            return null;
//        }
//
//        Produto produto = this.dados.get(codigo);
//
//        this.dados.remove(codigo);
//
//        return produto;
//    }


}
