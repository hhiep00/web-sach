/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tach.web.api;

import java.io.BufferedReader;

/**
 *
 * @author maiva
 */
public class getRequestBody {
  
    
    public  static String getBody(BufferedReader getReader){
        try{
                BufferedReader reader = getReader;
                StringBuilder sb = new StringBuilder();
                String line = reader.readLine();
                while ( line!=null){ 
                    sb.append(line).append("\n");
                    line = reader.readLine();
                } 
                return sb.toString();
    } 
        
            catch(Exception e){
                System.out.println(e);
                        return null;
            }

}
}
