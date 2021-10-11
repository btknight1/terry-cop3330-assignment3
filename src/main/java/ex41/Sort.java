package ex41;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;

public class Sort
{
    private int numNames;

    public int getNumNames()
    {
        return numNames;
    }

    public void setNumNames(int numNames)
    {
        this.numNames = numNames;
    }

    public int nameCount(String fileName) throws IOException
    {
        BufferedReader reader = new BufferedReader(new FileReader(fileName));
        int names = 0;
        while (reader.readLine() != null) names++;
        reader.close();
        return names;
    }

    public void sortAndOutput() throws IOException
    {
        String[] names = new String[numNames];
        int i=0;
        BufferedReader reader = new BufferedReader(new FileReader("src/main/java/ex41/exercise41_input.txt"));

        String line;
        while((line = reader.readLine()) != null){
            names[i] = line;
            i++;
        }

        reader.close();
        Arrays.sort(names);

        try
        {
            FileWriter myWriter = new FileWriter("src/main/java/ex41/exercise41_output.txt");
            myWriter.write("Total of " + numNames + " names\n-----------------\n");
            for(i=0; i<numNames; i++)
            {
                if(i!=numNames-1)
                    myWriter.write(names[i]+"\n");
                else
                    myWriter.write(names[i]);
            }

            myWriter.close();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}