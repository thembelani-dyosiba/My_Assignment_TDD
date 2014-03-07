/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tera.avis.com;

//import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import tera.avis.com.calc.Calculator;
import tera.avis.com.calc.config.AppConfig;

/**
 *
 * @author E939967
 */
public class CalculatorTest {
    
    public static ApplicationContext ctx;
    public static Calculator calcu;
    
    public CalculatorTest() {
    }
    
    @BeforeClass
    public static void setUpClass() throws Exception {
        ctx = (ApplicationContext) new AnnotationConfigApplicationContext(AppConfig.class);
        calcu = (Calculator)ctx.getBean("calc");
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
        Assert.assertEquals(20, calcu.add(10,10));
        Assert.assertEquals(0, calcu.sub(10,10));
    }
}
