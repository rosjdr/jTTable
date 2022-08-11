package br.com.tremdeprogramador.jttable.model;

import java.math.BigDecimal;

import org.springframework.stereotype.Component;

@Component
public class Teacher {
    private Long id;
    private String name;
    private int[] constraints; //store the constraints of the teacher

    public Teacher() {

    }

    public Teacher(String name, Long id, int[] constraints) {
        this.name = name;
        this.id = id;        
        this.constraints = constraints;
    }

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        return ((Teacher)obj).id == this.id;
    }

    @Override
    public int hashCode() {
        return this.id.intValue();
    }

    @Override
    public String toString() {
        String cons = ""; //convert the constraints array to a string
        for (int i : constraints) {
            cons += i + ",";
        } 
        cons = cons.substring(0, cons.length() - 1);
        return "Teacher [id=" + id + ", name=" + name + ", constraints= {" + cons + "} ]";
    }

}
