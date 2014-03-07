/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tera.avis.com;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tera.avis.com.nulltest.NullInterface;
import tera.avis.com.nulltest.config.AppConfig;

/**
 *
 * @author Thembelani Dyosiba
 */

public class NullTest {
    
    public static ApplicationContext ctx;
    public static NullInterface fci;

    
    public NullTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        fci = (NullInterface)ctx.getBean("nullCheck");
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @AfterMethod
    public void tearDownMethod() throws Exception {
    }
    
    @Test
     public void falseTest() {
        Assert.assertNull(null, fci.nullMethod());
     }
}
