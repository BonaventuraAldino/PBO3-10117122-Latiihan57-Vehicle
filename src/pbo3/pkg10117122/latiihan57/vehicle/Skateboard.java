/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo3.pkg10117122.latiihan57.vehicle;

/**
 *
 * @author Aldy Senda
 */
public class Skateboard extends Vehicle{
    private double myBoardLength;
    
    public Skateboard (){
        System.out.println("\nSkateboard");
    }

    public double getMyBoardLength() {
        return 54.5;
    }

    public void setMyBoardLength(double myBoardLength) {
        this.myBoardLength = myBoardLength;
    }
    
}
