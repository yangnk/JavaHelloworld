package DesignPattern.factoryPatternDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-02 下午10:09
 **/
public class CarFactoryImpl implements CarFactory{
    @Override
    public void printCarBrand(String name) {
        switch (name) {
            case "bmw":
                System.out.println("this is bmw");
                break;
            case "audi":
                System.out.println("this is audi");
                break;
            default:
                System.out.println("nothing");
        }
    }
}
