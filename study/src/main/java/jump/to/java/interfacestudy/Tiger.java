package jump.to.java.interfacestudy;

public class Tiger extends Animal implements BarkablePredator {

    @Override
    public String getFood() {
        return "apple";
    }

    @Override
    public void bark() {
        System.out.println(":::Tiger 어흥");
    }
}
