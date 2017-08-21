package br.com.casadocodigo.loja.daos;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import br.com.casadocodigo.loja.models.Produto;

@Repository
@Transactional
public class ProdutoDAO {
	
	private EntityManager manager;

	public void gravar (Produto produto) {
		manager.persist(produto);		
	}
	
}
