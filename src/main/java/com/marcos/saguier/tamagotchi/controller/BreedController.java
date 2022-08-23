package com.marcos.saguier.tamagotchi.controller;

import com.marcos.saguier.tamagotchi.model.Pet;
import com.marcos.saguier.tamagotchi.service.BreedService;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.net.http.HttpResponse;

@Controller
@RequestMapping("")
public class BreedController {

    private BreedService breedService;

    @GetMapping("{id}/able-to-play")
    public ResponseEntity<Boolean> isAbleToPlay(@PathVariable String id){
        return ResponseEntity.ok(breedService.isAbleToPlay(id));
    }
}
