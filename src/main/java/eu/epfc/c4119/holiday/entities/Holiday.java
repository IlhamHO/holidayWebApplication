package eu.epfc.c4119.holiday.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Holiday {
    @Id
    @GeneratedValue
    private Long id;
    private String employee;
    private String start;
    private String end;
    private String status;

    // ajouter
    // constucteur sans argument
    // constructeur avec tous les arguments
    // tous les getter and setter
    // le toString
    public Holiday() {
    }

    public Holiday(Long id, String employee, String start, String end, String status) {
        this.id = id;
        this.employee = employee;
        this.start = start;
        this.end = end;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Holiday{" +
                "id=" + id +
                ", employee='" + employee + '\'' +
                ", start='" + start + '\'' +
                ", end='" + end + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
