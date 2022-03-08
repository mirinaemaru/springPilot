package net.iotinfra.springpilot;

import org.apache.commons.lang3.StringUtils;
import org.junit.jupiter.api.Test;
//import org.springframework.util.StringUtils;

import static org.junit.jupiter.api.Assertions.*;

class StringUtilsTest {

    @Test
    public void stringToArrayTest() {

        StringUtil util = new StringUtil();
        String str = "2000^2001^2002";
        String[] result =  util.stringToArray(str);

        for(String s: result ) {
            System.out.println( ">>>" + s );
        }

        assertNotNull( result );
    }

    @Test
    public void stringSplitTest() {

        String str = "2000^2001^2002";
        String[] result = StringUtils.split(str,"^");

        for(String s: result ) {
            System.out.println( ">>>" + s );
        }

        assertNotNull( result );
    }
}