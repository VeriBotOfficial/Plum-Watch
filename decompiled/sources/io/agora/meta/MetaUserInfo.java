package io.agora.meta;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public class MetaUserInfo {
    public String mUserIconUrl;
    public String mUserId;
    public String mUserName;

    public MetaUserInfo() {
        this.mUserId = "";
        this.mUserName = "";
        this.mUserIconUrl = "";
    }

    public MetaUserInfo(String mUserId, String mUserName, String mUserIconUrl) {
        this.mUserId = mUserId;
        this.mUserName = mUserName;
        this.mUserIconUrl = mUserIconUrl;
    }

    public String getUserIconUrl() {
        return this.mUserIconUrl;
    }

    public String getUserId() {
        return this.mUserId;
    }

    public String getUserName() {
        return this.mUserName;
    }

    public String toString() {
        return "MetaUserInfo{mUserId='" + this.mUserId + "', mUserName='" + this.mUserName + "', mUserIconUrl='" + this.mUserIconUrl + AbstractJsonLexerKt.END_OBJ;
    }
}
