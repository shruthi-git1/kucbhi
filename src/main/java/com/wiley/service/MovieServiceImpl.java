package com.wiley.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.wiley.bean.Movie;
import com.wiley.persistence.MovieDao;

@Service
public class MovieServiceImpl implements MovieService{
	@Autowired
	private MovieDao movieDao;

	@Override
	public Movie findMovieById(int id) {
		// TODO Auto-generated method stub
		return movieDao.getById(id);
	}
}
