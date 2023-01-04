/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInformationSystem;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author kadir
 */
public class Database extends StudentsInformation implements IDatabase {
    public Database(){
        try {
      File fileforAdmin = new File("admin.txt");
      File fileforStudent=new File("student.txt");
      fileforAdmin.createNewFile();
      fileforStudent.createNewFile();
      
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
    }
    public boolean changeGrader(Information information){
        if(super.checkExistingId(information.getId())){
            System.out.println("1");
            return false;
        }else{
            for(int i=0;i<arr.size();i++){
                if(arr.get(i).getId()==information.getId()){
                    arr.remove(i);
                    System.out.println("10");
                    break;
                }
            }
            System.out.println("1");
            arr.add(information);
            for(int i=0;i<arr.size();i++){
                System.out.println(arr.get(i).nameSurname);
            }
            try{
            FileWriter myWriter = new FileWriter("student.txt");
            BufferedWriter bufferedWriter=new BufferedWriter(myWriter);
            for(int i=0;i<arr.size();i++){
                String sentence=Integer.toString(arr.get(i).getId())+" "+Integer.toString(arr.get(i).getClassname())+" "+arr.get(i).getGender()+" "+arr.get(i).getnameSurname()+" "+Double.toString(arr.get(i).getMidtermExams())+" "+Double.toString(arr.get(i).getProject())+" "+Double.toString(arr.get(i).getFinalExam());
                System.out.println(sentence);
                bufferedWriter.write(sentence);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            return true;
        } catch (IOException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
                return false;
            }
        }
    }
    
   
    
    public boolean addStudent(Information information){
        if(super.checkExistingId(information.getId())){
            System.out.println("1");
            FileWriter fileWriter;
            try {
                fileWriter = new FileWriter("student.txt",true);
                BufferedWriter bufferedWriter=new BufferedWriter(fileWriter);
                bufferedWriter.write(Integer.toString(information.getId())+" "+information.getClassname()+" "+information.getGender()+" "+information.getnameSurname()+" "+Double.toString(information.getMidtermExams())+" "+Double.toString(information.getProject())+" "+Double.toString(information.getFinalExam()));
                bufferedWriter.newLine();
                bufferedWriter.close();
                super.arr.add(information);
                
                return true;
            } catch (IOException ex) {
                Logger.getLogger(Database.class.getName()).log(Level.SEVERE, null, ex);
                return false;
            }
            
        }else{
            System.out.println(0);
            return false;
        }
    }
    public void changePasswordandUserId(String userId,String password){
        try{
        FileWriter myWriter = new FileWriter("admin.txt");
         myWriter.write(userId+" "+password);
         myWriter.close();
         Admin admin=new Admin(userId,password);
         System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
        
        
    }
    public void deleteAll(){
        try{
        FileWriter myWriter = new FileWriter("student.txt");
         myWriter.write("");
         myWriter.close();
        } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
    }

    public boolean checkUserIdAndPassword(String userId,String password){
        try{
            File file=new File("admin.txt");
            Scanner input=new Scanner(file); 
            String getUserId=input.next();
            String getPassword=input.next();
                if(userId.equals(getUserId)&&password.equals(getPassword)){
                    Admin admin=new Admin(userId,password);
                    return true;
                }
                
                return false;      
            
        }catch(FileNotFoundException e){
            e.printStackTrace();
            return false;
        }
        
    }
    public void getStudents(){
        try{
            File file=new File("student.txt");
            Scanner input=new Scanner(file); 
            while(input.hasNext()){
                int id=input.nextInt();
                int classname=input.nextInt();
                String gender=input.next();
                String nameSurname=input.next()+" "+input.next();
                System.out.println(id+" "+classname+" "+gender+" "+nameSurname);
                String midterm=input.next();
                String project=input.next();
                String finalExam=input.next();
                Information info=new Information(id,classname,gender,nameSurname,Double.parseDouble(midterm),Double.parseDouble(project),Double.parseDouble(finalExam));
                arr.add(info);
            }
        }catch(FileNotFoundException e){
            e.printStackTrace();
           
        }
        
    }
    
}
