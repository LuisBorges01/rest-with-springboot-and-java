package br.com.lsborges.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.lsborges.model.Person;

public interface PersonRepository extends JpaRepository<Person, Long> {}
