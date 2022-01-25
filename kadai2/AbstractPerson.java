public abstract class AbstractPerson{

    abstract String gender();

    public void speak(){
      System.out.println("I'm a "+ gender());
    }
}