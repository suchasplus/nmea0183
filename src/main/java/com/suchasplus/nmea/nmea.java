package com.suchasplus.nmea;

/**
 * Powered by suchasplus@gmail.com on 2016/1/17.
 */


/**
 *
 *
 * http://www.gpsinformation.org/dale/nmea.htm
 *
 * The National Marine Electronics Association (NMEA) has developed a specification that defines the interface between
 * various pieces of marine electronic equipment. The standard permits marine electronics to send information to
 * computers and to other marine equipment. A full copy of this standard is available for purchase at their web site.
 * None of the information on this site comes from this standard and I do not have a copy. Anyone attempting to design
 * anything to this standard should obtain an official copy.
 *
 * GPS receiver communication is defined within this specification. Most computer programs that provide real time
 * position information understand and expect data to be in NMEA format.
 * This data includes the complete PVT (position, velocity, time) solution computed by the GPS receiver.
 * The idea of NMEA is to send a line of data called a sentence that is totally self contained and independent from
 * other sentences. There are standard sentences for each device category and there is also the ability to define
 * proprietary sentences for use by the individual company. All of the standard sentences have a two letter prefix that
 * defines the device that uses that sentence type. (For gps receivers the prefix is GP.) which is followed by a three
 * letter sequence that defines the sentence contents. In addition NMEA permits hardware manufactures to define their
 * own proprietary sentences for whatever purpose they see fit. All proprietary sentences begin with the letter P and
 * are followed with 3 letters that identifies the manufacturer controlling that sentence. For example a Garmin sentence
 * would start with PGRM and Magellan would begin with PMGN.
 *
 * Each sentence begins with a '$' and ends with a carriage return/line feed sequence and can be no longer than 80
 * characters of visible text (plus the line terminators). The data is contained within this single line with data items
 * separated by commas. The data itself is just ascii text and may extend over multiple sentences in certain specialized
 * instances but is normally fully contained in one variable length sentence. The data may vary in the amount of
 * precision contained in the message. For example time might be indicated to decimal parts of a second or location may
 * be show with 3 or even 4 digits after the decimal point. Programs that read the data should only use the commas to
 * determine the field boundaries and not depend on column positions. There is a provision for a checksum at the end of
 * each sentence which may or may not be checked by the unit that reads the data. The checksum field consists of a '*'
 * and two hex digits representing an 8 bit exclusive OR of all characters between, but not including, the '$' and '*'.
 * A checksum is required on some sentences.
 *
 * There have been several changes to the standard but for gps use the only ones that are likely to be encountered are
 * 1.5 and 2.0 through 2.3. These just specify some different sentence configurations which may be peculiar to the needs
 * of a particular device thus the gps may need to be changed to match the devices being interfaced to. Some gps's
 * provide the ability configure a custom set the sentences while other may offer a set of fixed choices. Many gps
 * receivers simply output a fixed set of sentences that cannot be changed by the user. The current version of the
 * standard is 3.01. I have no specific information on this version, but I am not aware of any GPS products that require
 * conformance to this version.
 *
 *
 *
 *   AAM - Waypoint Arrival Alarm
 *   ALM - Almanac data
 *   APA - Auto Pilot A sentence
 *   APB - Auto Pilot B sentence
 *   BOD - Bearing Origin to Destination
 *   BWC - Bearing using Great Circle route
 *   DTM - Datum being used.
 *   GGA - Fix information
 *   GLL - Lat/Lon data
 *   GRS - GPS Range Residuals
 *   GSA - Overall Satellite data
 *   GST - GPS Pseudorange Noise Statistics
 *   GSV - Detailed Satellite data
 *   MSK - send control for a beacon receiver
 *   MSS - Beacon receiver status information.
 *   RMA - recommended Loran data
 *   RMB - recommended navigation data for gps
 *   RMC - recommended minimum data for gps
 *   RTE - route message
 *   TRF - Transit Fix Data
 *   STN - Multiple Data ID
 *   VBW - dual Ground / Water Spped
 *   VTG - Vector track an Speed over the Ground
 *   WCV - Waypoint closure velocity (Velocity Made Good)
 *   WPL - Waypoint Location information
 *   XTC - cross track error
 *   XTE - measured cross track error
 *   ZTG - Zulu (UTC) time and time to go (to destination)
 *   ZDA - Date and Time
 */
public class nmea {

    public static void main(String[] args) {


    }
}
