package com.vishal.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vishal.eventmanagement.entities.Venue;



public interface ParticipantRepository extends PagingAndSortingRepository<Venue, Long> {

}
