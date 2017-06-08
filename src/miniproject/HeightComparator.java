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
public class HeightComparator implements Comparator<CardData>{
//HIGHEST TO LOWEST
    public int compare(CardData s1, CardData s2) {
        if("n/a".equals(s1.getHeight())) {
        	return -1;
        } else if ("n/a".equals(s2.getHeight())){
        	return -1;
        } else {
        	return Integer.valueOf(s2.getHeight()).compareTo(Integer.valueOf(s1.getHeight()));
        }
        /*|| s2.getHeight == 0)
        if(s1.getHeight() > s2.getHeight() )
            return -1;
        else if(s1.getHeight() == s2.getHeight())
            return 0;
        return 1;*/
    }
}
