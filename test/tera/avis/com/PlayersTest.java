/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.util.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tera.avis.com.calc.config.AppConfig;
import tera.avis.com.players.PlayersInterface;

/**
 *
 * @author TERA
 */
public class PlayersTest {
    
    private static ApplicationContext ctx;
    private static PlayersInterface students;

    public PlayersTest() {
    }

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        students = (PlayersInterface) ctx.getBean("list");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUp() {
    }

    @AfterMethod
    public void tearDown() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testTrue() {  
         Assert.isTrue(5==students.getStudents());
     }
}
