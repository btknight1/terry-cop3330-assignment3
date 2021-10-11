package ex43;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Site
{
    private String site_name;
    private String author;
    private String js_folder;
    private String css_folder;


    public void set_directories(String site_name, String author, String js_folder, String css_folder) throws IOException
    {
        // establish directories
        String site_folder = "./src/main/java/ex43/website/" + site_name;
        File f0 = new File("./src/main/java/ex43/website");
        f0.mkdir();

        String site_html = site_folder;
        site_html += "/index.html";

        File f1 = new File(site_folder);
        f1.mkdir();
        System.out.println("Created: " + site_folder);

        File f2 = new File(site_html);
        f2.createNewFile();
        System.out.println("Created: " + site_html);

        FileWriter fw = new FileWriter(site_html);

        // Skeleton html file
        // create html template
        fw.write("<html>\n");
        fw.write("<head>\n");
        fw.write("<title>" + site_name + "</title>");
        fw.write("<meta name=\"author\" content=\"" + author + "\">\n");
        fw.write("</head>\n");
        fw.write("</html>\n");
        fw.close();

        // check if a javascript folder is needed
        if (js_folder.equals("y"))
        {
            String js_path = site_folder;
            js_path += "/js";
            File f3 = new File(js_path);
            f3.mkdir();
            System.out.println("Created: " + js_path);
        }

        // check if a css folder is needed
        if (css_folder.equals("y"))
        {
            String css_path = site_folder;
            css_path += "/css";
            File f4 = new File(css_path);
            f4.mkdir();
            System.out.println("Created: " + css_path);
        }
    }

    public void setSite_name(String site_name)
    {
        this.site_name = site_name;
    }

    public String getSite_name()
    {
        return site_name;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getJs_folder()
    {
        return js_folder;
    }

    public String getCss_folder()
    {
        return css_folder;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public void setJs_folder(String js_folder)
    {
        this.js_folder = js_folder;
    }

    public void setCss_folder(String css_folder)
    {
        this.css_folder = css_folder;
    }
}
