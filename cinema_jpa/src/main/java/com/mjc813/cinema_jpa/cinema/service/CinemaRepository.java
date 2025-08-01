package com.mjc813.cinema_jpa.cinema.service;

import com.mjc813.cinema_jpa.cinema.dto.CinemaEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@Repository
@RepositoryRestResource(path = "cinema2")
public interface CinemaRepository extends JpaRepository<CinemaEntity, Long> {

}
