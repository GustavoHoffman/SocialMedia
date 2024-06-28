package com.example.RedeSocial.Repository;

import com.example.RedeSocial.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer>{
}
