package com.facebook.common.callercontext;

import javax.annotation.Nullable;

/* loaded from: classes14.dex */
public interface ImageAttribution {
    String getCallingClassName();

    @Nullable
    ContextChain getContextChain();
}
