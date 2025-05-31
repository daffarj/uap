package uap.bases;


public abstract class Shape {

    private String name;

    public Shape(){};

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return this.name;
    }

    public abstract void printinfo();
    
}
    