package com.yandex.mobile.ads.impl;

import android.content.Intent;

/* loaded from: classes5.dex */
public final class bf0 {
    public static Intent a() {
        Intent intent = new Intent("com.google.android.gms.ads.identifier.service.START");
        intent.setPackage("com.google.android.gms");
        return intent;
    }
}
