public class Apple extends Fruits {

    public Apple() {
        super("La pomme");
    }

    @Override
    public void taste() {
        System.out.println(getName() + " est sucrées.");
    }

    @Override
    public boolean hasSeeds() {
        return true;
    }

    @Override
    public int getSize() {
        return 1;
    }
}