import java.util.ArrayList;
public class TestCafe {
    
    public static void main (String[]args) {
        /*test file control etmeye yarar ve burda ornek bi instance olusturman gerek ve bu 
        butun methodlari kullanmani saglar

        I need add 1 line to this line to this file to create
        an instance of the CafeUtil Class
        !!!! buraya kac taane instance gelecek??????
        */
        
        CafeUtil cafeUtil = new CafeUtil();
        System.out.println("\n----- Streak Goal Test -----");
        System.out.printf("Purchases needed by week 10: %s \n\n", cafeUtil.getStreakGoal());




        double[] lineItems = {3.5, 1.5, 4.0, 4.5, 10.2};
        double orderTotal = cafeUtil.getOrderTotal(lineItems);
        System.out.println("----- Order Total Test-----");
        System.out.printf("Order total: %s \n\n",orderTotal);



        //BURDA YENI BIR INSTANE URETTM ADI : MENU VE TURU  {drip coffee, cappucione} array list with strings
        ArrayList<String> menu = new ArrayList<String>();
        menu.add("drip coffee");
        menu.add("cappuccino");
        menu.add("latte");
        menu.add("mocha");
        cafeUtil.displayMenu(menu);



        System.out.println("\n----- Add Customer Test-----");
        ArrayList<String> customers = new ArrayList<String>();
        for (int i = 0; i < 4; i++) {
            cafeUtil.addCustomer(customers);
            System.out.println("\n");
        }
    }
}
