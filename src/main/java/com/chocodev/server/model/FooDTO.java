/**
 * 
 */
package com.chocodev.server.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

import org.hibernate.validator.constraints.NotEmpty;
import org.hibernate.validator.constraints.URL;

/**
 * Feed Source (rss, atom)
 * @author Daniel Rodriguez Millan
 *
 */
@XmlRootElement
@Entity
@Table(name="foo")
public class FooDTO {
    
    @Id
    @Column(name="foo_id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    private Integer id;
    
    @NotEmpty
    @Column(name="name")
    private String name;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    
    
}
