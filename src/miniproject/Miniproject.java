/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

import javax.swing.*;
import java.util.*;
import java.sql.*;

/**
 *
 * @author Usama
 */
public class Miniproject {

    public static void main(String[] args) {//main method starts from here.
        ArrayList <CardData> cardData = CardDataFactory.getData();

        System.out.println("First............1 \n"
                + "Next.............2 \n"
                + "Previous.........3 \n"
                + "Last.............4 \n"
                + "\n"
                + "Sort.............5\n"
                + "\n"
                + "Exit.............0\n"
                + "\n"
                + "Enter choice:> ");

        Scanner input = new Scanner(System.in);
        int choice = -1;
        int first = 0;
        int last = cardData.size() - 1;//myData.length - 1;
        int current = first;


        while (choice != 0) {

            choice = input.nextInt();

            if (choice == 0) {
                System.out.println("System Exit");
                break;
            }

            if (choice == 1) {
                current = first;
                cardData.get(first).printData();
            } else if (choice == 2) {
                if (current >= last) {
                    System.out.println("THIS IS THE LAST ELEMENT");
                    current = 28;
                }
                ++current;//returns the current value
                //CHECK WE HAVE GONE TOO FAR
                cardData.get(current).printData();
                

            } else if (choice == 3) {

                --current;

                if (current < 0) {
                    current = 0;
                    System.out.println("THIS IS THE FIRST ELEMENT");

                    // else if 
                }
                cardData.get(current).printData();
            } else if (choice == 4) {
                current = last;//current also becomes last 
                cardData.get(last).printData();// prints out the last thing in the data.... myData[last].printData();
            }
            else if (choice == 5) {
                sortMenu(cardData);
                
            }
         System.out.println("Main Menu\n\n"
                + "First............1 \n"
                + "Next.............2 \n"
                + "Previous.........3 \n"
                + "Last.............4 \n"
                + "\n"
                + "Sort.............5\n"
                + "\n"
                + "Exit.............0\n"
                + "\n"
                + "Enter choice:> ");
        }
    }
    
    
    private static void sortMenu(ArrayList <CardData> cardData ){
        
        int choice = -1;
        Scanner input = new Scanner(System.in);
        
        while(choice != 0){
        
         System.out.println("Sort Menu\n\n"
                + "Title......................6\n"
                + "Height.....................7\n"
                + "Speed......................8\n"
                + "Fighting Skills............9\n"
                + "\n"
                + "Back.......................0\n"
                + "\n"
                + "Enter choice:> ");
         
        choice = input.nextInt();
        
        if (choice == 6){
            cardData.sort(new TitleComparator());
            return;
        }
        else if (choice == 7){
            cardData.sort(new HeightComparator());
            return;
        }
        
        else if (choice == 8){
            cardData.sort(new SpeedComparator());  
            return;
        }
        else if (choice == 9){
            cardData.sort(new FightingSkillsComparator());
            return;
        }
        else if (choice == 0){
            break;
        }
        }}}
