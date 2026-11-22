package com.hp.hpl.sparta;

/* loaded from: classes12.dex */
public interface ParseSource {
    public static final ParseLog DEFAULT_LOG = new DefaultLog();
    public static final int MAXLOOKAHEAD = "<?xml version=\"1.0\" encoding=\"\"".length() + 40;

    int getLineNumber();

    String getSystemId();

    String toString();
}
