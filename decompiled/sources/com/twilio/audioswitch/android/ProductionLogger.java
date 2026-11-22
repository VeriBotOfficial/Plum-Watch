package com.twilio.audioswitch.android;

import android.util.Log;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ProductionLogger.kt */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u0003\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u000f\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tH\u0002J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J\u0018\u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016J \u0010\u000e\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000f\u001a\u00020\u0010H\u0016J\u0018\u0010\u0011\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\tH\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\u0004¨\u0006\u0012"}, d2 = {"Lcom/twilio/audioswitch/android/ProductionLogger;", "Lcom/twilio/audioswitch/android/Logger;", "loggingEnabled", "", "(Z)V", "getLoggingEnabled", "()Z", "setLoggingEnabled", "createTag", "", "tag", "d", "", "message", "e", "throwable", "", "w", "audioswitch_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes2.dex */
public final class ProductionLogger implements Logger {
    private boolean loggingEnabled;

    public ProductionLogger() {
        this(false, 1, null);
    }

    public ProductionLogger(boolean z) {
        this.loggingEnabled = z;
    }

    public /* synthetic */ ProductionLogger(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }

    @Override // com.twilio.audioswitch.android.Logger
    public boolean getLoggingEnabled() {
        return this.loggingEnabled;
    }

    @Override // com.twilio.audioswitch.android.Logger
    public void setLoggingEnabled(boolean z) {
        this.loggingEnabled = z;
    }

    @Override // com.twilio.audioswitch.android.Logger
    public void d(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (getLoggingEnabled()) {
            Log.d(createTag(tag), message);
        }
    }

    @Override // com.twilio.audioswitch.android.Logger
    public void w(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (getLoggingEnabled()) {
            Log.w(createTag(tag), message);
        }
    }

    @Override // com.twilio.audioswitch.android.Logger
    public void e(String tag, String message) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        if (getLoggingEnabled()) {
            Log.e(createTag(tag), message);
        }
    }

    @Override // com.twilio.audioswitch.android.Logger
    public void e(String tag, String message, Throwable throwable) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(message, "message");
        Intrinsics.checkNotNullParameter(throwable, "throwable");
        if (getLoggingEnabled()) {
            Log.e(createTag(tag), message, throwable);
        }
    }

    private final String createTag(String tag) {
        return "AS/" + tag;
    }
}
