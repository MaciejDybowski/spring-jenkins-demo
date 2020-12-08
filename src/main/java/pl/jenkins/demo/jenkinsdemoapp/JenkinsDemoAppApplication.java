package pl.jenkins.demo.jenkinsdemoapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class JenkinsDemoAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JenkinsDemoAppApplication.class, args);
    }


    @GetMapping("/test")
    public String get(){
        return "Łap wiadomosc";
    }

    @GetMapping("/test2")
    public String get2(){
        return "Łap wiadomosc2";
    }

    @GetMapping("/test3")
    public String get3(){
        return "Łap wiadomosc3";
    }
}
