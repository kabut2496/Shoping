/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package shopping;
import java.util.Scanner;
/**
 *Karl Butler
 * created on Oct.2.2018
 * for practice with the scanner package
 */
public class Shopping {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner keyInput = new Scanner(System.in);
        //declaring variables
        double usb,mouse,keyboard,usbCost,mouseCost,keyboardCost,totalCostBT,mouseTax,keyboardTax,usbTax,usbTotal,mouseTotal,keyboardTotal;
       
        //gatering the information
        System.out.println("how many USB sticks are you planing to buy");
        usb= keyInput.nextDouble();
        System.out.println("now how many mice do you plane on buying");
        mouse=keyInput.nextDouble();
        System.out.println("finaly how many keyboards do you plan on getting");
        keyboard=keyInput.nextDouble();
        
        // the cost of the items befor the tax
        usbCost=19.99*usb;
        mouseCost=49.99*mouse;
        keyboardCost=25.99*keyboard;
        System.out.println("The cost of the USB sticks befor tax will be "+usbCost+"\nThe cost of the mice will be "+ mouseCost+"\nThe cost of the keyboards will be "+keyboardCost );
        totalCostBT=usbCost+mouseCost+keyboardCost;
        System.out.println("Your total cost befor tax will be "+ totalCostBT);
        
        //produces with tax
        usbTax = usbCost*0.13;
        mouseTax = mouseCost*0.13;
        keyboardTax= keyboardCost*0.13;
        System.out.println("the usb tax will be "+usbTax);
        System.out.println("the mouse tax will be "+mouseTax);
        System.out.println("the keybourd tax will come to "+keyboardTax);
        
        //total prises 
        usbTotal = usbCost+usbTax;
        mouseTotal = mouseCost+mouseTax;
        keyboardTotal = keyboardCost+keyboardTax;
        System.out.println("the total cost of the USB's will be "+usbTotal);
        System.out.println("the total cost of the mouses will be "+mouseTotal);
        System.out.println("the total cost of the keyboard's will be "+keyboardTotal);
    }
    
}
