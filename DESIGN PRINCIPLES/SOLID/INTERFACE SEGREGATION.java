/*
    interface segregation principle prescribes a client should not be forced
    to implement an interface that it doesn't use.
    (this is single responsibility principle but at interface level)
*/
// bad approach
interface Worker{

    public void work();

    public void sleep();
}

class Human implements Worker{

    public void work(){

    }
    public void sleep(){

    }
}

class Robot implements Worker{
    public void work(){

    }
    public void sleep(){
        // this is violating interface segregation principle
    }
}



// best approach

interface Worker{
    public void work();
}
interface Sleep{
    public void sleep();
}
class Human implements Worker, Sleep{
    public void work(){
    }
    public void sleep(){
    }
}

class Robot implements Worker{
    public void work(){
    }
}


