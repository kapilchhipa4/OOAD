
public class Mobile {

    private String memory;
    private String battery;
    private String wireless;
    private String screen;
    private String metalcase;

    public String getMemory(){
        return memory;
    }
    public void setMemory(String memory){
        this.memory = memory;
    }
    

    
    public String getBattary(){
        return battery;
    }
    public void setBattary(String battery){
        this.battery = battery;
    }

    
    public String getWireless(){
        return wireless;
    }
    public void setWireless(String wireless){
        this.wireless = wireless;
    }

    
    public String getScreen(){
        return screen;
    }
    public void setScreen(String screen){
        this.screen = screen;
    }

    
    public String getMetalCase(){
        return metalcase;
    }
    public void setMetalCase(String metalCase){
        this.metalcase = metalCase;
    }

    public String toString(){
        return "Mobile [memory=" + memory + ", battary=" + battery + ", wireless=" + wireless + ", Screen=" + screen +
        ",metalcase=" + metalcase + "] ";
    }
}