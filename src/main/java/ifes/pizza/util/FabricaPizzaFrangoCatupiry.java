/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.pizza.util;

import ifes.pizza.cdp.Massa;
import ifes.pizza.cdp.Molho;
import ifes.pizza.cdp.Pizza;
import ifes.pizza.cdp.Recheio;

/**
 *
 * @author 20122bsi0387
 */
public class FabricaPizzaFrangoCatupiry implements Fabrica {

    @Override
    public Massa criarMassa() {
        return new Massa();
    }

    @Override
    public Recheio criarRecheio() {
        return new Recheio("frango e catupiry");
    }

    @Override
    public Molho criarMolho() {
        return new Molho();
    }

    @Override
    public Pizza criarPizza() {
        return new Pizza();
    }
    
}
