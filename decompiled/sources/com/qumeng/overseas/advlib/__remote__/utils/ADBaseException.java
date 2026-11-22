package com.qumeng.overseas.advlib.__remote__.utils;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes17.dex */
public class ADBaseException extends Exception {
    private Map<String, Object> mMap;

    public ADBaseException(String str) {
        super(str);
        this.mMap = new HashMap();
        exceptionInit(str, null);
    }

    private void exceptionInit(String str, Throwable th) {
        if (th != null) {
            initCause(th);
        }
        sweepStack();
    }

    private void sweepStack() {
        try {
            StackTraceElement[] stackTrace = getStackTrace();
            if (stackTrace.length > 1) {
                int i = 0;
                String className = stackTrace[0].getClassName();
                while (i < stackTrace.length && className.equals(stackTrace[i].getClassName())) {
                    i++;
                }
                setStackTrace((StackTraceElement[]) Arrays.copyOfRange(stackTrace, i, stackTrace.length));
            }
        } catch (Exception e) {
            e.printStackTrace();
            com.qumeng.overseas.advlib.__remote__.utils.bugman.a.a(this, "exp_ADBaseException_sweepStack", e);
        }
    }

    protected final Object getStashObject(String str) {
        return this.mMap.get(str);
    }

    public ADBaseException(String str, Throwable th, Map.Entry<String, Object>... entryArr) {
        super(str);
        this.mMap = new HashMap();
        for (Map.Entry<String, Object> entry : entryArr) {
            if (entry != null) {
                String key = entry.getKey();
                Object value = entry.getValue();
                if (key != null && value != null) {
                    this.mMap.put(key, value);
                }
            }
        }
        exceptionInit(str, th);
    }
}
