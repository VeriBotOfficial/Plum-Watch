package com.wakeup.common.baidu;

import android.util.Log;
import android.util.Pair;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.utils.HexUtils;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import java.util.function.Function;
import java.util.function.IntFunction;
import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;

/* loaded from: classes2.dex */
public class BCEAuthGenerator {
    private static final String TAG = "BCEAuthGenerator";

    private static String getTimestamp() {
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss'Z'");
        simpleDateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
        return simpleDateFormat.format(new Date());
    }

    private static String generateSigningKey(String sk, String authStringPrefix) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(sk.getBytes(), "HmacSHA256"));
            return HexUtils.toHexString(mac.doFinal(authStringPrefix.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            Log.e(TAG, "生成派生签名密钥失败", e);
            return "";
        }
    }

    private static String generateSignature(String signingKey, String canonicalRequest) {
        try {
            Mac mac = Mac.getInstance("HmacSHA256");
            mac.init(new SecretKeySpec(signingKey.getBytes(), "HmacSHA256"));
            return HexUtils.toHexString(mac.doFinal(canonicalRequest.getBytes())).toLowerCase();
        } catch (InvalidKeyException | NoSuchAlgorithmException e) {
            Log.e(TAG, "生成签名摘要失败", e);
            return "";
        }
    }

    private static String buildCanonicalRequest(String httpMethod, String canonicalUri, String canonicalQueryString, String canonicalHeaders) {
        return httpMethod + "\n" + uriEncodeExceptSlash(canonicalUri) + "\n" + canonicalQueryString + "\n" + canonicalHeaders;
    }

    private static String buildAuthorization(String accessKeyId, String timestamp, int expirationPeriod, String signedHeaders, String signature) {
        return "bce-auth-v1/" + accessKeyId + "/" + timestamp + "/" + expirationPeriod + "/" + signedHeaders + "/" + signature;
    }

    private static String encodeParam(String param) {
        try {
            return URLEncoder.encode(param, "UTF-8");
        } catch (UnsupportedEncodingException e) {
            Log.e(TAG, "参数编码失败", e);
            return param;
        }
    }

    private static String uriEncodeExceptSlash(String path) {
        if (path == null) {
            return "/";
        }
        if (!path.startsWith("/")) {
            path = "/" + path;
        }
        StringBuilder sb = new StringBuilder();
        String[] split = path.split("/", -1);
        for (int i = 0; i < split.length; i++) {
            if (i > 0) {
                sb.append("/");
            }
            try {
                sb.append(URLEncoder.encode(split[i], "UTF-8").replace("+", "%20"));
            } catch (UnsupportedEncodingException e) {
                Log.e(TAG, "路径编码失败", e);
                return path;
            }
        }
        return sb.toString();
    }

    private static String encodeParameterValue(String value) {
        try {
            return URLEncoder.encode(new String(("\"" + value + "\"").getBytes(StandardCharsets.UTF_8)), StandardCharsets.UTF_8.toString()).replace("+", "%20").replace("%2F", "/");
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("参数编码失败", e);
        }
    }

    private static String buildCanonicalQueryString(Map<String, String> queryParams) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : queryParams.entrySet()) {
            arrayList.add(encodeParam(entry.getKey()) + "=" + encodeParameterValue(entry.getValue()));
        }
        Collections.sort(arrayList);
        return String.join("&", arrayList);
    }

    private static String buildCanonicalHeaders(Map<String, String> headers) {
        ArrayList arrayList = new ArrayList();
        for (Map.Entry<String, String> entry : headers.entrySet()) {
            String trim = entry.getKey().toLowerCase().trim();
            String trim2 = entry.getValue().trim();
            if (!trim2.isEmpty()) {
                arrayList.add(encodeParam(trim) + ":" + encodeParam(trim2));
            }
        }
        Collections.sort(arrayList);
        return String.join("\n", arrayList);
    }

    public static Pair<String, String> getAuthorization(boolean isInput) {
        String timestamp = getTimestamp();
        String generateSigningKey = generateSigningKey(Constants.SECRET_ACCESS_KEY, "bce-auth-v1/ALTAKn1FzDTiRSlGCDQI63GztU/" + getTimestamp() + "/3600");
        String buildCanonicalQueryString = buildCanonicalQueryString(new HashMap());
        HashMap hashMap = new HashMap();
        hashMap.put("Host", Constants.HOST);
        hashMap.put("x-bce-date", timestamp);
        String buildCanonicalHeaders = buildCanonicalHeaders(hashMap);
        String join = String.join(";", (CharSequence[]) hashMap.keySet().stream().map(new Function() { // from class: com.wakeup.common.baidu.BCEAuthGenerator$$ExternalSyntheticLambda0
            @Override // java.util.function.Function
            public final Object apply(Object obj) {
                String lowerCase;
                lowerCase = ((String) obj).toLowerCase();
                return lowerCase;
            }
        }).sorted().toArray(new IntFunction() { // from class: com.wakeup.common.baidu.BCEAuthGenerator$$ExternalSyntheticLambda1
            @Override // java.util.function.IntFunction
            public final Object apply(int i) {
                return BCEAuthGenerator.lambda$getAuthorization$0(i);
            }
        }));
        String buildCanonicalRequest = buildCanonicalRequest("POST", isInput ? Constants.AI_BASE_INPUT_URI : Constants.AI_BASE_OUTPUT_URI, buildCanonicalQueryString, buildCanonicalHeaders);
        String generateSignature = generateSignature(generateSigningKey, buildCanonicalRequest);
        String buildAuthorization = buildAuthorization(Constants.ACCESS_KEY_ID, getTimestamp(), 3600, join, generateSignature);
        LogUtils.i(TAG, "canonicalRequest: " + buildCanonicalRequest);
        LogUtils.i(TAG, "signature: " + generateSignature);
        LogUtils.i(TAG, "authorization: " + buildAuthorization);
        return new Pair<>(buildAuthorization, timestamp);
    }

    static /* synthetic */ String[] lambda$getAuthorization$0(int i) {
        return new String[i];
    }
}
