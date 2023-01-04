/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package StudentInformationSystem;

/**
 *
 * @author kadir
 */
public class Information extends Students{
    private double midtermExams;
    private double project;
    private double finalExam;
    public Information(int id, int classname, String gender,String nameSurname,double midtermExams,double project,double finalExam){
        super(id,classname,gender,nameSurname);
        this.midtermExams=midtermExams;
        this.project=project;
        this.finalExam=finalExam;
        
    }

    /**
     * @return the midtermExams
     */
    public double getMidtermExams() {
        return midtermExams;
    }

    /**
     * @param midtermExams the midtermExams to set
     */
    public void setMidtermExams(double midtermExams) {
        this.midtermExams = midtermExams;
    }

    /**
     * @return the project
     */
    public double getProject() {
        return project;
    }

    /**
     * @param project the project to set
     */
    public void setProject(double project) {
        this.project = project;
    }

    /**
     * @return the finalExam
     */
    public double getFinalExam() {
        return finalExam;
    }

    /**
     * @param finalExam the finalExam to set
     */
    public void setFinalExam(double finalExam) {
        this.finalExam = finalExam;
    }
}
