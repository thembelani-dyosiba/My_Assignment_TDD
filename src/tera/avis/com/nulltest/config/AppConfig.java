/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com.nulltest.config;

import org.springframework.context.annotation.Bean;
import tera.avis.com.nulltest.NullImpl;
import tera.avis.com.nulltest.NullInterface;

/**
 *
 * @author Thembelani Dyosiba
 */
public class AppConfig {
    @Bean(name="nullCheck")
    public NullInterface getNull(){
        return new NullImpl();
    }
}
