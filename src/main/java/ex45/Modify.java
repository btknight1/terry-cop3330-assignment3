package ex45;

import java.io.FileWriter;
import java.io.IOException;

public class Modify
{
    private String text = "";

    public String getText()
    {
        return text;
    }

    public void replace(String old, String str)
    {
       text = text.replaceAll(old, str);
    }

    public void createFile(String name) throws IOException
    {
        FileWriter fw = new FileWriter("src/main/java/ex45/"+name+".txt");
        fw.write(text);
        fw.close();
    }

    public void addString(String str)
    {
        this.text += str;
    }
}
