/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanfromjava2.Model;

/**
 *
 * @author Wibby Chandra
 */
public class ModelProgram {
    public String lebel = "Please put your information to get the result";
    
    public String returnGenderNoun(String gender){
        String noun = "He";
        
        if (gender.toLowerCase().equals("female")){
            noun = "she";
        }
        return noun;
    }
    
    public String returnMental(String mental){
        switch(mental){
            case ":)":
                return "Smiling";
            case ":D":
                return "Happy";
            case ":(":
                return "Sad";
            case ":'(":
                return "Crying";
            default:
                return "In Love";
        }
    }
}
