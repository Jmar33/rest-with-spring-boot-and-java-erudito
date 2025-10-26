package br.com.jmar33.repository;

import br.com.jmar33.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;

//To make possible whe have access to database it's just need to create an interface and extends the JpaRepository
public interface PersonRepository  extends JpaRepository<Person, Long> {
}
