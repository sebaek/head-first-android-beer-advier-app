package com.hfad.beeradviser;

import java.util.ArrayList;
import java.util.List;

public class BeerExpert {

    List<String> getBrands(String color) {
        List<String> brands = new ArrayList<>();
        switch (color) {
            case "amber":
                brands.add("Jack Amber");
                brands.add("Red Moose");
                break;
            default:
                brands.add("Jail Pale Ale");
                brands.add("Gout Stout");

        }
        return brands;
    }
}
