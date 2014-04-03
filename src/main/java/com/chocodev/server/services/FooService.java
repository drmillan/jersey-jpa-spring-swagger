/**
 * 
 */
package com.chocodev.server.services;

import java.util.List;

import javax.inject.Singleton;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.chocodev.server.helper.DTOValidator;
import com.chocodev.server.model.FooDTO;
import com.chocodev.server.repository.FooRepository;

/**
 * Feed service
 * 
 * @author Daniel Rodriguez Millan
 * 
 */
@Singleton
@Service
@Component
public class FooService {

    @Autowired
    DTOValidator dtoValidator;

    @Autowired
    FooRepository fooRepository;

    /**
     * Returns a list of feed sources
     * 
     * @return
     */
    public List<FooDTO> getFooObjects() {
        return fooRepository.findAll();
    }

}
