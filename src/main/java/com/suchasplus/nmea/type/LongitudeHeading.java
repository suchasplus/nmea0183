package com.suchasplus.nmea.type;

import com.suchasplus.nmea.base.AbstractType;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */
public enum LongitudeHeading implements AbstractType {
    WEST {
        @Override
        public String getLiteral() {
            return "W";
        }
    },
    EAST {
        @Override
        public String getLiteral() {
            return "E";
        }
    }
}
