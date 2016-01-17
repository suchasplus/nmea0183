package com.suchasplus.nmea.type;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */

/** Known talkers:
 AG, AP, CD, CR, CS, CT, CV, CX, DE, DF, EC, EP, ER, GL, GP, HC, HE,
 HN, II, IN, LA, LC, OM, P, RA, SD, SN, TR, SS, TI, VD, DM, VW, WI,
 YX, ZA, ZC, ZQ, ZV
 */

/**
 * Talkers identifiers
 */
public enum TalkerIdentifiers {
    AG,
    AP,
    CD,
    CR,
    CS,
    CT,
    CV,
    CX,
    DE,
    DF,
    EC,
    EP,
    ER,
    GL,
    GP,
    GN,
    HC,
    HE,
    HN,
    II,
    IN,
    LA,
    LC,
    OM,
    P,
    RA,
    SD,
    SN,
    TR,
    SS,
    TI,
    VD,
    DM,
    VW,
    WI,
    YX,
    ZA,
    ZC,
    ZQ,
    ZV,
    unknown;

    public int getValue() {
        return this.ordinal();
    }

    public static TalkerIdentifiers forValue(int value) {
        return values()[value];
    }
}
