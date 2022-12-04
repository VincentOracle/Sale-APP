//Name:
//Assignment Number:HW3
//DESCRIPTION
/*
 * The project includes defining a class named Smartphone that 
 * Computes the battery life depending on the phone settings such ss
 * The Screen status,bluetooth status,voice status,wifi status and standby
 * The algorithm computes the battery life depending on the ON and OFF conditons and
 * the Battery capacity Values as set by thge SmartPhone Characteristics
 * 
 * 
 */

import java.util.*;
import javax.swing.*;

public class SmartPhone {

    public static void main(String[] args) {
        // Variables declaration and assignment
        int screen = 500;
        int voice = 300;
        int wifi = 200;
        int bluetooth = 100;
        int standby = 10;

    }

    // Creating the Constructor to the SmartPhone Class
    // Computes the smart phone battery life
    int SmartPhone(int batteryCapacity, int screen, int voice, int wifi, int bluetooth, int standby) {// The constructor
                                                                                                      // to The
                                                                                                      // SmartPhone
                                                                                                      // Class

        // Prompts to get thr=e total battery Capacity
        System.out.println("Enter the Phones battery capacity");
        Scanner scn = new Scanner(System.in);
        int capacity = scn.nextInt();
        return SmartPhone(batteryCapacity, screen, voice, wifi, bluetooth, standby);

    }

    private int wifi;
    private int voice;
    private int screen;
    private int bluetooth;
    private int standby;
}

    // Computes the average battery life depending on settings
int batterylife(int wifi,int voice,int screen,int bluetooth,int standby){
//When Other Phone features are OFF
    if(wifi==0&&voice==0&&screen==0&&bluetooth==0)
  
    {
          /*When wifi=False
          Voice=False 
          screen=False
          bluetooth=False

          */
        standby = 10;
        JOptionPane.showMessageDialog(null, standby, " all features are off!!!",
                JOptionPane.INFORMATION_MESSAGE);
    }
    else//When all the Features settings are ON
    {
        int totalPower = screen + voice + wifi + bluetooth + standby;

    private int batteryCapacity;
    // Calculates the average batterylife
    private int totalPower;
    int batterylife = batteryCapacity / totalPower;return batterylife;
}}