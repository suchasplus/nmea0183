package com.suchasplus.nmea.type;

import com.suchasplus.nmea.base.AbstractType;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */
public enum LatitudeHeading implements AbstractType {
    NORTH {
        @Override
        public String getLiteral() {
            return "N";
        }
    },
    SOUTH {
        @Override
        public String getLiteral() {
            return "S";
        }
    }
}
