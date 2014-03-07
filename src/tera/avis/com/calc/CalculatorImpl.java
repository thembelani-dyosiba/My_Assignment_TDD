/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tera.avis.com.calc;

/**
 *
 * @author Thembelani Dyosiba
 * Student NO: 210114363
 */
public class CalculatorImpl implements Calculator{
    
     @Override
    public int add(int a, int b) {
        return a + b;
    }

    @Override
    public int sub(int a, int b) {
        return a - b;
    }    
}
