/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.pizza.application.util;

import ifes.pizza.cdp.Recheio;

/**
 *
 * @author 20122bsi0387
 */
public class FabricaPizzaFrangoCatupiryBacon extends FabricaPizzaFrangoCatupiry {

    @Override
    public Recheio criarRecheio() {
       return new Recheio("frango com catupiry e bacon");
    }
    
}
