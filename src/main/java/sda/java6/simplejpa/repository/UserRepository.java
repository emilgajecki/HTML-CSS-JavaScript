package sda.java6.simplejpa.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sda.java6.simplejpa.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
