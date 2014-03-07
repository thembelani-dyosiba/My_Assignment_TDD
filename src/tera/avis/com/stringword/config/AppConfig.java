/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com.stringword.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import tera.avis.com.stringword.StringInterface;
import tera.avis.com.stringword.StringImpl;

/**
 *
 * @author boniface
 */
@Configurable
public class AppConfig {

    @Bean(name = "used")
    public StringInterface calculator() {
        return new StringImpl();
    }
}
