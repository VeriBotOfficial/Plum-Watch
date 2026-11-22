package io.livekit.android.dagger;

import android.content.Context;
import com.wakeup.common.burypoint.BuryPointPageId;
import io.livekit.android.LiveKitOverrides;
import io.livekit.android.dagger.LiveKitComponent;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: LiveKitComponent.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a\u001c\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0000¨\u0006\u0007"}, d2 = {BuryPointPageId.PAGE_ID_PLAN_CREATE, "Lio/livekit/android/dagger/LiveKitComponent;", "Lio/livekit/android/dagger/LiveKitComponent$Factory;", "context", "Landroid/content/Context;", "overrides", "Lio/livekit/android/LiveKitOverrides;", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LiveKitComponentKt {
    public static final LiveKitComponent create(LiveKitComponent.Factory factory, Context context, LiveKitOverrides overrides) {
        Intrinsics.checkNotNullParameter(factory, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(overrides, "overrides");
        return factory.create(context, new OverridesModule(overrides));
    }
}
