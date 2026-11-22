package com.wakeup.common.i18n;

import android.content.res.Configuration;
import android.content.res.Resources;
import java.util.Arrays;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.StringCompanionObject;

/* compiled from: OverrideResources.kt */
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\r\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0016J-\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\u000b0\n\"\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0002\u0010\fJ\u0010\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\bH\u0016J\u001a\u0010\r\u001a\u00020\u000e2\u0006\u0010\u0007\u001a\u00020\b2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016J\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002¨\u0006\u0011"}, d2 = {"Lcom/wakeup/common/i18n/OverrideResources;", "Landroid/content/res/Resources;", "base", "<init>", "(Landroid/content/res/Resources;)V", "getString", "", "id", "", "formatArgs", "", "", "(I[Ljava/lang/Object;)Ljava/lang/String;", "getText", "", "def", "override", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OverrideResources extends Resources {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OverrideResources(Resources base) {
        super(base.getAssets(), base.getDisplayMetrics(), base.getConfiguration());
        Intrinsics.checkNotNullParameter(base, "base");
    }

    @Override // android.content.res.Resources
    public String getString(int id2) {
        String override = override(id2);
        if (override != null) {
            return override;
        }
        String string = super.getString(id2);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // android.content.res.Resources
    public String getString(int id2, Object... formatArgs) {
        Intrinsics.checkNotNullParameter(formatArgs, "formatArgs");
        String override = override(id2);
        if (override != null) {
            try {
                StringCompanionObject stringCompanionObject = StringCompanionObject.INSTANCE;
                Locale locale = getConfiguration().getLocales().get(0);
                Object[] copyOf = Arrays.copyOf(formatArgs, formatArgs.length);
                String format = String.format(locale, override, Arrays.copyOf(copyOf, copyOf.length));
                Intrinsics.checkNotNullExpressionValue(format, "format(...)");
                return format;
            } catch (Throwable unused) {
                return super.getString(id2, Arrays.copyOf(formatArgs, formatArgs.length));
            }
        }
        String string = super.getString(id2, Arrays.copyOf(formatArgs, formatArgs.length));
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        return string;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int id2) {
        String override = override(id2);
        if (override != null) {
            return override;
        }
        CharSequence text = super.getText(id2);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    @Override // android.content.res.Resources
    public CharSequence getText(int id2, CharSequence def) {
        String override = override(id2);
        if (override != null) {
            return override;
        }
        CharSequence text = super.getText(id2, def);
        Intrinsics.checkNotNullExpressionValue(text, "getText(...)");
        return text;
    }

    private final String override(int id2) {
        try {
            String resourceEntryName = getResourceEntryName(id2);
            I18nOverrideManager i18nOverrideManager = I18nOverrideManager.INSTANCE;
            Configuration configuration = getConfiguration();
            Intrinsics.checkNotNullExpressionValue(configuration, "getConfiguration(...)");
            Intrinsics.checkNotNull(resourceEntryName);
            return i18nOverrideManager.lookup(configuration, resourceEntryName);
        } catch (Throwable unused) {
            return null;
        }
    }
}
