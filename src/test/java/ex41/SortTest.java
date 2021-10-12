package ex41;

import org.junit.jupiter.api.DisplayName;

import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class SortTest
{

    @org.junit.jupiter.api.Test
    @DisplayName("Test nameCount with various name lists")
    void nameCount01() throws IOException
    {
        Sort mySort = new Sort();
        String file1 = "src/test/java/ex41/nameCountTest01.txt";
        String file2 = "src/test/java/ex41/nameCountTest02.txt";
        String file3 = "src/test/java/ex41/nameCountTest03.txt";

        assertEquals(8, mySort.nameCount(file1));
        assertEquals(10, mySort.nameCount(file2));
        assertEquals(5, mySort.nameCount(file3));
    }
}