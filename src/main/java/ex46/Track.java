package ex46;

public class Track
{
    public String getText()
    {
        return text;
    }

    private String text = "";

    public void addString(String str)
    {
        this.text += str;
    }

    public static int count(String text, String str)
    {
        int index = 0, count = 0;
        while (true)
        {
            index = text.indexOf(str, index);
            if (index != -1)
            {
                count++;
                index += str.length();
            }
            else
            {
                break;
            }
        }
        return count;
    }
}
