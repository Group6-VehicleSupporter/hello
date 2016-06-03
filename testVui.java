/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import hello.Sholaship;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Tam
 */
public class testVui {
    
    public testVui() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
     @Test
     public void testHello() {
         Sholaship hoangStudent =new Sholaship();
         assertEquals(100, hoangStudent.getAward(10.0));
         assertEquals(100, hoangStudent.getAward(9.5));
//         assertEquals(100, hoangStudent.getAward(8.0));
     }
     
}
