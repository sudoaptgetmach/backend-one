package org.mach.src.exercises.exercism;

public class Lasagna {

    private int totalTimeInMinutes;

    public int expectedMinutesInOven() {
        int expectedMinutesInOven = 40;
        return expectedMinutesInOven;
    }

    public int remainingMinutesInOven(int remainingminutes) {
        return expectedMinutesInOven() - remainingminutes;
    }

    public int preparationTimeInMinutes(int minutes) {
        return minutes*2;
    }

    public int totalTimeInMinutes(int layers, int ovenMinutes) {
        return preparationTimeInMinutes(layers) + ovenMinutes;
    }

    public static void main(String[] args) {
        Lasagna lasagna = new Lasagna();

        System.out.println(lasagna.expectedMinutesInOven());
        System.out.println(lasagna.remainingMinutesInOven(30));
        System.out.println(lasagna.preparationTimeInMinutes(2));
        System.out.println(lasagna.totalTimeInMinutes(3, 20));

    }
}
