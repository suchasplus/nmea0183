package com.suchasplus.nmea.type;

/**
 * Powered by suchasplus@gmail.com on 2016/1/18.
 */

/**
 * Sentences identifiers
 *
 * Supported standart sentences:
 * AAM, ALM, APA, APB, ASD, BEC, BOD, BWC, BWR, BWW, DBK, DBS, DBT, DCN,
 * DPT, DSC, DSE, DSI, DSR, DTM, FSI, GBS, GGA, GLC, GLL, GRS, GST, GSA,
 * GSV, GTD, GXA, HDG, HDM, HDT, HSC, LCD, MSK, MSS, MWD, MTW, MWV, OLN,
 * OSD, ROO, RMA, RMB, RMC, ROT, RPM, RSA, RSD, RTE, SFI, STN, TLL, TRF,
 * TTM, TXT, VBW, VDR, VHW, VLW, VPW, VTG, VWR, WCV, WDC, WDR, WNC, WPL,
 * XDR, XTE, XTR, ZDA, ZDL, ZFO, ZTG
 */

/** Supported proprietary sentences:
 *
 * Garmin Corp        : B, E, F, M, T, V, Z, C, CE, C1, C1E, I, IE, O
 * Martech Inc.       : 001, 101, 102, 103, 104, 251, 300, 301, 313, 314, 320, 390, 420, 490, 520, 590, 605, 705
 * Trimble Navigation : DG, EV, ",GGK", ID, SM, ",AVR", ",BPQ", ",PJK", ",PJT", ",VGK", ",VHD"
 * Magellan           : CMD, CSM, DRT, DWP, RTE, TRK, VER, WPL, ST
 * Motorola           : G
 * Rockwell Int.      : RID, ILOG
 * Starlink           : B
 */
public enum SentenceIdentifiers {
    AAM,
    ALM,
    APA,
    APB,
    ASD,
    BEC,
    BOD,
    BWC,
    BWR,
    BWW,
    DBK,
    DBS,
    DBT,
    DCN,
    DPT,
    DSC,
    DSE,
    DSI,
    DSR,
    DTM,
    FSI,
    GBS,
    GGA,
    GLC,
    GLL,
    GRS,
    GST,
    GSA,
    GSV,
    GTD,
    GXA,
    HDG,
    HDM,
    HDT,
    HSC,
    LCD,
    MSK,
    MSS,
    MWD,
    MTW,
    MWV,
    OLN,
    OSD,
    ROO,
    RMA,
    RMB,
    RMC,
    ROT,
    RPM,
    RSA,
    RSD,
    RTE,
    SFI,
    STN,
    TLL,
    TRF,
    TTM,
    TXT,
    VBW,
    VDR,
    VHW,
    VLW,
    VPW,
    VTG,
    VWR,
    WCV,
    WDC,
    WDR,
    WNC,
    WPL,
    XDR,
    XTE,
    XTR,
    ZDA,
    ZDL,
    ZFO,
    ZTG,
    unknown;

    public int getValue() {
        return this.ordinal();
    }

    public static SentenceIdentifiers forValue(int value) {
        return values()[value];
    }
}
