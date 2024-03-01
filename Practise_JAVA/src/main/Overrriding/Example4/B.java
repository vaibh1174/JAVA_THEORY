package main.Overrriding.Example4;

import java.io.FileNotFoundException;
import java.io.IOException;

// IN CASE OF EXCEPTION- YOU NEED TO HAVE ONLY CHILD EXCEPTIONS UNLIKE ACCESS MODIFIERS
// FILENOTFOUNDEXCEPTION -> IOEXCEPTION -> eXCEPTION
public class B extends A{
    void m() {
        System.out.println("HI");
    }
    static void hero(){
        System.out.println("hi");
    }

    public static void main(String[] args) {
        hero();
    }
}
