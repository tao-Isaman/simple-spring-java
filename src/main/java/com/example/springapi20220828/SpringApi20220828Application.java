package com.example.springapi20220828;

import com.example.springapi20220828.dependency.Customer;
import com.example.springapi20220828.entity.Employee;
import com.example.springapi20220828.repository.EmployeeRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringApi20220828Application {

	public static void main(String[] args) {

		ApplicationContext context = SpringApplication.run(SpringApi20220828Application.class, args);

		Customer customer = context.getBean(Customer.class);
		System.out.println("Customer name " + customer.getName() );
		System.out.println("Customer address no " + customer.getAddress().getAddressNo() );
		System.out.println("Customer address name " + customer.getAddress().getAddressName() );

	}

	@Bean
	public CommandLineRunner initialize(EmployeeRepository employeeRepository){
		return (args -> {
			{
				Employee employee = new Employee();
				employee.setLastName("foo");
				employee.setFirstName("bar");
				employeeRepository.save(employee);
			}

			{
				Employee employee = new Employee();
				employee.setLastName("jar");
				employee.setFirstName("tao");
				employeeRepository.save(employee);
			}
		});
	}

}
