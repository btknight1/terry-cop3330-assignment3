package ex44;

import java.util.ArrayList;
import java.util.List;

public class Data
{
    private int size = 7;
    private String[] products = new String[size];
    private String searchThis;
    private int index = 0;


    public String getSearchThis()
    {
        return searchThis;
    }

    public int find()
    {
        int i;

        for(i=0; i<size; i++)
        {
            if(products[i].contains(searchThis))
            {
                return i;
            }
        }
        return 0;
    }

    public String[] getProducts()
    {
        return products;
    }

    public void setProducts(String str)
    {
        this.products[index] = str;
        index++;
    }

    public void setSearchThis(String searchThis)
    {
        this.searchThis = searchThis;
    }
}
