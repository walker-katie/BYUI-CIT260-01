/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson3part2;

/**
 *
 * @author katiewalker
 */
public class Lesson3Part2 {
    /**
     * Input: Co-ordinates from turn taken; how many spaces the ship has left
     * Process: Calculation: subtract hit for ship from total of ship numbers
     * (ex. 4 (Battleship) – 1 (hit) = 3 (hits left))
     * Output: “ShipName hit” (displayed to player)/ “Ship hit” (displayed to opponent); 
     * “Number of hits left for shipName” (displayed to player) or “Ship sunk” (displayed to both player & opponent)
     */
    public static void main(String[] args) {
        
       Boat boat1 = new Boat(4);
       boat1.hit();
       boat1.calculateHits();
       
       Boat boat2 = new Boat(3);
       boat2.hit();
       boat2.calculateHits();
       
       Boat boat3 = new Boat(2);
       boat3.hit();
       boat3.calculateHits();
    }
    
}
