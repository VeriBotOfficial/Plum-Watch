package com.wakeup.module.video.utils;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import com.wakeup.module.video.utils.UiThreadExecutor;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UiThreadExecutor.kt */
@Metadata(d1 = {"\u00007\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006*\u0001\u0005\bÆ\u0002\u0018\u00002\u00020\u0001:\u0001\u0016B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u0011J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\tH\u0002J\u0010\u0010\u0013\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\nH\u0002J\u000e\u0010\u0015\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\tR\u0010\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0004\n\u0002\u0010\u0006R\u001a\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0017"}, d2 = {"Lcom/wakeup/module/video/utils/UiThreadExecutor;", "", "<init>", "()V", "HANDLER", "com/wakeup/module/video/utils/UiThreadExecutor$HANDLER$1", "Lcom/wakeup/module/video/utils/UiThreadExecutor$HANDLER$1;", "TOKENS", "Ljava/util/HashMap;", "", "Lcom/wakeup/module/video/utils/UiThreadExecutor$Token;", "runTask", "", "id", "task", "Ljava/lang/Runnable;", "delay", "", "nextToken", "decrementToken", "token", "cancelAll", "Token", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UiThreadExecutor {
    private static final UiThreadExecutor$HANDLER$1 HANDLER;
    public static final UiThreadExecutor INSTANCE = new UiThreadExecutor();
    private static final HashMap<String, Token> TOKENS;

    private UiThreadExecutor() {
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [com.wakeup.module.video.utils.UiThreadExecutor$HANDLER$1] */
    static {
        final Looper mainLooper = Looper.getMainLooper();
        HANDLER = new Handler(mainLooper) { // from class: com.wakeup.module.video.utils.UiThreadExecutor$HANDLER$1
            @Override // android.os.Handler
            public void handleMessage(Message msg) {
                Intrinsics.checkNotNullParameter(msg, "msg");
                Runnable callback = msg.getCallback();
                if (callback != null) {
                    callback.run();
                    UiThreadExecutor uiThreadExecutor = UiThreadExecutor.INSTANCE;
                    Object obj = msg.obj;
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type com.wakeup.module.video.utils.UiThreadExecutor.Token");
                    uiThreadExecutor.decrementToken((UiThreadExecutor.Token) obj);
                    return;
                }
                super.handleMessage(msg);
            }
        };
        TOKENS = new HashMap<>();
    }

    public final void runTask(String id2, Runnable task, long delay) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(task, "task");
        if (Intrinsics.areEqual("", id2)) {
            HANDLER.postDelayed(task, delay);
        } else {
            HANDLER.postAtTime(task, nextToken(id2), SystemClock.uptimeMillis() + delay);
        }
    }

    private final Token nextToken(String id2) {
        Token token;
        HashMap<String, Token> hashMap = TOKENS;
        synchronized (hashMap) {
            token = hashMap.get(id2);
            if (token == null) {
                token = new Token(id2);
                hashMap.put(id2, token);
            }
            token.setRunnablesCount$module_video_overseasRelease(token.getRunnablesCount() + 1);
        }
        return token;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void decrementToken(Token token) {
        HashMap<String, Token> hashMap = TOKENS;
        synchronized (hashMap) {
            token.setRunnablesCount$module_video_overseasRelease(token.getRunnablesCount() - 1);
            if (token.getRunnablesCount() == 0) {
                String id2 = token.getId();
                Token remove = hashMap.remove(id2);
                if (!Intrinsics.areEqual(remove, token) && remove != null) {
                    hashMap.put(id2, remove);
                }
            }
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void cancelAll(String id2) {
        Token remove;
        Intrinsics.checkNotNullParameter(id2, "id");
        HashMap<String, Token> hashMap = TOKENS;
        synchronized (hashMap) {
            remove = hashMap.remove(id2);
            Unit unit = Unit.INSTANCE;
        }
        if (remove == null) {
            return;
        }
        HANDLER.removeCallbacksAndMessages(remove);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: UiThreadExecutor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0002\u001a\u00020\u0003X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/wakeup/module/video/utils/UiThreadExecutor$Token;", "", "id", "", "<init>", "(Ljava/lang/String;)V", "getId$module_video_overseasRelease", "()Ljava/lang/String;", "runnablesCount", "", "getRunnablesCount$module_video_overseasRelease", "()I", "setRunnablesCount$module_video_overseasRelease", "(I)V", "module-video_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    static final class Token {
        private final String id;
        private int runnablesCount;

        public Token(String id2) {
            Intrinsics.checkNotNullParameter(id2, "id");
            this.id = id2;
        }

        /* renamed from: getId$module_video_overseasRelease, reason: from getter */
        public final String getId() {
            return this.id;
        }

        /* renamed from: getRunnablesCount$module_video_overseasRelease, reason: from getter */
        public final int getRunnablesCount() {
            return this.runnablesCount;
        }

        public final void setRunnablesCount$module_video_overseasRelease(int i) {
            this.runnablesCount = i;
        }
    }
}
