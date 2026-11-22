package io.livekit.android.room;

import java.net.URI;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: RegionUrlProvider.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0001H\u0007\u001a\u0016\u0010\u0005\u001a\u00020\u0006*\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\bH\u0000\u001a\f\u0010\t\u001a\u00020\u0001*\u00020\u0006H\u0000\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"regionUrlProviderTesting", "", "setRegionUrlProviderTesting", "", "enable", "getCloudConfigUrl", "Ljava/net/URI;", "appendPath", "", "isLKCloud", "livekit-android-sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class RegionUrlProviderKt {
    private static boolean regionUrlProviderTesting;

    public static final boolean isLKCloud(URI uri) {
        Intrinsics.checkNotNullParameter(uri, "<this>");
        if (regionUrlProviderTesting) {
            return true;
        }
        if (uri.getHost() != null) {
            String host = uri.getHost();
            Intrinsics.checkNotNullExpressionValue(host, "getHost(...)");
            if (StringsKt.endsWith$default(host, ".livekit.cloud", false, 2, (Object) null)) {
                return true;
            }
            String host2 = uri.getHost();
            Intrinsics.checkNotNullExpressionValue(host2, "getHost(...)");
            if (StringsKt.endsWith$default(host2, ".livekit.run", false, 2, (Object) null)) {
                return true;
            }
        }
        return false;
    }

    public static /* synthetic */ URI getCloudConfigUrl$default(URI uri, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            str = "";
        }
        return getCloudConfigUrl(uri, str);
    }

    public static final URI getCloudConfigUrl(URI uri, String appendPath) {
        String scheme;
        Intrinsics.checkNotNullParameter(uri, "<this>");
        Intrinsics.checkNotNullParameter(appendPath, "appendPath");
        String scheme2 = uri.getScheme();
        Intrinsics.checkNotNullExpressionValue(scheme2, "getScheme(...)");
        if (StringsKt.startsWith$default(scheme2, "ws", false, 2, (Object) null)) {
            String scheme3 = uri.getScheme();
            Intrinsics.checkNotNullExpressionValue(scheme3, "getScheme(...)");
            scheme = StringsKt.replaceFirst$default(scheme3, "ws", "http", false, 4, (Object) null);
        } else {
            scheme = uri.getScheme();
        }
        return new URI(scheme, null, uri.getHost(), uri.getPort(), "/settings" + appendPath, null, null);
    }

    public static final void setRegionUrlProviderTesting(boolean z) {
        regionUrlProviderTesting = z;
    }
}
