package com.wakeup.howear.view.device.home.adapter;

import android.view.View;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DebounceClickListener.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001B\u0011\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH&J\u0010\u0010\u000b\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\nH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lcom/wakeup/howear/view/device/home/adapter/DebounceClickListener;", "Landroid/view/View$OnClickListener;", "debounceTime", "", "<init>", "(J)V", "lastClickTime", "onDebouncedClick", "", "v", "Landroid/view/View;", "onClick", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class DebounceClickListener implements View.OnClickListener {
    private final long debounceTime;
    private long lastClickTime;

    public DebounceClickListener() {
        this(0L, 1, null);
    }

    public abstract void onDebouncedClick(View v);

    public DebounceClickListener(long j) {
        this.debounceTime = j;
    }

    public /* synthetic */ DebounceClickListener(long j, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? 800L : j);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View v) {
        Intrinsics.checkNotNullParameter(v, "v");
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - this.lastClickTime > this.debounceTime) {
            onDebouncedClick(v);
            this.lastClickTime = currentTimeMillis;
        }
    }
}
