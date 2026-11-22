package com.iflytek.cloud.b;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.text.TextUtils;
import com.amap.api.maps.model.amap3dmodeltile.AMap3DTileBuildType;
import com.baidu.mapapi.http.wrapper.annotation.BodyData;
import com.iflytek.cloud.Setting;
import com.iflytek.cloud.SpeechConstant;
import com.iflytek.cloud.SpeechError;
import com.iflytek.cloud.SpeechUtility;
import com.iflytek.cloud.Version;
import com.iflytek.cloud.msc.util.FileUtil;
import com.iflytek.cloud.msc.util.j;
import com.iflytek.cloud.msc.util.k;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.umeng.commonsdk.config.d;
import io.nats.client.support.NatsJetStreamConstants;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes17.dex */
public class c {

    /* renamed from: a, reason: collision with root package name */
    private static String f11155a = "xiaoyan";
    private static String b;

    public static String a(Context context, com.iflytek.cloud.a.f.a aVar) throws SpeechError {
        if (context == null) {
            throw new SpeechError(20012);
        }
        a clone = aVar.getParam().clone();
        b = clone.a("net_type", b);
        b(context, clone);
        clone.a("timeout", "20000", false);
        clone.a("auth", "1", false);
        clone.b("msc.ver", Version.getVersion());
        clone.a("mac", com.iflytek.cloud.msc.util.a.b(context).a("net.mac"), false);
        clone.a("dvc", a(context), false);
        clone.b("unique_id", k.d(context));
        clone.a(com.iflytek.cloud.msc.util.a.f(context));
        a(clone);
        clone.a(b.c);
        return clone.toString();
    }

    public static void b(Context context, a aVar) {
        if (TextUtils.isEmpty(aVar.a("net_type")) && !TextUtils.isEmpty(b)) {
            aVar.a("net_type", b, false);
            return;
        }
        if (context == null) {
            aVar.a("net_type", "none", false);
            return;
        }
        try {
            NetworkInfo activeNetworkInfo = ((ConnectivityManager) context.getSystemService("connectivity")).getActiveNetworkInfo();
            if (activeNetworkInfo == null) {
                aVar.a("net_type", "none", false);
            } else {
                aVar.a("net_type", j.b(activeNetworkInfo), false);
                aVar.a("net_subtype", a.g(j.a(activeNetworkInfo)), false);
            }
        } catch (SecurityException e) {
            DebugLog.LogI("appendNetProxyParam exceptoin: " + e.getLocalizedMessage());
        } catch (Throwable th) {
            DebugLog.LogE(th);
        }
    }

    public static String c(Context context, String str, com.iflytek.cloud.a.f.a aVar) {
        if (str.equals("oneshot")) {
            return a(context, aVar.getParam().a(SpeechConstant.CLOUD_GRAMMAR), aVar);
        }
        a clone = aVar.getParam().clone();
        int a2 = clone.a(SpeechConstant.IVW_NET_MODE, 0);
        if (a2 == 0) {
            clone.a(SpeechConstant.IVW_NET_MODE, "0", true);
        } else if (2 == a2 || 1 == a2) {
            clone.a(SpeechConstant.IVW_NET_MODE, "1", true);
        } else if (j.b(context)) {
            clone.a(SpeechConstant.IVW_NET_MODE, "1", true);
        } else {
            clone.a(SpeechConstant.IVW_NET_MODE, "0", true);
        }
        clone.a(b.c);
        return clone.toString();
    }

    public static String d(Context context, a aVar) {
        a clone = aVar.clone();
        a(context, clone);
        SpeechUtility utility = SpeechUtility.getUtility();
        if (utility != null) {
            clone.b("appid", utility.getParameter("appid"));
        }
        clone.a(com.iflytek.cloud.msc.util.a.f(context));
        clone.a("dvc", a(context), false);
        clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "raw", false);
        clone.a(b.c);
        return clone.toString();
    }

    public static String e(Context context, com.iflytek.cloud.a.f.a aVar) {
        a clone = aVar.getParam().clone();
        b(context, clone);
        a(context, clone);
        clone.a("ssm", "1", false);
        int sampleRate = aVar.getSampleRate();
        clone.b("auf=audio/L16;rate", Integer.toString(sampleRate));
        if (sampleRate == 16000) {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex-wb", false);
        } else {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex", false);
        }
        clone.a(SpeechConstant.VOICE_NAME, clone.a(SpeechConstant.VOICE_NAME, f11155a), true);
        clone.a(SpeechConstant.TEXT_ENCODING, aVar.getTextEncoding(), false);
        b(clone);
        clone.a(b.c);
        return clone.toString();
    }

    public static String d(Context context, String str, com.iflytek.cloud.a.f.a aVar) {
        a clone = aVar.getParam().clone();
        b(context, clone);
        clone.a(NatsJetStreamConstants.ROLLUP_HDR_SUBJECT, "mfv", false);
        clone.a("prot_ver", "50", false);
        clone.a("mver", "2.0", false);
        if ("verify".equals(clone.a("sst"))) {
            clone.a("scene_mode", "vfy", false);
        } else {
            clone.a("scene_mode", "gen", false);
        }
        clone.a(b.c);
        return clone.toString();
    }

    public static String b(Context context, String str, com.iflytek.cloud.a.f.a aVar) {
        a param = aVar.getParam();
        b(context, param);
        param.a(SpeechConstant.RESULT_TYPE, BodyData.TYPE_JSON, false);
        param.a("rse", "gb2312", false);
        param.a(SpeechConstant.TEXT_ENCODING, aVar.getTextEncoding(), false);
        param.a(SpeechConstant.VAD_ENABLE, "false", false);
        param.a("ssm", "1", false);
        param.a(NatsJetStreamConstants.ROLLUP_HDR_SUBJECT, "ist", false);
        int sampleRate = aVar.getSampleRate();
        param.a("auf=audio/L16;rate", Integer.toString(sampleRate), false);
        if (sampleRate == 16000) {
            param.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex-wb", false);
        } else {
            param.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex", false);
        }
        return param.toString();
    }

    public static String c(Context context, com.iflytek.cloud.a.f.a aVar) {
        a clone = aVar.getParam().clone();
        b(context, clone);
        clone.b(SpeechConstant.RESULT_TYPE, BodyData.TYPE_JSON);
        clone.b("rse", aVar.getResultEncoding());
        clone.b(SpeechConstant.TEXT_ENCODING, aVar.getTextEncoding());
        clone.a("ssm", "1", false);
        clone.a("subject", SpeechConstant.ENG_IVP, false);
        int sampleRate = aVar.getSampleRate();
        clone.a("auf=audio/L16;rate", Integer.toString(sampleRate), false);
        if (sampleRate == 16000) {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex-wb;10", false);
        } else {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex", false);
        }
        clone.a(SpeechConstant.VAD_BOS, AMap3DTileBuildType.HOUSING, false);
        clone.a(SpeechConstant.VAD_EOS, "700", false);
        clone.a(b.c);
        return clone.toString();
    }

    private static void a(a aVar) {
        int i;
        if (aVar == null || Setting.getLogLevel() == Setting.LOG_LEVEL.none) {
            return;
        }
        String logPath = Setting.getLogPath();
        if (TextUtils.isEmpty(logPath)) {
            logPath = "/sdcard/msc/msc.log";
        }
        if (Setting.getLogLevel() == Setting.LOG_LEVEL.detail) {
            i = 31;
        } else if (Setting.getLogLevel() == Setting.LOG_LEVEL.normal) {
            i = 15;
        } else {
            i = Setting.getLogLevel() == Setting.LOG_LEVEL.low ? 7 : -1;
        }
        FileUtil.makeDir(logPath);
        aVar.b("log", logPath);
        aVar.b("lvl", "" + i);
        aVar.a("output", "1", false);
    }

    public static String d(Context context, com.iflytek.cloud.a.f.a aVar) {
        a clone = aVar.getParam().clone();
        b(context, clone);
        a(context, clone);
        clone.a("ssm", "1", false);
        clone.a(SpeechConstant.RESULT_TYPE, BodyData.TYPE_JSON, false);
        clone.a("rse", aVar.getResultEncoding(), false);
        clone.a(SpeechConstant.TEXT_ENCODING, aVar.getTextEncoding(), false);
        clone.a(b.c);
        return clone.toString();
    }

    public static String b(Context context, com.iflytek.cloud.a.f.a aVar) {
        a clone = aVar.getParam().clone();
        b(context, clone);
        a(context, clone);
        clone.a("ssm", "1", false);
        int sampleRate = aVar.getSampleRate();
        clone.a("auf=audio/L16;rate", Integer.toString(sampleRate), false);
        if (sampleRate == 16000) {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex-wb", false);
        } else {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex", false);
        }
        clone.a(SpeechConstant.TEXT_ENCODING, aVar.getTextEncoding(), false);
        clone.a("plev", "1", false);
        clone.a("accent", "mandarin", false);
        clone.a("domain", "ise", false);
        clone.a("subject", "ise", false);
        clone.a(SpeechConstant.RESULT_TYPE, "xml", false);
        clone.a(SpeechConstant.VAD_BOS, "5000", false);
        clone.a(SpeechConstant.VAD_EOS, "1800", false);
        clone.a("vad_speech_timeout", d.d, false);
        clone.a(b.c);
        return clone.toString();
    }

    public static void a(Context context, a aVar) {
        aVar.b("act_name", com.iflytek.cloud.msc.util.a.a(context));
    }

    public static String c(Context context, a aVar) {
        a clone = aVar.clone();
        clone.b("appid", SpeechUtility.getUtility().getParameter("appid"));
        clone.a(com.iflytek.cloud.msc.util.a.f(context));
        clone.a("dvc", a(context), false);
        clone.a(b.c);
        return clone.toString();
    }

    public static String a(Context context, String str, com.iflytek.cloud.a.f.a aVar) {
        a clone = aVar.getParam().clone();
        clone.f(SpeechConstant.CLOUD_GRAMMAR);
        b(context, clone);
        a(context, clone);
        clone.a("language", "zh_cn", false);
        clone.a("accent", "mandarin", false);
        clone.a(SpeechConstant.RESULT_TYPE, BodyData.TYPE_JSON, false);
        clone.a("rse", aVar.getResultEncoding(), false);
        clone.a(SpeechConstant.TEXT_ENCODING, aVar.getTextEncoding(), false);
        clone.a("ssm", "1", false);
        clone.a("msc.skin", "0", false);
        if (TextUtils.isEmpty(str)) {
            clone.a("subject", "iat", false);
        } else {
            clone.a("subject", "asr", false);
        }
        int sampleRate = aVar.getSampleRate();
        clone.a("auf=audio/L16;rate", Integer.toString(sampleRate), false);
        if (sampleRate == 16000) {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex-wb", false);
        } else {
            clone.a(SpeechConstant.AUDIO_FORMAT_AUE, "speex", false);
        }
        clone.a(SpeechConstant.VAD_BOS, Integer.toString(a(aVar)), false);
        clone.a(SpeechConstant.VAD_EOS, Integer.toString(b(aVar)), false);
        if (clone.a(SpeechConstant.DVC_INFO, false)) {
            b(context, clone);
            clone.a("dvc", a(context), false);
            clone.b("unique_id", k.d(context));
            String b2 = com.iflytek.cloud.msc.util.a.b(com.iflytek.cloud.msc.util.a.c(context));
            String e = com.iflytek.cloud.msc.util.a.e(context);
            clone.a(com.alipay.sdk.m.n.b.b, b2, false);
            clone.a("device_type", e, false);
            clone.a(com.iflytek.cloud.msc.util.a.f(context));
        }
        clone.a(b.c);
        return clone.toString();
    }

    private static void b(a aVar) {
        SpeechUtility utility = SpeechUtility.getUtility();
        if (utility == null) {
            return;
        }
        String parameter = utility.getParameter("ver_tts");
        if (aVar.b("speed_increase")) {
            return;
        }
        int a2 = aVar.a("speed", 50);
        if (a2 <= 100) {
            aVar.b("speed", "" + a2);
            aVar.b("speed_increase", "1");
            return;
        }
        if (100 < a2 && a2 <= 150 && (TextUtils.isEmpty(parameter) || parameter.contains("5.5."))) {
            aVar.b("speed", "" + (a2 - 50));
            aVar.b("speed_increase", "2");
        } else {
            if (100 >= a2 || a2 > 200) {
                return;
            }
            aVar.b("speed", "" + (a2 - 100));
            aVar.b("speed_increase", "4");
        }
    }

    public static int b(com.iflytek.cloud.a.f.a aVar) {
        return (aVar == null || !aVar.isLongInput()) ? 700 : 1800;
    }

    public static String a(Context context) {
        if (context == null) {
            return AbstractJsonLexerKt.NULL;
        }
        a b2 = com.iflytek.cloud.msc.util.a.b(context);
        String str = b2.a("os.imsi") + "|" + b2.a("os.imei");
        if (str.length() < 10) {
            str = b2.a("net.mac");
        }
        if (TextUtils.isEmpty(str) || str.length() <= 0) {
            return null;
        }
        return str;
    }

    public static String a() {
        return SpeechUtility.getUtility().getParameter("appid");
    }

    public static boolean a(String str) {
        if (str != null) {
            return str.contains("sms") || str.contains("iat");
        }
        return false;
    }

    public static int a(com.iflytek.cloud.a.f.a aVar) {
        return (aVar == null || !aVar.isLongInput()) ? 4000 : 5000;
    }
}
