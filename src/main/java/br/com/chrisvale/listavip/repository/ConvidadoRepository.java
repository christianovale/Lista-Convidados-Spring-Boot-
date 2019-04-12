package br.com.chrisvale.listavip.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import br.com.chrisvale.listavip.entity.Convidado;

public interface ConvidadoRepository extends CrudRepository<Convidado, Long>{
	
	List<Convidado> findByNome(String nome);

}