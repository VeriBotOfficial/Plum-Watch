package org.apache.commons.net.ntp;

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.bouncycastle.asn1.cmc.BodyPartID;
import tv.danmaku.ijk.media.player.IjkMediaMeta;

/* loaded from: classes8.dex */
public class TimeStamp implements Serializable, Comparable<TimeStamp> {
    public static final String NTP_DATE_FORMAT = "EEE, MMM dd yyyy HH:mm:ss.SSS";
    protected static final long msb0baseTime = 2085978496000L;
    protected static final long msb1baseTime = -2208988800000L;
    private static final long serialVersionUID = 8139806907588338737L;
    private final long ntpTime;
    private DateFormat simpleFormatter;
    private DateFormat utcFormatter;

    private static void appendHexString(StringBuilder sb, long j) {
        String hexString = Long.toHexString(j);
        for (int length = hexString.length(); length < 8; length++) {
            sb.append('0');
        }
        sb.append(hexString);
    }

    protected static long decodeNtpHexString(String str) throws NumberFormatException {
        if (str == null) {
            throw new NumberFormatException(AbstractJsonLexerKt.NULL);
        }
        int indexOf = str.indexOf(46);
        if (indexOf == -1) {
            if (str.isEmpty()) {
                return 0L;
            }
            return Long.parseLong(str, 16) << 32;
        }
        return (Long.parseLong(str.substring(0, indexOf), 16) << 32) | Long.parseLong(str.substring(indexOf + 1), 16);
    }

    public static TimeStamp getCurrentTime() {
        return getNtpTime(System.currentTimeMillis());
    }

    public static TimeStamp getNtpTime(long j) {
        return new TimeStamp(toNtpTime(j));
    }

    public static long getTime(long j) {
        long j2 = j >>> 32;
        return ((j2 & BodyPartID.bodyIdMax) * 1000) + ((j2 & IjkMediaMeta.AV_CH_WIDE_LEFT) == 0 ? msb0baseTime : msb1baseTime) + Math.round(((j & BodyPartID.bodyIdMax) * 1000.0d) / 4.294967296E9d);
    }

    public static TimeStamp parseNtpString(String str) throws NumberFormatException {
        return new TimeStamp(decodeNtpHexString(str));
    }

    protected static long toNtpTime(long j) {
        long j2 = msb0baseTime;
        boolean z = j < msb0baseTime;
        if (z) {
            j2 = msb1baseTime;
        }
        long j3 = j - j2;
        long j4 = j3 / 1000;
        long j5 = ((j3 % 1000) * IjkMediaMeta.AV_CH_WIDE_RIGHT) / 1000;
        if (z) {
            j4 |= IjkMediaMeta.AV_CH_WIDE_LEFT;
        }
        return j5 | (j4 << 32);
    }

    public static String toString(long j) {
        StringBuilder sb = new StringBuilder();
        appendHexString(sb, (j >>> 32) & BodyPartID.bodyIdMax);
        sb.append('.');
        appendHexString(sb, j & BodyPartID.bodyIdMax);
        return sb.toString();
    }

    public TimeStamp(Date date) {
        this.ntpTime = date == null ? 0L : toNtpTime(date.getTime());
    }

    public TimeStamp(long j) {
        this.ntpTime = j;
    }

    public TimeStamp(String str) throws NumberFormatException {
        this.ntpTime = decodeNtpHexString(str);
    }

    @Override // java.lang.Comparable
    public int compareTo(TimeStamp timeStamp) {
        return Long.compare(this.ntpTime, timeStamp.ntpTime);
    }

    public boolean equals(Object obj) {
        return (obj instanceof TimeStamp) && this.ntpTime == ((TimeStamp) obj).ntpValue();
    }

    public Date getDate() {
        return new Date(getTime(this.ntpTime));
    }

    public long getFraction() {
        return this.ntpTime & BodyPartID.bodyIdMax;
    }

    public long getSeconds() {
        return (this.ntpTime >>> 32) & BodyPartID.bodyIdMax;
    }

    public long getTime() {
        return getTime(this.ntpTime);
    }

    public int hashCode() {
        long j = this.ntpTime;
        return (int) (j ^ (j >>> 32));
    }

    public long ntpValue() {
        return this.ntpTime;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }

    public String toDateString() {
        if (this.simpleFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat(NTP_DATE_FORMAT, Locale.US);
            this.simpleFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getDefault());
        }
        return this.simpleFormatter.format(getDate());
    }

    public String toString() {
        return toString(this.ntpTime);
    }

    public String toUTCString() {
        if (this.utcFormatter == null) {
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE, MMM dd yyyy HH:mm:ss.SSS 'UTC'", Locale.US);
            this.utcFormatter = simpleDateFormat;
            simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        }
        return this.utcFormatter.format(getDate());
    }

    private void writeObject(ObjectOutputStream objectOutputStream) {
        throw new UnsupportedOperationException("Serialization is not supported");
    }
}
