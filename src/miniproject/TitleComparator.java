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
public class TitleComparator implements Comparator<CardData>{

    public int compare(CardData s1, CardData s2) {
        
        if(s1.getTitle().compareToIgnoreCase(s2.getTitle()) >= 1)
            return 1;
        else if(s1.getTitle() == s2.getTitle())
            return 0;
        return -1;
    }
}
