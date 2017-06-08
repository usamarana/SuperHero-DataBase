/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miniproject;

/**
 *
 * @author Usama
 */
public class CardData {

    private String title;
    private String realName;
    private String height;
    private int intelligence;
    private int strength;
    private int speed;
    private int agility;
    private int fightingSkills;
    private String backStory;

    CardData(String title,
            String realName,
            String height,
            int intelligence,
            int strength,
            int speed,
            int agility,
            int fightingSkills,
            String backStory) {
        this.title = title;
        this.realName = realName;
        this.height = height;
        this.intelligence = intelligence;
        this.strength = strength;
        this.speed = speed;
        this.agility = agility;
        this.fightingSkills = fightingSkills;
        this.backStory = backStory;
    }

   public void printData() {//printing all the data in a table that is inputed using arrays
       System.out.println("------------------------------------------------------------------------------");
       System.out.println("Title:          \t    " + title);
       System.out.println("Real Name:      \t    " + realName);
       System.out.println("Height (cm):    \t    " + height);//((height == 0) ? "n/a" : String.valueOf(height)));
       System.out.println("Intelligence:   \t    " + intelligence);
       System.out.println("Strength:       \t    " + strength);
       System.out.println("Speed:          \t    " + speed);
       System.out.println("Agility:        \t    " + agility);
       System.out.println("Fighting Skills:\t    " + fightingSkills);
       System.out.println("Back Story:     \t    " + backStory);
       System.out.println("------------------------------------------------------------------------------");
   }
    /*public String toString() {
    return "---------------------------------------------\n"+
    
    "Title                "+title+"\n"+
    
    "-------------------------------"
    */
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRealName() {
        return realName;
    }

    public void setRealName(String realName) {
        this.realName = realName;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getAgility() {
        return agility;//to get the value of agility only
    }

    public void setAgility(int agility) {
        this.agility = agility;
    }

    public int getFightingSkills() {
        return fightingSkills;
    }

    public void setFightingSkills(int fightingSkills) {
        this.fightingSkills = fightingSkills;
    }

    public String getBackStory() {
        return backStory;
    }
    public void setBackStory(String backStory) {
        this.backStory = backStory;
    }}

	



//public String toString() {
//    return "----------------------------------------------------------------------------\n"
//            + "Title                  " + title + "\n"
//            + "Real name              " + realName + "\n"
//            + "Height (cm)            " + height + "\n"
//            + "Intelligence           " + intelligence + "\n"
//            + "Strength               " + strength + "\n"
//            + "Speed                  " + speed + "\n"
//            + "Agility                " + agility + "\n"
//            + "Fighting skills        " + fightingSkills+ "\n"
//            + "Back story             " + backStory + "\n"
//            + "------------------------------------------------------------------------------------";
//}}