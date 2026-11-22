package com.xmly.businesssdk.module;

import android.content.Context;
import com.xmly.businesssdk.config.ModuleConfig;
import java.util.List;
import kotlin.Metadata;

/* compiled from: ModuleInitializer.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\bf\u0018\u00002\u00020\u0001J\u000e\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003H&J\b\u0010\u0005\u001a\u00020\u0006H&J\u0018\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&J\b\u0010\r\u001a\u00020\u000eH&¨\u0006\u000f"}, d2 = {"Lcom/xmly/businesssdk/module/ModuleInitializer;", "", "getDependencies", "", "", "getPriority", "", "init", "", "context", "Landroid/content/Context;", "config", "Lcom/xmly/businesssdk/config/ModuleConfig;", "isEnabled", "", "business-sdk_wakeRelease"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes2.dex */
public interface ModuleInitializer {
    List<String> getDependencies();

    int getPriority();

    void init(Context context, ModuleConfig config);

    boolean isEnabled();
}
