import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name= "Pet.findAll", query = "SELECT t FROM Pet t")
})
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private int age;
    private String gender;

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getGender() {
        return gender;
    }

    public Long getId() {
        return id;
    }

    public Pet(String name, int age, String gender) {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    public Pet() {

    }
}