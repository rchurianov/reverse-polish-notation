package com.roma.rpn;

import static org.junit.Assert.assertEquals;
import org.junit.Test;
// import java.io.*;

// import com.rom.rpn.*;

public class CellTest {

    @Test
    public void testComputeCell() {
        Cell c = new Cell("1+2");
        String result = c.computeCell();
        System.out.println(result);
    }

}
