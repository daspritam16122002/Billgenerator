package com.pritamdas;

public class pizza {
    private int price;
    private Boolean veg;
    private final int extraCheesePrice = 100;
    private final int extraToppingPrice = 100;
    private final int backpackPrice = 20;
    private int basePizzaPrice;

    private boolean isExtraCheeseAdded = false;
    private boolean isExtraToppingsAdded = false;
    private boolean isTakeAway = false;


    public pizza(Boolean veg) {
        this.veg = veg;
        if(this.veg)
            this.price = 300;
        else{
            this.price = 450;
        }

        basePizzaPrice = this.price;
    }


    public void addExtraCheese(){
        isExtraCheeseAdded = true;
//        System.out.println("Extra cheese added + $100!");
        this.price += extraCheesePrice;
    }
    public void addExtraTopping(){
        isExtraToppingsAdded = true;
//        System.out.println("Extra Topping added + $100!");
        this.price += extraToppingPrice;
    }
    public void takeAway(){
        isTakeAway = true;
//        System.out.println("You choose to take away + $20 !");
        this.price += backpackPrice;
    }
    public void getBill(){
        String bill = "";
        System.out.println("Base Pizza cost: $" + basePizzaPrice);
        if (isExtraCheeseAdded == true){
            bill += "Extra cheese added: " +extraCheesePrice + "\n" ;
        }
        if (isExtraToppingsAdded == true){
            bill += "Extra Toppings added: " +extraToppingPrice + "\n" ;
        }
        if (isTakeAway == true){
            bill += "Opted for take away: " +backpackPrice + "\n" ;
        }

        bill += "Your Bill: " + this.price + "\n";
        System.out.println(bill);
    }

}
