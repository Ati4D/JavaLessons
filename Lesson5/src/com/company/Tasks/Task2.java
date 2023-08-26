package com.company.Tasks;

import com.company.Models.City;

public class Task2 {

    public static void main(String[] args) {
        City city = new City("Kovel", "Volyn", "Ukraine", 68240L, 45060, (short) 3352);
        city.printCity();
    }
}
