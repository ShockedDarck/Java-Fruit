public class PineApple extends Fruits{

    public PineApple() {
        super("L'annanas");
    }

    @Override
    public void taste() {
        System.out.println(getName() + " est Acide.");
    }

    @Override
    public boolean hasSeeds() {
        return false;
    }

    @Override
    public int getSize() {
        return 5;
    }

    
}