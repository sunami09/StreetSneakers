package urjc.dad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import urjc.dad.models.User;

public interface UserRepository  extends JpaRepository<User, Long> {

}