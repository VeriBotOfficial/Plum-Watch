package com.wakeup.module.data;

import android.content.Context;
import com.alibaba.sdk.android.oss.callback.OSSProgressCallback;
import com.alibaba.sdk.android.oss.model.PutObjectRequest;
import com.wakeup.commponent.module.data.service.UserDataService;
import com.wakeup.module.data.sync.OssManager;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;

/* compiled from: UserDataServiceImpl.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J*\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000bH\u0096@¢\u0006\u0002\u0010\u000eJ.\u0010\u000f\u001a\u00020\n2\u0006\u0010\u0010\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000b2\u000e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012H\u0096@¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\u000bH\u0016¨\u0006\u0016"}, d2 = {"Lcom/wakeup/module/data/UserDataServiceImpl;", "Lcom/wakeup/commponent/module/data/service/UserDataService;", "<init>", "()V", "init", "", "context", "Landroid/content/Context;", "uploadAvatar", "Lkotlin/Pair;", "", "", "fileName", "localFile", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "uploadToOss", "failPathAndName", "progressCallback", "Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;", "Lcom/alibaba/sdk/android/oss/model/PutObjectRequest;", "(Ljava/lang/String;Ljava/lang/String;Lcom/alibaba/sdk/android/oss/callback/OSSProgressCallback;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getOssUrl", "module-data_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class UserDataServiceImpl implements UserDataService {
    @Override // com.alibaba.android.arouter.facade.template.IProvider
    public void init(Context context) {
    }

    @Override // com.wakeup.commponent.module.data.service.UserDataService
    public Object uploadAvatar(String str, String str2, Continuation<? super Pair<Boolean, String>> continuation) {
        String str3 = "cdn/howear/" + str;
        return new Pair(Boxing.boxBoolean(OssManager.INSTANCE.uploadAvatarOssFile(str3, str2)), str3);
    }

    @Override // com.wakeup.commponent.module.data.service.UserDataService
    public Object uploadToOss(String str, String str2, OSSProgressCallback<PutObjectRequest> oSSProgressCallback, Continuation<? super Boolean> continuation) {
        return Boxing.boxBoolean(OssManager.INSTANCE.uploadOssFile(str, str2, oSSProgressCallback));
    }

    @Override // com.wakeup.commponent.module.data.service.UserDataService
    public String getOssUrl() {
        return OssManager.OSS_URL;
    }
}
