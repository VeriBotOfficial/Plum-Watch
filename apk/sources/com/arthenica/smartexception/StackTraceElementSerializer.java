package com.arthenica.smartexception;

/* JADX INFO: loaded from: classes16.dex */
public interface StackTraceElementSerializer {
    String getModuleName(StackTraceElement stackTraceElement);

    String getNativeMethodDefinition();

    String getPackageInformation(StackTraceElement stackTraceElement);

    String getUnknownSourceDefinition();

    String toString(StackTraceElement stackTraceElement, boolean z, boolean z2);
}
