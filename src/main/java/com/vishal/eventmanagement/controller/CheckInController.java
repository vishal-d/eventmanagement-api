package com.vishal.eventmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.rest.webmvc.RepositoryRestController;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vishal.eventmanagement.entities.Participant;
import com.vishal.eventmanagement.repos.ParticipantRepository;

@RepositoryRestController
@RequestMapping("/events")
public class CheckInController {
	@Autowired
	private ParticipantRepository participantRepository;
	@PostMapping("/checkin/{id}")
	public ResponseEntity<Participant> checkIn(@PathVariable Long id){
		Participant participant = participantRepository.findById(id).get();
		return null;
	}
}
