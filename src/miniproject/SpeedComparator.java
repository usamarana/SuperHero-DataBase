/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import java.util.Comparator;

/**
 *
 * @author Usama
 */
public class SpeedComparator implements Comparator<CardData>{
    
    
//   private static SpeedComparator theComparator;
//   
//   
//    static SpeedComparator getInstance() {
//
//        if (theComparator == null) {
//            theComparator = new SpeedComparator();
//        }
//
//        return theComparator;
//    }

    public int compare(CardData s1, CardData s2) {
        //starts from lowest to highest
        if(s1.getSpeed() > s2.getSpeed() )
            return 1;
        else if(s1.getSpeed() == s2.getSpeed())
            return 0;
        return -1;
    }}
