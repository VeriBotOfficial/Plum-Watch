package com.bigkoo.pickerview.utils;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/* JADX INFO: loaded from: classes15.dex */
public class ChinaDate {
    private static final long[] lunarInfo = {19416, 19168, 42352, 21717, 53856, 55632, 91476, 22176, 39632, 21970, 19168, 42422, 42192, 53840, 119381, 46400, 54944, 44450, 38320, 84343, 18800, 42160, 46261, 27216, 27968, 109396, 11104, 38256, 21234, 18800, 25958, 54432, 59984, 28309, 23248, 11104, 100067, 37600, 116951, 51536, 54432, 120998, 46416, 22176, 107956, 9680, 37584, 53938, 43344, 46423, 27808, 46416, 86869, 19872, 42416, 83315, 21168, 43432, 59728, 27296, 44710, 43856, 19296, 43748, 42352, 21088, 62051, 55632, 23383, 22176, 38608, 19925, 19152, 42192, 54484, 53840, 54616, 46400, 46752, 103846, 38320, 18864, 43380, 42160, 45690, 27216, 27968, 44870, 43872, 38256, 19189, 18800, 25776, 29859, 59984, 27480, 21952, 43872, 38613, 37600, 51552, 55636, 54432, 55888, 30034, 22176, 43959, 9680, 37584, 51893, 43344, 46240, 47780, 44368, 21977, 19360, 42416, 86390, 21168, 43312, 31060, 27296, 44368, 23378, 19296, 42726, 42208, 53856, 60005, 54576, 23200, 30371, 38608, 19195, 19152, 42192, 118966, 53840, 54560, 56645, 46496, 22224, 21938, 18864, 42359, 42160, 43600, 111189, 27936, 44448, 84835, 37744, 18936, 18800, 25776, 92326, 59984, 27424, 108228, 43744, 41696, 53987, 51552, 54615, 54432, 55888, 23893, 22176, 42704, 21972, 21200, 43448, 43344, 46240, 46758, 44368, 21920, 43940, 42416, 21168, 45683, 26928, 29495, 27296, 44368, 84821, 19296, 42352, 21732, 53600, 59752, 54560, 55968, 92838, 22224, 19168, 43476, 41680, 53584, 62034, 54560};
    private static final String[] nStr1 = {"", "正", "二", "三", "四", "五", "六", "七", "八", "九", "十", "冬", "腊"};
    private static final String[] Gan = {"甲", "乙", "丙", "丁", "戊", "己", "庚", "辛", "壬", "癸"};
    private static final String[] Zhi = {"子", "丑", "寅", "卯", "辰", "巳", "午", "未", "申", "酉", "戌", "亥"};
    private static final String[] Animals = {"鼠", "牛", "虎", "兔", "龙", "蛇", "马", "羊", "猴", "鸡", "狗", "猪"};
    private static SimpleDateFormat sdf = new SimpleDateFormat("yyyy年M月d日 EEEEE");

    private static final int lYearDays(int r7) {
        int r0 = 348;
        for (int r1 = 32768; r1 > 8; r1 >>= 1) {
            if ((lunarInfo[r7 - 1900] & ((long) r1)) != 0) {
                r0++;
            }
        }
        return r0 + leapDays(r7);
    }

    public static final int leapDays(int r5) {
        if (leapMonth(r5) != 0) {
            return (lunarInfo[r5 + (-1900)] & 65536) != 0 ? 30 : 29;
        }
        return 0;
    }

    public static final int leapMonth(int r5) {
        return (int) (lunarInfo[r5 - 1900] & 15);
    }

    public static final int monthDays(int r3, int r4) {
        return (((long) (65536 >> r4)) & lunarInfo[r3 + (-1900)]) == 0 ? 29 : 30;
    }

    public static final String AnimalsYear(int r1) {
        return Animals[(r1 - 4) % 12];
    }

    private static final String cyclicalm(int r3) {
        return Gan[r3 % 10] + Zhi[r3 % 12];
    }

    public static final String cyclical(int r0) {
        return cyclicalm(r0 - 1864);
    }

    public static final long[] calElement(int r17, int r18, int r19) {
        char c;
        long j;
        long[] jArr = new long[7];
        int r3 = 1900;
        long time = (new GregorianCalendar(r17, r18 - 1, r19).getTime().getTime() - new GregorianCalendar(1900, 0, 31).getTime().getTime()) / 86400000;
        jArr[5] = 40 + time;
        jArr[4] = 14;
        int r1 = 0;
        while (r3 < 2100 && time > 0) {
            r1 = lYearDays(r3);
            time -= (long) r1;
            jArr[4] = jArr[4] + 12;
            r3++;
        }
        if (time < 0) {
            time += (long) r1;
            r3--;
            jArr[4] = jArr[4] - 12;
        }
        jArr[0] = r3;
        jArr[3] = r3 - 1864;
        int r2 = leapMonth(r3);
        jArr[6] = 0;
        int r9 = 1;
        while (r9 < 13 && time > 0) {
            if (r2 > 0 && r9 == r2 + 1 && jArr[6] == 0) {
                jArr[6] = 1;
                r1 = leapDays((int) jArr[0]);
                r9--;
            } else {
                r1 = monthDays((int) jArr[0], r9);
            }
            if (jArr[6] == 1 && r9 == r2 + 1) {
                jArr[6] = 0;
            }
            time -= (long) r1;
            if (jArr[6] == 0) {
                jArr[4] = jArr[4] + 1;
            }
            r9++;
        }
        long j2 = time;
        if (j2 != 0 || r2 <= 0 || r9 != r2 + 1) {
            c = 4;
        } else if (jArr[6] == 1) {
            jArr[6] = 0;
            c = 4;
        } else {
            jArr[6] = 1;
            r9--;
            c = 4;
            jArr[4] = jArr[4] - 1;
        }
        if (j2 < 0) {
            j = j2 + ((long) r1);
            r9--;
            jArr[c] = jArr[c] - 1;
        } else {
            j = j2;
        }
        jArr[1] = r9;
        jArr[2] = j + 1;
        return jArr;
    }

    public static final String getChinaDate(int r5) {
        String str;
        if (r5 == 10) {
            return "初十";
        }
        if (r5 == 20) {
            return "二十";
        }
        if (r5 == 30) {
            return "三十";
        }
        int r1 = r5 / 10;
        if (r1 != 0) {
            str = "";
        } else {
            str = "初";
        }
        if (r1 == 1) {
            str = "十";
        }
        if (r1 == 2) {
            str = "廿";
        }
        if (r1 == 3) {
            str = "三";
        }
        switch (r5 % 10) {
            case 1:
                return str.concat("一");
            case 2:
                return str.concat("二");
            case 3:
                return str.concat("三");
            case 4:
                return str.concat("四");
            case 5:
                return str.concat("五");
            case 6:
                return str.concat("六");
            case 7:
                return str.concat("七");
            case 8:
                return str.concat("八");
            case 9:
                return str.concat("九");
            default:
                return str;
        }
    }

    public static String getCurrentLunarDate() {
        Calendar calendar = Calendar.getInstance(Locale.SIMPLIFIED_CHINESE);
        int r2 = calendar.get(1);
        long[] jArrCalElement = calElement(r2, calendar.get(2) + 1, calendar.get(5));
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(sdf.format(calendar.getTime()));
        stringBuffer.append(" 农历");
        stringBuffer.append(cyclical(r2));
        stringBuffer.append('(');
        stringBuffer.append(AnimalsYear(r2));
        stringBuffer.append(")年");
        stringBuffer.append(nStr1[(int) jArrCalElement[1]]);
        stringBuffer.append("月");
        stringBuffer.append(getChinaDate((int) jArrCalElement[2]));
        return stringBuffer.toString();
    }

    public static String oneDay(int r2, int r3, int r4) {
        long[] jArrCalElement = calElement(r2, r3, r4);
        StringBuffer stringBuffer = new StringBuffer(" 农历");
        stringBuffer.append(cyclical(r2));
        stringBuffer.append('(');
        stringBuffer.append(AnimalsYear(r2));
        stringBuffer.append(")年");
        stringBuffer.append(nStr1[(int) jArrCalElement[1]]);
        stringBuffer.append("月");
        stringBuffer.append(getChinaDate((int) jArrCalElement[2]));
        return stringBuffer.toString();
    }

    public static String getLunarYearText(int r3) {
        int r4 = r3 - 4;
        return Gan[r4 % 10] + Zhi[r4 % 12] + "年";
    }

    public static ArrayList<String> getYears(int r3, int r4) {
        ArrayList<String> arrayList = new ArrayList<>();
        while (r3 < r4) {
            arrayList.add(String.format("%s(%d)", getLunarYearText(r3), Integer.valueOf(r3)));
            r3++;
        }
        return arrayList;
    }

    public static ArrayList<String> getMonths(int r6) {
        String[] strArr;
        ArrayList<String> arrayList = new ArrayList<>();
        int r1 = 1;
        while (true) {
            strArr = nStr1;
            if (r1 >= strArr.length) {
                break;
            }
            arrayList.add(strArr[r1] + "月");
            r1++;
        }
        if (leapMonth(r6) != 0) {
            arrayList.add(leapMonth(r6), "闰" + strArr[leapMonth(r6)] + "月");
        }
        return arrayList;
    }

    public static ArrayList<String> getLunarDays(int r3) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (int r1 = 1; r1 <= r3; r1++) {
            arrayList.add(getChinaDate(r1));
        }
        return arrayList;
    }
}
