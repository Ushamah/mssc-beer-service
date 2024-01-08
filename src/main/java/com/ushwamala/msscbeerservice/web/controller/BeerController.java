package com.ushwamala.msscbeerservice.web.controller;


import com.ushwamala.msscbeerservice.web.model.BeerDto;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RequestMapping("api/v1/beer")
@RestController
public class BeerController {

    @GetMapping({"{/beerId}"})
    public ResponseEntity<BeerDto> getBeerById(@PathVariable("beerId") UUID beerId) {

        //TODO: impl
        return new ResponseEntity<>(BeerDto.builder().build(), HttpStatusCode.valueOf(200));
    }

    @PostMapping
    public ResponseEntity saveNewBeer(@RequestBody BeerDto beerDto){

        return new ResponseEntity(beerDto, HttpStatus.CREATED);
    }


    @PutMapping({"{/beerId}"})
    public ResponseEntity updateBeerById(@PathVariable("beerId") UUID beerId, @RequestBody BeerDto beerDto){

        return new ResponseEntity(beerDto, HttpStatus.NO_CONTENT);
    }

    @DeleteMapping({"{/beerId}"})
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void deleteBeerById (@PathVariable("beerId") UUID beerId){

    }

}
