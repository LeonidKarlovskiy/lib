package com.example.demolib.spring.repository;


import com.example.demolib.domain.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher,Long> {

    List<Publisher> findByNameContainingIgnoreCaseOrderByName(String name );
}
