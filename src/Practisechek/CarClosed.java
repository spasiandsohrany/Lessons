package Practisechek;

import java.io.Closeable;

public class CarClosed {
    static class Car implements AutoCloseable {

        @Override
        public void close() throws Exception {
            System.out.println("Машина закрывается...");
        }

        public void drive() {
            System.out.println("Машина поехала.");
        }
    }

    public static void main(String[] args) {
        try (Car car = new Car()) {
            car.drive();
        } catch (Exception ignore) {
        }

    }
}
