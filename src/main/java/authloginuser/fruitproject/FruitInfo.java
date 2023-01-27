/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */

//parent abstract class- had abstract prepandeat methods - abstraction and polymorphism
abstract public class FruitInfo {
    private String fruitName; 
    private int fruitAmount; 
    private double fruitPrice; 
    
    FruitInfo()
    {
        this.fruitName = "Fruit Name"; 
        this.fruitAmount = 0;  
        this.fruitPrice = 0.0; 
        
        
    }
    FruitInfo(String fruitName,int fruitAmount,double fruitPrice)
    { 
        this.fruitName = fruitName; 
        this.fruitAmount = fruitAmount; 
        this.fruitPrice = fruitPrice; 
    }
    FruitInfo(FruitInfo f)
    {
        this.fruitName = f.fruitName; 
        this.fruitAmount = f.fruitAmount; 
        this.fruitPrice = f.fruitPrice; 
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public int getFruitAmount() {
        return fruitAmount;
    }

    public void setFruitAmount(int fruitAmount) {
        this.fruitAmount = fruitAmount;
    }

    public double getFruitPrice() {
        return fruitPrice;
    }

    public void setFruitPrice(double fruitPrice) {
        this.fruitPrice = fruitPrice;
    }

   
    
    //compares two values and returns true if the content is the same
    public boolean equals(FruitInfo f)
    {
       if (this.fruitName.equals(f.fruitName) && this.fruitAmount == f.fruitAmount 
               && this.fruitPrice ==f.fruitPrice)
           return true; 
       else 
           return false; 
      
    }
    
    @Override 
    public String toString()
    {
        return ("Fruit name " + this.getFruitName() + " Fruit amount " + this.getFruitAmount()+ " Fruit price " + this.getFruitPrice()); 
    }

    abstract public String prepAndeat(); 
    
    public String calcPrice(int amount, double price)
    {
        double totalPriceFruits = Math.round(price  * amount);
        String str = String.format("%.2f", totalPriceFruits);
        
        return "$" + str;
    }
    public double calcPricedouble(int amount, double price)
    {
        double totalPriceFruits = Math.round(price  * amount);
        return totalPriceFruits;
    }
    
    
    
}
