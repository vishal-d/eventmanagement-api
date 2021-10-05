package com.vishal.eventmanagement.repos;

import java.time.ZoneId;
import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import com.vishal.eventmanagement.entities.Event;



public interface EventRepository extends PagingAndSortingRepository<Event, Long> {
	
	List<Event> findByName(@Param("name")String name);
	Page<Event> findByNameAndZoneId(@Param("name")String name,@Param("zoneId") ZoneId zoneId);
}
