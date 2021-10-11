package ex42;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class FormatTest
{

    @Test
    @DisplayName("Check array, Check rows")
    void getNumRows() throws IOException
    {
        Format myFormat = new Format();
        myFormat.setNumRows(myFormat.rowCount("src/test/java/ex42/testdata.txt"));
        assertEquals(7, myFormat.getNumRows());


        assertEquals(true, myFormat.readToArray() != null);

    }
}