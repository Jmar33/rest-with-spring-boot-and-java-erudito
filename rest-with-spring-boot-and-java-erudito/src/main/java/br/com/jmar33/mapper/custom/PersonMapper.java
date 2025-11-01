package br.com.jmar33.mapper.custom;

import br.com.jmar33.data.dto.v2.PersonDTOV2;
import br.com.jmar33.model.Person;
import org.springframework.stereotype.Service;


import java.util.Date;

@Service
public class PersonMapper {

    public PersonDTOV2 convertEntityToDTO (Person person){
        PersonDTOV2 dto =  new PersonDTOV2();
        dto.setId(person.getId());
        dto.setFirstName(person.getFirstName());
        dto.setLastName(person.getLastName());
        dto.setAddress(person.getAddress());
        dto.setBirthDay(new Date());
        dto.setGender(person.getGender());
        return dto;
    }

    public Person convertDTOToEntity (PersonDTOV2 person){
        Person entity =  new Person();
        entity.setId(person.getId());
        entity.setFirstName(person.getFirstName());
        entity.setLastName(person.getLastName());
        entity.setAddress(person.getAddress());
        // entity.setBirthDay(new Date());
        entity.setGender(person.getGender());
        return entity;
    }
}
