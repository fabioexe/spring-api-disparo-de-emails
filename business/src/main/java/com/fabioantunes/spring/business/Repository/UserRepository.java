package com.fabioantunes.spring.business.Repository;

import com.fabioantunes.spring.business.Domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {



}
