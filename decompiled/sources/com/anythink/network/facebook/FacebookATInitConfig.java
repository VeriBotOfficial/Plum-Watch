package com.anythink.network.facebook;

import com.anythink.core.api.ATInitConfig;

/* loaded from: classes12.dex */
public class FacebookATInitConfig extends ATInitConfig {
    public FacebookATInitConfig() {
        this.initMediation = FacebookATInitManager.getInstance();
    }
}
