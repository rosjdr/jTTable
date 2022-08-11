package br.com.tremdeprogramador.jttable.model;

import org.springframework.stereotype.Component;

@Component
public class Class {
    
    private Long id;
    private String name;
    private String initials;
    private int workload;

    public Class() {
    }

    public Class(Long id, String name, String initials, int workload) {
        this.id = id;
        this.name = name;
        this.initials = initials;
        this.workload = workload;
    }

    @Override
    public String toString() {
        return "Class [id=" + id + ", name=" + name + ", initials=" + initials + ", workload=" + workload + "]";
    }

    @Override
    public boolean equals(Object obj) {
        return ((Class)obj).id == this.id;
    }

    @Override
    public int hashCode() {
        return this.id.intValue();
    }




}
