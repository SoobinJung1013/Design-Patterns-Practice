package abstract_factory.example.buttons;

public class WindowButton implements Button{
    @Override
    public void paint() {
        System.out.println("You have created WindowButton.");
    }
}
