package com.suchasplus.nmea.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Calculate CheckSum in NMEA 0183 Sentence
 *
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */
final public class NmeaCheckSum {
    final private static Logger logger = LoggerFactory.getLogger(NmeaCheckSum.class);

    private String sentence;

    private int checkSum;

    public NmeaCheckSum(String stc) {
        super();
        sentence = stc;
        checkSum = -1;
    }

    public static String generateSum(String content) {
        int sum = 0;
        char[] contentArray = content.toCharArray();
        for( char c : contentArray) {
            sum ^= c;
        }

        return Integer.toHexString(sum);
    }

    public int getIntegerCheckSum() {
        return checkSum;
    }

    public String getHexCheckSum() {
        return Integer.toHexString(checkSum);
        //return Integer.valueOf(String.valueOf(checkSum), 16);
    }

    public int findEntryIndex() {
        char[] sentenceArray = sentence.toCharArray();
        int i = 0;
        for(char c : sentenceArray) {
            if( c == '!' || c == '$') {
                return i;
            }
            i++;
        }
        return -1;
    }

    public int calcCheckSum() {

        int idx = findEntryIndex() + 1;
        checkSum = 0;

        char[] data = sentence.substring(idx).toCharArray();
        for( char c : data) {
            if ( (c == '!') || (c == '$')) {
                logger.error("illegal char found : {}", c);
                return -1;
            }

            if (c == '*') {
                break;
            }

            checkSum ^= c;
        }
        return checkSum;
    }

    public int getCheckSumInSentence() {
        char[] data = sentence.toCharArray();
        int idx = 0;
        for( char c : data) {
            if (c == '*') {
                break;
            }
            idx++;
        }

        if(idx >= (sentence.length() - 2)) {
            return -1;
        }

        String hex = sentence.substring(idx+1, idx+3);

        return Integer.parseInt(hex, 16);

//        String hex = "ff";
//        int value = Integer.parseInt(hex, 16);
//        return value;

    }
}
