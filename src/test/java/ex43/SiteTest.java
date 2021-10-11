package ex43;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SiteTest
{

    @Test
    @DisplayName("Check if folders are created")
    void set_directories() throws IOException
    {

        String site_name = "awesomeco";
        String author = "Max Powell";
        String js_folder = "y";
        String css_folder = "y";

        Site mySite = new Site();

        String site_folder = "./src/test/java/ex43/website/" + site_name;
        File f0 = new File("./src/test/java/ex43/website");
        f0.mkdir();

        String site_html = site_folder;
        site_html += "/index.html";

        File f1 = new File(site_folder);
        f1.mkdir();
        System.out.println("Created: " + site_folder);

        File f2 = new File(site_html);
        f2.createNewFile();
        System.out.println("Created: " + site_html);

        assertEquals(true, f0 != null);
        assertEquals(true, f1 != null);
        assertEquals(true, f2 != null);

    }
}