package androidx.constraintlayout.core.motion.utils;

import android.gov.nist.core.Separators;
import com.baidu.mapapi.UIMsg;
import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/* JADX INFO: loaded from: classes8.dex */
public class Utils {
    static DebugHandle ourHandle;

    public interface DebugHandle {
        void message(String str);
    }

    private static int clamp(int r1) {
        int r2 = (r1 & (~(r1 >> 31))) + UIMsg.m_AppUI.V_WM_ADDLISTUPDATE;
        return (r2 & (r2 >> 31)) + 255;
    }

    public static void log(String str, String str2) {
        System.out.println(str + " : " + str2);
    }

    public static void loge(String str, String str2) {
        System.err.println(str + " : " + str2);
    }

    public static void socketSend(String str) {
        try {
            OutputStream outputStream = new Socket("127.0.0.1", 5327).getOutputStream();
            outputStream.write(str.getBytes());
            outputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public int getInterpolatedColor(float[] fArr) {
        return (clamp((int) (fArr[3] * 255.0f)) << 24) | (clamp((int) (((float) Math.pow(fArr[0], 0.45454545454545453d)) * 255.0f)) << 16) | (clamp((int) (((float) Math.pow(fArr[1], 0.45454545454545453d)) * 255.0f)) << 8) | clamp((int) (((float) Math.pow(fArr[2], 0.45454545454545453d)) * 255.0f));
    }

    public static int rgbaTocColor(float f, float f2, float f3, float f4) {
        int r1 = clamp((int) (f * 255.0f));
        int r2 = clamp((int) (f2 * 255.0f));
        return (r1 << 16) | (clamp((int) (f4 * 255.0f)) << 24) | (r2 << 8) | clamp((int) (f3 * 255.0f));
    }

    public static void setDebugHandle(DebugHandle debugHandle) {
        ourHandle = debugHandle;
    }

    public static void logStack(String str, int r8) {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        int r9 = Math.min(r8, stackTrace.length - 1);
        String str2 = " ";
        for (int r2 = 1; r2 <= r9; r2++) {
            StackTraceElement stackTraceElement = stackTrace[r2];
            str2 = str2 + " ";
            System.out.println(str + str2 + (".(" + stackTrace[r2].getFileName() + ":" + stackTrace[r2].getLineNumber() + ") " + stackTrace[r2].getMethodName()) + str2);
        }
    }

    public static void log(String str) {
        StackTraceElement stackTraceElement = new Throwable().getStackTrace()[1];
        String str2 = ".(" + stackTraceElement.getFileName() + ":" + stackTraceElement.getLineNumber() + Separators.RPAREN + "    ".substring(Integer.toString(stackTraceElement.getLineNumber()).length()) + (stackTraceElement.getMethodName() + "                  ").substring(0, 17);
        System.out.println(str2 + " " + str);
        DebugHandle debugHandle = ourHandle;
        if (debugHandle != null) {
            debugHandle.message(str2 + " " + str);
        }
    }
}
