package akityty.demo.repository;

import akityty.demo.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface  CustomerRepository extends CrudRepository<Customer,Long> {
    List<Customer> findByLastName(String lastName);
}
