package com.arquitetura.pagamento.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.arquitetura.pagamento.entity.ProdutoVenda;

@Repository
public interface ProdutoVendaRepository extends JpaRepository<ProdutoVenda, Long>{

}
