package urjc.dad.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import urjc.dad.models.Review;

public interface ReviewRepository  extends JpaRepository<Review, Long> {

}
