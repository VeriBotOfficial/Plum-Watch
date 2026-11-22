package com.qumeng.overseas.advlib.__remote__.ui.elements;

import android.content.Context;
import com.qumeng.overseas.advlib.__remote__.core.proto.utils.x;
import com.qumeng.overseas.advlib.__remote__.ui.banner.json2view.view.view.overrideview.DownloadBar2;
import com.qumeng.overseas.advlib.__remote__.ui.elements.IProgressIndicator;
import java.util.Observer;

/* loaded from: classes17.dex */
public abstract class q extends com.qumeng.overseas.advlib.__remote__.ui.incite.g implements Observer, IProgressIndicator {

    class a extends x.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ float f13127a;

        a(float f) {
            this.f13127a = f;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.core.proto.utils.x.c
        public void Run() {
            q.this.setProgress(this.f13127a);
        }
    }

    class b extends x.c {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ IProgressIndicator.ProgressIndicatorState f13128a;
        final /* synthetic */ float b;

        b(IProgressIndicator.ProgressIndicatorState progressIndicatorState, float f) {
            this.f13128a = progressIndicatorState;
            this.b = f;
        }

        @Override // com.qumeng.overseas.advlib.__remote__.core.proto.utils.x.c
        public void Run() {
            q.this.setProgressAndState(this.f13128a, this.b);
        }
    }

    public q(Context context) {
        super(context);
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.IProgressIndicator
    public void asyncSetProgress(float f) {
        com.qumeng.overseas.advlib.__remote__.core.proto.utils.p.a(new a(f));
    }

    @Override // com.qumeng.overseas.advlib.__remote__.ui.elements.IProgressIndicator
    public void asyncSetProgressAndState(IProgressIndicator.ProgressIndicatorState progressIndicatorState, float f) {
        com.qumeng.overseas.advlib.__remote__.core.proto.utils.p.a(new b(progressIndicatorState, f));
    }

    public abstract void bindDownloadListener(String str);

    public DownloadBar2 getDownloadBar() {
        return null;
    }

    public void setDialogLocationX(int i) {
        getWindow().getAttributes().x = i;
    }

    public void setDialogLocationY(int i) {
        getWindow().getAttributes().y = i;
    }
}
