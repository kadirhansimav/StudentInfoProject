/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInformationSystem;

/**
 *
 * @author kadir
 */
public interface IDatabase {
    public boolean changeGrader(Information information);
    public boolean addStudent(Information information);
    public void changePasswordandUserId(String userId,String password);
    public void deleteAll();
    public boolean checkUserIdAndPassword(String userId,String password);
    public void getStudents();
    
    
}
