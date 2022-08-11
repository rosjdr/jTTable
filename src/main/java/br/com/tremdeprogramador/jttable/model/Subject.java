package br.com.tremdeprogramador.jttable.model;

import org.springframework.stereotype.Component;

@Component
public class Subject {
    
    private Long id;
    private String name;
    private String initials;
    private int workload;
    private Teacher teacher;

    public Subject() {
    }

    public Subject(Long id, String name, String initials, int workload, Teacher teacher) {
        this.id = id;
        this.name = name;
        this.initials = initials;
        this.workload = workload;
        this.teacher = teacher;
    }

    @Override
    public String toString() {
        return "Subject [id=" + id + ", name=" + name + ", initials=" + initials + ", workload=" + workload + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return ((Subject)obj).id == this.id;
    }

    @Override
    public int hashCode() {
        return this.id.intValue();
    }




}
