package com.gestion.club.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gestion.club.service.IServiceClub;
import com.gestion.club.entities.Club;
import com.gestion.club.service.ClubService;
import com.gestion.club.service.TournoiService;
@RestController
@RequestMapping("/api/clubs")
public class RestClubController {
	@Autowired
	IServiceClub clubService;
	
	@GetMapping("")
	public List<Club> all(){
		return clubService.getAllClubs();
	}
	@GetMapping("/{id}")
	public Club getClub(@PathVariable int id) {
		return clubService.findClubById(id);
	}
	
	@PostMapping("/add")
	public Club add(@RequestBody Club c) {
		return clubService.persistClub(c);
	}
	@PutMapping("/update")
	public Club update(@RequestBody Club c) {
		return clubService.persistClub(c);
	}
	@DeleteMapping("/{id}")
	public String delete(@PathVariable int id) {
		clubService.deleteClub(id);
		return "Suppression réussite";
	}
	
	/*@PostMapping("/findbytour")
	public List<Club> add(@RequestParam int idt){
		return clubService.findClubByTour(idt);
	}*/

}
