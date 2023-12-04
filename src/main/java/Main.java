
public class Main {
    public static void main(String args[])  //static method
    {
        Car car = new Car("black","toyota");
        String json = new ObjectMapper().writeValueAsString(car);
        System.out.println(json);
    }
}
