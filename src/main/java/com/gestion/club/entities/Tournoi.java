package com.gestion.club.entities;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.gestion.club.entities.Club;

@Entity
public class Tournoi {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	@JsonIgnore
	@OneToMany(mappedBy = "tournoi",cascade=CascadeType.ALL)
	List<Club> club;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public List<Club> getClub() {
		return club;
	}
	public void setListe(List<Club> club) {
		this.club = club;
	}
	public Tournoi(int id, String nom, List<Club> club) {
		super();
		this.id = id;
		this.nom = nom;
		this.club = club;
	}
	public Tournoi(String nom, List<Club> club) {
		super();
		this.nom = nom;
		this.club = club;
	}
	public Tournoi() {
		super();
	}
	
}
