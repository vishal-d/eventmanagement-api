package com.vishal.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vishal.eventmanagement.entities.Organizer;


public interface OrganizerRepository extends PagingAndSortingRepository<Organizer, Long> {

}
