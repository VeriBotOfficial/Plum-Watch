package com.wakeup.common.utils;

import com.xiaomi.mipush.sdk.Constants;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.URLDecoder;
import java.net.URLEncoder;
import java.util.Map;
import java.util.TreeMap;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class SignatureUtils {
    private static final String ALGORITHM = "HmacSHA1";
    private static final String CHARSET_UTF8 = "utf8";
    private static final String SEPARATOR = "&";

    public static Map<String, String> splitQueryString(String url) throws URISyntaxException, UnsupportedEncodingException {
        String[] split = new URI(url).getQuery().split("&");
        TreeMap treeMap = new TreeMap();
        for (String str : split) {
            int indexOf = str.indexOf("=");
            String substring = indexOf > 0 ? str.substring(0, indexOf) : str;
            if (!treeMap.containsKey(substring)) {
                treeMap.put(substring, URLDecoder.decode(str.substring(indexOf + 1), "utf8"));
            }
        }
        return treeMap;
    }

    public static String generate(String method, Map<String, String> parameter, String accessKeySecret) throws Exception {
        String newStringByBase64 = newStringByBase64(hmacSHA1Signature(accessKeySecret + "&", generateSignString(method, parameter)));
        return "POST".equals(method) ? newStringByBase64 : URLEncoder.encode(newStringByBase64, "UTF-8");
    }

    public static String generateSignString(String httpMethod, Map<String, String> parameter) throws IOException {
        TreeMap treeMap = new TreeMap();
        treeMap.putAll(parameter);
        String generateQueryString = UrlUtil.generateQueryString(treeMap, true);
        if (httpMethod == null) {
            throw new RuntimeException("httpMethod can not be empty");
        }
        StringBuilder sb = new StringBuilder();
        sb.append(httpMethod).append("&");
        sb.append(percentEncode("/")).append("&");
        sb.append(percentEncode(generateQueryString));
        return sb.toString();
    }

    public static String percentEncode(String value) {
        if (value == null) {
            return null;
        }
        try {
            return URLEncoder.encode(value, "utf8").replace("+", "%20").replace("*", "%2A").replace("%7E", Constants.WAVE_SEPARATOR);
        } catch (Exception unused) {
            return "";
        }
    }

    public static byte[] hmacSHA1Signature(String secret, String baseString) throws Exception {
        if (com.blankj.utilcode.util.StringUtils.isEmpty(secret)) {
            throw new IOException("secret can not be empty");
        }
        if (com.blankj.utilcode.util.StringUtils.isEmpty(baseString)) {
            return null;
        }
        Mac mac = Mac.getInstance("HmacSHA1");
        mac.init(new SecretKeySpec(secret.getBytes("utf8"), "HmacSHA1"));
        return mac.doFinal(baseString.getBytes("utf8"));
    }

    public static String newStringByBase64(byte[] bytes) throws UnsupportedEncodingException {
        if (bytes == null || bytes.length == 0) {
            return null;
        }
        return new String(com.wakeup.common.utils.binary.Base64.encodeBase64(bytes, false), "utf8");
    }
}
