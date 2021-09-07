package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.PetOwner;

@Repository
public interface PetOwnerRepository extends JpaRepository<PetOwner,Integer>{

	PetOwner findByOwnerId(Integer petOwnerId);
}
