package com.qumeng.overseas.advlib.__remote__.utils;

import java.util.List;
import java.util.Map;
import org.json.JSONObject;

/* JADX INFO: loaded from: classes2.dex */
public class q {
    /* JADX WARN: Multi-variable type inference failed */
    public static <T> boolean a(T t) {
        if (t == 0) {
            return true;
        }
        if (t instanceof String) {
            return ((String) t).length() == 0;
        }
        if (t instanceof List) {
            if (((List) t).size() == 0) {
                return true;
            }
        } else if (t instanceof Map) {
            if (((Map) t).size() == 0) {
                return true;
            }
        } else if (t instanceof JSONObject) {
            if (((JSONObject) t).length() == 0) {
                return true;
            }
        } else if ((t instanceof Object[]) && ((Object[]) t).length == 0) {
            return true;
        }
        return false;
    }

    public static <T> boolean b(T t) {
        return !a(t);
    }

    public static <T> T c(T t) {
        t.getClass();
        return t;
    }

    public static <T> boolean a(Object... objArr) {
        if (objArr == null) {
            return false;
        }
        for (Object obj : objArr) {
            if (a(obj)) {
                return false;
            }
        }
        return true;
    }
}
