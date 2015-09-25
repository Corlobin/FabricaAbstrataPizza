/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.pizza.util;

import ifes.pizza.cdp.Pizza;

/**
 *
 * @author 20122bsi0387
 */
public class FabricaPizza {

    public static Pizza criarPizza(String nome) {
        Fabrica fabrica;
        
        if (nome.equals("FrangoCatupiry")) {
            fabrica = new FabricaPizzaFrangoCatupiry();
        } else {
            fabrica = new FabricaPizzaFrangoCatupiryBacon();
        }
        
        Pizza pizza = fabrica.criarPizza();
        pizza.setMassa(fabrica.criarMassa());
        pizza.setMolho(fabrica.criarMolho());
        pizza.setRecheio(fabrica.criarRecheio());
        return pizza;
    }
}
