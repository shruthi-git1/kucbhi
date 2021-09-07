package com.wiley.persistence;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.wiley.bean.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie,Integer>{

}
