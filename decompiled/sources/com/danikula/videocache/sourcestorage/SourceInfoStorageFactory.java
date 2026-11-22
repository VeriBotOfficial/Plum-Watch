package com.danikula.videocache.sourcestorage;

import android.content.Context;

/* loaded from: classes14.dex */
public class SourceInfoStorageFactory {
    public static SourceInfoStorage newSourceInfoStorage(Context context) {
        return new DatabaseSourceInfoStorage(context);
    }

    public static SourceInfoStorage newEmptySourceInfoStorage() {
        return new NoSourceInfoStorage();
    }
}
