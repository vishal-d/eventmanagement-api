package com.vishal.eventmanagement.repos;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.vishal.eventmanagement.entities.Event;


public interface VenueRepository extends PagingAndSortingRepository<Event, Long> {

}
