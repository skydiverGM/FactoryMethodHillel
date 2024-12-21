public class Client {
    public static void run() {
        TransportFactory carFactory = new CarFactory();
        TransportFactory planeFactory = new PlaneFactory();

        Transport car = carFactory.createTransport();
        Transport plane = planeFactory.createTransport();

        car.charge().move();
        plane.charge().move();

        if (car instanceof Car){
            System.out.println("CarFactory created the Car");
        }else {
            System.out.println("CarFactory failed to create a Car");
        }

        if (plane instanceof Plane){
            System.out.println("PlaneFactory created the Plane");
        }else {
            System.out.println("PlaneFactory failed to create a Plane");
        }
    }
}

