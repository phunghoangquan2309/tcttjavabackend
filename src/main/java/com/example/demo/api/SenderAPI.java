package com.example.demo.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.SenderDTO;
import com.example.demo.service.SenderService;

@RestController
@CrossOrigin
public class SenderAPI {
	@Autowired
	SenderService senderService;
	@GetMapping("/getlist")
	public List<SenderDTO> getlist(){
		return senderService.getlist();
	}
	@PostMapping("/add")
	public SenderDTO add(@RequestBody SenderDTO model){
		return senderService.add(model);
	}
}
