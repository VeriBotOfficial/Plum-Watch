package com.iflytek.cloud;

import androidx.core.app.NotificationCompat;
import com.google.firebase.analytics.FirebaseAnalytics;
import com.iflytek.cloud.msc.util.log.DebugLog;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class VerifierResult {
    public static final int MSS_ERROR_IVP_EXTRA_RGN_SOPPORT = 11601;
    public static final int MSS_ERROR_IVP_GENERAL = 11600;
    public static final int MSS_ERROR_IVP_MUCH_NOISE = 11603;
    public static final int MSS_ERROR_IVP_NO_ENOUGH_AUDIO = 11608;
    public static final int MSS_ERROR_IVP_TEXT_NOT_MATCH = 11607;
    public static final int MSS_ERROR_IVP_TOO_LOW = 11604;
    public static final int MSS_ERROR_IVP_TRUNCATED = 11602;
    public static final int MSS_ERROR_IVP_UTTER_TOO_SHORT = 11606;
    public static final int MSS_ERROR_IVP_ZERO_AUDIO = 11605;
    public static final String TAG = "VerifyResult";
    public String dcs;
    public int err;
    public int ret;
    public int rgn;
    public Double score;
    public Double score_raw;
    public String source;
    public String sst;
    public int suc;
    public String trs;
    public String vid;

    public VerifierResult(String str) {
        this.ret = 0;
        this.dcs = "";
        this.vid = "";
        this.suc = 0;
        this.rgn = 0;
        this.trs = "";
        this.err = 0;
        try {
            this.source = str;
            JSONObject jSONObject = new JSONObject(this.source);
            DebugLog.LogD("VerifyResult = " + this.source);
            if (jSONObject.has(SpeechUtility.TAG_RESOURCE_RET)) {
                this.ret = jSONObject.getInt(SpeechUtility.TAG_RESOURCE_RET);
            }
            if (jSONObject.has("sst")) {
                this.sst = jSONObject.getString("sst");
            }
            if (jSONObject.has("dcs")) {
                this.dcs = jSONObject.getString("dcs");
            }
            if (jSONObject.has("suc")) {
                this.suc = jSONObject.getInt("suc");
            }
            if (jSONObject.has(SpeechConstant.ISV_VID)) {
                this.vid = jSONObject.getString(SpeechConstant.ISV_VID);
            }
            if (jSONObject.has("rgn")) {
                this.rgn = jSONObject.getInt("rgn");
            }
            if (jSONObject.has("trs")) {
                this.trs = jSONObject.getString("trs");
            }
            if (jSONObject.has(NotificationCompat.CATEGORY_ERROR)) {
                this.err = jSONObject.getInt(NotificationCompat.CATEGORY_ERROR);
            }
            if (jSONObject.has(FirebaseAnalytics.Param.SCORE)) {
                this.score = Double.valueOf(jSONObject.getDouble(FirebaseAnalytics.Param.SCORE));
            }
            if (jSONObject.has("score_raw")) {
                this.score_raw = Double.valueOf(jSONObject.getDouble("score_raw"));
            }
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
    }
}
