import java.util.ArrayList;

public class ZooAnimals{
    private ArrayList<ZooAnimals> animals = new ArrayList<ZooAnimals>();
    private String food;
    private boolean nocturnal;
    private String Name;
    private double aveLifeSpan; 
    public void eat(String s){
        s=  food;
    }
    public String getFood(){
        return food;
    }
    public void isNocturnal(boolean b){
      nocturnal = b;
    }
    public boolean getNocturnal(){
        return nocturnal;
    }
    public void setAvgLifeSpan(double d){
        aveLifeSpan = d;
    }
    public void setName(String name){
       Name = name;
    }
    public String getName(){
        return Name;
    }
    public double getAveLifeSpan(){
    return aveLifeSpan;
    }
    public double getLifeSpan(){
        return aveLifeSpan;
    }
   

    public void setAnimals(){
        ZooAnimals animal1 = new deer();
        ZooAnimals animal2 = new elephant();
        ZooAnimals animal3 = new girrafe();
        ZooAnimals animal4 = new gorrilla();
        ZooAnimals animal5 = new hippo();
        ZooAnimals animal6 = new lion();
        ZooAnimals animal7 = new monkey();
        ZooAnimals animal8 = new tiger();
       animals.add(animal1);
       animals.add(animal2);
       animals.add(animal3);
       animals.add(animal4);
       animals.add(animal5);
       animals.add(animal6);
       animals.add(animal7);
       animals.add(animal8);
     


    }
    public void speak(){
        System.out.println("I am an animal with no speak function in my class");
    }
    public ArrayList<ZooAnimals> animalList(){
        return animals;
    }
   

   
}