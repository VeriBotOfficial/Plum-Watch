package com.amap.location.support.network;

import com.amap.location.support.header.HeaderConfig;
import com.amap.location.support.security.Base64;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes11.dex */
public class HttpRequest {
    public static final String sHeaderProductInfoKey = "aps_c_key";
    public static final String sHeaderProductTypeKey = "aps_c_src";
    public byte[] body;
    public Map<String, String> headers = new HashMap();
    boolean returnBytes = true;
    public int timeout = 10000;
    public String url;

    public static String getHeaderProductInfo() {
        return HeaderConfig.getProductVerion() + "*" + HeaderConfig.getProcessName();
    }

    public static String getHeaderProductType() {
        return "lc_" + ((int) HeaderConfig.getProductId());
    }

    public void addProductHeader() {
        this.headers.put(sHeaderProductTypeKey, Base64.encodeToString(getHeaderProductType().getBytes(), 2));
        this.headers.put(sHeaderProductInfoKey, Base64.encodeToString(getHeaderProductInfo().getBytes(), 2));
    }
}
