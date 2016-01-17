package com.suchasplus.nmea.vo;

import com.suchasplus.nmea.base.AbstractNmeaObject;
import com.suchasplus.nmea.type.Sentence;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 *
 * <link>http://arundale.com/docs/ais/ais_decoder.html</link>
 */
public class VdmNmeaObject extends AbstractNmeaObject {
    public VdmNmeaObject() {
        objType = Sentence.VDM;
    }

    @Override
    public String assemble() {
        return null;
    }
}
