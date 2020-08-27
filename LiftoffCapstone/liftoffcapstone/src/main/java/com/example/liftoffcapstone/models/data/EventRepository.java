package com.example.liftoffcapstone.models.data;

import com.example.liftoffcapstone.models.Event;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public interface EventRepository extends CrudRepository<Event, Integer> {
}
