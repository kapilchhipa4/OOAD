

public class MobileConcreteBuilder extends MobileBuilder{

    public void createMemory(){
        getMobile().setMemory("32 GB");
        System.out.println("Memory created and installed");
    }

    public void createBattary(){
        getMobile().setBattary("4500 mAh");
        System.out.println("Battery created and installed");
    }

    public void createWireless(){
        getMobile().setWireless("Bluetooth and wifi");
        System.out.println("Created wireless features and installed");
    }

    public void createScreen(){
        getMobile().setScreen("Amoled");
        System.out.println("Screen created and installed");
    }

    public void createMetalCase(){
        getMobile().setMetalCase("Aliminium");
        System.out.println("Metal case created plugged every thing in it");
    }
}