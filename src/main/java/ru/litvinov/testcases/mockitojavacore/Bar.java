package ru.litvinov.testcases.mockitojavacore;

public class Bar {
    private Foo foo;

    public Bar(Foo foo) {
        this.foo = foo;
    }

    public String bar(String parameter) {
        return foo.foo(parameter);
    }
}
