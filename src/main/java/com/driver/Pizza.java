package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private Boolean cheese ;
    private Boolean topping;
    private Boolean carrybag ;
    private Boolean billGenerated;

    public Pizza(Boolean isVeg){
        this.isVeg = isVeg;
        cheese = false ;
        topping =false ;
        carrybag = false ;
        billGenerated = false ;

        if(this.isVeg==true)
        {
            this.price = 300 ;
            this.bill = "Base Price Of The Pizza: 300\n" ;
        }
        else
        {
            this.price=400 ;
            this.bill = "Base Price Of The Pizza: 400\n" ;
        }
    }

    public int getPrice(){
        return this.price;
    }

    public void addExtraCheese(){
        if(cheese==false)
        price+= 80;
        cheese = true ;
    }

    public void addExtraToppings(){
        if(topping==false)
        {
            if(isVeg ==true)
            price += 70 ;
            else
            price += 120 ;
        }
        topping = true ;
    }

    public void addTakeaway(){
        // your code goes here
        if(carrybag==false)
        price += 20 ;
        carrybag = true ;
    }

    public String getBill(){
        // your code goes here
        if(billGenerated==false)
        {
            billGenerated = true ;
            if(cheese==true)
            bill += "Extra Cheese Added: 80\n" ;

            if(topping == true && isVeg==true)
            bill+= "Extra Toppings Added: 70\n";

            if(topping==true && isVeg==false)
            bill+= "Extra Toppings Added: 120\n";

            if(carrybag==true)
            bill+= "Paperbag Added: 20\n";
        
            bill+= "Total Price: "+price+"\n" ;
        }

        return this.bill;
    }
}
