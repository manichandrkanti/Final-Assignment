package com.company;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotEquals;

public class Testing {

    @Test
    public void testFactory(){
        StudentFactory factory=new StudentFactory();
        UndergraduateStudents s= (UndergraduateStudents) factory.getInstance("undergraduate");

        assertNotEquals(s,null);

    }

    @Test
    public void testSingleton(){
        Tool t1=Tool.getInstance();
        Tool t2=Tool.getInstance();

        assertEquals(t1,t2);
    }

}
