package ex42;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Format
{
    private int numRows;

    public int getNumRows()
    {
        return numRows;
    }

    public void setNumRows(int numRows)
    {
        this.numRows = numRows;
    }

    public int rowCount(String fileName) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int rows = 0;
        while (reader.readLine() != null) rows++;
        reader.close();
        return rows;
    }

    public String[] readToArray() throws IOException
    {
        String[] names = new String[numRows];
        int i=0;
        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ex42/exercise42_input.txt"));

        String line;
        while((line = reader.readLine()) != null)
        {
            names[i] = line;
            i++;
        }
        reader.close();
        return names;
    }
}
