package urjc.dad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import urjc.dad.models.Admin;

public interface AdminRepository  extends JpaRepository<Admin, Long> {

}
