package com.gestion.club.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.gestion.club.entities.Club;

@Service
public interface IServiceClub {
	//public void persistClub(Club c );
	public Club persistClub(Club c );
	public void deleteClub(int id);
	public List<Club> getAllClubs();
	public Club findClubById(int id);
	public List<Club> findClubsByNom(String nom);
	public void updateClub(Club c);
}
