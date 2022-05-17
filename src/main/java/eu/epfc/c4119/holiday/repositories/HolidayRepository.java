package eu.epfc.c4119.holiday.repositories;

import eu.epfc.c4119.holiday.entities.Holiday;
import org.springframework.data.jpa.repository.JpaRepository;

public interface HolidayRepository extends JpaRepository<Holiday, Long> {
}
