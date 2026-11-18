package com.compress.utils;

import com.phancy.mini.core.resource.MiniPack;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes11.dex */
public class Utils {
    private static final Map<Integer, String> formatPattern = new HashMap<Integer, String>() { // from class: com.compress.utils.Utils.1
        {
            put(1, "yyyy/MM/dd HH:mm:ss");
            put(2, "yyyy_MM_dd_HH_mm_ss");
            put(3, "yyyy/MM/dd HH:mm:ss.SSS");
            put(4, MiniPack.BUILD_TIME_FORMAT);
            put(5, "yyyy-MM-dd");
            put(6, "yyyy/MM/dd");
            put(7, "yyyy_MM_dd");
            put(8, "HH:MM:ss.SSS");
            put(9, "MM-dd HH:mm:ss");
            put(10, "MM-dd HH:mm");
            put(11, "MM-dd_HH_mm_ss");
            put(12, "HH_mm_ss");
            put(13, "yyyy-MM-dd-HH-mm-ss");
            put(14, "yyyy-MM-dd HH:mm:ss.SSS");
            put(15, "mm:ss.SSS");
        }
    };

    public static String formatDate(int r2, long j) {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat(formatPattern.get(Integer.valueOf(r2)));
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(j);
        return simpleDateFormat.format(calendar.getTime());
    }

    public static String formatDate(int r2) {
        return new SimpleDateFormat(formatPattern.get(Integer.valueOf(r2))).format(new Date());
    }
}
