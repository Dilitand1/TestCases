package ru.litvinov.testcases.mockitojavacore;

import static org.mockito.Mockito.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

/**
 * Тут только пример инициализации с антоациями
 * Все примеры в классе рядом ru.litvinov.testcases.mockitojavacore.BarTestWithoutAnnotation
 */
@RunWith(MockitoJUnitRunner.class)
public class BarTestWithAnnotations {

    @Mock
    private Foo foo;

    @InjectMocks
    private Bar bar = new Bar(null);

    @Test
    public void test() {
        bar.bar("qwe");
        verify(foo).foo("qwe");
    }

    /**
     * Сделали мок, создали класс с моком и проверили вызывался ли он
     */
    @Test
    public void simpleMocking(){
        //Foo foo = mock(Foo.class);
        //Bar bar = new Bar(foo);
        bar.bar("qwe");
        verify(foo).foo("qwe");
    }



}
