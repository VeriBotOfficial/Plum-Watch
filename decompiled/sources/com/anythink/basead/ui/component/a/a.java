package com.anythink.basead.ui.component.a;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import com.anythink.basead.ui.ScanningAnimButton;

/* loaded from: classes11.dex */
public abstract class a implements d {

    /* renamed from: a, reason: collision with root package name */
    protected ScanningAnimButton f3230a;
    protected ScanningAnimButton b;

    @Override // com.anythink.basead.ui.component.a.d
    public void a(ViewGroup viewGroup) {
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void a(Drawable drawable) {
        if (this.f3230a == null || drawable == null) {
            return;
        }
        try {
            this.f3230a.setBackground(drawable);
        } catch (Throwable unused) {
        }
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final void a(String str) {
        ScanningAnimButton scanningAnimButton = this.f3230a;
        if (scanningAnimButton != null) {
            scanningAnimButton.setText(str);
        }
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final String a() {
        ScanningAnimButton scanningAnimButton = this.f3230a;
        if (scanningAnimButton != null) {
            scanningAnimButton.getText().toString();
            return "";
        }
        return "";
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final View b() {
        return this.f3230a;
    }

    @Override // com.anythink.basead.ui.component.a.d
    public final View c() {
        return this.b;
    }
}
