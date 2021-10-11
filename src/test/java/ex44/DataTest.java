package ex44;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class DataTest
{

    @Test
    @DisplayName("Test if data is loaded to String, Test find()")
    void find() throws FileNotFoundException
    {
        int i = 0;
        Data myData = new Data();
        File readFile = new File("./src/test/java/ex44/exercise44_input.json");
        Scanner in = new Scanner(readFile);
        while (in.hasNextLine())
        {
            myData.setProducts(in.nextLine());
        }
        in.close();

        assertEquals(true, myData.getProducts() != null);

        myData.setSearchThis("Widget");
        assertEquals(true, myData.find() != 0);
    }
}