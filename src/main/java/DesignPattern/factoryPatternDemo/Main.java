package DesignPattern.factoryPatternDemo;

/**
 * ${DESCRIPTION}
 *
 * @author yangningkai
 * @create 2019-06-02 下午10:12
 **/
public class Main {
    public static void main(String[] args) {
        CarFactory carFactory = new CarFactoryImpl();
        carFactory.printCarBrand("bmw");
    }
}
