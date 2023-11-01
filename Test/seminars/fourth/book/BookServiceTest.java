package seminars.fourth.book;


import org.assertj.core.util.Arrays;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.FactoryBasedNavigableListAssert.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.anyList;
import static org.mockito.Mockito.*;

class BookServiceTest {


    @Test
    public void testFindByIdBookRepository(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findById("1")).thenReturn(new Book("1","Book1", "Author1"));
        String idBook = "1";
        String actualBook = bookService.findBookById(idBook).getId();
        verify(bookRepository,times(1)).findById("1");
        assertEquals(idBook,actualBook);

    }

    @Test
    public void testFindByAllBookRepository(){
        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);
        when(bookRepository.findAll()).thenReturn(new ArrayList<>(List.of(new Book("1","Book1", "Author1"),
                new Book("2","Book2", "Author2"),
                new Book("3","Book3", "Author3"),
                new Book("4","Book4", "Author4"))));
        int listSize = 4;
        int actualSize = bookService.findAllBooks().size();
        verify(bookRepository, times(1)).findAll();
        assertEquals(listSize,actualSize);

    }
   


}