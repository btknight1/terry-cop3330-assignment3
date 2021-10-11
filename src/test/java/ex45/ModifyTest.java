package ex45;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;

class ModifyTest
{
    @Test
    @DisplayName("Check if occurrences are removed")
    void main() throws IOException
    {
        Modify myText = new Modify();
        File readFile = new File("src/test/java/ex45/exercise45_input.txt");
        Scanner input = new Scanner(readFile);
        while (input.hasNextLine())
        {
            myText.addString(input.nextLine());
            if(input.hasNextLine())
                myText.addString("\n");
        }
        input.close();

        input = new Scanner(System.in);
        myText.replace("\\butilize\\b", "use");
        myText.replace("\\butilizes\\b", "use");

        String check = myText.getText();

        assertEquals(false, check.contains("utilize"));
        assertEquals(false, check.contains("utilizes"));
    }
}