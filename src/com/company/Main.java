package com.company;

public class Main {

    public static void main(String[] args) {

      /*  Father father = new Father("Kolin",33,new PlaceOfResidence("Ул Токтогула"),Profession.BUILDER);
        father.beatSon(true);
        father.beatSon(true,5);

        Son son = new Son("Dio",15,new  PlaceOfResidence("Ул Петровское"),Profession.PART_TIME_JOB);
        son.whippingPact(true);*/

        Father Denil = new Father("Denil",22,new PlaceOfResidence("Пермоненко"),Profession.BUILDER);
        Son Alex = new Son("Alex",15,new PlaceOfResidence("Ул Пушкино"),Profession.PART_TIME_JOB);
        Son Johni = new Son("Johni",19,new PlaceOfResidence("Ул Глаткова"),Profession.PART_TIME_JOB);

        System.out.println(Denil.getInfo());
        Denil.beatSon(true,5);
        System.out.println("-------------------------------------");
        System.out.println(Alex.getInfo());
        Alex.whippingPact(false);
        System.out.println("-------------------------------------");
        System.out.println(Johni.getInfo());
        Johni.whippingPact(true);

    }
}
