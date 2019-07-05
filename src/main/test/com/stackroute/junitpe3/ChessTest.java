package com.stackroute.junitpe3;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ChessTest {
    Chess chess;
    @Before
    public void setUp() throws Exception {
        chess=new Chess();
    }

    @After
    public void tearDown() throws Exception {
        chess=null;
    }

    @Test
    public void generateBoard() {
        String expected="WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|\n" +
                "WW|BB|WW|BB|WW|BB|WW|BB|\n" +
                "BB|WW|BB|WW|BB|WW|BB|WW|";
        assertEquals(expected,chess.generateBoard());
    }
    @Test
    public void generateBoardNotNull() {

        assertNotNull(chess.generateBoard());
    }

}