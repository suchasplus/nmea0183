package com.suchasplus.nmea.util;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */

/**
 * simulate the ability to pass arguments by reference in Java
 * @param <T>
 */
final public class RefObject<T> {
    public T argvalue;
    public RefObject(T refarg) {
        argvalue = refarg;
    }
}
