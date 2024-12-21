public class Car implements Transport{
    @Override
    public Transport move() {
        System.out.println("Poexali!");
        return this;
    }

    @Override
    public Transport charge() {
        System.out.println("Benz-E95 Please!");
        return this;
    }
}
