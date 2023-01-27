/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */
public class Apple extends FruitInfo //inheritance
{
    public Apple()
    {
        this.setFruitName("Apple");
        this.setFruitPrice(0.99);
    }
    @Override
    public String prepAndeat()
    {
        return ("Rinse apple with water and then bite into it.");
    }
     
     
}
