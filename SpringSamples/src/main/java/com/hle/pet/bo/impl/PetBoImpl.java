package com.hle.pet.bo.impl;

import com.hle.pet.dao.PetDao;
import com.hle.pet.model.Pet;
/**
 * Created by hungle on 2/1/17.
 */
public class PetBoImpl {
    PetDao petDao;

    public void setPetDao(PetDao petDao) {
        this.petDao = petDao;
    }

    public void save(Pet pet){
        petDao.save(pet);
    }

    public void update(Pet pet){
        petDao.update(pet);
    }

    public void delete(Pet pet){
        petDao.delete(pet);
    }

    public Pet findByPetName(String petName){
        return petDao.findByPetName(petName);
    }

}
