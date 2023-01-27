/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */
public class Grape extends FruitInfo{
    public Grape()
    {
      this.setFruitName("Grape");
      this.setFruitPrice(2.79);
      
    }
    @Override
    public String prepAndeat()
    {
       return ("Rinse grapes with water, take a grape off the stem and then pop it into your mouth.");
    }
   
}
