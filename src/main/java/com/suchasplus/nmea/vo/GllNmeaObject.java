package com.suchasplus.nmea.vo;

import com.suchasplus.nmea.base.AbstractNmeaObject;
import com.suchasplus.nmea.type.LatitudeHeading;
import com.suchasplus.nmea.type.LongitudeHeading;
import com.suchasplus.nmea.type.Sentence;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */

/**
 *
 * Lat/Lon data
 *
 * <link>http://www.gpsinformation.org/dale/nmea.htm#2.3</link>
 *
 * GLL - Geographic Latitude and Longitude is a holdover from Loran data and some old
 * units may not send the time and data active information
 * if they are emulating Loran data.
 * If a gps is emulating Loran data they may use the LC Loran prefix instead of GP.

 * $GPGLL,4916.45,N,12311.12,W,225444,A,*1D
 *
 * Where:
 * GLL          Geographic position, Latitude and Longitude
 * 4916.46,N    Latitude 49 deg. 16.45 min. North
 * 12311.12,W   Longitude 123 deg. 11.12 min. West
 * 225444       Fix taken at 22:54:44 UTC
 * A            Data Active or V (void)
 * *iD          checksum data
 * Note that, as of the 2.3 release of NMEA, there is a new field in the GLL sentence at the end just prior to the checksum.
 */
public class GllNmeaObject extends AbstractNmeaObject {

    public GllNmeaObject() {
        objType = Sentence.GLL;
    }

    private String latitude;
    private LatitudeHeading latitude_heading;
    private String longitude;
    private LongitudeHeading longitude_heading;
    private String fixTaken;
    private Boolean activeOrVoid;

    @Override
    public String assemble() {
        return String.format("GPGLL%s,%s,%s,%s,%s,%s",
                latitude, latitude_heading.getLiteral(),
                longitude, longitude_heading.getLiteral(),
                fixTaken, (activeOrVoid ? "A" : "V")
        );
    }


    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public LatitudeHeading getLatitude_heading() {
        return latitude_heading;
    }

    public void setLatitude_heading(LatitudeHeading latitude_heading) {
        this.latitude_heading = latitude_heading;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public LongitudeHeading getLongitude_heading() {
        return longitude_heading;
    }

    public void setLongitude_heading(LongitudeHeading longitude_heading) {
        this.longitude_heading = longitude_heading;
    }

    public String getFixTaken() {
        return fixTaken;
    }

    public void setFixTaken(String fixTaken) {
        this.fixTaken = fixTaken;
    }

    public Boolean getActiveOrVoid() {
        return activeOrVoid;
    }

    public void setActiveOrVoid(Boolean activeOrVoid) {
        this.activeOrVoid = activeOrVoid;
    }


    @Override
    public String toString() {
        return "GllNmeaObject{" +
                "latitude='" + latitude + '\'' +
                ", latitude_heading=" + latitude_heading +
                ", longitude='" + longitude + '\'' +
                ", longitude_heading=" + longitude_heading +
                ", fixTaken='" + fixTaken + '\'' +
                ", activeOrVoid=" + activeOrVoid +
                '}';
    }
}

