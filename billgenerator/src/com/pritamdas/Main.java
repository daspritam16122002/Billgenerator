
//problem statement:
/*
Suppose you open a pizza restaurant and there is two option
for choosing the pizza base Deluxe or normal pizza base for both the Deluxe and normal pizza you will have two choice
veg or nonveg, the veg has a cost of 300 whereas the nonveg is an amount of 400 in case of normal pizza
you can have an option of choosing toppings which cost ₹100 and that option of choosing the amount of extra cheese so it
will cost more 100 rupees and another option will be given as take away or dine in, for takeaway you have to pay 20 rupees and
for dine it is ok it is completely free Now in the other section I can say this is the Deluxe Pizza base you again have two choices between the veg cost almost 500 the non-veg cost amount around  650,
now the Deluxe pizza do not have any option of extra cheese or toppings as by default it has extra cheese and extra toppings here we can get an option of whether to dine or take in and as usual takeaway cost 20 rupees and dine in cost zero
 */


package com.pritamdas;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /* pizza basePizza = new pizza(false);
        basePizza.addExtraCheese();
        basePizza.addExtraTopping();
        basePizza.takeAway();
        basePizza.getBill(); */

        DeluxPizza dp = new DeluxPizza(false);
        dp.getBill();

    }
}
