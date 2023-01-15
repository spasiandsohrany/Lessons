package Practisechek;

import java.io.*;
import java.util.Arrays;

public class WriteAnimal {
    public static void main(String[] args) throws IOException {
        byte[] intermediate = null;
        try (
                ByteArrayOutputStream output = new ByteArrayOutputStream();
                ObjectOutputStream oos = new ObjectOutputStream(output)) {

            oos.writeInt(3);
            oos.writeObject(new Animal("Dog"));
            oos.writeObject(new Animal("Cat"));
            oos.writeObject(new Animal("Mouse"));

            output.flush();
            intermediate = output.toByteArray();

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println(Arrays.toString(intermediate));
        Animal[] animals = deserializeAnimalArray(intermediate);
        System.out.println(Arrays.toString(animals));

    }
        /*
        Animal[] animals = {new Animal("Dog"), new Animal("Cat"), new Animal("Fog")};
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        objectOutputStream.writeObject(animals);
        objectOutputStream.close();
        System.out.println(Arrays.toString(objectOutputStream.toString().toCharArray()));
        System.out.println(Arrays.toString(deserializeAnimalArray(byteArrayOutputStream.toByteArray())));*/


    public static Animal[] deserializeAnimalArray(byte[] data) {
        Animal[] animals = null;
        try (ObjectInputStream objectInputStream = new ObjectInputStream(new ByteArrayInputStream(data))) {
            //animals = new Animal[objectInputStream.readInt()];
            animals = new Animal[objectInputStream.readInt()];
            for (int i = 0 ; i < animals.length ; i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
            //animals = (Animal[]) objectInputStream.readObject();
        } catch (IOException | ClassNotFoundException | NegativeArraySizeException e) {
            throw new IllegalArgumentException(e);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }
}
        /*        Animal[] animals = null;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        try (ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream)) {
            animals = new Animal[objectInputStream.read()];
            for (int i = 0; i < objectInputStream.readInt(); i++) {
                animals[i] = (Animal) objectInputStream.readObject();
            }
        } catch (IOException | ClassNotFoundException | NegativeArraySizeException e) {
            throw new IllegalArgumentException(e);
        } catch (RuntimeException e) {
            throw new IllegalArgumentException(e);
        }
        return animals;
    }

 */

