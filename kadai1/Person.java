public class Person {

    public int gender;

    public Person(int gender){
        this.gender = gender;
    }

    public void speak() {
        if (gender == 1){
            System.out.println("I'm a man");
        } else if (gender == 2) {
            System.out.println("I'm a woman");
        }
        
    }


    public static void main(String[] args){
        Person man = new Person(1);
        man.speak();
        Person woman = new Person(2);
        woman.speak(); 
    }

}