/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.objectbrains.controller;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;

/**
 *
 * @author quang
 */
public class HomeControllerTest {
    
    public HomeControllerTest() {
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

    /**
     * Test of home method, of class HomeController.
     */
    @org.junit.Test
    public void testHome() {
        System.out.println("home");
        HomeController instance = new HomeController();
        String expResult = "welcome to the homepage";
        String result = instance.home();
        assertEquals(expResult, result);
        
    }
    
}
