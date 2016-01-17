package com.suchasplus.nmea.tests.util;

import com.suchasplus.nmea.util.NmeaCheckSum;
import junit.framework.TestCase;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */
public class NmeaCheckSumTest extends TestCase {

    String aam = "$GPAAM,A,A,0.10,N,WPTNME*32"; // 0x32 == 50
    NmeaCheckSum ncs;

    @Override
    public void setUp() throws Exception {
        super.setUp();
        ncs = new NmeaCheckSum(aam);
    }

    @Override
    public void tearDown() throws Exception {
        super.tearDown();
    }

    public void testGenerateSum() {
        assertEquals("32", NmeaCheckSum.generateSum("GPAAM,A,A,0.10,N,WPTNME"));
    }

    public void testFindEntryIndex() {
        assertEquals(0, ncs.findEntryIndex());
    }

    public void testCalcCheckSum() {
        assertEquals(50, ncs.calcCheckSum());
    }

    public void testGetCheckSumInSentence() {
        assertEquals(50, ncs.getCheckSumInSentence() );
    }
}
