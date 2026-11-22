package com.apm.insight.b;

import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.huawei.hms.push.constant.RemoteMessageConst;
import com.yandex.div.core.ScrollDirection;
import java.lang.reflect.Field;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LooperUtil.java */
/* loaded from: classes12.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    private static MessageQueue f6006a;
    private static Field b;
    private static Field c;

    public static MessageQueue a() {
        if (f6006a == null && Looper.getMainLooper() != null) {
            Looper mainLooper = Looper.getMainLooper();
            if (mainLooper == Looper.myLooper()) {
                f6006a = Looper.myQueue();
            } else {
                f6006a = mainLooper.getQueue();
            }
        }
        return f6006a;
    }

    public static Message a(MessageQueue messageQueue) {
        Field field = b;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.MessageQueue").getDeclaredField("mMessages");
                b = declaredField;
                declaredField.setAccessible(true);
                return (Message) b.get(messageQueue);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(messageQueue);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static Message a(Message message) {
        Field field = c;
        if (field == null) {
            try {
                Field declaredField = Class.forName("android.os.Message").getDeclaredField(ScrollDirection.NEXT);
                c = declaredField;
                declaredField.setAccessible(true);
                return (Message) c.get(message);
            } catch (Exception unused) {
                return null;
            }
        }
        try {
            return (Message) field.get(message);
        } catch (Exception unused2) {
            return null;
        }
    }

    private static JSONObject a(Message message, long j) {
        JSONObject jSONObject = new JSONObject();
        if (message != null) {
            try {
                jSONObject.put(RemoteMessageConst.Notification.WHEN, message.getWhen() - j);
                if (message.getCallback() != null) {
                    jSONObject.put("callback", String.valueOf(message.getCallback()));
                }
                jSONObject.put("what", message.what);
                if (message.getTarget() != null) {
                    jSONObject.put("target", String.valueOf(message.getTarget()));
                } else {
                    jSONObject.put("barrier", message.arg1);
                }
                jSONObject.put("arg1", message.arg1);
                jSONObject.put("arg2", message.arg2);
                if (message.obj != null) {
                    jSONObject.put(MapBundleKey.MapObjKey.OBJ_SL_OBJ, message.obj);
                    return jSONObject;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        return jSONObject;
    }

    public static JSONArray a(long j) {
        MessageQueue a2 = a();
        JSONArray jSONArray = new JSONArray();
        if (a2 != null) {
            try {
                synchronized (a2) {
                    Message a3 = a(a2);
                    if (a3 == null) {
                        return jSONArray;
                    }
                    int i = 0;
                    int i2 = 0;
                    while (a3 != null && i < 100) {
                        i++;
                        i2++;
                        JSONObject a4 = a(a3, j);
                        try {
                            a4.put("id", i2);
                        } catch (JSONException unused) {
                        }
                        jSONArray.put(a4);
                        a3 = a(a3);
                    }
                }
            } catch (Throwable th) {
                com.apm.insight.c.a();
                com.apm.insight.runtime.j.a(th, "NPTH_CATCH");
                return jSONArray;
            }
        }
        return jSONArray;
    }
}
