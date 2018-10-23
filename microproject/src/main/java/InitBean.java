import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import javax.inject.Inject;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Singleton
@Startup
public class InitBean {

@Inject
private PetFacade petFacade;

    @PostConstruct
    public void init(){
        petFacade.save(new Pet("max",11,"m"));
        petFacade.save(new Pet("moritz",34,"m"));
        System.out.println("done");
    }
}
