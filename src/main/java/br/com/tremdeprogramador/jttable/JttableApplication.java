package br.com.tremdeprogramador.jttable;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
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
        LOG.info("EXECUTING : command line runner");
 
        for (int i = 0; i < args.length; ++i) {
            LOG.info("args[{}]: {}", i, args[i]);
        }
    }
}
