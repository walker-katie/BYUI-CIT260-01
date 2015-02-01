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
public class Boat {

    int totalLeft = 0;
    int combinedHits = 0;
    int spaceOnShip = 0;
    String tally = new String();

    public Boat(int spaceOnShip) {
        this.spaceOnShip = spaceOnShip;
        this.totalLeft = spaceOnShip;
    }

    public void calculateHits() {

        if (totalLeft == 0) {
            tally = "sunk";
        } else {
            if (spaceOnShip == totalLeft) {
                tally = "undamaged";
            }
            else{
                tally = "damaged";
            }
                
        }
    

    System.out.println ("Your ship is " + tally);
    System.out.println ("Total combined hits =" + combinedHits);
    }
    public void hit()
    {
        totalLeft--;
        combinedHits = totalLeft +1;
    }
   
     public int getTotalLeft() {
        return totalLeft;
    }

    public int getCombinedHits() {
        return combinedHits;
    }

    public int getSpaceOnShip() {
        return spaceOnShip;
    }

    public String getTally() {
        return tally;
    }

    public void setTotalLeft(int totalLeft) {
        this.totalLeft = totalLeft;
    }

    public void setCombinedHits(int combinedHits) {
        this.combinedHits = combinedHits;
    }

    public void setSpaceOnShip(int spaceOnShip) {
        this.spaceOnShip = spaceOnShip;
    }

    public void setTally(String tally) {
        this.tally = tally;
    }
   
}

//What a headache...so gald there are people who are interested in getting this type
//code to run (it's not me). This all makes me a bit dizzy.
