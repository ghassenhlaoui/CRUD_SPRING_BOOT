package com.gestion.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.club.dao.TournoiRepository;
import com.gestion.club.entities.Tournoi;

@Service
public class TournoiService implements IServiceTournoi {
	@Autowired
	TournoiRepository tournoiRepository;

	@Override
	public void persistTournoi(Tournoi t) {
		// TODO Auto-generated method stub
		tournoiRepository.save(t);
	}

	@Override
	public void deleteTournoi(int id) {
		// TODO Auto-generated method stub
		tournoiRepository.deleteById(id);
	}

	@Override
	public List<Tournoi> getAllTournoi() {
		// TODO Auto-generated method stub
		return tournoiRepository.findAll();
	}

	@Override
	public Tournoi findTournoiById(int id) {
		// TODO Auto-generated method stub
		return tournoiRepository.findById(id).get();
	}

	@Override
	public List<Tournoi> findTournoiByNom(String nom) {
		// TODO Auto-generated method stub
		return tournoiRepository.findByNomContains(nom);
	}

	@Override
	public void updateTournoi(Tournoi t) {
		// TODO Auto-generated method stub
		tournoiRepository.save(t);
	}

}
