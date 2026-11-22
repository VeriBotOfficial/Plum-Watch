package com.qumeng.overseas.advlib.__remote__.core.proto.utils;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import io.nats.client.support.ApiConstants;
import java.lang.ref.SoftReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes17.dex */
public class j {

    /* renamed from: a, reason: collision with root package name */
    private SoftReference<Context> f12858a;

    public j(Context context) {
        this.f12858a = new SoftReference<>(context);
    }

    public boolean a(String str) {
        char c;
        ArrayMap<String, String> h = z.h(str);
        if (h.get("target").equals("goUquLive")) {
            try {
                String str2 = "";
                Bundle bundle = new Bundle();
                for (String str3 : h.keySet()) {
                    int hashCode = str3.hashCode();
                    if (hashCode == -880905839) {
                        if (str3.equals("target")) {
                            c = 0;
                        }
                        c = 65535;
                    } else if (hashCode != 3575610) {
                        if (hashCode == 111972721 && str3.equals("value")) {
                            c = 1;
                        }
                        c = 65535;
                    } else {
                        if (str3.equals("type")) {
                            c = 2;
                        }
                        c = 65535;
                    }
                    if (c != 0) {
                        if (c == 1) {
                            str2 = h.get(str3);
                        } else if (c != 2) {
                            bundle.putString(str3, h.get(str3));
                        } else {
                            bundle.putInt("type", b0.c(h.get(str3)) ? Integer.valueOf(h.get(str3)).intValue() : 2);
                        }
                    }
                }
                a(this.f12858a.get(), str2, bundle);
                return true;
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e2) {
                e2.printStackTrace();
            } catch (NoSuchMethodException e3) {
                e3.printStackTrace();
            } catch (InvocationTargetException e4) {
                e4.printStackTrace();
            }
        }
        return false;
    }

    public void a(Context context, String str, Bundle bundle) throws InvocationTargetException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        Class<?> cls = Class.forName("com.jifen.framework.router.Router");
        Class<?> cls2 = Class.forName("com.jifen.framework.router.IRouter");
        Method method = cls2.getMethod("with", Bundle.class);
        Method method2 = cls2.getMethod(ApiConstants.GO, Context.class);
        Object invoke = cls.getMethod("build", String.class).invoke(null, str);
        method.invoke(invoke, bundle);
        method2.invoke(invoke, context);
    }
}
