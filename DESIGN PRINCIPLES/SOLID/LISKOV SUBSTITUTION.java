/* Liskov substitution Principle prescribes substitutability of a class by it's 
subclass.

Broadly put, a class can be replaced by it's subclass in all practical
usage scenarios.


*/
class Bird {

    //base functionality related to bird
    public void fly(){
        System.out.println("I am a flying bird !");
    }
}
class Sparrow extends Bird {

}

class Ostrich extends Bird{

} 
public class LSPExe {

    public static void main(String args[]){
        Ostrich bird = new Ostrich();
        // but ostrich can't fly so it is violating liskov substitution principle
        bird.fly();
    }
}


//  Best practice

class Bird {

    //base functionality related to bird
    public void info(){
        System.out.println("I am a bird");
    }
   
}
class FlyingBird extends Bird{

     public void fly(){
        System.out.println("I am a flying bird !");
    }
}
class Sparrow extends FlyingBird {

}

class Ostrich extends Bird{

} 
public class LSPExe {

    public static void main(String args[]){
        Ostrich bird = new Ostrich();
        bird.info();
        
    }
}