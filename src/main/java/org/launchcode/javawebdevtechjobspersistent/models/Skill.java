package org.launchcode.javawebdevtechjobspersistent.models;

import javax.persistence.Entity;
import javax.validation.constraints.Size;

@Entity
public class Skill extends AbstractEntity {

    @Size(max=500, message="Description must be no longer than 500 characters.")
    private String description;

    public Skill(){
    }

    public Skill(String aDescription){
        super();
        this.description = aDescription;
    }

    // Getter and setter

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}