package com.gestion.club.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gestion.club.entities.Tournoi;
import com.gestion.club.service.ClubService;
import com.gestion.club.service.TournoiService;


@Controller
@RequestMapping("/tournoi/")
public class TournoiController {
	@Autowired
	ClubService clubService;
	@Autowired
	TournoiService tournoiService;
	
	@GetMapping("all")
	public String index(Model model) {
		model.addAttribute("clubs",clubService.getAllClubs());
		model.addAttribute("tournois",tournoiService.getAllTournoi());
		return "show";
		}
	@GetMapping("add")
	public String showFormAdd() {
		return "add";
	}
	@GetMapping("delete/{id}")
	public String delete(@PathVariable int id) {
		tournoiService.deleteTournoi(id);
		return "redirect:/tournoi/all";
	}
	@PostMapping("add")
	public String add(Tournoi t) {
		tournoiService.persistTournoi(t);
		return "redirect:/tournoi/all";
	}
	@GetMapping("update/{id}")
	public String edit(Model model,@PathVariable int id) {
		model.addAttribute("tournoi",tournoiService.findTournoiById(id));
		return "update";
	}
	@PostMapping("update")
	public String update(Tournoi t) {
		tournoiService.updateTournoi(t);
		return "redirect:/tournoi/all";
	}
	@PostMapping("find")
	public String findbynom(@RequestParam String motcle, Model model) {
		model.addAttribute("tournois", tournoiService.findTournoiByNom(motcle));
		model.addAttribute("clubs", clubService.getAllClubs());
		return "show";
	}
}
