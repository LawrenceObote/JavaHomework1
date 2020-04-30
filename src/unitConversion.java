public class unitConversion {
    public static void main(String[] args){
        unitConversion(1000);
    }

    public static void unitConversion(double inches){
        double meters = 0.0254 * inches;
        System.out.println(meters);

    }
}
