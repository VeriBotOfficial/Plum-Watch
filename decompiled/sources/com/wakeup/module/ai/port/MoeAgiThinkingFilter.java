package com.wakeup.module.ai.port;

import android.gov.nist.core.Separators;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.CollectionsKt;
import kotlin.collections.SetsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.MatchResult;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import kotlin.text.StringsKt;

/* compiled from: MoeAgiThinkingFilter.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\t\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u0006J\u0010\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u0006H\u0002J\u0018\u0010\r\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u0006H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/wakeup/module/ai/port/MoeAgiThinkingFilter;", "", "<init>", "()V", "THINKING_TAGS", "", "", "UNICODE_ESCAPE", "Lkotlin/text/Regex;", "strip", "content", "decodeUnicodeEscapes", "text", "removeThinkingBlocks", "tag", "module-ai_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MoeAgiThinkingFilter {
    public static final MoeAgiThinkingFilter INSTANCE = new MoeAgiThinkingFilter();
    private static final List<String> THINKING_TAGS = CollectionsKt.listOf((Object[]) new String[]{"think", "redacted_thinking"});
    private static final Regex UNICODE_ESCAPE = new Regex("\\\\u([0-9a-fA-F]{4})");

    private MoeAgiThinkingFilter() {
    }

    public final String strip(String content) {
        Intrinsics.checkNotNullParameter(content, "content");
        if (StringsKt.isBlank(content)) {
            return content;
        }
        String decodeUnicodeEscapes = decodeUnicodeEscapes(content);
        Iterator<T> it = THINKING_TAGS.iterator();
        while (it.hasNext()) {
            decodeUnicodeEscapes = INSTANCE.removeThinkingBlocks(decodeUnicodeEscapes, (String) it.next());
        }
        return StringsKt.trim((CharSequence) decodeUnicodeEscapes).toString();
    }

    private final String decodeUnicodeEscapes(String text) {
        String str = text;
        return !StringsKt.contains$default((CharSequence) str, (CharSequence) "\\u", false, 2, (Object) null) ? text : UNICODE_ESCAPE.replace(str, new Function1() { // from class: com.wakeup.module.ai.port.MoeAgiThinkingFilter$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                CharSequence decodeUnicodeEscapes$lambda$1;
                decodeUnicodeEscapes$lambda$1 = MoeAgiThinkingFilter.decodeUnicodeEscapes$lambda$1((MatchResult) obj);
                return decodeUnicodeEscapes$lambda$1;
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CharSequence decodeUnicodeEscapes$lambda$1(MatchResult match) {
        Intrinsics.checkNotNullParameter(match, "match");
        return String.valueOf((char) Integer.parseInt(match.getGroupValues().get(1), CharsKt.checkRadix(16)));
    }

    private final String removeThinkingBlocks(String text, String tag) {
        Regex regex = new Regex(Separators.LESS_THAN + tag + ">.*?</" + tag + Separators.GREATER_THAN, (Set<? extends RegexOption>) SetsKt.setOf((Object[]) new RegexOption[]{RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE}));
        Regex regex2 = new Regex(Separators.LESS_THAN + tag + ">.*", (Set<? extends RegexOption>) SetsKt.setOf((Object[]) new RegexOption[]{RegexOption.DOT_MATCHES_ALL, RegexOption.IGNORE_CASE}));
        while (true) {
            String str = text;
            String replace = regex.replace(str, "");
            if (Intrinsics.areEqual(replace, text)) {
                return regex2.replace(str, "");
            }
            text = replace;
        }
    }
}
