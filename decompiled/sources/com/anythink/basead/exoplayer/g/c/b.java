package com.anythink.basead.exoplayer.g.c;

import com.anythink.basead.exoplayer.g.a;

/* loaded from: classes11.dex */
public abstract class b implements a.InterfaceC0141a {
    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public String toString() {
        return "SCTE-35 splice command: type=" + getClass().getSimpleName();
    }
}
