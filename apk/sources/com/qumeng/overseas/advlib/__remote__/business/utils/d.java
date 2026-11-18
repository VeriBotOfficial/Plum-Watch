package com.qumeng.overseas.advlib.__remote__.business.utils;

import java.util.Locale;
import java.util.Random;

/* JADX INFO: loaded from: classes2.dex */
public class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String[][] f12794a = {new String[]{"精选推荐", "Featured Recommendation"}, new String[]{"您可能会喜欢", "You Might Like This"}, new String[]{"赞助内容", "Sponsored Content"}, new String[]{"发现更多精彩", "Discover Something New"}, new String[]{"一份特别推荐", "A Special Recommendation"}};
    private static final Random b = new Random();

    public static String a() {
        Random random = b;
        String[][] strArr = f12794a;
        int r0 = random.nextInt(strArr.length);
        return "zh".equalsIgnoreCase(Locale.getDefault().getLanguage()) ? strArr[r0][0] : strArr[r0][1];
    }
}
