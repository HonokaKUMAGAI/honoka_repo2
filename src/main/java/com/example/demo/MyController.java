package com.example.demo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

// ①@Controllerって書いてインポートする（アノテーション）
@Controller
public class MyController {

	@Autowired
	GangsRepository gangsRepository;
	
	@Autowired
	MyCommandLineRunner myCommandLineRunner;	
	
	// ③@GetMapping("/")って書いてインポートする（アノテーション）
	@GetMapping("/")
	// ②コントローラの中にメソッド（名称自由）を作り、HTMLファイル名のドットの前を書く
	public String getIndex(Model model) {// ④Model(org spring workframe)のほうをインポート

		model.addAttribute("greating1", "");
		model.addAttribute("greating2", "");
		model.addAttribute("greating3", "");

		return "index";
	}
	/*
	 * ここから2024年5月16日の改良
	 */

	@GetMapping("/gangs0516_top")
    public String showGangs0516(Model model) {
        List<Person3> gangsList2 = gangsRepository.findAll();
        model.addAttribute("person3", gangsList2);
        return "gangs0516_top";
    }
	
	@GetMapping("/gangs0516_filtered")
	public String showFilteredGangs0516(@RequestParam int age, @RequestParam String condition, Model model) {
		if (condition.equals("under")) {
	        model.addAttribute("person3", gangsRepository.findByAgeLessThan(age));
	    } else {
	        model.addAttribute("person3", gangsRepository.findByAgeGreaterThan(age));
	    }
	    return "gangs0516_filtered"; // 適切なビュー名を返す
	}

	@PostMapping("/gangs0516_filtered")
	public String postFilteredGangs0516(@RequestParam int age, @RequestParam String condition, Model model) {
	    if (condition.equals("under")) {
	        model.addAttribute("person3", gangsRepository.findByAgeLessThan(age));
	    } else {
	        model.addAttribute("person3", gangsRepository.findByAgeGreaterThan(age));
	    }
	    return "gangs0516_filtered";
	}
	
}
