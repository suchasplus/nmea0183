package com.suchasplus.nmea.vo.ais;

import com.suchasplus.nmea.base.AbstractNmeaObject;
import com.suchasplus.nmea.type.SentenceIdentifiers;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 *
 * <link>http://arundale.com/docs/ais/ais_decoder.html</link>
 */
public class VdmNmeaObject extends AbstractNmeaObject {
    public VdmNmeaObject() {
        objType = SentenceIdentifiers.ALM.toString();
    }

    @Override
    public String assemble() {
        return null;
    }
}
