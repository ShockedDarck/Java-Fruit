public class Main{
    public static void main(String[] args) 
    {
        Fruits apple = new Apple();
        apple.miam();
        apple.taste();
        apple.NomFruits();

        apple.hasSeeds();
        apple.getSize();



        Fruits pineapple = new PineApple();
        System.out.println(" ");
        pineapple.miam();
        pineapple.taste();
        pineapple.NomFruits();

        pineapple.getSize();
        pineapple.hasSeeds();
    }
}   