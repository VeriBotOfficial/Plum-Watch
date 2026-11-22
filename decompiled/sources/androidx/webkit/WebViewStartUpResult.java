package androidx.webkit;

import java.util.List;

/* loaded from: classes11.dex */
public interface WebViewStartUpResult {
    List<BlockingStartUpLocation> getBlockingStartUpLocations();

    Long getMaxTimePerTaskInUiThreadMillis();

    Long getTotalTimeInUiThreadMillis();
}
