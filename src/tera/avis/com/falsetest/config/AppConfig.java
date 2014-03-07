/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com.falsetest.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import tera.avis.com.falsetest.FalseImpl;
import tera.avis.com.falsetest.FalseInterface;

/**
 *
 * @author Thembelani Dyosiba
 * Student NO: 210114363
 */
@Configurable
public class AppConfig {
    @Bean(name="fasleCheck")
    public FalseInterface getFasle(){
        return (FalseInterface) new FalseImpl();
    }
}
  

