package com.necer.utils;

import android.gov.nist.javax.sip.parser.TokenTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class SolarTermUtil {
    private static final double[][] CENTURY_ARRAY;
    private static final double D = 0.2422d;
    private static final Map<String, Integer[]> DECREASE_OFFSETMAP;
    private static final Map<String, Integer[]> INCREASE_OFFSETMAP;
    private static List<String> mSolarData;
    private static List<String> mSolarName;
    private static int mYear;

    private enum SolarTermsEnum {
        LICHUN,
        YUSHUI,
        JINGZHE,
        CHUNFEN,
        QINGMING,
        GUYU,
        LIXIA,
        XIAOMAN,
        MANGZHONG,
        XIAZHI,
        XIAOSHU,
        DASHU,
        LIQIU,
        CHUSHU,
        BAILU,
        QIUFEN,
        HANLU,
        SHUANGJIANG,
        LIDONG,
        XIAOXUE,
        DAXUE,
        DONGZHI,
        XIAOHAN,
        DAHAN
    }

    static {
        HashMap map = new HashMap();
        INCREASE_OFFSETMAP = map;
        HashMap map2 = new HashMap();
        DECREASE_OFFSETMAP = map2;
        map2.put(SolarTermsEnum.YUSHUI.name(), new Integer[]{2026});
        map.put(SolarTermsEnum.CHUNFEN.name(), new Integer[]{2084});
        map.put(SolarTermsEnum.XIAOMAN.name(), new Integer[]{2008});
        map.put(SolarTermsEnum.MANGZHONG.name(), new Integer[]{1902});
        map.put(SolarTermsEnum.XIAZHI.name(), new Integer[]{1928});
        map.put(SolarTermsEnum.XIAOSHU.name(), new Integer[]{1925, 2016});
        map.put(SolarTermsEnum.DASHU.name(), new Integer[]{1922});
        map.put(SolarTermsEnum.LIQIU.name(), new Integer[]{2002});
        map.put(SolarTermsEnum.BAILU.name(), new Integer[]{1927});
        map.put(SolarTermsEnum.QIUFEN.name(), new Integer[]{1942});
        String strName = SolarTermsEnum.SHUANGJIANG.name();
        Integer numValueOf = Integer.valueOf(TokenTypes.REQUIRE);
        map.put(strName, new Integer[]{numValueOf});
        map.put(SolarTermsEnum.LIDONG.name(), new Integer[]{numValueOf});
        map.put(SolarTermsEnum.XIAOXUE.name(), new Integer[]{1978});
        map.put(SolarTermsEnum.DAXUE.name(), new Integer[]{1954});
        map2.put(SolarTermsEnum.DONGZHI.name(), new Integer[]{1918, 2021});
        map.put(SolarTermsEnum.XIAOHAN.name(), new Integer[]{1982});
        map2.put(SolarTermsEnum.XIAOHAN.name(), new Integer[]{2019});
        map.put(SolarTermsEnum.DAHAN.name(), new Integer[]{2082});
        CENTURY_ARRAY = new double[][]{new double[]{4.6295d, 19.4599d, 6.3826d, 21.4155d, 5.59d, 20.888d, 6.318d, 21.86d, 6.5d, 22.2d, 7.928d, 23.65d, 8.35d, 23.95d, 8.44d, 23.822d, 9.098d, 24.218d, 8.218d, 23.08d, 7.9d, 22.6d, 6.11d, 20.84d}, new double[]{3.87d, 18.73d, 5.63d, 20.646d, 4.81d, 20.1d, 5.52d, 21.04d, 5.678d, 21.37d, 7.108d, 22.83d, 7.5d, 23.13d, 7.646d, 23.042d, 8.318d, 23.438d, 7.438d, 22.36d, 7.18d, 21.94d, 5.4055d, 20.12d}};
        mSolarData = new ArrayList();
        mSolarName = new ArrayList();
    }

    public static int getSolarTermNum(int r8, String str) {
        char c;
        String upperCase = str.trim().toUpperCase();
        int r0 = SolarTermsEnum.valueOf(upperCase).ordinal();
        if (r8 >= 1901 && r8 <= 2000) {
            c = 0;
        } else {
            if (r8 < 2001 || r8 > 2100) {
                throw new RuntimeException("不支持此年份：" + r8 + "，目前只支持1901年到2100年的时间范围");
            }
            c = 1;
        }
        double d = CENTURY_ARRAY[c][r0];
        int r1 = r8 % 100;
        if (((r8 % 4 == 0 && r1 != 0) || r8 % 400 == 0) && (r0 == SolarTermsEnum.XIAOHAN.ordinal() || r0 == SolarTermsEnum.DAHAN.ordinal() || r0 == SolarTermsEnum.LICHUN.ordinal() || r0 == SolarTermsEnum.YUSHUI.ordinal())) {
            r1--;
        }
        return (((int) ((((double) r1) * D) + d)) - (r1 / 4)) + specialYearOffset(r8, upperCase);
    }

    private static int specialYearOffset(int r3, String str) {
        return getOffset(DECREASE_OFFSETMAP, r3, str, -1) + getOffset(INCREASE_OFFSETMAP, r3, str, 1);
    }

    private static int getOffset(Map<String, Integer[]> map, int r4, String str, int r6) {
        Integer[] numArr = map.get(str);
        if (numArr != null) {
            for (Integer num : numArr) {
                if (num.intValue() == r4) {
                    return r6;
                }
            }
        }
        return 0;
    }

    public static String getSolatName(int r1, String str) {
        if (r1 != mYear) {
            solarTermToString(r1);
        }
        if (mSolarData.contains(str)) {
            return mSolarName.get(mSolarData.indexOf(str));
        }
        return null;
    }

    private static void solarTermToString(int r4) {
        mYear = r4;
        List<String> list = mSolarData;
        if (list != null) {
            list.clear();
        } else {
            mSolarData = new ArrayList();
        }
        List<String> list2 = mSolarName;
        if (list2 != null) {
            list2.clear();
        } else {
            mSolarName = new ArrayList();
        }
        mSolarName.add("立春");
        mSolarData.add("02" + getSolarTermNum(r4, SolarTermsEnum.LICHUN.name()));
        mSolarName.add("雨水");
        mSolarData.add("02" + getSolarTermNum(r4, SolarTermsEnum.YUSHUI.name()));
        mSolarName.add("惊蛰");
        mSolarData.add("03" + getSolarTermNum(r4, SolarTermsEnum.JINGZHE.name()));
        mSolarName.add("春分");
        mSolarData.add("03" + getSolarTermNum(r4, SolarTermsEnum.CHUNFEN.name()));
        mSolarName.add("清明");
        mSolarData.add("04" + getSolarTermNum(r4, SolarTermsEnum.QINGMING.name()));
        mSolarName.add("谷雨");
        mSolarData.add("04" + getSolarTermNum(r4, SolarTermsEnum.GUYU.name()));
        mSolarName.add("立夏");
        mSolarData.add("05" + getSolarTermNum(r4, SolarTermsEnum.LIXIA.name()));
        mSolarName.add("小满");
        mSolarData.add("05" + getSolarTermNum(r4, SolarTermsEnum.XIAOMAN.name()));
        mSolarName.add("芒种");
        mSolarData.add("06" + getSolarTermNum(r4, SolarTermsEnum.MANGZHONG.name()));
        mSolarName.add("夏至");
        mSolarData.add("06" + getSolarTermNum(r4, SolarTermsEnum.XIAZHI.name()));
        mSolarName.add("小暑");
        mSolarData.add("07" + getSolarTermNum(r4, SolarTermsEnum.XIAOSHU.name()));
        mSolarName.add("大暑");
        mSolarData.add("07" + getSolarTermNum(r4, SolarTermsEnum.DASHU.name()));
        mSolarName.add("立秋");
        mSolarData.add("08" + getSolarTermNum(r4, SolarTermsEnum.LIQIU.name()));
        mSolarName.add("处暑");
        mSolarData.add("08" + getSolarTermNum(r4, SolarTermsEnum.CHUSHU.name()));
        mSolarName.add("白露");
        mSolarData.add("09" + getSolarTermNum(r4, SolarTermsEnum.BAILU.name()));
        mSolarName.add("秋分");
        mSolarData.add("09" + getSolarTermNum(r4, SolarTermsEnum.QIUFEN.name()));
        mSolarName.add("寒露");
        mSolarData.add("10" + getSolarTermNum(r4, SolarTermsEnum.HANLU.name()));
        mSolarName.add("霜降");
        mSolarData.add("10" + getSolarTermNum(r4, SolarTermsEnum.SHUANGJIANG.name()));
        mSolarName.add("立冬");
        mSolarData.add("11" + getSolarTermNum(r4, SolarTermsEnum.LIDONG.name()));
        mSolarName.add("小雪");
        mSolarData.add("11" + getSolarTermNum(r4, SolarTermsEnum.XIAOXUE.name()));
        mSolarName.add("大雪");
        mSolarData.add("12" + getSolarTermNum(r4, SolarTermsEnum.DAXUE.name()));
        mSolarName.add("冬至");
        mSolarData.add("12" + getSolarTermNum(r4, SolarTermsEnum.DONGZHI.name()));
        mSolarName.add("小寒");
        mSolarData.add("01" + getSolarTermNum(r4, SolarTermsEnum.XIAOHAN.name()));
        mSolarName.add("大寒");
        mSolarData.add("01" + getSolarTermNum(r4, SolarTermsEnum.DAHAN.name()));
    }
}
