/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package hu.dpc.training;

/**
 *
 * @author balazs
 */
public class Client {
    public static void main(String[] args) {
        // call dependency method before and after update
    	System.out.println(Weather.getWeather());
    	System.out.println("Te kis piszok.");
    }
    
}
