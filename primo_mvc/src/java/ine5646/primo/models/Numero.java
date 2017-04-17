/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ine5646.primo.models;

/**
 *
 * @author Sasse
 */
public class Numero {
    private final int num;

    public Numero(int numero){
        num = numero;
    }
    
    public int getNumero() {
        return num;
    }
    
    public boolean ehPrimo() {
        if (num < 2) return false;
        if (num > 2 && num%2 == 0) return false;

        for (int i = 3; i*i <= num; i += 2) {
            if (num%i == 0) return false;
        }

        return true;
    }
    
}
