package com.digitazon.model.beer;

public class CharlesQuintBeer extends BeerItem{
    public CharlesQuintBeer(String codeBeer, String nameBeer, double alcoholPercentage, String description, String beerStyle) {
        super(codeBeer, nameBeer, alcoholPercentage, description, beerStyle);
    }

    @Override
    public double calculatePrice() {
        return 0;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
