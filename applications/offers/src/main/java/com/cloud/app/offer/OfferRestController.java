package com.cloud.app.offer;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OfferRestController {

    @GetMapping("/offers")
    public String getOffers()
    {
        return "Awesome Offers";
    }
}
