package com.groza.model;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * DemoEntity
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */

@Entity(name = "demo_entity")
public class DemoEntity {
    @Id
    @GeneratedValue
    Long id;

    @Column(name = "name")
    String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
