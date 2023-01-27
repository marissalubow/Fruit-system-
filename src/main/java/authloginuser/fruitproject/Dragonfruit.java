/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */
public class Dragonfruit extends FruitInfo{
    public Dragonfruit()
    {
      this.setFruitName("Dragonfruit");
      this.setFruitPrice(5);
    }
    @Override
    public String prepAndeat()
    {
       return ("Chop dragonfruit in half and then scoop some of the flesh with a spoon and eat it.");
    }
   
}
