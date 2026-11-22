package com.qumeng.overseas.advlib.__remote__.ui.incite.video;

import android.os.Bundle;
import com.qumeng.overseas.advlib.core.ICliBundle;
import com.qumeng.overseas.advlib.ui.front.InciteVideoListener;

/* loaded from: classes17.dex */
public class i {

    /* renamed from: a, reason: collision with root package name */
    public ICliBundle f13191a;
    public Bundle b;
    public InciteVideoListener c;
    public int d;

    public static class a {

        /* renamed from: a, reason: collision with root package name */
        private i f13192a;

        public a() {
            i iVar = new i();
            this.f13192a = iVar;
            iVar.d = iVar.hashCode();
        }

        public a adContent(ICliBundle iCliBundle) {
            this.f13192a.f13191a = iCliBundle;
            return this;
        }

        public i build() {
            return this.f13192a;
        }

        public a inciteVideoListener(InciteVideoListener inciteVideoListener) {
            this.f13192a.c = inciteVideoListener;
            return this;
        }

        public a params(Bundle bundle) {
            this.f13192a.b = bundle;
            return this;
        }
    }
}
