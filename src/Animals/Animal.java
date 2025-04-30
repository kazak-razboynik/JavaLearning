package Animals;

public class Animal {
        private String name = "";
        private int age = 0;

        // Конструктор
        public Animal(String name, int age) {
                this.name = name;
                this.age = age;
        }

        // Задаем животному имя
        protected void setName (String newName) {
                name = newName;
        }

        // Выводим инфо по животному
        protected String info() {
                String infoOfAnimal = "Имя: " + name + ". Возраст: " + age;
                return  infoOfAnimal;
        }
}
