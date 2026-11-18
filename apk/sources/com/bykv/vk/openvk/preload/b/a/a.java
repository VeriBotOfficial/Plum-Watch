package com.bykv.vk.openvk.preload.b.a;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: compiled from: ParallelException.java */
/* JADX INFO: loaded from: classes15.dex */
public final class a extends Exception {
    public a(List<Throwable> list) {
        if (list.isEmpty()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<Throwable> it = list.iterator();
        while (it.hasNext()) {
            a(it.next(), arrayList);
        }
        setStackTrace((StackTraceElement[]) arrayList.toArray(new StackTraceElement[arrayList.size()]));
    }

    private static void a(Throwable th, List<StackTraceElement> list) {
        while (th != null) {
            StackTraceElement[] stackTrace = th.getStackTrace();
            int length = stackTrace.length;
            for (int r2 = 0; r2 < length; r2++) {
                StackTraceElement stackTraceElement = stackTrace[r2];
                if (r2 == 0) {
                    String message = th.getMessage();
                    StringBuilder sb = new StringBuilder("\b\b\b\nCaused by:");
                    if (message == null) {
                        message = "";
                    }
                    list.add(new StackTraceElement(sb.append(message).append("\n\t").append(stackTraceElement.getClassName()).toString(), stackTraceElement.getMethodName(), stackTraceElement.getFileName(), stackTraceElement.getLineNumber()));
                } else {
                    list.add(stackTraceElement);
                }
            }
            th = th.getCause();
        }
    }
}
