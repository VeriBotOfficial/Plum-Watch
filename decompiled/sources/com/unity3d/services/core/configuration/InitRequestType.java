package com.unity3d.services.core.configuration;

import com.qumeng.overseas.advlib.__remote__.core.proto.response.presenter.helper.b;

/* loaded from: classes2.dex */
public enum InitRequestType {
    PRIVACY(b.f12848a),
    TOKEN("token_srr");

    private String _callType;

    InitRequestType(String str) {
        this._callType = str;
    }

    public String getCallType() {
        return this._callType;
    }
}
