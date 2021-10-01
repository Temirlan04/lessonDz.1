package com.company;

public final class Son extends Father {
    public Son(String name, int age, PlaceOfResidence placeOfResidence, Profession profession) {
        super(name, age, placeOfResidence, profession);
    }

    public void whippingPact(boolean еheSonDissuades) {
        super.beatSon(!(еheSonDissuades));
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

}
