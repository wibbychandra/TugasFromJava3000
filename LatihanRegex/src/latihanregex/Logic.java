/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihanregex;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Wibby Chandra
 */
public class Logic {
    
    public Boolean checkEmail(String email){
        Pattern pattern = Pattern.compile("^([a-zA-Z0-9_\\-\\.]+)@([a-zA-Z0-9_"
                + "\\-\\.]+)\\.([a-zA-Z]{2,5})$");
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
    
    public ArrayList addData(ArrayList list, String data){
        list.add(data);
        return list;
    }
}
