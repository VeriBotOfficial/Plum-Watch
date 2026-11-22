package io.appmetrica.analytics.networktasks.internal;

import android.net.Uri;

/* loaded from: classes6.dex */
public class NetworkTaskForSendingDataParamsAppender {

    /* renamed from: a, reason: collision with root package name */
    private final RequestBodyEncrypter f18688a;

    public NetworkTaskForSendingDataParamsAppender(RequestBodyEncrypter requestBodyEncrypter) {
        this.f18688a = requestBodyEncrypter;
    }

    public void appendEncryptedData(Uri.Builder builder) {
        if (this.f18688a.getEncryptionMode() == RequestBodyEncryptionMode.AES_RSA) {
            builder.appendQueryParameter(CommonUrlParts.ENCRYPTED_REQUEST, "1");
        }
    }
}
