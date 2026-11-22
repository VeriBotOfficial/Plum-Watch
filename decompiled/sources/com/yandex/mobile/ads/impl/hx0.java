package com.yandex.mobile.ads.impl;

import com.monetization.ads.nativeads.CustomizableMediaView;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public abstract class hx0 extends vg2<CustomizableMediaView, ex0> {
    private final ox0 c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        public static final a c;
        public static final a d;
        public static final a e;
        public static final a f;
        public static final a g;
        private static final /* synthetic */ a[] h;
        private final String b;

        static {
            a aVar = new a(0, "WEB_VIEW", "webview");
            c = aVar;
            a aVar2 = new a(1, "VIDEO", "video");
            d = aVar2;
            a aVar3 = new a(2, "MULTIBANNER", "multibanner");
            e = aVar3;
            a aVar4 = new a(3, "IMAGE", "image");
            f = aVar4;
            a aVar5 = new a(4, "MEDIATION", "mediation");
            g = aVar5;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4, aVar5};
            h = aVarArr;
            EnumEntriesKt.enumEntries(aVarArr);
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) h.clone();
        }

        private a(int i, String str, String str2) {
            this.b = str2;
        }

        public final String a() {
            return this.b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hx0(CustomizableMediaView mediaView, ox0 mediaViewRenderController) {
        super(mediaView);
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(mediaViewRenderController, "mediaViewRenderController");
        this.c = mediaViewRenderController;
    }

    public abstract void a(CustomizableMediaView customizableMediaView);

    @Override // com.yandex.mobile.ads.impl.vg2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void b(CustomizableMediaView mediaView, ex0 value) {
        Intrinsics.checkNotNullParameter(mediaView, "mediaView");
        Intrinsics.checkNotNullParameter(value, "value");
        this.c.a(mediaView, d());
    }

    public abstract void a(ex0 ex0Var);

    public abstract a d();
}
