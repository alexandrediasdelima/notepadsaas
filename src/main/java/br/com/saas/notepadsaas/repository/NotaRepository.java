package br.com.saas.notepadsaas.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import br.com.saas.notepadsaas.model.Nota;

public interface NotaRepository extends MongoRepository<Nota, String> {

}
