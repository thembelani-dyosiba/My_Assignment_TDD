/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com.players.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import tera.avis.com.players.PlayersInterface;
import tera.avis.com.players.PlayersImpl;


/**
 *
 * @author Thembelani Dyosiba
 */
@Configurable
public class AppConfig {
   
   @Bean(name="list")
    public PlayersInterface list(){
        return new PlayersImpl();
    }
   
}
