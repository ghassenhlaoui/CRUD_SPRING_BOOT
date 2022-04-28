package com.gestion.club.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.club.entities.Tournoi;

@Service
public interface IServiceTournoi {
	public void persistTournoi(Tournoi t );
	public void deleteTournoi(int id);
	public List<Tournoi> getAllTournoi();
	public Tournoi findTournoiById(int id);
	public List<Tournoi> findTournoiByNom(String nom);
	public void updateTournoi(Tournoi t);
}
