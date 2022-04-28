package com.gestion.club.entities;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import com.gestion.club.entities.Tournoi;

@Entity
public class Club {
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String nom;
	private Date dateFond;
	
	@ManyToOne
	Tournoi tournoi;

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

	public Date getDateFond() {
		return dateFond;
	}

	public void setDateFond(Date dateFond) {
		this.dateFond = dateFond;
	}

	public Tournoi getTournoi() {
		return tournoi;
	}

	public void setTournoi(Tournoi tournoi) {
		this.tournoi = tournoi;
	}

	public Club(int id, String nom, Date dateFond, Tournoi tournoi) {
		super();
		this.id = id;
		this.nom = nom;
		this.dateFond = dateFond;
		this.tournoi = tournoi;
	}

	public Club(String nom, Date dateFond, Tournoi tournoi) {
		super();
		this.nom = nom;
		this.dateFond = dateFond;
		this.tournoi = tournoi;
	}

	public Club() {
		super();
	}
	

}
