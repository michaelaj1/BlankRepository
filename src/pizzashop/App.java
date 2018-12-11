package pizzashop;

import pizzashop.menu.Pizza;

public class App{

    public static void main (String [] args)
    {

        int size = 12;
        String crust = "Thin";
        String [] toppings = {"Cheese","Tomato Sauce"};
        //reference or declaration
        Pizza cheesePizza;  //only in Stack
        Pizza pepperoniPizza;

        //defining what this variable is
        //reserved word (new) for Java
        //new object created by calling the pizza constructor

        cheesePizza = new Pizza(size, crust,toppings); //Now in heap  also default constructor or no args constructor 
        pepperoniPizza = new Pizza(size, crust,"Tomato sauce","Pepperoni");

        //array doesnt have a to string
        System.out.println(cheesePizza.toString() + "\n"); //addres is in the heap, the output numbers
        System.out.println(pepperoniPizza.toString());
        
        

    }

}