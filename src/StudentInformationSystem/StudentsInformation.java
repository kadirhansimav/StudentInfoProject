/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInformationSystem;

import java.util.ArrayList;

/**
 *
 * @author kadir
 */
public class StudentsInformation {
    public static ArrayList<Information> arr=new ArrayList<>();
  
    public boolean checkExistingId(int id){
        
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getId()==id){
                return false;
            }
            
        }
        return true;
    }
    public static int findId(int id){
        for(int i=0;i<arr.size();i++){
            if(arr.get(i).getId()==id){
                return i;
            }
        }
        return -1;
    }
    
}
