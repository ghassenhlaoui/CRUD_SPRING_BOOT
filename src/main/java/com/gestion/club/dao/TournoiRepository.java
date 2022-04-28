package com.gestion.club.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gestion.club.entities.Tournoi;


public interface TournoiRepository extends JpaRepository<Tournoi, Integer> {
	List<Tournoi> findByNomContains(String nom); 

}
