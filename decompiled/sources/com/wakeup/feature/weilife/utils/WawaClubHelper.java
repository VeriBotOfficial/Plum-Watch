package com.wakeup.feature.weilife.utils;

import android.gov.nist.core.Separators;
import com.wakeup.common.utils.game.BbySignUtil;
import java.net.URLEncoder;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: WawaClubHelper.kt */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\b\n\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J,\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005H\u0002J&\u0010\f\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u0005J$\u0010\u000e\u001a\u00020\u00052\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002J.\u0010\u0011\u001a\u00020\u00052\u0006\u0010\r\u001a\u00020\u00052\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0006\u0012\u0004\u0018\u00010\u00050\b2\u0006\u0010\u0010\u001a\u00020\u0005H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lcom/wakeup/feature/weilife/utils/WawaClubHelper;", "", "<init>", "()V", "WAWA_APP_ID", "", "APP_SECRET", "getGenerateParams", "", "userId", "nickname", "headimg", "getWawaClubH5Url", "url", "generateSignature", "data", "key", "generateSignatureUrl", "feature-weilife_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class WawaClubHelper {
    public static final WawaClubHelper INSTANCE = new WawaClubHelper();
    private static final String WAWA_APP_ID = "12276";
    private static final String APP_SECRET = "wvD1gTEa58XhrNO6bkCo";

    private WawaClubHelper() {
    }

    private final Map<String, String> getGenerateParams(String userId, String nickname, String headimg) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("appid", WAWA_APP_ID);
        linkedHashMap.put("time", String.valueOf(System.currentTimeMillis() / 1000));
        linkedHashMap.put("user_id", userId);
        linkedHashMap.put("nickname", nickname);
        linkedHashMap.put("headimgurl", headimg);
        return linkedHashMap;
    }

    public final String getWawaClubH5Url(String url, String userId, String nickname, String headimg) {
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(userId, "userId");
        Intrinsics.checkNotNullParameter(nickname, "nickname");
        Intrinsics.checkNotNullParameter(headimg, "headimg");
        Map<String, String> generateParams = getGenerateParams(userId, nickname, headimg);
        return generateSignatureUrl(url, generateParams, generateSignature(generateParams, APP_SECRET));
    }

    private final String generateSignature(Map<String, String> data, String key) {
        String[] strArr = (String[]) data.keySet().toArray(new String[0]);
        Arrays.sort(strArr);
        StringBuilder sb = new StringBuilder();
        for (String str : strArr) {
            sb.append(str).append("=").append(data.get(str));
            sb.append("&");
        }
        sb.append("key=");
        sb.append(key);
        String MD5 = BbySignUtil.MD5(sb.toString());
        Intrinsics.checkNotNullExpressionValue(MD5, "MD5(...)");
        Locale locale = Locale.getDefault();
        Intrinsics.checkNotNullExpressionValue(locale, "getDefault(...)");
        String lowerCase = MD5.toLowerCase(locale);
        Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
        return lowerCase;
    }

    private final String generateSignatureUrl(String url, Map<String, String> data, String key) {
        String[] strArr = (String[]) data.keySet().toArray(new String[0]);
        StringBuilder sb = new StringBuilder();
        sb.append(url);
        sb.append(Separators.QUESTION);
        for (String str : strArr) {
            sb.append(str).append("=").append(URLEncoder.encode(data.get(str), "utf-8"));
            sb.append("&");
        }
        sb.append("sign=");
        sb.append(key);
        String sb2 = sb.toString();
        Intrinsics.checkNotNullExpressionValue(sb2, "toString(...)");
        return sb2;
    }
}
