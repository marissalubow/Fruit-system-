/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */
public class Orange extends FruitInfo{
    public Orange()
    {
        this.setFruitName("Orange");
        this.setFruitPrice(0.99);
    }
    
    @Override
    public String prepAndeat()
    {
            return ("Cut orange into slices with knife eat flesh until rind is empty.");
    }
   
}
