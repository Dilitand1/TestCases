package ru.litvinov.testcases.mockitojavacore;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

import static org.mockito.Mockito.*;

/**
 * init mock without annotations
 */
public class BarTestWithoutAnnotation {
    private Foo foo;
    private Bar bar;

    /**
     * @Before срабатывает перед каждым вызовом метода @Test
     */
    @Before
    public void init() {
        foo = mock(Foo.class);
        bar = new Bar(foo);
    }

    /**
     * Сделали мок, создали класс с моком и проверили вызывался ли он
     */
    @Test
    public void simpleMocking(){
        bar.bar("qwe");
        verify(foo).foo("qwe");
    }


}
