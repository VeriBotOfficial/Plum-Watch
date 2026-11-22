package io.agora.meta.internal;

import io.agora.meta.AvatarModelInfo;
import io.agora.meta.ILocalUserAvatar;
import io.agora.meta.MetaUserInfo;

/* loaded from: classes6.dex */
public class LocalUserAvatarImpl implements ILocalUserAvatar {
    private long mNativeHandle;

    LocalUserAvatarImpl(long nativeHandle) {
        this.mNativeHandle = nativeHandle;
    }

    private native int nativeApplyInfo(long nativeLocalUserAvatarAndroid);

    private native byte[] nativeGetExtraInfo(long nativeLocalUserAvatarAndroid);

    private native AvatarModelInfo nativeGetModelInfo(long nativeLocalUserAvatarAndroid);

    private native MetaUserInfo nativeGetUserInfo(long nativeLocalUserAvatarAndroid);

    private native int nativeSetExtraInfo(long nativeLocalUserAvatarAndroid, byte[] extraCustomInfo);

    private native int nativeSetModelInfo(long nativeLocalUserAvatarAndroid, AvatarModelInfo modelInfo);

    private native int nativeSetUserInfo(long nativeLocalUserAvatarAndroid, MetaUserInfo userInfo);

    @Override // io.agora.meta.ILocalUserAvatar
    public int applyInfo() {
        return nativeApplyInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public byte[] getExtraInfo() {
        return nativeGetExtraInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public AvatarModelInfo getModelInfo() {
        return nativeGetModelInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public MetaUserInfo getUserInfo() {
        return nativeGetUserInfo(this.mNativeHandle);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public int setExtraInfo(byte[] extraInfo) {
        return nativeSetExtraInfo(this.mNativeHandle, extraInfo);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public int setModelInfo(AvatarModelInfo modelInfo) {
        return nativeSetModelInfo(this.mNativeHandle, modelInfo);
    }

    @Override // io.agora.meta.ILocalUserAvatar
    public int setUserInfo(MetaUserInfo userInfo) {
        return nativeSetUserInfo(this.mNativeHandle, userInfo);
    }
}
