/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.pizza.application;

import ifes.pizza.util.FabricaPizza;
import ifes.pizza.cdp.Pizza;

/**
 *
 * @author 20122bsi0387
 * ctrl shift I
 */
public class Application {
    public static void main(String args[]) {
        Pizza pizza = FabricaPizza.criarPizza("zzz");
        System.out.println(""+pizza);
        pizza = FabricaPizza.criarPizza("FrangoCatupiry");
        System.out.println(""+pizza);
      
    }
}
