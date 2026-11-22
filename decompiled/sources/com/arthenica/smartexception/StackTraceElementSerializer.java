package com.arthenica.smartexception;

/* loaded from: classes12.dex */
public interface StackTraceElementSerializer {
    String getModuleName(StackTraceElement stackTraceElement);

    String getNativeMethodDefinition();

    String getPackageInformation(StackTraceElement stackTraceElement);

    String getUnknownSourceDefinition();

    String toString(StackTraceElement stackTraceElement, boolean z, boolean z2);
}
