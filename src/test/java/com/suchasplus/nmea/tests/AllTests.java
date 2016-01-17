package com.suchasplus.nmea.tests;

import com.suchasplus.nmea.tests.util.NmeaCheckSumTest;
import junit.framework.Test;
import junit.framework.TestSuite;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */
public class AllTests {

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for NMEA0183 suchasplus.com");

        suite.addTestSuite(NmeaCheckSumTest.class);

        return suite;
    }
}
