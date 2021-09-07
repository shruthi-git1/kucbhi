package com.wiley.resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.wiley.bean.Movie;
import com.wiley.service.MovieService;

@RestController 
public class MovieResource {
	
	@Autowired
	private MovieService movieService;
		
	@GetMapping(value = "/movies/{id}",produces = "application/json")
	public Movie getMovieById(@PathVariable int id) {
		return movieService.findMovieById(id);
	}
}
