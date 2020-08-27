package com.example.liftoffcapstone.models;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

public class Equine extends AbstractEntity{

    @NotBlank
    @Size(max = 100)
    private String equineName;

    @NotBlank
    @Size(max = 4)
    private int yearOfBirth;

    @NotBlank
    @Size(max = 10)
    private int height;

    @NotBlank
    @Size(max = 255)
    private int weight;

    private String gender;

    private boolean inFoal;
    private boolean foalAtSide;
    private boolean atStud;

    @NotBlank
    @Size(max = 100)
    private String color;

    @NotBlank
    @Size(max = 255)
    private String description;
    private boolean forSale;
    private boolean forLease;

    public Equine() {
    }

    public Equine(String equineName, int yearOfBirth, int height, int weight, String gender, boolean inFoal, boolean foalAtSide, boolean atStud, String color, String description, boolean forSale, boolean forLease, List<Event> events) {
        this.equineName = equineName;
        this.yearOfBirth = yearOfBirth;
        this.height = height;
        this.weight = weight;
        this.gender = gender;
        this.inFoal = inFoal;
        this.foalAtSide = foalAtSide;
        this.atStud = atStud;
        this.color = color;
        this.description = description;
        this.forSale = forSale;
        this.forLease = forLease;
        this.events = events;
    }

    // @OneToMany(mappedBy = "user")
    private List<Event> events =new ArrayList<Event>();

    public String getEquineName() {
        return equineName;
    }

    public void setEquineName(String equineName) {
        this.equineName = equineName;
    }

    public int getYearOfBirth() {
        return yearOfBirth;
    }

    public void setYearOfBirth(int yearOfBirth) {
        this.yearOfBirth = yearOfBirth;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isInFoal() {
        return inFoal;
    }

    public void setInFoal(boolean inFoal) {
        this.inFoal = inFoal;
    }

    public boolean isFoalAtSide() {
        return foalAtSide;
    }

    public void setFoalAtSide(boolean foalAtSide) {
        this.foalAtSide = foalAtSide;
    }

    public boolean isAtStud() {
        return atStud;
    }

    public void setAtStud(boolean stStud) {
        this.atStud = stStud;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isForSale() {
        return forSale;
    }

    public void setForSale(boolean forSale) {
        this.forSale = forSale;
    }

    public boolean isForLease() {
        return forLease;
    }

    public void setForLease(boolean forLease) {
        this.forLease = forLease;
    }
}
