package com.example.Demo.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Demo.Entity.FetchNextNumber;
import com.example.Demo.Service.FetchService;

public interface FetchRepo extends JpaRepository<FetchNextNumber,Integer> {

	void save(FetchService fs);

}
