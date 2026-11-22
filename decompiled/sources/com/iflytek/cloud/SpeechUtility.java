package com.iflytek.cloud;

import android.app.ActivityManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.database.Cursor;
import android.net.Uri;
import android.os.Process;
import android.text.TextUtils;
import android.util.Base64;
import android.util.Log;
import com.autonavi.aps.amapapi.config.Const;
import com.iflytek.cloud.a.f.d;
import com.iflytek.cloud.msc.util.log.DebugLog;
import com.iflytek.idata.extension.IFlyCollectorExt;
import com.iflytek.msc.MSC;
import com.iflytek.msc.MSCSessionInfo;
import com.iflytek.speech.SpeechComponent;
import com.iflytek.speech.UtilityConfig;
import com.phancy.mini.utils.MiniStorage;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes17.dex */
public class SpeechUtility extends d {
    public static final d.a DEF_ENGINE_MODE = d.a.MSC;
    public static final String TAG_RESOURCE_CONTENT = "tag_rescontent";
    public static final String TAG_RESOURCE_RESULT = "result";
    public static final String TAG_RESOURCE_RET = "ret";

    /* renamed from: a, reason: collision with root package name */
    private static SpeechUtility f11089a;
    private Context d;
    private a f;
    protected d.a g;
    private ArrayList<SpeechComponent> b = new ArrayList<>();
    private int c = -1;
    private boolean e = false;

    private class a extends BroadcastReceiver {
    }

    class b extends Thread {

        /* renamed from: a, reason: collision with root package name */
        String f11090a = "";
        Context b;

        b() {
        }

        public void a(String str) {
            this.f11090a = str;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            IFlyCollectorExt iFlyCollectorExt = IFlyCollectorExt.getInstance(this.b.getApplicationContext());
            iFlyCollectorExt.setAppId("5d2386c983");
            iFlyCollectorExt.setSubId(this.f11090a);
        }

        public void a(Context context) {
            this.b = context;
        }
    }

    private SpeechUtility(Context context, String str) throws SpeechError {
        this.d = null;
        this.g = DEF_ENGINE_MODE;
        this.d = context.getApplicationContext();
        super.setParameter("params", str);
        MSC.loadLibrary(this.mSessionParams.a(SpeechConstant.LIB_NAME, SpeechConstant.MODE_MSC));
        DebugLog.updateJniLogStatus();
        setParameter("params", str);
        this.g = d.a.MSC;
        int d = d();
        if (d != 0) {
            throw new SpeechError(d);
        }
        b();
        String parameter = getParameter("appid");
        try {
            String parameter2 = getParameter("enable_sunflower");
            if (TextUtils.isEmpty(parameter2) || !parameter2.equals("false")) {
                b bVar = new b();
                bVar.a(parameter);
                bVar.a(context.getApplicationContext());
                bVar.start();
            }
        } catch (Exception unused) {
            DebugLog.LogW("userLog creating failed");
        }
        String parameter3 = getParameter("lxy_tp_dc");
        if (!TextUtils.isEmpty(parameter3)) {
            "false".equals(parameter3);
        }
        DebugLog.LogD("DC init enable=" + parameter3);
    }

    private void a(String str) {
        if (TextUtils.isEmpty(str)) {
            return;
        }
        PackageManager packageManager = this.d.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(UtilityConfig.COMPONENT_PKG);
        List<ResolveInfo> queryIntentServices = packageManager.queryIntentServices(intent, 224);
        if (queryIntentServices == null || queryIntentServices.size() <= 0) {
            return;
        }
        for (ResolveInfo resolveInfo : queryIntentServices) {
            SpeechComponent c = c(resolveInfo.serviceInfo.packageName);
            if (c != null) {
                try {
                    for (String str2 : resolveInfo.serviceInfo.metaData.getString(UtilityConfig.METADATA_KEY_ENGINE_TYPE).split(",")) {
                        c.addEngine(str2);
                    }
                } catch (Exception e) {
                    DebugLog.LogE(e);
                }
            }
        }
    }

    private void b() {
        if (checkServiceInstalled()) {
            a(UtilityConfig.ACTION_SPEECH_RECOGNIZER);
            a(UtilityConfig.ACTION_SPEECH_SYNTHESIZER);
            a(UtilityConfig.ACTION_SPEECH_UNDERSTANDER);
            a(UtilityConfig.ACTION_TEXT_UNDERSTANDER);
            a(UtilityConfig.ACTION_SPEECH_WAKEUP);
        }
    }

    public static synchronized SpeechUtility createUtility(Context context, String str) {
        SpeechUtility speechUtility;
        synchronized (SpeechUtility.class) {
            synchronized (d.sSync) {
                if (f11089a == null) {
                    com.iflytek.cloud.b.a aVar = new com.iflytek.cloud.b.a();
                    aVar.d(str);
                    if (aVar.a(SpeechConstant.FORCE_LOGIN, false) || a(context.getApplicationContext())) {
                        try {
                            f11089a = new SpeechUtility(context, str);
                        } catch (SpeechError e) {
                            DebugLog.LogE("init failed");
                            DebugLog.LogE(e);
                        }
                    } else {
                        DebugLog.LogE("init failed, please call this method in your main process!");
                        f11089a = null;
                    }
                }
            }
            speechUtility = f11089a;
        }
        return speechUtility;
    }

    private int d() {
        if (!MSC.isLoaded()) {
            return 21002;
        }
        DebugLog.LogD("SpeechUtility start login");
        SpeechError a2 = new com.iflytek.cloud.a.g.b(this.d, this.mSessionParams).a(this.mSessionParams.a(MiniStorage.DIR_USR), this.mSessionParams.a("pwd"));
        if (a2 == null) {
            return 0;
        }
        return a2.getErrorCode();
    }

    private boolean e() {
        if (MSC.isLoaded()) {
            return com.iflytek.cloud.a.g.a.a();
        }
        return true;
    }

    public static synchronized SpeechUtility getUtility() {
        SpeechUtility speechUtility;
        synchronized (SpeechUtility.class) {
            speechUtility = f11089a;
        }
        return speechUtility;
    }

    protected boolean c() {
        try {
            return this.d.getPackageManager().getPackageInfo(UtilityConfig.COMPONENT_PKG, 0) != null;
        } catch (PackageManager.NameNotFoundException unused) {
            return false;
        }
    }

    public boolean checkServiceInstalled() {
        boolean z = false;
        int i = -1;
        try {
            PackageInfo packageInfo = this.d.getPackageManager().getPackageInfo(UtilityConfig.COMPONENT_PKG, 0);
            if (packageInfo != null) {
                z = true;
                i = packageInfo.versionCode;
            }
        } catch (Throwable unused) {
        }
        if (z != this.e || this.c != i) {
            this.e = z;
            this.c = i;
            if (SpeechRecognizer.getRecognizer() != null) {
                SpeechRecognizer.getRecognizer().a(this.d);
            }
            if (SpeechSynthesizer.getSynthesizer() != null) {
                SpeechSynthesizer.getSynthesizer().a(this.d);
            }
            if (SpeechUnderstander.getUnderstander() != null) {
                SpeechUnderstander.getUnderstander().a(this.d);
            }
            if (TextUnderstander.getTextUnderstander() != null) {
                TextUnderstander.getTextUnderstander().a(this.d);
            }
        }
        return z;
    }

    @Override // com.iflytek.cloud.a.f.d
    public boolean destroy() {
        boolean z;
        if (f11089a != null) {
            super.destroy();
            z = e();
        } else {
            z = true;
        }
        if (!z) {
            return z;
        }
        a aVar = this.f;
        if (aVar != null) {
            this.d.unregisterReceiver(aVar);
        }
        DebugLog.LogD("SpeechUtility destory success");
        synchronized (d.sSync) {
            f11089a = null;
        }
        return z;
    }

    public String getComponentUrl() {
        StringBuffer stringBuffer = new StringBuffer(UtilityConfig.COMPONENT_URL);
        UtilityConfig.appendHttpParam(stringBuffer, "key", URLEncoder.encode(Base64.encodeToString(UtilityConfig.getComponentUrlParam(this.d).getBytes(), 0)));
        UtilityConfig.appendHttpParam(stringBuffer, "version", "2.0");
        return stringBuffer.toString();
    }

    public d.a getEngineMode() {
        return this.g;
    }

    @Override // com.iflytek.cloud.a.f.d
    public String getParameter(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (this.mSessionParams.b(str)) {
            return super.getParameter(str);
        }
        if (!MSC.isLoaded()) {
            return null;
        }
        try {
        } catch (Exception e) {
            DebugLog.LogS(e);
        } catch (UnsatisfiedLinkError e2) {
            DebugLog.LogS(e2);
        }
        if (!str.equals("ver_msc") && !str.equals("ver_asr") && !str.equals("ver_tts") && !str.equals("ver_ivw")) {
            byte[] bytes = str.getBytes("utf-8");
            MSCSessionInfo mSCSessionInfo = new MSCSessionInfo();
            if (MSC.QMSPGetParam(bytes, mSCSessionInfo) == 0) {
                return new String(mSCSessionInfo.buffer, "utf-8");
            }
            return null;
        }
        byte[] bytes2 = str.getBytes("utf-8");
        MSCSessionInfo mSCSessionInfo2 = new MSCSessionInfo();
        String str2 = new String(MSC.QMSPGetVersion(bytes2, mSCSessionInfo2), "utf-8");
        if (mSCSessionInfo2.errorcode == 0) {
            return str2;
        }
        return null;
    }

    public String getPlusLocalInfo(String str) throws JSONException {
        String str2;
        JSONObject jSONObject = new JSONObject();
        if (!checkServiceInstalled()) {
            jSONObject.put(TAG_RESOURCE_RET, 21001);
            return jSONObject.toString();
        }
        if (getServiceVersion() < 97) {
            jSONObject.put(TAG_RESOURCE_RET, ErrorCode.ERROR_VERSION_LOWER);
            return jSONObject.toString();
        }
        if (10000 <= getServiceVersion() && getServiceVersion() <= 11000) {
            jSONObject.put(TAG_RESOURCE_RET, ErrorCode.ERROR_SYSTEM_PREINSTALL);
            return jSONObject.toString();
        }
        Cursor query = this.d.getContentResolver().query(Uri.parse("content://com.iflytek.vflynote.providers.LocalResourceProvider"), null, str, null, null);
        int columnIndex = query.getColumnIndex(TAG_RESOURCE_CONTENT);
        if (query.moveToFirst()) {
            str2 = query.getString(columnIndex);
            Log.v("SpeechUtility", str2);
        } else {
            str2 = "";
        }
        query.close();
        if (TextUtils.isEmpty(str2)) {
            jSONObject.put(TAG_RESOURCE_RET, 20004);
            return jSONObject.toString();
        }
        jSONObject.put(TAG_RESOURCE_RET, 0);
        jSONObject.put("result", new JSONObject(str2));
        return jSONObject.toString();
    }

    public int getServiceVersion() {
        if (this.c < 0) {
            try {
                PackageInfo packageInfo = this.d.getPackageManager().getPackageInfo(UtilityConfig.COMPONENT_PKG, 0);
                if (packageInfo != null) {
                    this.c = packageInfo.versionCode;
                }
            } catch (PackageManager.NameNotFoundException unused) {
            }
        }
        return this.c;
    }

    public int openEngineSettings(String str) {
        String str2 = UtilityConfig.SETTINGS_ACTION_ASR;
        try {
            Intent intent = new Intent();
            intent.setPackage(UtilityConfig.COMPONENT_PKG);
            if ("tts".equals(str) && b(UtilityConfig.SETTINGS_ACTION_TTS)) {
                str2 = UtilityConfig.SETTINGS_ACTION_TTS;
            } else if (!"asr".equals(str) || !b(UtilityConfig.SETTINGS_ACTION_ASR)) {
                str2 = b(UtilityConfig.SETTINGS_ACTION_MAIN) ? UtilityConfig.SETTINGS_ACTION_MAIN : UtilityConfig.COMPONENT_PKG;
            }
            intent.setAction(str2);
            intent.addFlags(268435456);
            this.d.startActivity(intent);
            return 0;
        } catch (Exception e) {
            DebugLog.LogE(e);
            return 21002;
        }
    }

    public String[] queryAvailableEngines() {
        this.b.clear();
        b();
        ArrayList arrayList = new ArrayList();
        Iterator<SpeechComponent> it = this.b.iterator();
        while (it.hasNext()) {
            arrayList.addAll(it.next().getEngines());
        }
        String[] strArr = new String[arrayList.size()];
        for (int i = 0; i < arrayList.size(); i++) {
            strArr[i] = (String) arrayList.get(i);
        }
        return strArr;
    }

    @Override // com.iflytek.cloud.a.f.d
    public boolean setParameter(String str, String str2) {
        if (TextUtils.isEmpty(str) || TextUtils.isEmpty(str2)) {
            return false;
        }
        super.setParameter(str, str2);
        if (!MSC.isLoaded() || "params".equals(str)) {
            return true;
        }
        try {
            return MSC.QMSPSetParam(str.getBytes("utf-8"), str2.getBytes("utf-8")) == 0;
        } catch (Exception e) {
            DebugLog.LogE(e);
            return false;
        } catch (UnsatisfiedLinkError e2) {
            DebugLog.LogE(e2);
            return false;
        }
    }

    private SpeechComponent c(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        Iterator<SpeechComponent> it = this.b.iterator();
        while (it.hasNext()) {
            if (str.equals(it.next().getPackageName())) {
                return null;
            }
        }
        SpeechComponent speechComponent = new SpeechComponent(str);
        this.b.add(speechComponent);
        return speechComponent;
    }

    private boolean b(String str) {
        PackageManager packageManager = this.d.getPackageManager();
        Intent intent = new Intent(str);
        intent.setPackage(UtilityConfig.COMPONENT_PKG);
        return packageManager.queryIntentActivities(intent, 1).size() > 0;
    }

    private static boolean a(Context context) {
        try {
            int myPid = Process.myPid();
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
            if (activityManager != null) {
                for (ActivityManager.RunningAppProcessInfo runningAppProcessInfo : activityManager.getRunningAppProcesses()) {
                    if (runningAppProcessInfo.pid == myPid) {
                        DebugLog.LogD("process name:" + runningAppProcessInfo.processName);
                        if (context.getPackageManager().getApplicationInfo(context.getPackageName(), 0).packageName.equals(runningAppProcessInfo.processName)) {
                            DebugLog.LogD("process name:" + runningAppProcessInfo.processName + "is own process");
                            return true;
                        }
                    }
                }
            }
        } catch (Exception e) {
            DebugLog.LogE(e);
        }
        return false;
    }
}
