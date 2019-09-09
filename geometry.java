public class geometry {
    public static void main(String[] args){
        int sides = 7;
        int radius = 5;
        final double pi = 22/7;
        
        System.out.println("A heptagon has "+sides+" sides.");
        System.out.println("A decagon has "+(sides+(sides-radius))+" sides.");
        System.out.println("A dodecagon has "+(sides+radius)+" sides.");
        System.out.println("The circumference of a circle with a radius of "+radius+" is "+(pi*radius*radius)+".");
    }
}
