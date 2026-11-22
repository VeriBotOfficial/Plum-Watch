package com.huawei.hms.mlsdk.common;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import com.huawei.agconnect.AGConnectInstance;
import com.huawei.agconnect.config.AGConnectServicesConfig;
import com.huawei.hms.ml.common.utils.SmartLog;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* loaded from: classes14.dex */
public class AgConnectInfo {
    private String apiKey;
    private String applicationId;
    private String certFingerprint;
    private List<String> haCollectorUrls;
    private List<String> mlServiceUrls;
    private String packageName;
    private String region;

    private static final class AgConnectKey {
        public static String ANALYTICS_COLLECTOR_URL = "service/analytics/collector_url";
        public static String API_KEY = "client/api_key";
        public static String APPLICATION_ID = "client/app_id";
        public static String ML_SERVICE_URL = "service/ml/mlservice_url";
        public static String PACKAGE_NAME = "client/package_name";
        public static String REGION = "region";

        private AgConnectKey() {
        }
    }

    public AgConnectInfo(Context context) {
        this.mlServiceUrls = new ArrayList();
        this.haCollectorUrls = new ArrayList();
        context = context == null ? AGConnectInstance.getInstance().getContext() : context;
        if (context == null) {
            throw new IllegalStateException("Context not found.");
        }
        AGConnectServicesConfig fromContext = AGConnectServicesConfig.fromContext(context);
        SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + fromContext + "context: " + context);
        this.region = fromContext.getString(AgConnectKey.REGION);
        SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + fromContext + "region: " + this.region);
        String string = fromContext.getString(AgConnectKey.PACKAGE_NAME);
        this.packageName = string;
        if (string != null) {
            SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + fromContext + "packageName: " + this.packageName);
        } else {
            this.packageName = context.getPackageName();
        }
        String string2 = fromContext.getString(AgConnectKey.APPLICATION_ID);
        this.applicationId = string2;
        if (string2 != null) {
            SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + fromContext + "packageName: " + this.packageName);
        } else {
            this.applicationId = this.packageName;
        }
        String string3 = fromContext.getString(AgConnectKey.API_KEY);
        this.apiKey = string3;
        if (string3 != null) {
            SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + fromContext + "apiKey: apiKey is secret");
        }
        String rawSignature = getRawSignature(context);
        this.certFingerprint = rawSignature;
        if (rawSignature != null) {
            SmartLog.i("AgConnectInfo", "AGConnectServicesConfig: " + fromContext + "certFingerprint: certFingerprint is secret");
        }
        String string4 = fromContext.getString(AgConnectKey.ML_SERVICE_URL);
        if (string4 != null) {
            for (String str : string4.split(",")) {
                String lowerCase = str.trim().toLowerCase(Locale.ENGLISH);
                if (!lowerCase.startsWith("http://") && !lowerCase.startsWith("https://")) {
                    lowerCase = "https://" + lowerCase;
                }
                if (!lowerCase.endsWith("/")) {
                    lowerCase = lowerCase + "/";
                }
                this.mlServiceUrls.add(lowerCase);
            }
        }
        String string5 = fromContext.getString(AgConnectKey.ANALYTICS_COLLECTOR_URL);
        if (string5 != null) {
            for (String str2 : string5.split(",")) {
                String lowerCase2 = str2.trim().toLowerCase(Locale.ENGLISH);
                if (!lowerCase2.startsWith("http://") && !lowerCase2.startsWith("https://")) {
                    lowerCase2 = "https://" + lowerCase2;
                }
                this.haCollectorUrls.add(lowerCase2);
            }
        }
    }

    public AgConnectInfo() {
        this(null);
    }

    private String getRawSignature(Context context) {
        PackageInfo packageInfo;
        Signature signature;
        try {
            packageInfo = context.getPackageManager().getPackageInfo(context.getPackageName(), 64);
        } catch (PackageManager.NameNotFoundException unused) {
        }
        if (packageInfo == null) {
            return "";
        }
        Signature[] signatureArr = packageInfo.signatures;
        if (signatureArr == null || signatureArr.length <= 0) {
            SmartLog.i("AgConnectInfo", "signature is null ");
            signature = null;
        } else {
            signature = signatureArr[0];
            SmartLog.i("AgConnectInfo", "signature is not null ");
        }
        if (signature != null) {
            return getSignatureString(signature, "SHA256");
        }
        return "";
    }

    private final String getSignatureString(Signature signature, String str) {
        try {
            byte[] byteArray = signature.toByteArray();
            StringBuffer stringBuffer = new StringBuffer();
            MessageDigest messageDigest = MessageDigest.getInstance(str);
            messageDigest.reset();
            messageDigest.update(byteArray);
            byte[] digest = messageDigest.digest();
            for (int i = 0; i < digest.length; i++) {
                if (Integer.toHexString(digest[i] & 255).length() == 1) {
                    stringBuffer.append("0").append(Integer.toHexString(digest[i] & 255));
                } else {
                    stringBuffer.append(Integer.toHexString(digest[i] & 255));
                }
                if (i != digest.length - 1) {
                    stringBuffer.append(":");
                }
            }
            return stringBuffer.toString().toUpperCase(Locale.ENGLISH);
        } catch (Throwable unused) {
            return null;
        }
    }

    public String getRegion() {
        return this.region;
    }

    public String getApplicationId() {
        return this.applicationId;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public String getApiKey() {
        return this.apiKey;
    }

    public String getCertFingerprint() {
        return this.certFingerprint;
    }

    public List<String> getMLServiceUrls() {
        return this.mlServiceUrls;
    }

    public List<String> getHaCollectorUrls() {
        return this.haCollectorUrls;
    }
}
