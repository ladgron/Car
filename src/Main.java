public class Main {

    public static void main(String[] args) {
	// write your code here

        Car car1 = new Car();
        Car car2 = new Car();

        car1.modelyear = 1980;
        car1.modelName = "Volvo";
        car1.price = 15000;


        car2.modelyear = 2000;
        car2.modelName = "SAAB";
        car2.price = 20000;

        System.out.printf("%s %d kostar %,d kr \n", car1.modelName, car1.modelyear, car1.price);
        System.out.printf("%s %d kostar %,d kr \n", car2.modelName, car2.modelyear, car2.price);
    }
}
