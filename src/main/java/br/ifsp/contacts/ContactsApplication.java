package br.ifsp.contacts;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Classe principal da nossa aplicação Spring Boot.
 * 
 * A anotação @SpringBootApplication habilita as configurações
 * automáticas do Spring (auto-configuration) e também indica 
 * que esta é a classe que deve ser executada para iniciar 
 * a aplicação.
 */
@SpringBootApplication
public class ContactsApplication {

    public static void main(String[] args) {

        SpringApplication.run(ContactsApplication.class, args);
    }

}
