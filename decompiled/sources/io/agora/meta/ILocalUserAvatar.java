package io.agora.meta;

/* loaded from: classes6.dex */
public interface ILocalUserAvatar {
    int applyInfo();

    byte[] getExtraInfo();

    AvatarModelInfo getModelInfo();

    MetaUserInfo getUserInfo();

    int setExtraInfo(byte[] extraInfo);

    int setModelInfo(AvatarModelInfo modelInfo);

    int setUserInfo(MetaUserInfo userInfo);
}
