import java.util.ArrayList;

public class runner{
    public static void animalsSpeak(){
        ArrayList<ZooAnimals> animals =new ArrayList<ZooAnimals>();
        ZooAnimals mew = new ZooAnimals();
        mew.setAnimals();
        animals = mew.animalList();
        for(ZooAnimals Z: animals){
            System.out.print("This animal says: ");
            Z.speak();
        }
    
    }
    public static void hearTheAnimal(ZooAnimals A){
       System.out.print("This animal says :");
       A.speak(); 
    }
    public static void main(String[] args) {
        // APES   
        
        gorrilla x = new gorrilla();
              x.setName(" Jerry the Gorrila");
              System.out.println("Name: "+x.getName());
            System.out.print("Check for Subclass method: ");
                
               x.Grunt();
            System.out.print("Check for parent class method: ");
                
                x.forage();
                x.eat("Grapes");
                x.isNocturnal(false);
                x.setAvgLifeSpan(17.5);
                System.out.println("Stored age for "+x.getName()+" is : "+x.getAveLifeSpan());
                System.out.println("");
        monkey m = new monkey();
        m.setName(" Mort the Monkey");
        System.out.println("Name: "+m.getName());
            System.out.print("Check for Subclass method: ");
                m.climb();
                m.hoot();
                m.howl();
            System.out.print("Check for parent class method: ");
                m.forage();
                m.eat("Grapes");
                m.isNocturnal(false);
                m.setAvgLifeSpan(17.5);
                System.out.println("Stored age for "+m.getName()+" is : "+m.getAveLifeSpan());
                System.out.println("");
        // MAMMALS
        hippo h = new hippo();
        h.setName(" harry the hippo");
        System.out.println("Name: "+h.getName());
            System.out.print("Check for Subclass method: ");
                h.groan();
            System.out.print("Check for parent class method: ");
                //h.growl();
                h.eat("crocodile");
                h.isNocturnal(false);
                h.setAvgLifeSpan(19.5);
                System.out.println("Stored age for "+h.getName()+" is : "+h.getAveLifeSpan());
                System.out.println("");
                System.out.println("");
        elephant e = new elephant();
        e.setName(" ed the elephant");
        System.out.println("Name: "+e.getName());
            System.out.print("Check for Subclass method: ");
                e.trumpet();
            System.out.print("Check for parent class method: ");
                e.forage();
                e.eat("crocodile");
                e.isNocturnal(false);
                e.setAvgLifeSpan(19.5);
                System.out.println("Stored age for "+e.getName()+" is : "+e.getAveLifeSpan());
                System.out.println("");
        
        // feline animals
        lion l = new lion();
        l.setName(" larry the lion");
        System.out.println("Name: "+l.getName());
            System.out.print("Check for Subclass method: ");
                l.huntInAPack();
            System.out.print("Check for parent class method: ");
                l.roar();
                l.eat("meat");
                l.isNocturnal(true);
                l.setAvgLifeSpan(34.5);
                System.out.println("Stored age for "+l.getName()+" is : "+l.getAveLifeSpan());
                System.out.println("");
        tiger t = new tiger();
        t.setName(" tim the tiger");
        System.out.println("Name: "+t.getName());
            System.out.print("Check for Subclass method: ");
                t.huntAlone();
            System.out.print("Check for parent class method: ");
                t.roar();
                t.eat("meat");
                t.isNocturnal(true);
                t.setAvgLifeSpan(34.5);
                System.out.println("Stored age for "+t.getName()+" is : "+t.getAveLifeSpan());
                System.out.println("");
        // herbivouAnimals
        girrafe g = new girrafe();
        g.setName(" garry the girrafe");
        
        System.out.println("Name: "+g.getName());
            System.out.print("Check for Subclass method: ");
                g.hum();
            System.out.print("Check for parent class method: ");
                g.munch();
                g.eat("leaves");
                g.isNocturnal(false);
                g.setAvgLifeSpan(17.8);
                System.out.println("Stored age for "+g.getName()+" is : "+g.getAveLifeSpan());
                System.out.println("");
        deer d= new deer();
        d.setName(" dan the deer");
        System.out.println("Name: "+d.getName());
            System.out.print("Check for Subclass method: ");
                d.Grunt();
            System.out.print("Check for parent class method: ");
                d.munch();
                d.eat("leaves");
                d.isNocturnal(false);
                d.setAvgLifeSpan(17.8);
                System.out.println("Stored age for "+d.getName()+" is : "+d.getAveLifeSpan());
                System.out.println("");
       // animalsSpeak();


        ArrayList<ZooAnimals> animals =new ArrayList<ZooAnimals>();
        ZooAnimals mew = new ZooAnimals();
        mew.setAnimals();
        animals = mew.animalList();
        for(ZooAnimals Z: animals){
            hearTheAnimal(Z);
        }

       }
}