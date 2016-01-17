package com.suchasplus.nmea.base;

import java.util.List;
import java.util.Observable;
import java.util.Observer;

/**
 * Powered by suchasplus@gmail.com on 2016/1/17.
 */
abstract public class AbstractNmeaCodec extends Observable implements Observer{

    final protected String SUM_SPLIT = "*";

    abstract public AbstractNmeaObject decode(List<String> Content);
    abstract public List<String> encode(AbstractNmeaObject obj);

}
