package org.cadenhead.ecommerce;
import java.util.*;

public class GiftShop {
    public static void main(String [] arguments)
    {
        Storefront store = new Storefront();
        store.addItem("C01","MUG","9.99","150");
        store.addItem("C02","LG MUG","19.99","800");
        store.addItem("C03","MOOUSEPAD","199.99","50");
        store.addItem("D01","T SHIRT","2859.99","90");
        store.sort();

        for( int i = 0 ;i< store.getSize(); i++ )

        {
            Item show = (Item) store.getItem(i);
            System.out.println("\nItem:"+show.getId()+"\n name"+show.getName()
                    +"\nretail price"+show.getRetail()+"\nPriice"+show.getPrice()+"\nQuantity"+show.getQuant());
        }
    }




}
