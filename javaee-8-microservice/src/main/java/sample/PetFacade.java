package sample;

import sample.Entities.Pet;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.ArrayList;
import java.util.List;

@Stateless
public class PetFacade {
    @PersistenceContext
    EntityManager em;

    List<Pet> petList;

    public PetFacade(){
        petList = new ArrayList<>();
        petList.add(new Pet("max",10));
    }

    public List<Pet> findAll(){
        return petList;
    }
    public void save(Pet pet){
        petList.add(pet);
    }
}
