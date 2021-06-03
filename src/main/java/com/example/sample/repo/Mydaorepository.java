package com.example.sample.repo;
import com.example.sample.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
 

 
@Repository
public interface Mydaorepository extends JpaRepository<Employee, Integer> {
 
}