/**
 * 
 */
package com.chocodev.server.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.chocodev.server.model.FooDTO;

/**
 * JPA Repository for Foo objects
 * @author Daniel Rodriguez Millan
 *
 */
@Repository
public interface FooRepository extends JpaRepository<FooDTO, Integer>{

}
