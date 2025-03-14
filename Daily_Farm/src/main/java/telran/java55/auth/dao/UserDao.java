package telran.java55.auth.dao;

import java.util.Optional;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import telran.java55.auth.model.User; 

@Repository
public interface UserDao extends JpaRepository<UserDao, Long> {
    Optional<UserDao> findByEmail(String email);
}









