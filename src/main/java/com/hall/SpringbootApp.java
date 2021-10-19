package com.hall;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class SpringbootApp {

    public static void main(String[] args) { SpringApplication.run(SpringbootApp.class, args); }


    @CrossOrigin("http://localhost:3000")
    @GetMapping("/physicsWhat")
    public String reqResponse(){
        Book defaultBook = new Book("The 3 Body Problem","Cixin Liu",1);
        return defaultBook.toString();
    }

    @CrossOrigin("http://localhost:3000")
    @GetMapping("/thinkMark")
    public String invincible(){
        Comic invincible = new Comic("Invincible","Robert Kirkman","Cory Walker, Ryan Ottley",12);
        return invincible.toString();
    }

}
