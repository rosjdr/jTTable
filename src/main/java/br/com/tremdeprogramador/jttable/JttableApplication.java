package br.com.tremdeprogramador.jttable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.tremdeprogramador.jttable.model.Teacher;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;

@SpringBootApplication
public class JttableApplication implements CommandLineRunner {

    private static Logger LOG = LoggerFactory
      .getLogger(JttableApplication.class);

    public static void main(String[] args) {
        LOG.info("STARTING THE APPLICATION");
        SpringApplication.run(JttableApplication.class, args);
        LOG.info("APPLICATION FINISHED");
    }
 
    @Override
    public void run(String... args) {
        int[] constraints = {0, 0, 1,1,0,0,0,0,1,1};
        Teacher teacher = new Teacher("Rodrigo", 1L, constraints);
        


        LOG.info(teacher.toString());
    }
}
