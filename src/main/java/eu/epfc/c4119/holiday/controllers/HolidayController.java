package eu.epfc.c4119.holiday.controllers;

import eu.epfc.c4119.holiday.entities.Holiday;
import eu.epfc.c4119.holiday.repositories.HolidayRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class HolidayController {
    private HolidayRepository repository;

    public HolidayController(HolidayRepository repository) {
        this.repository = repository;
    }

    // http://localhost:8080/holidays
    @GetMapping("holidays")
    public String get(Model model) {
        List<Holiday> holidays = repository.findAll();
        for(Holiday h : holidays) System.out.println(h.toString());
        model.addAttribute("list", holidays);
        return "holidays.html";
    }
}
