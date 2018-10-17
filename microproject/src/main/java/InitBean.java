import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class InitBean {

@PersistenceContext
EntityManager em;

    @PostConstruct
    public void init(){
        em.persist(new Pet("max",11,"m"));
        em.persist(new ZooKeeper("fritz",1000.00));
        System.out.println("done");
    }
}
