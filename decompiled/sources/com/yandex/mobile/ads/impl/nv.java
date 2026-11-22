package com.yandex.mobile.ads.impl;

import android.gov.nist.core.Separators;
import android.widget.CheckBox;
import android.widget.ProgressBar;
import android.widget.TextView;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class nv implements aw0 {

    /* renamed from: a, reason: collision with root package name */
    private final CheckBox f16379a;
    private final ProgressBar b;
    private final TextView c;

    public nv() {
        this(0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nv)) {
            return false;
        }
        nv nvVar = (nv) obj;
        return Intrinsics.areEqual(this.f16379a, nvVar.f16379a) && Intrinsics.areEqual(this.b, nvVar.b) && Intrinsics.areEqual(this.c, nvVar.c);
    }

    public final int hashCode() {
        CheckBox checkBox = this.f16379a;
        int hashCode = (checkBox == null ? 0 : checkBox.hashCode()) * 31;
        ProgressBar progressBar = this.b;
        int hashCode2 = (hashCode + (progressBar == null ? 0 : progressBar.hashCode())) * 31;
        TextView textView = this.c;
        return hashCode2 + (textView != null ? textView.hashCode() : 0);
    }

    public final String toString() {
        return "CustomControlsContainer(muteControl=" + this.f16379a + ", videoProgress=" + this.b + ", countDownProgress=" + this.c + Separators.RPAREN;
    }

    public /* synthetic */ nv(int i) {
        this(null, null, null);
    }

    @Override // com.yandex.mobile.ads.impl.aw0
    public final CheckBox getMuteControl() {
        return this.f16379a;
    }

    @Override // com.yandex.mobile.ads.impl.aw0
    public final ProgressBar getVideoProgress() {
        return this.b;
    }

    public nv(CheckBox checkBox, ProgressBar progressBar, TextView textView) {
        this.f16379a = checkBox;
        this.b = progressBar;
        this.c = textView;
    }

    @Override // com.yandex.mobile.ads.impl.aw0
    public final TextView getCountDownProgress() {
        return this.c;
    }
}
