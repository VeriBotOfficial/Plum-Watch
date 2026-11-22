package com.wakeup.module.religion.util;

import com.anythink.core.common.m.e;
import com.blankj.utilcode.util.LogUtils;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.TimeZone;

/* loaded from: classes4.dex */
public class PrayTime {
    private int AngleBased;
    private int Custom;
    private int Egypt;
    private int Floating;
    private int Hanafi;
    private int ISNA;
    private String InvalidTime;
    private double JDate;
    private int Jafari;
    private int Karachi;
    private int MWL;
    private int Makkah;
    private int MidNight;
    private int None;
    private int OneSeventh;
    private int Shafii;
    private int Tehran;
    private int Time12;
    private int Time12NS;
    private int Time24;
    private int adjustHighLats;
    private int asrJuristic;
    private int calcMethod;
    private int dhuhrMinutes;
    private double lat;
    private double lng;
    private HashMap<Integer, double[]> methodParams;
    private int numIterations;
    private int[] offsets;
    private double[] prayerTimesCurrent;
    private int timeFormat;
    private ArrayList<String> timeNames;
    private double timeZone;

    private double DegreesToRadians(double d) {
        return (d * 3.141592653589793d) / 180.0d;
    }

    private double radiansToDegrees(double d) {
        return (d * 180.0d) / 3.141592653589793d;
    }

    public PrayTime() {
        setCalcMethod(0);
        setAsrJuristic(0);
        setDhuhrMinutes(0);
        setAdjustHighLats(1);
        setTimeFormat(0);
        setJafari(0);
        setKarachi(1);
        setISNA(2);
        setMWL(3);
        setMakkah(4);
        setEgypt(5);
        setTehran(6);
        setCustom(7);
        setShafii(0);
        setHanafi(1);
        setNone(0);
        setMidNight(1);
        setOneSeventh(2);
        setAngleBased(3);
        setTime24(0);
        setTime12(1);
        setTime12NS(2);
        setFloating(3);
        ArrayList<String> arrayList = new ArrayList<>();
        this.timeNames = arrayList;
        arrayList.add("Fajr");
        this.timeNames.add("Sunrise");
        this.timeNames.add("Dhuhr");
        this.timeNames.add("Asr");
        this.timeNames.add("Sunset");
        this.timeNames.add("Maghrib");
        this.timeNames.add("Isha");
        this.InvalidTime = "-----";
        setNumIterations(1);
        this.offsets = new int[]{0, 0, 0, 0, 0, 0, 0};
        HashMap<Integer, double[]> hashMap = new HashMap<>();
        this.methodParams = hashMap;
        hashMap.put(Integer.valueOf(getJafari()), new double[]{16.0d, 0.0d, 4.0d, 0.0d, 14.0d});
        this.methodParams.put(Integer.valueOf(getKarachi()), new double[]{18.0d, 1.0d, 0.0d, 0.0d, 18.0d});
        this.methodParams.put(Integer.valueOf(getISNA()), new double[]{15.0d, 1.0d, 0.0d, 0.0d, 15.0d});
        this.methodParams.put(Integer.valueOf(getMWL()), new double[]{18.0d, 1.0d, 0.0d, 0.0d, 17.0d});
        this.methodParams.put(Integer.valueOf(getMakkah()), new double[]{18.5d, 1.0d, 0.0d, 1.0d, 90.0d});
        this.methodParams.put(Integer.valueOf(getEgypt()), new double[]{19.5d, 1.0d, 0.0d, 0.0d, 17.5d});
        this.methodParams.put(Integer.valueOf(getTehran()), new double[]{17.7d, 0.0d, 4.5d, 0.0d, 14.0d});
        this.methodParams.put(Integer.valueOf(getCustom()), new double[]{18.0d, 1.0d, 0.0d, 0.0d, 17.0d});
    }

    private double fixangle(double d) {
        double floor = d - (Math.floor(d / 360.0d) * 360.0d);
        return floor < 0.0d ? floor + 360.0d : floor;
    }

    private double fixhour(double d) {
        double floor = d - (Math.floor(d / 24.0d) * 24.0d);
        return floor < 0.0d ? floor + 24.0d : floor;
    }

    private double dsin(double d) {
        return Math.sin(DegreesToRadians(d));
    }

    private double dcos(double d) {
        return Math.cos(DegreesToRadians(d));
    }

    private double dtan(double d) {
        return Math.tan(DegreesToRadians(d));
    }

    private double darcsin(double d) {
        return radiansToDegrees(Math.asin(d));
    }

    private double darccos(double d) {
        return radiansToDegrees(Math.acos(d));
    }

    private double darctan(double d) {
        return radiansToDegrees(Math.atan(d));
    }

    private double darctan2(double d, double d2) {
        return radiansToDegrees(Math.atan2(d, d2));
    }

    private double darccot(double d) {
        return radiansToDegrees(Math.atan2(1.0d, d));
    }

    private double getTimeZone1() {
        return (TimeZone.getDefault().getRawOffset() / 1000.0d) / 3600.0d;
    }

    private double getBaseTimeZone() {
        return (TimeZone.getDefault().getRawOffset() / 1000.0d) / 3600.0d;
    }

    private double detectDaylightSaving() {
        return TimeZone.getDefault().getDSTSavings();
    }

    private double julianDate(int i, int i2, int i3) {
        if (i2 <= 2) {
            i--;
            i2 += 12;
        }
        double floor = Math.floor(i / 100.0d);
        return (((Math.floor((i + 4716) * 365.25d) + Math.floor((i2 + 1) * 30.6001d)) + i3) + ((2.0d - floor) + Math.floor(floor / 4.0d))) - 1524.5d;
    }

    private double calcJD(int i, int i2, int i3) {
        return (Math.floor(new Date(i, i2 - 1, i3).getTime() / 8.64E7d) + 2440588.0d) - 0.5d;
    }

    private double[] sunPosition(double d) {
        double d2 = d - 2451545.0d;
        double fixangle = fixangle((0.98560028d * d2) + 357.529d);
        double fixangle2 = fixangle((0.98564736d * d2) + 280.459d);
        double fixangle3 = fixangle((dsin(fixangle) * 1.915d) + fixangle2 + (dsin(fixangle * 2.0d) * 0.02d));
        double d3 = 23.439d - (d2 * 3.6E-7d);
        return new double[]{darcsin(dsin(d3) * dsin(fixangle3)), (fixangle2 / 15.0d) - fixhour(darctan2(dcos(d3) * dsin(fixangle3), dcos(fixangle3)) / 15.0d)};
    }

    private double equationOfTime(double d) {
        return sunPosition(d)[1];
    }

    private double sunDeclination(double d) {
        return sunPosition(d)[0];
    }

    private double computeMidDay(double d) {
        return fixhour(12.0d - equationOfTime(getJDate() + d));
    }

    private double computeTime(double d, double d2) {
        double sunDeclination = sunDeclination(getJDate() + d2);
        double computeMidDay = computeMidDay(d2);
        double darccos = darccos(((-dsin(d)) - (dsin(sunDeclination) * dsin(getLat()))) / (dcos(sunDeclination) * dcos(getLat()))) / 15.0d;
        if (d > 90.0d) {
            darccos = -darccos;
        }
        return computeMidDay + darccos;
    }

    private double computeAsr(double d, double d2) {
        return computeTime(-darccot(d + dtan(Math.abs(getLat() - sunDeclination(getJDate() + d2)))), d2);
    }

    private double timeDiff(double d, double d2) {
        return fixhour(d2 - d);
    }

    private ArrayList<String> getDatePrayerTimes(int i, int i2, int i3, double d, double d2, double d3) {
        setLat(d);
        setLng(d2);
        setTimeZone(d3);
        setJDate(julianDate(i, i2, i3));
        setJDate(getJDate() - (d2 / 360.0d));
        return computeDayTimes();
    }

    public ArrayList<String> getPrayerTimes(Calendar calendar, double d, double d2, double d3) {
        return getDatePrayerTimes(calendar.get(1), calendar.get(2) + 1, calendar.get(5), d, d2, d3);
    }

    private void setCustomParams(double[] dArr) {
        for (int i = 0; i < 5; i++) {
            if (dArr[i] == -1.0d) {
                dArr[i] = this.methodParams.get(Integer.valueOf(getCalcMethod()))[i];
                this.methodParams.put(Integer.valueOf(getCustom()), dArr);
            } else {
                this.methodParams.get(Integer.valueOf(getCustom()))[i] = dArr[i];
            }
        }
        setCalcMethod(getCustom());
    }

    public void setFajrAngle(double d) {
        setCustomParams(new double[]{d, -1.0d, -1.0d, -1.0d, -1.0d});
    }

    public void setMaghribAngle(double d) {
        setCustomParams(new double[]{-1.0d, 0.0d, d, -1.0d, -1.0d});
    }

    public void setIshaAngle(double d) {
        setCustomParams(new double[]{-1.0d, -1.0d, -1.0d, 0.0d, d});
    }

    public void setMaghribMinutes(double d) {
        setCustomParams(new double[]{-1.0d, 1.0d, d, -1.0d, -1.0d});
    }

    public void setIshaMinutes(double d) {
        setCustomParams(new double[]{-1.0d, -1.0d, -1.0d, 1.0d, d});
    }

    public String floatToTime24(double d) {
        if (Double.isNaN(d)) {
            return this.InvalidTime;
        }
        double fixhour = fixhour(d + 0.008333333333333333d);
        int floor = (int) Math.floor(fixhour);
        double floor2 = Math.floor((fixhour - floor) * 60.0d);
        if (floor >= 0 && floor <= 9 && floor2 >= 0.0d && floor2 <= 9.0d) {
            return "0" + floor + ":0" + Math.round(floor2);
        }
        if (floor >= 0 && floor <= 9) {
            return "0" + floor + ":" + Math.round(floor2);
        }
        if (floor2 >= 0.0d && floor2 <= 9.0d) {
            return floor + ":0" + Math.round(floor2);
        }
        return floor + ":" + Math.round(floor2);
    }

    public String floatToTime12(double d, boolean z) {
        String str;
        if (Double.isNaN(d)) {
            return this.InvalidTime;
        }
        double fixhour = fixhour(d + 0.008333333333333333d);
        int floor = (int) Math.floor(fixhour);
        double floor2 = Math.floor((fixhour - floor) * 60.0d);
        if (floor >= 12) {
            str = e.bd;
        } else {
            str = "am";
        }
        int i = ((floor + 11) % 12) + 1;
        if (!z) {
            if (i >= 0 && i <= 9 && floor2 >= 0.0d && floor2 <= 9.0d) {
                return "0" + i + ":0" + Math.round(floor2) + " " + str;
            }
            if (i < 0 || i > 9) {
                return (floor2 < 0.0d || floor2 > 9.0d) ? i + ":" + Math.round(floor2) + " " + str : i + ":0" + Math.round(floor2) + " " + str;
            }
            return "0" + i + ":" + Math.round(floor2) + " " + str;
        }
        if (i >= 0 && i <= 9 && floor2 >= 0.0d && floor2 <= 9.0d) {
            return "0" + i + ":0" + Math.round(floor2);
        }
        if (i >= 0 && i <= 9) {
            return "0" + i + ":" + Math.round(floor2);
        }
        if (floor2 >= 0.0d && floor2 <= 9.0d) {
            return i + ":0" + Math.round(floor2);
        }
        return i + ":" + Math.round(floor2);
    }

    public String floatToTime12NS(double d) {
        return floatToTime12(d, true);
    }

    private double[] computeTimes(double[] dArr) {
        double[] dayPortion = dayPortion(dArr);
        return new double[]{computeTime(180.0d - this.methodParams.get(Integer.valueOf(getCalcMethod()))[0], dayPortion[0]), computeTime(179.167d, dayPortion[1]), computeMidDay(dayPortion[2]), computeAsr(getAsrJuristic() + 1, dayPortion[3]), computeTime(0.833d, dayPortion[4]), computeTime(this.methodParams.get(Integer.valueOf(getCalcMethod()))[2], dayPortion[5]), computeTime(this.methodParams.get(Integer.valueOf(getCalcMethod()))[4], dayPortion[6])};
    }

    private ArrayList<String> computeDayTimes() {
        double[] dArr = {5.0d, 6.0d, 12.0d, 13.0d, 18.0d, 18.0d, 18.0d};
        for (int i = 1; i <= getNumIterations(); i++) {
            dArr = computeTimes(dArr);
        }
        return adjustTimesFormat(tuneTimes(adjustTimes(dArr)));
    }

    private double[] adjustTimes(double[] dArr) {
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = dArr[i] + (getTimeZone() - (getLng() / 15.0d));
        }
        dArr[2] = dArr[2] + (getDhuhrMinutes() / 60);
        if (this.methodParams.get(Integer.valueOf(getCalcMethod()))[1] == 1.0d) {
            dArr[5] = dArr[4] + (this.methodParams.get(Integer.valueOf(getCalcMethod()))[2] / 60.0d);
        }
        if (this.methodParams.get(Integer.valueOf(getCalcMethod()))[3] == 1.0d) {
            dArr[6] = dArr[5] + (this.methodParams.get(Integer.valueOf(getCalcMethod()))[4] / 60.0d);
        }
        return getAdjustHighLats() != getNone() ? adjustHighLatTimes(dArr) : dArr;
    }

    private ArrayList<String> adjustTimesFormat(double[] dArr) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (getTimeFormat() == getFloating()) {
            for (double d : dArr) {
                arrayList.add(String.valueOf(d));
            }
        } else {
            for (int i = 0; i < 7; i++) {
                if (getTimeFormat() == getTime12()) {
                    arrayList.add(floatToTime12(dArr[i], false));
                } else if (getTimeFormat() == getTime12NS()) {
                    arrayList.add(floatToTime12(dArr[i], true));
                } else {
                    arrayList.add(floatToTime24(dArr[i]));
                }
            }
        }
        return arrayList;
    }

    private double[] adjustHighLatTimes(double[] dArr) {
        double timeDiff = timeDiff(dArr[4], dArr[1]);
        double nightPortion = nightPortion(this.methodParams.get(Integer.valueOf(getCalcMethod()))[0]) * timeDiff;
        if (Double.isNaN(dArr[0]) || timeDiff(dArr[0], dArr[1]) > nightPortion) {
            dArr[0] = dArr[1] - nightPortion;
        }
        double nightPortion2 = nightPortion(this.methodParams.get(Integer.valueOf(getCalcMethod()))[3] == 0.0d ? this.methodParams.get(Integer.valueOf(getCalcMethod()))[4] : 18.0d) * timeDiff;
        if (Double.isNaN(dArr[6]) || timeDiff(dArr[4], dArr[6]) > nightPortion2) {
            dArr[6] = dArr[4] + nightPortion2;
        }
        double nightPortion3 = nightPortion(this.methodParams.get(Integer.valueOf(getCalcMethod()))[1] == 0.0d ? this.methodParams.get(Integer.valueOf(getCalcMethod()))[2] : 4.0d) * timeDiff;
        if (!Double.isNaN(dArr[5]) && timeDiff(dArr[4], dArr[5]) <= nightPortion3) {
            return dArr;
        }
        dArr[5] = dArr[4] + nightPortion3;
        return dArr;
    }

    private double nightPortion(double d) {
        int i = this.adjustHighLats;
        if (i == this.AngleBased) {
            return d / 60.0d;
        }
        if (i == this.MidNight) {
            return 0.5d;
        }
        return i == this.OneSeventh ? 0.14286d : 0.0d;
    }

    private double[] dayPortion(double[] dArr) {
        for (int i = 0; i < 7; i++) {
            dArr[i] = dArr[i] / 24.0d;
        }
        return dArr;
    }

    public void tune(int[] iArr) {
        for (int i = 0; i < iArr.length; i++) {
            this.offsets[i] = iArr[i];
        }
    }

    private double[] tuneTimes(double[] dArr) {
        for (int i = 0; i < dArr.length; i++) {
            dArr[i] = dArr[i] + (this.offsets[i] / 60.0d);
        }
        return dArr;
    }

    public static void main() {
        PrayTime prayTime = new PrayTime();
        prayTime.setTimeFormat(prayTime.Time24);
        prayTime.setCalcMethod(prayTime.Karachi);
        prayTime.setAsrJuristic(prayTime.Shafii);
        prayTime.setAdjustHighLats(prayTime.AngleBased);
        prayTime.tune(new int[]{0, 0, 0, 0, 0, 0, 0});
        Date date = new Date();
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        ArrayList<String> prayerTimes = prayTime.getPrayerTimes(calendar, 22.607093838594523d, 114.05262918735728d, 8.0d);
        ArrayList<String> timeNames = prayTime.getTimeNames();
        for (int i = 0; i < prayerTimes.size(); i++) {
            if (!timeNames.get(i).equals("Sunset")) {
                LogUtils.i(">>", timeNames.get(i) + " - " + prayerTimes.get(i));
            }
        }
    }

    public int getCalcMethod() {
        return this.calcMethod;
    }

    public void setCalcMethod(int i) {
        this.calcMethod = i;
    }

    public int getAsrJuristic() {
        return this.asrJuristic;
    }

    public void setAsrJuristic(int i) {
        this.asrJuristic = i;
    }

    public int getDhuhrMinutes() {
        return this.dhuhrMinutes;
    }

    public void setDhuhrMinutes(int i) {
        this.dhuhrMinutes = i;
    }

    public int getAdjustHighLats() {
        return this.adjustHighLats;
    }

    public void setAdjustHighLats(int i) {
        this.adjustHighLats = i;
    }

    public int getTimeFormat() {
        return this.timeFormat;
    }

    public void setTimeFormat(int i) {
        this.timeFormat = i;
    }

    public double getLat() {
        return this.lat;
    }

    public void setLat(double d) {
        this.lat = d;
    }

    public double getLng() {
        return this.lng;
    }

    public void setLng(double d) {
        this.lng = d;
    }

    public double getTimeZone() {
        return this.timeZone;
    }

    public void setTimeZone(double d) {
        this.timeZone = d;
    }

    public double getJDate() {
        return this.JDate;
    }

    public void setJDate(double d) {
        this.JDate = d;
    }

    public int getJafari() {
        return this.Jafari;
    }

    public void setJafari(int i) {
        this.Jafari = i;
    }

    public int getKarachi() {
        return this.Karachi;
    }

    private void setKarachi(int i) {
        this.Karachi = i;
    }

    public int getISNA() {
        return this.ISNA;
    }

    private void setISNA(int i) {
        this.ISNA = i;
    }

    public int getMWL() {
        return this.MWL;
    }

    private void setMWL(int i) {
        this.MWL = i;
    }

    public int getMakkah() {
        return this.Makkah;
    }

    private void setMakkah(int i) {
        this.Makkah = i;
    }

    public int getEgypt() {
        return this.Egypt;
    }

    private void setEgypt(int i) {
        this.Egypt = i;
    }

    public int getCustom() {
        return this.Custom;
    }

    private void setCustom(int i) {
        this.Custom = i;
    }

    public int getTehran() {
        return this.Tehran;
    }

    private void setTehran(int i) {
        this.Tehran = i;
    }

    public int getShafii() {
        return this.Shafii;
    }

    private void setShafii(int i) {
        this.Shafii = i;
    }

    public int getHanafi() {
        return this.Hanafi;
    }

    private void setHanafi(int i) {
        this.Hanafi = i;
    }

    private int getNone() {
        return this.None;
    }

    private void setNone(int i) {
        this.None = i;
    }

    private int getMidNight() {
        return this.MidNight;
    }

    private void setMidNight(int i) {
        this.MidNight = i;
    }

    private int getOneSeventh() {
        return this.OneSeventh;
    }

    private void setOneSeventh(int i) {
        this.OneSeventh = i;
    }

    public int getAngleBased() {
        return this.AngleBased;
    }

    private void setAngleBased(int i) {
        this.AngleBased = i;
    }

    public int getTime24() {
        return this.Time24;
    }

    private void setTime24(int i) {
        this.Time24 = i;
    }

    private int getTime12() {
        return this.Time12;
    }

    private void setTime12(int i) {
        this.Time12 = i;
    }

    private int getTime12NS() {
        return this.Time12NS;
    }

    private void setTime12NS(int i) {
        this.Time12NS = i;
    }

    private int getFloating() {
        return this.Floating;
    }

    private void setFloating(int i) {
        this.Floating = i;
    }

    private int getNumIterations() {
        return this.numIterations;
    }

    private void setNumIterations(int i) {
        this.numIterations = i;
    }

    public ArrayList<String> getTimeNames() {
        return this.timeNames;
    }
}
