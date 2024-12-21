public class Plane implements Transport{
    @Override
    public Transport move() {
        System.out.println("Poleteli!");
        return this;
    }

    @Override
    public Transport charge() {
        System.out.println("AvGas Please!");
        return this;
    }
}
