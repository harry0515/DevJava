

public class FreshJuiceTest extends FreshJuice {

   public static void main(String args[]) {
        FreshJuice juice = new FreshJuice();
        juice.size = FreshJuice.FreshJuiceSize.SMALL ;
        System.out.println("Size: " + juice.size);
    }
}
