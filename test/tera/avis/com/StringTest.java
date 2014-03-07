package tera.avis.com;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tera.avis.com.stringword.StringInterface;
import tera.avis.com.stringword.config.AppConfig;

/**
 *
 * @author TERA
 */
public class StringTest {
    
    public static ApplicationContext ctx;
    public static StringInterface calcu;
    
    public StringTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calcu = (StringInterface)ctx.getBean("used");
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
    public void addTest(){
        Assert.assertEquals("Good Morning", calcu.message());
    }
}
