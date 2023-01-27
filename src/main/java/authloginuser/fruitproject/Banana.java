/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package authloginuser.fruitproject;

/**
 *
 * @author marissalubow
 */
public class Banana extends FruitInfo
{
    public Banana()
    {
        this.setFruitName("Banana");
        this.setFruitPrice(0.25);
      
    }
    @Override
    public String prepAndeat()
    {
            return ("Peel skin of banana then bite into flesh.");
    }
    
}
