package de.dhbw.advancewars;

import de.dhbw.advancewars.GUI.GUI2;

public class AdvanceWars{

    public AdvanceWars(){
        GUI2 gui = new GUI2(this);
    }

    public static void main(String[] args){
        System.out.println("AdvanceWars");
        AdvanceWars advanceWars = new AdvanceWars();
    }
}
