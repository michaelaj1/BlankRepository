package pizzashop.menu;

import java.util.Arrays;

public class Pizza{

    //Pizza cheesePizza = new Pizza();
    //reference or declaration
    int size;
    String crust;
    String[] toppings;
    
    /*
        access modifiers: public, (default), protected, private

        private: only accessible within this class

        (default) : only accessible within this package

        protected: same as default, and sub classes outside of the package
        
        public: accessible anywhere 
    */

    public Pizza(int size, String crust, String...toppings)
    {
        this.size =  2 * size;
        this.crust = crust + "Pizza";
        Arrays.sort(toppings);
        this.toppings = toppings;
    }

    public Pizza()
    {
       
    }

    public String toString() {
        return "Pizza size: " + size + "\nPizza crust: " + crust
        + "\nPizza toppings: " + Arrays.toString(toppings); //this is a wrapper object
        
    }





}