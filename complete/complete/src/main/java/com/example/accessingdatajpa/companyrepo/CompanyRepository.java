package com.example.accessingdatajpa.companyrepo;


import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.example.accessingdatajpa.entity.Company;

@Repository

public interface CompanyRepository extends JpaRepository<Company, Integer> {

	Optional<Company> findOneById(Integer getid);
	
	List<Company> findAllByIsActive(String string);
             


}
