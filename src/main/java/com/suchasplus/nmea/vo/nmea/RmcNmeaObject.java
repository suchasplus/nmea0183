package com.suchasplus.nmea.vo.nmea;

import com.suchasplus.nmea.base.AbstractNmeaObject;
import com.suchasplus.nmea.type.SentenceIdentifiers;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */

/**
 *
 * recommended minimum data for gps
 * <link>http://www.gpsinformation.org/dale/nmea.htm#2.3</link>
 *
 * RMC - NMEA has its own version of essential gps pvt (position, velocity, time) data.
 * It is called RMC, The Recommended Minimum, which will look similar to:
 *
 * $GPRMC,123519,A,4807.038,N,01131.000,E,022.4,084.4,230394,003.1,W*6A
 *
 * Where:
 * RMC          Recommended Minimum sentence C
 * 123519       Fix taken at 12:35:19 UTC
 * A            Status A=active or V=Void.
 * 4807.038,N   Latitude 48 deg 07.038' N
 * 01131.000,E  Longitude 11 deg 31.000' E
 * 022.4        Speed over the ground in knots
 * 084.4        Track angle in degrees True
 * 230394       Date - 23rd of March 1994
 * 003.1,W      Magnetic Variation
 * *6A          The checksum data, always begins with *
 * Note that, as of the 2.3 release of NMEA, there is a new field in the RMC sentence
 * at the end just prior to the checksum.
 */
public class RmcNmeaObject extends AbstractNmeaObject {
    public RmcNmeaObject() {
        objType = SentenceIdentifiers.RMC.toString();
    }

    @Override
    public String assemble() {
        return null;
    }
}
