package com.suchasplus.nmea.devtest;

import com.suchasplus.nmea.util.NmeaCheckSum;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */
public class DevTest {
    final private static Logger logger = LoggerFactory.getLogger(DevTest.class);

    public static void main(String[] args) {

        logger.info("DevTest Start");

        NmeaCheckSum ncs = new NmeaCheckSum("$GPAAM,A,A,0.10,N,WPTNME*32");
        int sum = ncs.calcCheckSum();
        logger.info("check sum is : {}", sum);

        logger.info("{}", (new NmeaCheckSum("$PMTK000")).calcCheckSum());

        logger.info("* sum: {}", ncs.getCheckSumInSentence());
    }
}
