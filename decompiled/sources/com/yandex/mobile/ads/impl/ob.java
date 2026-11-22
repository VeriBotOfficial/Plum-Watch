package com.yandex.mobile.ads.impl;

import android.app.Dialog;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.mobile.ads.R;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class ob {

    /* renamed from: a, reason: collision with root package name */
    private final ac f16432a;
    private final zq0 b;

    private static final class a implements View.OnClickListener {

        /* renamed from: a, reason: collision with root package name */
        private final Dialog f16433a;
        private final zq0 b;

        public a(Dialog dialog, zq0 keyboardUtils) {
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
            this.f16433a = dialog;
            this.b = keyboardUtils;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intrinsics.checkNotNullParameter(view, "view");
            this.b.getClass();
            zq0.a(view);
            n10.a(this.f16433a);
        }
    }

    private static final class b implements View.OnTouchListener {

        /* renamed from: a, reason: collision with root package name */
        private final View f16434a;
        private final Dialog b;
        private final zq0 c;
        private float d;

        public b(ViewGroup adTuneContainer, Dialog dialog, zq0 keyboardUtils) {
            Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
            Intrinsics.checkNotNullParameter(dialog, "dialog");
            Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
            this.f16434a = adTuneContainer;
            this.b = dialog;
            this.c = keyboardUtils;
        }

        @Override // android.view.View.OnTouchListener
        public final boolean onTouch(View view, MotionEvent event) {
            Intrinsics.checkNotNullParameter(view, "view");
            Intrinsics.checkNotNullParameter(event, "event");
            float rawY = event.getRawY();
            int action = event.getAction();
            if (action == 0) {
                this.d = rawY;
                return true;
            }
            if (action != 1) {
                if (action != 2) {
                    return false;
                }
                float f = this.d;
                if (rawY > f) {
                    this.f16434a.setTranslationY(rawY - f);
                } else {
                    this.f16434a.setTranslationY(0.0f);
                }
            } else if (rawY > this.d) {
                this.c.getClass();
                zq0.a(view);
                n10.a(this.b);
            }
            return true;
        }
    }

    public final void a(ViewGroup adTuneContainer, Dialog dialog) {
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        Intrinsics.checkNotNullParameter(dialog, "dialog");
        this.f16432a.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        View findViewById = adTuneContainer.findViewById(R.id.adtune_drag_view_container);
        if (findViewById != null) {
            findViewById.setOnTouchListener(new b(adTuneContainer, dialog, this.b));
        }
        this.f16432a.getClass();
        Intrinsics.checkNotNullParameter(adTuneContainer, "adTuneContainer");
        ViewGroup viewGroup = (ViewGroup) adTuneContainer.findViewById(R.id.adtune_background_view);
        if (viewGroup != null) {
            viewGroup.setOnClickListener(new a(dialog, this.b));
        }
    }

    public /* synthetic */ ob() {
        this(new ac(), new zq0());
    }

    public ob(ac adtuneViewProvider, zq0 keyboardUtils) {
        Intrinsics.checkNotNullParameter(adtuneViewProvider, "adtuneViewProvider");
        Intrinsics.checkNotNullParameter(keyboardUtils, "keyboardUtils");
        this.f16432a = adtuneViewProvider;
        this.b = keyboardUtils;
    }
}
