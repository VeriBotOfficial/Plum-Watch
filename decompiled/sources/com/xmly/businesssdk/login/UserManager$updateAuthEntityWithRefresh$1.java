package com.xmly.businesssdk.login;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import org.apache.commons.net.ftp.FTPReply;

/* compiled from: UserManager.kt */
@Metadata(k = 3, mv = {1, 7, 1}, xi = 48)
@DebugMetadata(c = "com.xmly.businesssdk.login.UserManager", f = "UserManager.kt", i = {0, 0}, l = {FTPReply.FILE_ACTION_PENDING}, m = "updateAuthEntityWithRefresh", n = {"this", "updatedTokenInfo"}, s = {"L$0", "L$1"})
/* loaded from: classes2.dex */
public final class UserManager$updateAuthEntityWithRefresh$1 extends ContinuationImpl {
    public Object L$0;
    public Object L$1;
    public int label;
    public /* synthetic */ Object result;
    public final /* synthetic */ UserManager this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserManager$updateAuthEntityWithRefresh$1(UserManager userManager, Continuation<? super UserManager$updateAuthEntityWithRefresh$1> continuation) {
        super(continuation);
        this.this$0 = userManager;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return this.this$0.updateAuthEntityWithRefresh(null, null, 0L, null, this);
    }
}
