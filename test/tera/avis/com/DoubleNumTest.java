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
import tera.avis.com.doublenum.AddDoubleNum;
import tera.avis.com.doublenum.config.AppConfig;

/**
 *
 * @author TERA
 */
public class DoubleNumTest {
    
    public static ApplicationContext ctx;
    public static AddDoubleNum calcu;
    
    public DoubleNumTest() {
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}

    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        calcu = (AddDoubleNum)ctx.getBean("calc");
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
        Assert.assertEquals(5.0, calcu.doubleNum(2.50,2.0));
    }
}
