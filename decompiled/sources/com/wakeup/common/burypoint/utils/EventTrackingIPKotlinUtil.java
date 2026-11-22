package com.wakeup.common.burypoint.utils;

import com.wakeup.common.storage.CacheManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineScopeKt;
import kotlinx.coroutines.Dispatchers;

/* compiled from: EventTrackingIPKotlinUtil.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001a\u0010\u0011\u001a\u00020\u00122\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00120\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0010\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0015"}, d2 = {"Lcom/wakeup/common/burypoint/utils/EventTrackingIPKotlinUtil;", "", "<init>", "()V", "IP", "", "getIP", "()Ljava/lang/String;", "setIP", "(Ljava/lang/String;)V", "videoParam", "", "getVideoParam", "()Z", "setVideoParam", "(Z)V", "TAG", "getIpv4NetIP", "", "callback", "Lkotlin/Function1;", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class EventTrackingIPKotlinUtil {
    private static final String TAG = "EventTrackingIPKotlinUtil";
    public static final EventTrackingIPKotlinUtil INSTANCE = new EventTrackingIPKotlinUtil();
    private static String IP = "";
    private static boolean videoParam = CacheManager.getBoolean("wk_video_prefer_params", false);

    private EventTrackingIPKotlinUtil() {
    }

    public final String getIP() {
        return IP;
    }

    public final void setIP(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        IP = str;
    }

    public final boolean getVideoParam() {
        return videoParam;
    }

    public final void setVideoParam(boolean z) {
        videoParam = z;
    }

    public final void getIpv4NetIP(Function1<? super String, Unit> callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        BuildersKt__Builders_commonKt.launch$default(CoroutineScopeKt.CoroutineScope(Dispatchers.getIO()), null, null, new EventTrackingIPKotlinUtil$getIpv4NetIP$1(callback, null), 3, null);
    }
}
