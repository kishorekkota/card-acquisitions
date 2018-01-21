package com.cloud.app;

import com.cloud.prospects.Propspects;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@ComponentScan
public class ProspectController
{
    private String id;

    @GetMapping(value = "/prospects/{id}")
    public ResponseEntity getProspect(@PathVariable String id){

        System.out.println(id);

        return ResponseEntity.status(HttpStatus.OK).build();
    }

    @GetMapping("/getit")
    public String getIt(){

        //System.out.println(proespectId);

        return "Got it..Really";
    }

    @PostMapping("/prospects")
    public ResponseEntity add(Propspects prospect)
    {

        System.out.print(prospect.toString());

        return ResponseEntity.status(HttpStatus.CREATED).build();

    }


    @DeleteMapping("/prospects/{id}")
    public ResponseEntity add(@PathVariable String id)
    {


        //System.out.print(proespectId);

        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();

    }
}
