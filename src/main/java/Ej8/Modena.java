/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Ej8;

import java.util.Random;

/**
 *
 * @author NitroPc
 */
public class Modena extends Azar{
    
    private static final Random random =  new Random();
    
    @Override
    public int lanzar() {
        return random.nextInt(2 - 1 + 1) + 1;
    }
}
