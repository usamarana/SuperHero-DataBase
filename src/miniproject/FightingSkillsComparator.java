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
public class FightingSkillsComparator implements Comparator<CardData>{

    public int compare(CardData s1, CardData s2) {
        //Starts from highest to lowest
        if(s1.getFightingSkills() > s2.getFightingSkills() )
            return -1;
        else if(s1.getFightingSkills() == s2.getFightingSkills())
            return 0;
        return 1;


             
    }}
