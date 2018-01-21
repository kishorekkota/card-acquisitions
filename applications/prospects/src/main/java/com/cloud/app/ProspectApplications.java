package com.cloud.app;


import com.cloud.prospects.Propspects;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.SpringApplication;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication

public class ProspectApplications {

    public static void main(String[] args)
    {
        SpringApplication.run(ProspectApplications.class, args);
    }


}

