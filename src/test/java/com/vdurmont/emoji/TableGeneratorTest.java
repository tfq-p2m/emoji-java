package com.vdurmont.emoji;

import static org.junit.Assert.assertEquals;

public class TableGeneratorTest {

    public void testTableGenerator() {
        assertEquals(
                "An :grinning:awesome :smiley:string with a few :wink:emojis!",
                TableGenerator.class
        );
    }
}
