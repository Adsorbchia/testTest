package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookTest {
    Book book;

    @BeforeEach
    public void setUp(){
        book = new Book("1","Book1", "Author1" );
    }


    @Test
    public void testGetId(){
        assertEquals(book.getId(),"1");

    }

    @Test
    public void testGetTitle(){
        assertEquals(book.getTitle(),"Book1");
    }

    @Test
    public void testGetAuthor(){
        assertEquals(book.getAuthor(),"Author1");
    }


    @Test
    public void testSetId(){
        book.setId("2");
        assertEquals(book.getId(),"2");
    }
}
