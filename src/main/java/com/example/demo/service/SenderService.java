package com.example.demo.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.converter.SenderConverter;
import com.example.demo.dto.SenderDTO;
import com.example.demo.entity.SenderEntity;
import com.example.demo.repository.SenderRepository;

@Service
public class SenderService {
	@Autowired
	SenderRepository senderRepository;
	@Autowired
	SenderConverter senderConverter;
	public List<SenderDTO> getlist() {
		List<SenderEntity> list =senderRepository.findAll();
		List<SenderDTO> listSenderDTO = new ArrayList<SenderDTO>();
		for (int i=0;i<list.size();i++) {
			listSenderDTO.add(senderConverter.toDTO(list.get(i)));
		}
		return listSenderDTO;
	}
	public SenderDTO add(SenderDTO model) {
		SenderEntity sendere = senderConverter.toEntity(model);
		senderRepository.save(sendere);
		SenderDTO senderdto = senderConverter.toDTO(sendere);
		return senderdto;
	}
}
