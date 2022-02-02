package urjc.dad;

import java.time.LocalDateTime;
import java.util.Currency;
import java.util.HashSet;
import java.util.Set;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import urjc.dad.models.Admin;
import urjc.dad.models.Order;
import urjc.dad.models.Product;
import urjc.dad.models.Review;
import urjc.dad.models.User;
import urjc.dad.repositories.AdminRepository;
import urjc.dad.repositories.OrderRepository;
import urjc.dad.repositories.ProductRepository;
import urjc.dad.repositories.ReviewRepository;
import urjc.dad.repositories.UserRepository;

@Component
public class DatabaseInitializer {

	
	@Autowired
	private AdminRepository adminRepository;
	
	@Autowired
	private UserRepository userRepository;
	
	@Autowired
	private OrderRepository orderRepository;
	
	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private ReviewRepository reviewRepository;


	@PostConstruct
	public void init() {
		
		Admin admin1= new Admin("Raul", "Heredia", "raulHeredia@gmail.com", "1234");
		Admin admin2= new Admin("Alberto", "Martin", "albertomartin@gmail.com", "4567");
		Admin admin3= new Admin("Fatima", "Smount", "FatimaSmount@gmail.com", "8901");
		adminRepository.save(admin1);
		adminRepository.save(admin2);
		adminRepository.save(admin3);
		
		User user1= new User("Heredia", "Raul", "HerediaRaul@gmail.com", "1234");
		User user2= new User("Martin","Alberto", "martinalberto@gmail.com", "4567");
		User user3= new User("Smount","Fatima","Smountfatima@gmail.com", "8901");
		
		userRepository.save(user1);
		userRepository.save(user2);
		userRepository.save(user3);
		
		Product product1 = new Product("AirForce1", "Zapatillas grandes", 123.4, 44);
		Product product2 = new Product("Jordan", "Zapatillas de baloncesto", 99.99, 42);
		Product product3 = new Product("Ultraboost", "Zapatillas comodas", 180, 41);
		
		productRepository.save(product1);
		productRepository.save(product2);
		productRepository.save(product3);
		
		Set<Product> set= new HashSet<>();
		set.add(product1);
		set.add(product3);
		set.add(product2);
		LocalDateTime date =  LocalDateTime.of(2022,02,02,10,00,00);
		Order order1= new Order(user1,date,300.02,set);
		
		//orderRepository.save(order1);
		
		Review review1= new Review(product1,"muy bonitas",user1,"perfectas",5);
		Review review2= new Review(product2,"muy grandes",user2,"mala talla",2);
		Review review3= new Review(product3,"muy feas",user3,"no se corresponde con la foto",1);
		
		reviewRepository.save(review1);	
		reviewRepository.save(review2);	
		reviewRepository.save(review3);	
		
	}	
}
	