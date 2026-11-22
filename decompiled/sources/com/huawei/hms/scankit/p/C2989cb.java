package com.huawei.hms.scankit.p;

import android.util.SparseArray;
import com.blankj.utilcode.constant.PermissionConstants;
import com.huawei.hms.ml.scan.HmsScan;

/* compiled from: HaLog.java */
/* renamed from: com.huawei.hms.scankit.p.cb, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
class C2989cb extends SparseArray<String> {
    C2989cb() {
        put(HmsScan.ARTICLE_NUMBER_FORM, "ARTICLE_NUMBER");
        put(HmsScan.EMAIL_CONTENT_FORM, "EMAIL_CONTENT");
        put(HmsScan.TEL_PHONE_NUMBER_FORM, "TEL_PHONE_NUMBER");
        put(HmsScan.PURE_TEXT_FORM, "PURE_TEXT");
        put(HmsScan.SMS_FORM, PermissionConstants.SMS);
        put(HmsScan.URL_FORM, "URL");
        put(HmsScan.WIFI_CONNECT_INFO_FORM, "WIFI_CONNECT_INFO");
        put(HmsScan.EVENT_INFO_FORM, "EVENT_INFO");
        put(HmsScan.CONTACT_DETAIL_FORM, "CONTACT_DETAIL");
        put(HmsScan.DRIVER_INFO_FORM, "DRIVER_INFO");
        put(HmsScan.LOCATION_COORDINATE_FORM, "LOCATION_COORDINATE");
        put(HmsScan.ISBN_NUMBER_FORM, "ISBN_NUMBER");
        put(-1, AbstractC3037ob.b);
    }
}
