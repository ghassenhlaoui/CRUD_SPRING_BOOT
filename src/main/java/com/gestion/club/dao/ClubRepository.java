package com.gestion.club.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.gestion.club.entities.Club;

public interface ClubRepository extends JpaRepository<Club,Integer> {

	List<Club> findByNomContains(String nom);
	
	@Query("select c from Club c where c.nom like %:x%")
	List<Club> rechercheparnom(@Param("x") String nom); 

}
