package com.example.doggraphql.repository;

import com.example.doggraphql.entity.Dog;
import org.springframework.data.repository.CrudRepository;

public interface DogRepository extends CrudRepository<Dog, Long> {
}