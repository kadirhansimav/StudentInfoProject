package StudentInformationSystem;


public abstract class People {

    protected String nameSurname;
    
    public abstract String getNameSurname();

    public People(String nameSurname) {
        this.nameSurname = nameSurname;
        
    }

}
