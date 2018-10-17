import javax.persistence.*;

@Entity
@NamedQueries({
        @NamedQuery(name= "Zookeeper.findAll", query = "SELECT z FROM ZooKeeper z")
})
public class ZooKeeper {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private Double salary;

    public ZooKeeper(){

    }

    public ZooKeeper(String name, Double salary) {
        this.name = name;
        this.salary = salary;
    }
}