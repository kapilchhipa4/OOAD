
public class Manufacturer {

    public static Mobile createCompleteObject() {

        MobileBuilder mobbuilder = new MobileConcreteBuilder();
        return mobbuilder.buildMobile();
    }
}