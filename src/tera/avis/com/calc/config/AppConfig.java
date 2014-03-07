/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com.calc.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import tera.avis.com.calc.CalculatorImpl;
import tera.avis.com.calc.Calculator;

/**
 *
 * @author Thembelani Dyosiba
 * Student NO: 210114363
 */

@Configurable
public class AppConfig {
    
   @Bean(name = "calc")
   public Calculator calculator(){
       return new CalculatorImpl();
   }
}
