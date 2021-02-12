package it.sirfin.rubricagal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan(basePackages = {"it.sirfin.rubricaGal"})
@EnableJpaRepositories(basePackages = {"it.sirfin.rubricaGal.repository"})
@EntityScan(basePackages = {"it.sirfin.rubricaGal.model"})
public class RubricagalApplication {

    public static void main(String[] args) {
        SpringApplication.run(RubricagalApplication.class, args);
    }
}
