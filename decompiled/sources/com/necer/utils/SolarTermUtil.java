package com.necer.utils;

import android.gov.nist.javax.sip.parser.TokenTypes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes17.dex */
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
        HashMap hashMap = new HashMap();
        INCREASE_OFFSETMAP = hashMap;
        HashMap hashMap2 = new HashMap();
        DECREASE_OFFSETMAP = hashMap2;
        hashMap2.put(SolarTermsEnum.YUSHUI.name(), new Integer[]{2026});
        hashMap.put(SolarTermsEnum.CHUNFEN.name(), new Integer[]{2084});
        hashMap.put(SolarTermsEnum.XIAOMAN.name(), new Integer[]{2008});
        hashMap.put(SolarTermsEnum.MANGZHONG.name(), new Integer[]{1902});
        hashMap.put(SolarTermsEnum.XIAZHI.name(), new Integer[]{1928});
        hashMap.put(SolarTermsEnum.XIAOSHU.name(), new Integer[]{1925, 2016});
        hashMap.put(SolarTermsEnum.DASHU.name(), new Integer[]{1922});
        hashMap.put(SolarTermsEnum.LIQIU.name(), new Integer[]{2002});
        hashMap.put(SolarTermsEnum.BAILU.name(), new Integer[]{1927});
        hashMap.put(SolarTermsEnum.QIUFEN.name(), new Integer[]{1942});
        String name = SolarTermsEnum.SHUANGJIANG.name();
        Integer valueOf = Integer.valueOf(TokenTypes.REQUIRE);
        hashMap.put(name, new Integer[]{valueOf});
        hashMap.put(SolarTermsEnum.LIDONG.name(), new Integer[]{valueOf});
        hashMap.put(SolarTermsEnum.XIAOXUE.name(), new Integer[]{1978});
        hashMap.put(SolarTermsEnum.DAXUE.name(), new Integer[]{1954});
        hashMap2.put(SolarTermsEnum.DONGZHI.name(), new Integer[]{1918, 2021});
        hashMap.put(SolarTermsEnum.XIAOHAN.name(), new Integer[]{1982});
        hashMap2.put(SolarTermsEnum.XIAOHAN.name(), new Integer[]{2019});
        hashMap.put(SolarTermsEnum.DAHAN.name(), new Integer[]{2082});
        CENTURY_ARRAY = new double[][]{new double[]{4.6295d, 19.4599d, 6.3826d, 21.4155d, 5.59d, 20.888d, 6.318d, 21.86d, 6.5d, 22.2d, 7.928d, 23.65d, 8.35d, 23.95d, 8.44d, 23.822d, 9.098d, 24.218d, 8.218d, 23.08d, 7.9d, 22.6d, 6.11d, 20.84d}, new double[]{3.87d, 18.73d, 5.63d, 20.646d, 4.81d, 20.1d, 5.52d, 21.04d, 5.678d, 21.37d, 7.108d, 22.83d, 7.5d, 23.13d, 7.646d, 23.042d, 8.318d, 23.438d, 7.438d, 22.36d, 7.18d, 21.94d, 5.4055d, 20.12d}};
        mSolarData = new ArrayList();
        mSolarName = new ArrayList();
    }

    public static int getSolarTermNum(int i, String str) {
        char c;
        String upperCase = str.trim().toUpperCase();
        int ordinal = SolarTermsEnum.valueOf(upperCase).ordinal();
        if (i >= 1901 && i <= 2000) {
            c = 0;
        } else {
            if (i < 2001 || i > 2100) {
                throw new RuntimeException("不支持此年份：" + i + "，目前只支持1901年到2100年的时间范围");
            }
            c = 1;
        }
        double d = CENTURY_ARRAY[c][ordinal];
        int i2 = i % 100;
        if (((i % 4 == 0 && i2 != 0) || i % 400 == 0) && (ordinal == SolarTermsEnum.XIAOHAN.ordinal() || ordinal == SolarTermsEnum.DAHAN.ordinal() || ordinal == SolarTermsEnum.LICHUN.ordinal() || ordinal == SolarTermsEnum.YUSHUI.ordinal())) {
            i2--;
        }
        return (((int) ((i2 * D) + d)) - (i2 / 4)) + specialYearOffset(i, upperCase);
    }

    private static int specialYearOffset(int i, String str) {
        return getOffset(DECREASE_OFFSETMAP, i, str, -1) + getOffset(INCREASE_OFFSETMAP, i, str, 1);
    }

    private static int getOffset(Map<String, Integer[]> map, int i, String str, int i2) {
        Integer[] numArr = map.get(str);
        if (numArr != null) {
            for (Integer num : numArr) {
                if (num.intValue() == i) {
                    return i2;
                }
            }
        }
        return 0;
    }

    public static String getSolatName(int i, String str) {
        if (i != mYear) {
            solarTermToString(i);
        }
        if (mSolarData.contains(str)) {
            return mSolarName.get(mSolarData.indexOf(str));
        }
        return null;
    }

    private static void solarTermToString(int i) {
        mYear = i;
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
        mSolarData.add("02" + getSolarTermNum(i, SolarTermsEnum.LICHUN.name()));
        mSolarName.add("雨水");
        mSolarData.add("02" + getSolarTermNum(i, SolarTermsEnum.YUSHUI.name()));
        mSolarName.add("惊蛰");
        mSolarData.add("03" + getSolarTermNum(i, SolarTermsEnum.JINGZHE.name()));
        mSolarName.add("春分");
        mSolarData.add("03" + getSolarTermNum(i, SolarTermsEnum.CHUNFEN.name()));
        mSolarName.add("清明");
        mSolarData.add("04" + getSolarTermNum(i, SolarTermsEnum.QINGMING.name()));
        mSolarName.add("谷雨");
        mSolarData.add("04" + getSolarTermNum(i, SolarTermsEnum.GUYU.name()));
        mSolarName.add("立夏");
        mSolarData.add("05" + getSolarTermNum(i, SolarTermsEnum.LIXIA.name()));
        mSolarName.add("小满");
        mSolarData.add("05" + getSolarTermNum(i, SolarTermsEnum.XIAOMAN.name()));
        mSolarName.add("芒种");
        mSolarData.add("06" + getSolarTermNum(i, SolarTermsEnum.MANGZHONG.name()));
        mSolarName.add("夏至");
        mSolarData.add("06" + getSolarTermNum(i, SolarTermsEnum.XIAZHI.name()));
        mSolarName.add("小暑");
        mSolarData.add("07" + getSolarTermNum(i, SolarTermsEnum.XIAOSHU.name()));
        mSolarName.add("大暑");
        mSolarData.add("07" + getSolarTermNum(i, SolarTermsEnum.DASHU.name()));
        mSolarName.add("立秋");
        mSolarData.add("08" + getSolarTermNum(i, SolarTermsEnum.LIQIU.name()));
        mSolarName.add("处暑");
        mSolarData.add("08" + getSolarTermNum(i, SolarTermsEnum.CHUSHU.name()));
        mSolarName.add("白露");
        mSolarData.add("09" + getSolarTermNum(i, SolarTermsEnum.BAILU.name()));
        mSolarName.add("秋分");
        mSolarData.add("09" + getSolarTermNum(i, SolarTermsEnum.QIUFEN.name()));
        mSolarName.add("寒露");
        mSolarData.add("10" + getSolarTermNum(i, SolarTermsEnum.HANLU.name()));
        mSolarName.add("霜降");
        mSolarData.add("10" + getSolarTermNum(i, SolarTermsEnum.SHUANGJIANG.name()));
        mSolarName.add("立冬");
        mSolarData.add("11" + getSolarTermNum(i, SolarTermsEnum.LIDONG.name()));
        mSolarName.add("小雪");
        mSolarData.add("11" + getSolarTermNum(i, SolarTermsEnum.XIAOXUE.name()));
        mSolarName.add("大雪");
        mSolarData.add("12" + getSolarTermNum(i, SolarTermsEnum.DAXUE.name()));
        mSolarName.add("冬至");
        mSolarData.add("12" + getSolarTermNum(i, SolarTermsEnum.DONGZHI.name()));
        mSolarName.add("小寒");
        mSolarData.add("01" + getSolarTermNum(i, SolarTermsEnum.XIAOHAN.name()));
        mSolarName.add("大寒");
        mSolarData.add("01" + getSolarTermNum(i, SolarTermsEnum.DAHAN.name()));
    }
}
