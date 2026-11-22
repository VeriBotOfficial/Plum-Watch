package io.agora.meta;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class AvatarModelInfo {
    public String mBundleCode;
    public boolean mLocalVisible;
    public boolean mRemoteVisible;
    public boolean mSyncPosition;

    public AvatarModelInfo() {
        this.mBundleCode = "";
        this.mLocalVisible = false;
        this.mRemoteVisible = false;
        this.mSyncPosition = false;
    }

    public AvatarModelInfo(String bundleCode, boolean localVisible, boolean remoteVisible, boolean syncPosition) {
        this.mBundleCode = bundleCode;
        this.mLocalVisible = localVisible;
        this.mRemoteVisible = remoteVisible;
        this.mSyncPosition = syncPosition;
    }

    public String getBundleCode() {
        return this.mBundleCode;
    }

    public boolean getLocalVisible() {
        return this.mLocalVisible;
    }

    public boolean getRemoteVisible() {
        return this.mRemoteVisible;
    }

    public boolean getSyncPosition() {
        return this.mSyncPosition;
    }

    public String toString() {
        return "AvatarModelInfo{mBundleCode='" + this.mBundleCode + "', mLocalVisible=" + this.mLocalVisible + ", mRemoteVisible=" + this.mRemoteVisible + ", mSyncPosition=" + this.mSyncPosition + AbstractJsonLexerKt.END_OBJ;
    }
}
