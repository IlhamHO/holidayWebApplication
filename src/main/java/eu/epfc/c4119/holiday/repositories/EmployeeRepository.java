package eu.epfc.c4119.holiday.repositories;

import eu.epfc.c4119.holiday.entities.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
