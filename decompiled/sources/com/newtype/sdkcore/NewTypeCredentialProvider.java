package com.newtype.sdkcore;

import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: NewTypeModels.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H¦@¢\u0006\u0002\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/newtype/sdkcore/NewTypeCredentialProvider;", "", "refreshCredential", "Lcom/newtype/sdkcore/NewTypeConnectionCredential;", "current", "(Lcom/newtype/sdkcore/NewTypeConnectionCredential;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "newtypesdkcore_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes17.dex */
public interface NewTypeCredentialProvider {
    Object refreshCredential(NewTypeConnectionCredential newTypeConnectionCredential, Continuation<? super NewTypeConnectionCredential> continuation);
}
