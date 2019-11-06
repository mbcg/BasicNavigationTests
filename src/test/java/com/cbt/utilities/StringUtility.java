package com.cbt.utilities;

import org.apache.commons.lang3.SystemUtils;

public class StringUtility {

    public static String getOperatingSystemSystemUtils() {
        String os = SystemUtils.OS_NAME;
        return os;
    }

    public static String verifyEquals(String expected, String actual) {

        if (expected.equals(actual)) {
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
        System.out.println("Expected value:"+expected);
        System.out.println("Actual value:"+actual);
        return expected;
    }


}

