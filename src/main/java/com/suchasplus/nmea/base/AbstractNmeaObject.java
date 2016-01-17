package com.suchasplus.nmea.base;

/**
 * Powered by suchasplus@gmail.com on 2016/1/17.
 */
abstract public class AbstractNmeaObject {

    protected String objType;

    public String getObjType() {
        return objType;
    }

    public void setObjType(String objType) {
        this.objType = objType;
    }

    abstract public String assemble();
}
