import java.util.ArrayList;

public class CafeUtil {
///butun variable lar burada


    public CafeUtil(){
        System.out.println("Coffee is LIFE");
    }

///bu kisima constructor nedir pythondaki self kismi gibi

///// This section is for METHOD her degisken data TYPE YAZMAK ZORUNDASIN.
    public int getStreakGoal() {
    int sum=0;
    for ( int i=0; i<11 ; i++) {
        sum=sum+i;
    }
    return sum;
}
//getorder SECTION
    public double getOrderTotal(double[] prices) {
    double sum= 0.00;
    for (double price : prices){
        sum += price; 
    }
    return sum;
}

//DISPLAY MENU SECTION
    public void displayMenu(ArrayList<String> menuItems) {
    int counter = 0;
        for (String menuItem : menuItems) {
        System.out.println(String.format("%s %s", counter, menuItem));
        counter += 1;
    }
}
// ADD CUSTOMER SECTION
    public void addCustomer(ArrayList<String>customers) {
        System.out.println("Please enter your name");
        //readline butun index leri okur.
        String userName =System.console().readLine();
        System.out.println(String.format("Hello ,%s", userName));
        // array size al
        int customersArray = customers.size();
        System.out.println(String.format("There are %s people in front of you", customersArray));
        //add username to the customer
        customers.add(userName);
            for (String customer: customers) {
                System.out.println(customer);
            }
    }















}