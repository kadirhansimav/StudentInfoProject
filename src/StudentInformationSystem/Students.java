/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInformationSystem;

/**
 *
 * @author kadir
 */
    public class Students extends People{

        private int id;
        private int classname;
        private String gender;

        public Students(int id, int classname, String gender,String nameSurname) {
            super(nameSurname);
            this.id = id;
            this.classname = classname;
            this.gender = gender;
            
        }

        public int getId() {
            return id;
        }

        public int getClassname() {
            return classname;
        }

        public String getGender() {
            return gender;
        }

        public String getnameSurname() {
            return nameSurname;
        }

      

        public void setId(int id) {
            this.id = id;
        }

        public void setClassname(int classname) {
            this.classname = classname;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public void setnameSurname(String nameSurname) {
            this.nameSurname = nameSurname;
        }

    @Override
    public String getNameSurname() {
        return super.nameSurname; //To change body of generated methods, choose Tools | Templates.
    }

        

        
       
        
        
    }

    

