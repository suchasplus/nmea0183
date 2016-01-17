package com.suchasplus.nmea.tests.lesson1;

import com.suchasplus.nmea.tests.util.NmeaCheckSumTest;
import junit.framework.Test;
import junit.framework.TestSuite;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */
public class Lesson1Test {

    final private static Logger logger = LoggerFactory.getLogger(Lesson1Test.class);

    public static Test suite() {
        TestSuite suite = new TestSuite("Test for Lesson 1 @ suchasplus@gmail.com");

        suite.addTestSuite(GGATest.class);

        suite.addTestSuite(GLLTest.class);

        suite.addTestSuite(RMCTest.class);

        suite.addTestSuite(VDMTest.class);

        suite.addTestSuite(NmeaCheckSumTest.class);

        return suite;
    }
}
