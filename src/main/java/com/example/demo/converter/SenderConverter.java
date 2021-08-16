package com.example.demo.converter;

import org.springframework.stereotype.Component;

import com.example.demo.dto.SenderDTO;
import com.example.demo.entity.SenderEntity;
@Component
public class SenderConverter {
	public SenderDTO toDTO(SenderEntity e) {
		SenderDTO dto = new SenderDTO() ;
		dto.setContent(e.getContent());
		dto.setEmail(e.getEmail());
		dto.setName(e.getName());
		dto.setPhone(e.getPhone());
		return dto;
	}
	public SenderEntity toEntity(SenderDTO dto) {
		SenderEntity e = new SenderEntity() ;
		e.setContent(dto.getContent());
		e.setEmail(dto.getEmail());
		e.setName(dto.getName());
		e.setPhone(dto.getPhone());
		return e;
	}
}
