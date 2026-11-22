package com.wakeup.howear;

import android.app.Activity;
import android.view.View;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DialMainNativeAdHelper.kt */
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005J\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007J\b\u0010\b\u001a\u0004\u0018\u00010\u0007J\u0016\u0010\t\u001a\u00020\u00052\u000e\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000bJ\u0010\u0010\f\u001a\u00020\u00052\b\u0010\r\u001a\u0004\u0018\u00010\u0007JL\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\r\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b2\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000b¨\u0006\u0017"}, d2 = {"Lcom/wakeup/howear/DialMainNativeAdHelper;", "", "<init>", "()V", "loadDialMainNativeAd", "", "consumeDialMainReadyAd", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "peekDialMainReadyAd", "setDialMainReadyListener", "listener", "Lkotlin/Function0;", "destroyDialMainNativeAd", "ad", "renderDialMainNativeAd", "Landroid/view/View;", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "width", "", "height", "onImpressed", "onClosed", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class DialMainNativeAdHelper {
    public static final DialMainNativeAdHelper INSTANCE = new DialMainNativeAdHelper();

    public final NativeAdItemEntity consumeDialMainReadyAd() {
        return null;
    }

    public final void destroyDialMainNativeAd(NativeAdItemEntity ad) {
    }

    public final void loadDialMainNativeAd() {
    }

    public final NativeAdItemEntity peekDialMainReadyAd() {
        return null;
    }

    public final View renderDialMainNativeAd(Activity activity, NativeAdItemEntity ad, int width, int height, Function0<Unit> onImpressed, Function0<Unit> onClosed) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(ad, "ad");
        return null;
    }

    public final void setDialMainReadyListener(Function0<Unit> listener) {
    }

    private DialMainNativeAdHelper() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ View renderDialMainNativeAd$default(DialMainNativeAdHelper dialMainNativeAdHelper, Activity activity, NativeAdItemEntity nativeAdItemEntity, int i, int i2, Function0 function0, Function0 function02, int i3, Object obj) {
        if ((i3 & 16) != 0) {
            function0 = null;
        }
        if ((i3 & 32) != 0) {
            function02 = null;
        }
        return dialMainNativeAdHelper.renderDialMainNativeAd(activity, nativeAdItemEntity, i, i2, function0, function02);
    }
}
