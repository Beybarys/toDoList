package kz.primesource.todoliist.models;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table (name = "tasks")
public class Tasks {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column
    private String name;

    @Column
    private Integer priority;

    @Column
    private Date date;

    @Column
    private String description;

    public Tasks(Long id, String name, Integer priority, Date date, String description) {
        this.id = id;
        this.name = name;
        this.priority = priority;
        this.date = date;
        this.description = description;
    }

    public Tasks() {

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
