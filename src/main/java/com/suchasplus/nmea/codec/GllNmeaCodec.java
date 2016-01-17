package com.suchasplus.nmea.codec;

import com.suchasplus.nmea.base.AbstractNmeaCodec;
import com.suchasplus.nmea.base.AbstractNmeaObject;
import com.suchasplus.nmea.util.NmeaCheckSum;
import com.suchasplus.nmea.util.NmeaConst;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;

/**
 * Powered by suchasplus@gmail.com on 2016/1/17.
 */
public class GllNmeaCodec extends AbstractNmeaCodec {

    final private static Logger logger = LoggerFactory.getLogger(GllNmeaCodec.class);

    @Override
    public AbstractNmeaObject decode(List<String> Content) {

        return null;
    }

    @Override
    public List<String> encode(AbstractNmeaObject obj) {

        String content = obj.assemble();

        String str = (new StringBuilder())
                .append(NmeaConst.SentenceStartDelimiter)
                .append(content)
                .append(NmeaConst.CheckSumFieldDelimiter)
                .append(NmeaCheckSum.generateSum(content))
                .toString();

        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(str);
        return arrayList;
    }

    @Override
    public void update(Observable o, Object arg) {

    }
}
