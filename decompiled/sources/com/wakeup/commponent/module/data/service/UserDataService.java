package com.wakeup.commponent.module.data.service;

import com.alibaba.android.arouter.facade.template.IProvider;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;

/* compiled from: UserDataService.kt */
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J*\u0010\u0002\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u00050\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u0005H¦@¢\u0006\u0002\u0010\bJ0\u0010\t\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\u00052\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH¦@¢\u0006\u0002\u0010\u000eJ\b\u0010\u000f\u001a\u00020\u0005H&¨\u0006\u0010"}, d2 = {"Lcom/wakeup/commponent/module/data/service/UserDataService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "uploadAvatar", "Lkotlin/Pair;", "", "", "fileName", "localFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToOss", "failPathAndName", "progressCallback", "Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;", "Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOssUrl", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface UserDataService extends IProvider {
    String getOssUrl();

    Object uploadAvatar(String str, String str2, Continuation<? super Pair<Boolean, String>> continuation);

    Object uploadToOss(String str, String str2, OSSProgressCallback<PutObjectRequest> oSSProgressCallback, Continuation<? super Boolean> continuation);

    /* compiled from: UserDataService.kt */
    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public static final class DefaultImpls {
        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Object uploadToOss$default(UserDataService userDataService, String str, String str2, OSSProgressCallback oSSProgressCallback, Continuation continuation, int i, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: uploadToOss");
            }
            if ((i & 4) != 0) {
                oSSProgressCallback = null;
            }
            return userDataService.uploadToOss(str, str2, oSSProgressCallback, continuation);
        }
    }
}
