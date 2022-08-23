package com.marcos.saguier.tamagotchi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.io.Serializable;
import java.time.LocalDateTime;

@Entity
public class Pet implements Serializable {

    private final static long serialVersionUID = 885782735012279763L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private int level;
    private boolean isAbleToPlay;
    private int hunger;
    private int happiness;
    private LocalDateTime lastTimePlay;

    public Pet(){
        //No-args constructor
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isAbleToPlay() {
        return isAbleToPlay;
    }

    public void setAbleToPlay(boolean ableToPlay) {
        isAbleToPlay = ableToPlay;
    }

    public int getHunger() {
        return hunger;
    }

    public void setHunger(int hunger) {
        this.hunger = hunger;
    }

    public int getHappiness() {
        return happiness;
    }

    public void setHappiness(int happiness) {
        this.happiness = happiness;
    }
}
