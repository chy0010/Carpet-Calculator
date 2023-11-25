public class Main {
    public static void main(String[] args) {
        Floor floor=new Floor(12,10);
        Carpet carpet=new Carpet(8);
        Calculator calculate=new Calculator(floor,carpet);
        System.out.println(calculate.getTotalCost());

    }
}
