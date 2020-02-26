package org.cadenhead.ecommerce;
import java.util.*;

public class frontStore {
    LinkedList catalog = new LinkedList();

    public void addItem(String idIn,String nameIn, String retailIn, String quantIn)
    {
        Item itt=new Item(idIn, nameIn,retailIn, quantIn);
            catalog.add(itt);
    }

    public Item getItem(int i)
    {return (Item)catalog.get(i);}
    public int getSize()
    {return catalog.size();}
    public void sort()
    { Collections.sort(catalog);}
}
