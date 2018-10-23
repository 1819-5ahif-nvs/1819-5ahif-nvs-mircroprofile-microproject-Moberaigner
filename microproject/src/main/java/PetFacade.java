import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class PetFacade {

    @PersistenceContext
    EntityManager em;


    public List<Pet> findAll(){
        return this.em
                .createNamedQuery("Pet.findAll")
                .getResultList();
    }


    public void delete (long id){
        Pet reference = this.em.getReference(Pet.class, id);
        this.em.remove(reference);
    }


    public void save (Pet pet){
        em.merge(pet);
    }

    public Pet findById(long id){
        return this.em.find(Pet.class,id);
    }


}
