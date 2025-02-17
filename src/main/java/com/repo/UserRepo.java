package com.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dto.UserDto;

@Repository
public interface UserRepo extends JpaRepository<UserDto, Integer>{

}
