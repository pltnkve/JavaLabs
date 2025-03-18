package lab2;

public class Task4 {
    static class Person {
        private String name;
        private int age;
        private String gender;

        public Person(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public String getGender() {
            return gender;
        }

        public void setGender(String gender) {
            this.gender = gender;
        }

        public static void main(String[] args) {
            Person person = new Person("Egor", 22, "Male");
            person.setName("Artyom");
            person.setAge(21);
            System.out.println(person.getName() + " " + person.getAge() + " " + person.getGender());
        }
    }
}
