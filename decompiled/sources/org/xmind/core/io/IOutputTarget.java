package org.xmind.core.io;

import java.io.IOException;
import java.io.OutputStream;

/* loaded from: classes7.dex */
public interface IOutputTarget {
    OutputStream getEntryStream(String str);

    boolean isEntryAvaialble(String str);

    OutputStream openEntryStream(String str) throws IOException;

    void setEntryTime(String str, long j);
}
