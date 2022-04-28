package com.gestion.club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestion.club.entities.Club;
import com.gestion.club.service.ClubService;
import com.gestion.club.service.IServiceClub;
import com.gestion.club.service.TournoiService;



@Controller
@RequestMapping("/club/")
public class ClubController {

	@Autowired
	ClubService clubService;
	@Autowired
	TournoiService tournoiService;
	
	@GetMapping("all")
	public String index(Model model) {
		model.addAttribute("clubs",clubService.getAllClubs());
		model.addAttribute("tournois",tournoiService.getAllTournoi());
		return "index";
		}
	@GetMapping("add")
	public String showFormAdd(Model model) {
		model.addAttribute("tournois",tournoiService.getAllTournoi());
		return "ajout";
	}
	@GetMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		clubService.deleteClub(id);
		return "redirect:/club/all";
	}
	@PostMapping("add")
	public String add(Club c) {
		//
		clubService.persistClub(c);
		return "redirect:/club/all";
	}
	@GetMapping("update/{id}")
	public String edit(Model model,@PathVariable int id) {
		model.addAttribute("tournois",tournoiService.getAllTournoi());
		model.addAttribute("club",clubService.findClubById(id));
		return "modif";
	}
	@PostMapping("update")
	public String update(Club c) {
		//
		clubService.updateClub(c);
		return "redirect:/club/all";
	}
	@PostMapping("find")
	public String findbynom(@RequestParam String motcle, Model model) {
		model.addAttribute("clubs", clubService.findClubsByNom(motcle));
		model.addAttribute("tournois", tournoiService.getAllTournoi());
		return "index";
	}
	
		
}

