package com.wakeup.module.ai.utils;

import com.blankj.utilcode.util.FileUtils;
import com.wakeup.common.utils.AppPath;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: CachePath.kt */
@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000e\"\u0011\u0010\u0000\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\"\u0011\u0010\u0004\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0003\"\u001b\u0010\u0006\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\u0007\u0010\u0003\"\u001b\u0010\n\u001a\u00020\u00018FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\f\u0010\t\u001a\u0004\b\u000b\u0010\u0003\"\u0011\u0010\r\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u0003¨\u0006\u000f"}, d2 = {"CHAT_TEXT_DIR", "", "getCHAT_TEXT_DIR", "()Ljava/lang/String;", "CHAT_SINGLE_DIR", "getCHAT_SINGLE_DIR", "TS_DIR", "getTS_DIR", "TS_DIR$delegate", "Lkotlin/Lazy;", "TS_CAPTURE_DIR", "getTS_CAPTURE_DIR", "TS_CAPTURE_DIR$delegate", "TS_RECORD_DIR", "getTS_RECORD_DIR", "module-ai_overseasRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CachePathKt {
    private static final String CHAT_TEXT_DIR = AppPath.getAiFileDir() + "chat/";
    private static final String CHAT_SINGLE_DIR = AppPath.getAiFileDir() + "chatSingle/";
    private static final Lazy TS_DIR$delegate = LazyKt.lazy(new Function0() { // from class: com.wakeup.module.ai.utils.CachePathKt$$ExternalSyntheticLambda0
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String TS_DIR_delegate$lambda$1;
            TS_DIR_delegate$lambda$1 = CachePathKt.TS_DIR_delegate$lambda$1();
            return TS_DIR_delegate$lambda$1;
        }
    });
    private static final Lazy TS_CAPTURE_DIR$delegate = LazyKt.lazy(new Function0() { // from class: com.wakeup.module.ai.utils.CachePathKt$$ExternalSyntheticLambda1
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            String TS_CAPTURE_DIR_delegate$lambda$3;
            TS_CAPTURE_DIR_delegate$lambda$3 = CachePathKt.TS_CAPTURE_DIR_delegate$lambda$3();
            return TS_CAPTURE_DIR_delegate$lambda$3;
        }
    });
    private static final String TS_RECORD_DIR = AppPath.getAiFileDir() + "record/";

    public static final String getCHAT_TEXT_DIR() {
        return CHAT_TEXT_DIR;
    }

    public static final String getCHAT_SINGLE_DIR() {
        return CHAT_SINGLE_DIR;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TS_DIR_delegate$lambda$1() {
        String str = AppPath.getAiFileDir() + "ts/";
        FileUtils.createOrExistsDir(str);
        return str;
    }

    public static final String getTS_DIR() {
        return (String) TS_DIR$delegate.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String TS_CAPTURE_DIR_delegate$lambda$3() {
        String str = AppPath.getAiFileDir() + "capture/";
        FileUtils.createOrExistsDir(str);
        return str;
    }

    public static final String getTS_CAPTURE_DIR() {
        return (String) TS_CAPTURE_DIR$delegate.getValue();
    }

    public static final String getTS_RECORD_DIR() {
        return TS_RECORD_DIR;
    }
}
