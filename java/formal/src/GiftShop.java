package org.cadenhead.ecommerce;

import org.cadenhead.ecommerce.Stroefront ;
import org.cadenhead.ecommerce.Item ;

public class GiftShop {

    public static void main(String[] arguments) {

        Stroefront store = new Stroefront();

        store.addItem("C01", "MUG", "9.99", "150");
        store.addItem("C02", "LG MUG", "12.99", "82");
        store.addItem("C03", "MOUSEPAD", "10.94", "800");
        store.addItem("D01", "T SHIRT", "16.99", "90");
        store.sort();

        for (int i = 0; i < store.getSize(); i++) {
            Item show = (Item) store.getItem(i);
            System.out.println("\nItem ID" + show.getId()+
                    "\nName:" + show.getName() + "\nRetail:" + show.getRetail() +
                            "\nprice:" + show.getPrice() + "\nQuantity:" + show.getQuantity());

        }
    }
}
