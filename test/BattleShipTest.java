/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import static junit.framework.Assert.assertEquals;
import lesson3part2.Boat;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author katiewalker
 */
public class BattleShipTest {
    
    public BattleShipTest() {
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
    // @Test
    // public void hello() {}
    
    @Test
    public void testHit(){
       Boat boat1 = new Boat(4);
       Boat boat2 = new Boat(3);
       Boat boat3 = new Boat(2);
       
       boat1.hit();
       boat2.hit();
       boat3.hit();
       boat3.hit();

       
       assertEquals(boat1.getTotalLeft(), 3);
       assertEquals(boat2.getTotalLeft(), 2);
       assertEquals(boat3.getTotalLeft(), 0);
       
       boat1.calculateHits();
       boat2.calculateHits();
       boat3.calculateHits();

       assertEquals(boat1.getTally(), "damaged");
       assertEquals(boat2.getTally(), "damaged");
       assertEquals(boat3.getTally(), "sunk");
    }
}
