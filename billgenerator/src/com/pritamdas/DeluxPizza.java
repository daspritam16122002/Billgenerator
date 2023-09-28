package com.pritamdas;

public class DeluxPizza extends pizza {
    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraTopping();
        super.addExtraCheese();
    }

    //disable the add cheese and topping choosing option from Deluxe pizza
    @Override
    public void addExtraCheese() {}
    @Override
    public void addExtraTopping() {}
}
