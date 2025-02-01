package com.impacta.cursointegracao.controller;

import com.impacta.cursointegracao.Dto.ProdutoDto;
import com.impacta.cursointegracao.Dto.ProdutoListDto;
import com.impacta.cursointegracao.domain.Produto;
import com.impacta.cursointegracao.repository.DescricaoRepository;
import com.impacta.cursointegracao.repository.ProdutoRepository;
import com.impacta.cursointegracao.service.ProdutoSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@Component
@RequestMapping("/api/v1/produto")
public class ProdutoCtrl {

    @Autowired
    public ProdutoRepository produtoRepository;

    public DescricaoRepository repository;

    @Autowired
    public ProdutoSvc produtoService;

    @GetMapping(value = "/{id}")
    public Produto findById(@PathVariable Long id) {
        Produto result = produtoService.findById(id);
        return result;
    }

    @PutMapping(value = "/{id}")
    public ResponseEntity<Produto> update(@PathVariable Long id, @RequestBody Produto obj) {
        obj = produtoService.update(id, obj);
        return ResponseEntity.ok().body(obj);
    }

    @GetMapping
    public List<ProdutoListDto> findAll() {
        List<ProdutoListDto> result = produtoService.findAll();
        return result;
    }

    @PostMapping
    public Produto salvar(@RequestBody Produto produto) {
        return produtoService.salvar(produto);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produtoService.delete(id);
    }


}