package com.suchasplus.nmea.vo.nmea;

import com.suchasplus.nmea.base.AbstractNmeaObject;
import com.suchasplus.nmea.type.SentenceIdentifiers;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */

/**
 *
 * Fix information
 *
 *
 * GGA - essential fix data which provide 3D location and accuracy data.
 *
 * $GPGGA,123519,4807.038,N,01131.000,E,1,08,0.9,545.4,M,46.9,M,,*47
 *
 * Where:
 * GGA          Global Positioning System Fix Data
 * 123519       Fix taken at 12:35:19 UTC
 * 4807.038,N   Latitude 48 deg 07.038' N
 * 01131.000,E  Longitude 11 deg 31.000' E
 * 1            Fix quality: 0 = invalid
 * 1 = GPS fix (SPS)
 * 2 = DGPS fix
 * 3 = PPS fix
 * 4 = Real Time Kinematic
 * 5 = Float RTK
 * 6 = estimated (dead reckoning) (2.3 feature)
 * 7 = Manual input mode
 * 8 = Simulation mode
 * 08           Number of satellites being tracked
 * 0.9          Horizontal dilution of position
 * 545.4,M      Altitude, Meters, above mean sea level
 * 46.9,M       Height of geoid (mean sea level) above WGS84
 * ellipsoid
 * (empty field) time in seconds since last DGPS update
 * (empty field) DGPS station ID number
 * *47          the checksum data, always begins with *
 * If the height of geoid is missing then the altitude should be suspect.
 * Some non-standard implementations report altitude with respect to the ellipsoid
 * rather than geoid altitude. Some units do not report negative altitudes at all.
 * This is the only sentence that reports altitude.
 */


public class GgaNmeaObject extends AbstractNmeaObject {
    public GgaNmeaObject() {
        objType = SentenceIdentifiers.GGA.toString();
    }

    @Override
    public String assemble() {
        return null;
    }
}
