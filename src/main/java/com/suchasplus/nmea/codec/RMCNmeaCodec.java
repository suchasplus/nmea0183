package com.suchasplus.nmea.codec;

import com.suchasplus.nmea.base.AbstractNmeaCodec;
import com.suchasplus.nmea.base.AbstractNmeaObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;
import java.util.Observable;

/**
 * Powered by suchasplus@gmail.com on 2016/1/17.
 */
public class RmcNmeaCodec extends AbstractNmeaCodec {
    final private static Logger logger = LoggerFactory.getLogger(RmcNmeaCodec.class);


    @Override
    public AbstractNmeaObject decode(List<String> Content) {

        return null;
    }

    @Override
    public List<String> encode(AbstractNmeaObject obj) {

        return null;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
