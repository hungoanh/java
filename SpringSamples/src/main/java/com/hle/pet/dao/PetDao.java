package com.hle.pet.dao;

import com.hle.pet.model.Pet;
/**
 * Created by hungle on 1/31/17.
 */
public interface PetDao {
    void save(Pet pet);
    void update(Pet pet);
    void delete(Pet pet);
    Pet findByPetName(String petName);
}
