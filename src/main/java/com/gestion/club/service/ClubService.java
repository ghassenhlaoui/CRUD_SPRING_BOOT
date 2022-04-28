package com.gestion.club.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gestion.club.dao.ClubRepository;
import com.gestion.club.entities.Club;

@Service
public class ClubService implements IServiceClub {
	@Autowired
	ClubRepository clubRepository;
	
	/*@Override
	public void persistClub(Club c) {
		// TODO Auto-generated method stub
		clubRepository.save(c);
	}*/
	@Override
	public Club persistClub(Club c) {
		return clubRepository.save(c);
	}

	@Override
	public void deleteClub(int id) {
		// TODO Auto-generated method stub
		clubRepository.deleteById(id);
	}

	@Override
	public List<Club> getAllClubs() {
		// TODO Auto-generated method stub
		return clubRepository.findAll();
	}

	@Override
	public Club findClubById(int id) {
		// TODO Auto-generated method stub
		return clubRepository.findById(id).get();
	}

	@Override
	public List<Club> findClubsByNom(String nom) {
		// TODO Auto-generated method stub
		return clubRepository.findByNomContains(nom);
	}

	@Override
	public void updateClub(Club c) {
		// TODO Auto-generated method stub
		clubRepository.save(c);
	}

}
