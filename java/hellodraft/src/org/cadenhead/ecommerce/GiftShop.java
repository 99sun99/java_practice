package org.cadenhead.ecommerce;
import java.util.*;
import org.cadenhead.ecommerce.*;

public class GiftShop {
    public static void main(String []arguments)
    {
        frontStore store=new frontStore();
        store.addItem("C01","MUG","19.99","800");
        store.addItem("C02","LG MUG","499.99","900");
        store.addItem("C03","MOUSEPAD","529.99","100");
        store.addItem("D01","T SHIRT","611.25","80");

        for(int i=0;i<store.getSize();i++)
        {
            Item show= (Item)store.getItem(i);

            System.out.println("id "+show.getId()+"Name "+show.getName()+"retail "+show.getRetail()
                    +"Price "+show.getPrice()+"quantitiy "+show.getQuant());

        }



    }

}
