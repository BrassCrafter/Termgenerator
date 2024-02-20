public class Zufallsgenerator{
    public static int generate(int pVon, int bis){
        int von = pVon;
        int [] interval = new int[bis - pVon + 1];

        for(int i = 0; i < interval.length; i++){
            interval[i] = von;

            von++;
        }
        return interval[(int)(Math.random()*interval.length)];
    }
}