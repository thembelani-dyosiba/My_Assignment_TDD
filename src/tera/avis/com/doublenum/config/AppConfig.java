/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com.doublenum.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import tera.avis.com.doublenum.AddDoubleNum;
import tera.avis.com.doublenum.DoubleNumImpl;

/**
 *
 * @author TERA
 */
@Configurable
public class AppConfig {
    
   @Bean(name = "calc")
   public AddDoubleNum doubleNum(){
       return new DoubleNumImpl();
   }
}