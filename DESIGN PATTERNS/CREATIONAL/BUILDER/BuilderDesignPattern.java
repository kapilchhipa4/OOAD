
/* 
	The Builder is a design pattern which provide a flexible solution to various complex object creation problems in object-oriented programming. The intent of the builder pattern is to isolate the construction of a complex object from its representation.


*/

public class BuilderDesignPattern {

    public static void main(String args[]){

        Mobile m = Manufacturer.createCompleteObject();
        System.out.println(m);
       
    }
}