package org.cadenhead.ecommerce;
import java.util.*;

public class Item implements Comparable {
    private String name;
    private String id;
    private  double retail;
    private  double price;
    private int quantity;

    Item(String idIn, String nameIn, String retailIn, String quantIn)
    {
        id=idIn;
        name=nameIn;
        retail=Double.parseDouble(retailIn);
        quantity=Integer.parseInt(quantIn);

        if(quantity>400)
            price=retail*.5D;
        else if(quantity>200)
            price=retail*.6D;
        else
            price=retail*.7D;

        price = Math.floor(( price * 100 + .5 ) )/100;
    }

    public int compareTo(Object obj)
    {
        Item a= (Item)obj ;

        if(a.price>this.price)
            return -1;
        else  if(a.price>this.price)
            return 1 ;

        return 0;

    }

    public String getName()
    {return name ; }
    public String getId()
    {return id;}
    public double getRetail()
    {return retail;}
    public double getPrice()
    {return price;}
    public int getQuant()
    {return quantity;}

}
