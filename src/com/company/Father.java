package com.company;

public class Father extends Grandfather {
    public Father(String name, int age, PlaceOfResidence placeOfResidence, Profession profession) {
        super(name, age, placeOfResidence, profession);
    }

    public void beatSon(boolean blovosSonLed) {
        if (blovosSonLed == true) {
            System.out.println("Отец побил сына");
        } else {
            System.out.println("Сын вел себя хорошо");
        }

    }

    public final void beatSon(boolean blovosSonLed,int number) {
        if (blovosSonLed == true) {
            System.out.println("Отец побил сына " + number + " раз");
        } else {
            System.out.println("Сын вел себя хорошо");
        }
    }


    @Override
    public String getInfo() {
        return super.getInfo();
    }
}

