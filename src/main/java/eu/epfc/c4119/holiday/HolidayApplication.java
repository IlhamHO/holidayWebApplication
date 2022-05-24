package eu.epfc.c4119.holiday;

import eu.epfc.c4119.holiday.entities.Employee;
import eu.epfc.c4119.holiday.entities.Holiday;
import eu.epfc.c4119.holiday.repositories.EmployeeRepository;
import eu.epfc.c4119.holiday.repositories.HolidayRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;
import java.util.List;

@SpringBootApplication
public class HolidayApplication implements CommandLineRunner {
	private HolidayRepository holidayRepository;
	private EmployeeRepository employeeRepository;

	public HolidayApplication(HolidayRepository holidayRepository, EmployeeRepository employeeRepository) {
		this.holidayRepository = holidayRepository;
		this.employeeRepository = employeeRepository;
	}

	public static void main(String[] args) {
		SpringApplication.run(HolidayApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Holiday> holidays = new ArrayList<>();
		holidays.add(new Holiday(null,"Sara","2022-06-01","2022-06-30","ACCEPTED"));
		holidays.add(new Holiday(null,"Sara","2022-08-15","2022-08-30","REQUESTED"));
		holidayRepository.saveAll(holidays);

		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(null,"A001","Sylvie","Graver","sylvie@gmail.com"));
		employees.add(new Employee(null,"A001","Ronan","Fillip","ronan@gmail.com"));
		employeeRepository.saveAll(employees);
	}
}
