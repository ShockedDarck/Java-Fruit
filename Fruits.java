public abstract class Fruits {

    private final String name;

    public Fruits(String name) {
        this.name = name;
    }

    public abstract void taste();
    public abstract boolean hasSeeds();
    public abstract int getSize();



    public void miam(){
        System.out.println("Miam, miam.");
    }
    public void NomFruits(){
        System.out.println("Trop miam, miam " + name);
    }


    public String getName(){
        return name;
    }
}