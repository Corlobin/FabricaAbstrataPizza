/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ifes.pizza.application.util;

import ifes.pizza.cdp.*;

/**
 *
 * @author 20122bsi0387
 */
public interface Fabrica {
    public Massa criarMassa();
    public Recheio criarRecheio();
    public Molho criarMolho();
    public Pizza criarPizza();
}
