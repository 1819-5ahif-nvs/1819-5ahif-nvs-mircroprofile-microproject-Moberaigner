package sample.Entities;

import javax.persistence.*;

@Entity(name = "PET")
@NamedQueries({
        @NamedQuery(name= "Pet.findAll", query = "SELECT t FROM PET t")
})
public class Pet {
    @Id
    @GeneratedValue
    private long id;

    private String name;
    private Integer age;

    public Pet(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Pet() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}






