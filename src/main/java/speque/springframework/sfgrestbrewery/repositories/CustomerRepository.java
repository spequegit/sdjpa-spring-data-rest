package speque.springframework.sfgrestbrewery.repositories;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import speque.springframework.sfgrestbrewery.domain.Beer;
import speque.springframework.sfgrestbrewery.domain.BeerStyleEnum;
import speque.springframework.sfgrestbrewery.domain.Customer;

import java.util.UUID;


public interface CustomerRepository extends JpaRepository<Customer, UUID> {
    Page<Customer> findAllByName(String name, Pageable pageable);

}
