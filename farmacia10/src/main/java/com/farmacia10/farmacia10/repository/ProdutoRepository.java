package com.farmacia10.farmacia10.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.farmacia10.farmacia10.model.Produto;



public interface ProdutoRepository extends  JpaRepository<Produto, Long>{

	public List<Produto> findAllByNomeContainingIgnoreCase(String nome);
		
}
