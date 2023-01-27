/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */
public class Pomergranate extends FruitInfo{
    public Pomergranate()
    {
      this.setFruitName("Pomegranate");
      this.setFruitPrice(2.99);
      
    }
    @Override
    public String prepAndeat()
    {
       return ("Cut off top of pomegranate, cut along the sections of the white membrane," +" and then eat the seeds.");
    }
    
}
