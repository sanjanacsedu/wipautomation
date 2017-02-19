package com.wip.automation.exercise6;

import java.util.Arrays;

public class CountrySort {

  public static void main(String[] args) {
    // TODO Auto-generated method stub
    
    String[] countries = new String[]{"Bangladesh","USA","India", "Pakistan"};
    //sort String array using sort method
    Arrays.sort(countries);
   
    System.out.println("Sorted country names: ");
   
    //print sorted country
    for(int i=0; i < countries.length; i++){
            System.out.println(countries[i]);
    }

  }

}
