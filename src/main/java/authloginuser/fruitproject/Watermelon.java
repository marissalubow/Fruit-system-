/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */
public class Watermelon extends FruitInfo{
 public Watermelon()
    {
        this.setFruitName("Watermelon");
        this.setFruitPrice(4.19);
    }
    @Override
    public String prepAndeat()
    {
       return ("Cut Watermelon in triangular pieces with knife eat flesh until rind is empty.");
    }
   
}
