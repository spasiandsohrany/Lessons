package Practisechek;

import java.util.Objects;

public class Who {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human((byte) 15, "Nikita", "Kazakov");
        Human human3 = new Human((byte) 15, "Nikita", "Kazakov");
        System.out.println(human2.equals(human3));
        System.out.println(human2.hashCode() == human3.hashCode());
    }

    public static class Human {
        private byte age;
        private String name;
        private String secondName;
        private String favoriteSport;

        public Human() {

        }

        public Human(byte age, String name, String secondName, String favoriteSport) {
            System.out.println("Харош");
            this.age = age;
            this.name = name;
            this.secondName = secondName;
            this.favoriteSport = favoriteSport;
        }

        public Human(byte age, String name, String secondName) {
            System.out.println("Найс");
            this.age = age;
            this.name = name;
            this.secondName = secondName;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Human human = (Human) o;
            return age == human.age && Objects.equals(name, human.name) && Objects.equals(secondName, human.secondName) && Objects.equals(favoriteSport, human.favoriteSport);
        }

        @Override
        public int hashCode() {
            return Objects.hash(age, name, secondName, favoriteSport);
        }
    }
}

