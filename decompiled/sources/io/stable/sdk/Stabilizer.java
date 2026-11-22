package io.stable.sdk;

import android.app.ActivityManager;
import android.app.ApplicationExitInfo;
import android.content.Context;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import app.squady.telemetry.SquadySentry;
import com.autonavi.aps.amapapi.config.Const;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

/* loaded from: classes7.dex */
public class Stabilizer {
    private static final String EXIT_DIAGNOSTIC_PREFS = "stabilizer-exit-diagnostics";
    private static final String EXIT_DIAGNOSTIC_TAG = "StabilizerExit";
    private static final String LAST_REPORTED_EXIT_TIMESTAMP = "last-reported-exit-timestamp";
    private static final int MAX_LOGGED_TRACE_BYTES = 65536;
    private static final int MAX_PENDING_EXIT_DIAGNOSTIC_LINES = 64;
    private static final int MAX_TRACE_BYTES = 8388608;
    private static final String NATIVE_STAGE_FILE = "stabilizer-native-stage.txt";
    private static LogCallback sLogCallback;
    private ProgressCallback mCallback;
    private long mHandle;
    private static final AtomicBoolean EXIT_DIAGNOSTICS_REPORTED = new AtomicBoolean(false);
    private static final Object EXIT_DIAGNOSTIC_LOG_LOCK = new Object();
    private static final ArrayDeque<String> PENDING_EXIT_DIAGNOSTICS = new ArrayDeque<>();

    public interface LogCallback {
        void onLog(String str);
    }

    private static native void cancel(long j);

    private static native long create();

    private static native void destroy(long j);

    private static native String getBuildInfoNative();

    private static native String getCurrentDeviceNative(long j);

    private static native String[] listGpuDevicesNative();

    private static native boolean run(long j, Uri uri, Uri uri2, String str, String str2, String str3, ProgressCallback progressCallback);

    private static native void setContext(Context context);

    private static native boolean setDeviceNative(long j, int i);

    private static native void setLogCallbackNative(LogCallback logCallback);

    static {
        System.loadLibrary("stabilizer");
    }

    public interface ProgressCallback {
        void onComplete(boolean z);

        void onError(String str);

        void onProgress(float f);

        default void onProgress(float f, String str) {
            onProgress(f);
        }
    }

    public Stabilizer(Context context) {
        if (context != null) {
            initContext(context);
        }
        this.mHandle = create();
    }

    public void release() {
        long j = this.mHandle;
        if (j != 0) {
            destroy(j);
            this.mHandle = 0L;
        }
    }

    protected void finalize() throws Throwable {
        try {
            release();
        } finally {
            super.finalize();
        }
    }

    public static void initContext(Context context) {
        if (context != null) {
            Context applicationContext = context.getApplicationContext();
            reportPreviousExitDiagnostics(applicationContext);
            setContext(applicationContext);
            initializeTelemetry(applicationContext);
        }
    }

    private static void reportPreviousExitDiagnostics(Context context) {
        if (EXIT_DIAGNOSTICS_REPORTED.compareAndSet(false, true)) {
            File file = new File(context.getFilesDir(), NATIVE_STAGE_FILE);
            if (file.isFile()) {
                emitExitDiagnostic("STABILIZER_PREVIOUS_NATIVE_STAGE " + readFilePreview(file, 16384).trim());
            } else {
                emitExitDiagnostic("STABILIZER_PREVIOUS_NATIVE_STAGE missing");
            }
            if (Build.VERSION.SDK_INT >= 30) {
                reportApplicationExitInfo(context);
            } else {
                emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT unavailable sdk=" + Build.VERSION.SDK_INT);
            }
        }
    }

    private static void reportApplicationExitInfo(Context context) {
        try {
            ActivityManager activityManager = (ActivityManager) context.getSystemService(Const.STR_PROCESS_TAG);
            if (activityManager == null) {
                emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT activity_manager_missing");
                return;
            }
            List<ApplicationExitInfo> historicalProcessExitReasons = activityManager.getHistoricalProcessExitReasons(context.getPackageName(), 0, 5);
            if (historicalProcessExitReasons.isEmpty()) {
                emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT none");
                return;
            }
            ApplicationExitInfo applicationExitInfo = historicalProcessExitReasons.get(0);
            if (applicationExitInfo.getTimestamp() <= context.getSharedPreferences(EXIT_DIAGNOSTIC_PREFS, 0).getLong(LAST_REPORTED_EXIT_TIMESTAMP, 0L)) {
                emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT already_reported timestamp=" + applicationExitInfo.getTimestamp());
                return;
            }
            emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT reason=" + exitReasonLabel(applicationExitInfo.getReason()) + " reason_code=" + applicationExitInfo.getReason() + " status=" + applicationExitInfo.getStatus() + " timestamp_ms=" + applicationExitInfo.getTimestamp() + " importance=" + applicationExitInfo.getImportance() + " pss_kb=" + applicationExitInfo.getPss() + " rss_kb=" + applicationExitInfo.getRss() + " description=" + safeDiagnosticText(applicationExitInfo.getDescription()));
            InputStream traceInputStream = applicationExitInfo.getTraceInputStream();
            try {
                if (traceInputStream == null) {
                    emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT_TRACE unavailable");
                } else {
                    persistAndLogExitTrace(context, applicationExitInfo.getTimestamp(), traceInputStream);
                }
                if (traceInputStream != null) {
                    traceInputStream.close();
                }
                context.getSharedPreferences(EXIT_DIAGNOSTIC_PREFS, 0).edit().putLong(LAST_REPORTED_EXIT_TIMESTAMP, applicationExitInfo.getTimestamp()).commit();
            } finally {
            }
        } catch (Throwable th) {
            emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT collection_failed=" + th.getClass().getSimpleName() + ":" + safeDiagnosticText(th.getMessage()));
        }
    }

    private static String exitReasonLabel(int i) {
        if (i == 10) {
            return "USER_REQUESTED";
        }
        if (i == 11) {
            return "USER_STOPPED";
        }
        switch (i) {
            case 1:
                return "EXIT_SELF";
            case 2:
                return "SIGNALED";
            case 3:
                return "LOW_MEMORY";
            case 4:
                return "CRASH";
            case 5:
                return "CRASH_NATIVE";
            case 6:
                return "ANR";
            default:
                return "OTHER";
        }
    }

    private static void persistAndLogExitTrace(Context context, long j, InputStream inputStream) throws Exception {
        File file = new File(context.getFilesDir(), "stabilizer-diagnostics");
        if (!file.exists() && !file.mkdirs()) {
            throw new IllegalStateException("cannot create diagnostic directory");
        }
        File file2 = new File(file, "previous-exit-" + j + ".trace");
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(65536);
        byte[] bArr = new byte[8192];
        FileOutputStream fileOutputStream = new FileOutputStream(file2, false);
        int i = 0;
        while (i < 8388608) {
            try {
                int read = inputStream.read(bArr, 0, Math.min(8192, 8388608 - i));
                if (read < 0) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
                if (byteArrayOutputStream.size() < 65536) {
                    byteArrayOutputStream.write(bArr, 0, Math.min(read, 65536 - byteArrayOutputStream.size()));
                }
                i += read;
            } catch (Throwable th) {
                try {
                    fileOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        }
        fileOutputStream.flush();
        fileOutputStream.close();
        emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT_TRACE saved=" + file2.getName() + " bytes=" + i + " truncated=" + (i == 8388608));
        for (String str : byteArrayOutputStream.toString(StandardCharsets.UTF_8.name()).split("\\R")) {
            int i2 = 0;
            while (i2 < str.length()) {
                int i3 = i2 + 3000;
                emitExitDiagnostic("STABILIZER_PREVIOUS_EXIT_TRACE " + str.substring(i2, Math.min(i3, str.length())));
                i2 = i3;
            }
        }
    }

    private static void emitExitDiagnostic(String str) {
        Log.e(EXIT_DIAGNOSTIC_TAG, str);
        synchronized (EXIT_DIAGNOSTIC_LOG_LOCK) {
            LogCallback logCallback = sLogCallback;
            if (logCallback == null) {
                ArrayDeque<String> arrayDeque = PENDING_EXIT_DIAGNOSTICS;
                if (arrayDeque.size() == 64) {
                    arrayDeque.removeFirst();
                }
                arrayDeque.addLast(str);
                return;
            }
            notifyLogCallback(logCallback, str);
        }
    }

    private static void notifyLogCallback(LogCallback logCallback, String str) {
        try {
            logCallback.onLog(str);
        } catch (Throwable th) {
            Log.e(EXIT_DIAGNOSTIC_TAG, "STABILIZER_EXIT_CALLBACK_FAILED " + th.getClass().getSimpleName() + ":" + safeDiagnosticText(th.getMessage()));
        }
    }

    private static String readFilePreview(File file, int i) {
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[i];
                int read = fileInputStream.read(bArr);
                String str = read <= 0 ? "empty" : new String(bArr, 0, read, StandardCharsets.UTF_8);
                fileInputStream.close();
                return str;
            } finally {
            }
        } catch (Exception e) {
            return "read_failed=" + e.getClass().getSimpleName();
        }
    }

    private static String safeDiagnosticText(String str) {
        if (str == null) {
            return "none";
        }
        String replace = str.replace('\n', ' ').replace('\r', ' ');
        return replace.length() <= 512 ? replace : replace.substring(0, 512);
    }

    private static void initializeTelemetry(Context context) {
        try {
            SquadySentry.initialize(context.getApplicationContext());
        } catch (LinkageError unused) {
        }
    }

    public static void setLogCallback(LogCallback logCallback) {
        setLogCallbackNative(logCallback);
        List emptyList = Collections.emptyList();
        synchronized (EXIT_DIAGNOSTIC_LOG_LOCK) {
            sLogCallback = logCallback;
            if (logCallback != null) {
                ArrayDeque<String> arrayDeque = PENDING_EXIT_DIAGNOSTICS;
                if (!arrayDeque.isEmpty()) {
                    emptyList = new ArrayList(arrayDeque);
                    arrayDeque.clear();
                }
            }
        }
        if (logCallback != null) {
            Iterator it = emptyList.iterator();
            while (it.hasNext()) {
                notifyLogCallback(logCallback, (String) it.next());
            }
        }
    }

    public static String getBuildInfo() {
        return getBuildInfoNative();
    }

    public static String[] listGpuDevices() {
        return listGpuDevicesNative();
    }

    public boolean setDevice(int i) {
        return setDeviceNative(this.mHandle, i);
    }

    public String getCurrentDevice() {
        return getCurrentDeviceNative(this.mHandle);
    }

    public void cancel() {
        cancel(this.mHandle);
    }

    public boolean run(Uri uri, Uri uri2, String str, String str2, JSONObject jSONObject, ProgressCallback progressCallback) {
        this.mCallback = progressCallback;
        try {
            boolean run = run(this.mHandle, uri, uri2, str, str2, jSONObject != null ? jSONObject.toString() : "{}", progressCallback);
            if (!run) {
                captureTelemetryMessage("render_start_failed", "Native render did not start");
            }
            return run;
        } catch (Error | RuntimeException e) {
            captureTelemetryError("render_start_exception", e);
            throw e;
        }
    }

    private void onProgressUpdate(float f) {
        ProgressCallback progressCallback = this.mCallback;
        if (progressCallback != null) {
            progressCallback.onProgress(f);
        }
    }

    private void onProgressUpdate(float f, String str) {
        ProgressCallback progressCallback = this.mCallback;
        if (progressCallback != null) {
            progressCallback.onProgress(f, str);
        }
    }

    private void onComplete(boolean z) {
        ProgressCallback progressCallback = this.mCallback;
        if (progressCallback != null) {
            progressCallback.onComplete(z);
        }
    }

    private void onError(String str) {
        HashMap hashMap = new HashMap();
        hashMap.put("stabilizer.error", redactTelemetryText(str));
        captureTelemetryMessage("render_error", "Native stabilization failed", hashMap);
        ProgressCallback progressCallback = this.mCallback;
        if (progressCallback != null) {
            progressCallback.onError(str);
        }
    }

    private static void captureTelemetryError(String str, Throwable th) {
        try {
            SquadySentry.captureError("stabilizer", str, th);
        } catch (LinkageError unused) {
        }
    }

    private static void captureTelemetryMessage(String str, String str2) {
        captureTelemetryMessage(str, str2, Collections.emptyMap());
    }

    private static void captureTelemetryMessage(String str, String str2, Map<String, String> map) {
        try {
            SquadySentry.captureMessage("stabilizer", str, str2, SquadySentry.Level.ERROR, Collections.singletonMap("sdk.platform", "android"), map);
        } catch (LinkageError unused) {
        }
    }

    private static String redactTelemetryText(String str) {
        if (str == null || str.isEmpty()) {
            return "unknown";
        }
        String replaceAll = str.replaceAll("(?i)(token|bearer|authorization)(\\s*[:=]\\s*)\\S+", "$1$2[REDACTED]").replaceAll("(?i)(content|file)://\\S+", "[URI]").replaceAll("(?<![A-Za-z0-9_])/(?:[^\\s/]+/)+[^\\s]+", "[PATH]");
        return replaceAll.length() <= 512 ? replaceAll : replaceAll.substring(0, 512);
    }
}
