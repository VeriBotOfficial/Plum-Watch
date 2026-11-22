package io.livekit.android.util;

import android.util.Log;
import com.umeng.analytics.pro.ak;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.Writer;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt;
import kotlin.text.StringsKt;

/* compiled from: LKDebugTree.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0016\u0018\u0000 \u00162\u00020\u0001:\u0001\u0016B\u0005¢\u0006\u0002\u0010\u0002J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000b\u001a\u00020\fH\u0002J\u0010\u0010\r\u001a\u00020\u00052\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J,\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u0007\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0014\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0016J\"\u0010\u0015\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005R\u001c\u0010\u0003\u001a\u0010\u0012\f\u0012\n \u0006*\u0004\u0018\u00010\u00050\u00050\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u00058F¢\u0006\u0006\u001a\u0004\b\b\u0010\t¨\u0006\u0017"}, d2 = {"Lio/livekit/android/util/LKDebugTree;", "", "()V", "fqcnIgnore", "", "", "kotlin.jvm.PlatformType", "tag", "getTag", "()Ljava/lang/String;", "createStackElementTag", "element", "Ljava/lang/StackTraceElement;", "getStackTraceString", ak.aH, "", "log", "", "priority", "", "message", "prepareLog", "Companion", "livekit-android-sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes6.dex */
public class LKDebugTree {
    private static final int MAX_LOG_LENGTH = 4000;
    private static final int MAX_TAG_LENGTH = 23;
    private final List<String> fqcnIgnore = CollectionsKt.listOf((Object[]) new String[]{LKDebugTree.class.getName(), LKLog.INSTANCE.getDefaultLogger().getClass().getName()});
    private static final Pattern ANONYMOUS_CLASS = Pattern.compile("(\\$\\d+)+$");

    public final String getTag() {
        StackTraceElement[] stackTrace = new Throwable().getStackTrace();
        Intrinsics.checkNotNullExpressionValue(stackTrace, "getStackTrace(...)");
        for (StackTraceElement stackTraceElement : stackTrace) {
            if (!this.fqcnIgnore.contains(stackTraceElement.getClassName())) {
                return createStackElementTag(stackTraceElement);
            }
        }
        throw new NoSuchElementException("Array contains no element matching the predicate.");
    }

    public final void prepareLog(int priority, Throwable t, String message) {
        String tag = getTag();
        String str = message;
        if (str == null || str.length() == 0) {
            if (t == null) {
                return;
            } else {
                message = getStackTraceString(t);
            }
        } else if (t != null) {
            message = message + '\n' + getStackTraceString(t);
        }
        log(priority, tag, message, t);
    }

    private final String getStackTraceString(Throwable t) {
        StringWriter stringWriter = new StringWriter(256);
        PrintWriter printWriter = new PrintWriter((Writer) stringWriter, false);
        t.printStackTrace(printWriter);
        printWriter.flush();
        String stringWriter2 = stringWriter.toString();
        Intrinsics.checkNotNullExpressionValue(stringWriter2, "toString(...)");
        return stringWriter2;
    }

    private final String createStackElementTag(StackTraceElement element) {
        String className = element.getClassName();
        Intrinsics.checkNotNullExpressionValue(className, "getClassName(...)");
        String substringAfterLast$default = StringsKt.substringAfterLast$default(className, '.', (String) null, 2, (Object) null);
        Matcher matcher = ANONYMOUS_CLASS.matcher(substringAfterLast$default);
        if (matcher.find()) {
            substringAfterLast$default = matcher.replaceAll("");
            Intrinsics.checkNotNullExpressionValue(substringAfterLast$default, "replaceAll(...)");
        }
        substringAfterLast$default.length();
        return substringAfterLast$default;
    }

    public void log(int priority, String tag, String message, Throwable t) {
        int coerceAtMost;
        Intrinsics.checkNotNullParameter(message, "message");
        if (message.length() < 4000) {
            if (priority == 7) {
                Log.wtf(tag, message);
                return;
            } else {
                Log.println(priority, tag, message);
                return;
            }
        }
        int length = message.length();
        int i = 0;
        while (i < length) {
            int indexOf$default = StringsKt.indexOf$default((CharSequence) message, '\n', i, false, 4, (Object) null);
            if (indexOf$default == -1) {
                indexOf$default = length;
            }
            while (true) {
                coerceAtMost = RangesKt.coerceAtMost(indexOf$default, i + 4000);
                String substring = message.substring(i, coerceAtMost);
                Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
                if (priority == 7) {
                    Log.wtf(tag, substring);
                } else {
                    Log.println(priority, tag, substring);
                }
                if (coerceAtMost >= indexOf$default) {
                    break;
                } else {
                    i = coerceAtMost;
                }
            }
            i = coerceAtMost + 1;
        }
    }
}
