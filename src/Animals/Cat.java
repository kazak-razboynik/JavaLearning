package Animals;

public class Cat extends Animal {
        Cat(String name, int age) {
                super(name, age);
        }

        public void meow() {
                System.out.println("Мяу!");
        }

        public static void main(String[] args) {
                Cat cat = new Cat("Барсик", 3);
                cat.meow();
                cat.setName("Мурзик");
                System.out.println(cat.info());

        }
}
