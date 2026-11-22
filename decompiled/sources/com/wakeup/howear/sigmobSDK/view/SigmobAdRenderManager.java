package com.wakeup.howear.sigmobSDK.view;

import android.app.Activity;
import android.gov.nist.javax.sip.header.ParameterNames;
import android.view.ViewGroup;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.nativead.entity.NativeAdItemEntity;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.xmind.core.ITopic;

/* compiled from: SigmobAdRenderManager.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u0000 \u00042\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/wakeup/howear/sigmobSDK/view/SigmobAdRenderManager;", "", "<init>", "()V", "Companion", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SigmobAdRenderManager {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    private static final float DEFAULT_ASPECT_RATIO = 1.3333334f;
    public static final String TAG = "SigmobAdRenderManager";

    /* compiled from: SigmobAdRenderManager.kt */
    @Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003JO\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000f2!\u0010\u0010\u001a\u001d\u0012\u0013\u0012\u00110\u0012¢\u0006\f\b\u0013\u0012\b\b\u0014\u0012\u0004\b\b(\u0015\u0012\u0004\u0012\u00020\t0\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\u0017R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lcom/wakeup/howear/sigmobSDK/view/SigmobAdRenderManager$Companion;", "", "<init>", "()V", "TAG", "", "DEFAULT_ASPECT_RATIO", "", ParameterNames.RENDER, "", ITopic.ROOT, "Landroid/view/ViewGroup;", "width", "", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "adCallback", "Lkotlin/Function1;", "Lcom/wakeup/common/nativead/entity/NativeAdItemEntity;", "Lkotlin/ParameterName;", "name", "data", "updateUi", "Lkotlin/Function0;", "app_wpOverseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final void render(ViewGroup root, int width, Activity activity, Function1<? super NativeAdItemEntity, Unit> adCallback, Function0<Unit> updateUi) {
            Intrinsics.checkNotNullParameter(root, "root");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intrinsics.checkNotNullParameter(adCallback, "adCallback");
            Intrinsics.checkNotNullParameter(updateUi, "updateUi");
        }

        private Companion() {
        }
    }
}
