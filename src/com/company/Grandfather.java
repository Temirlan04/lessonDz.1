package com.company;

public class Grandfather {
    private String name;
    private int age;
    private PlaceOfResidence placeOfResidence;
    private Profession profession;

    public Grandfather(String name, int age, PlaceOfResidence placeOfResidence, Profession profession) {
        this.name = name;
        this.age = age;
        this.placeOfResidence = placeOfResidence;
        this.profession = profession;
    }



    public String getInfo(){
        return "name: " + getName() + "\nage: " + getAge() +"\nplaceOfResidence: " + placeOfResidence.getAddress() + "\nprofession: " + getProfession();
    }


    public String getName() {
        return name;
    }


    public int getAge() {
        return age;
    }

    public Profession getProfession() {
        return profession;
    }
}
