package com.wakeup.module.tts.ali;

import com.blankj.utilcode.util.NetworkUtils;
import com.heytap.mcssdk.constant.b;
import com.wakeup.common.ali.AliQueryInfo;
import com.wakeup.common.network.RetrofitManager;
import com.wakeup.common.utils.CryptTools;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: AliLfaMgr.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001e\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0005H\u0087@¢\u0006\u0002\u0010\nJ&\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00052\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u000fR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lcom/wakeup/module/tts/ali/AliLfaMgr;", "", "<init>", "()V", "TAG", "", "startVoiceConvert", "audioFile", "Ljava/io/File;", "language", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFile", "Lcom/wakeup/common/ali/AliQueryInfo;", b.z, "token", "(Ljava/lang/String;Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AliLfaMgr {
    public static final AliLfaMgr INSTANCE = new AliLfaMgr();
    private static final String TAG = "AliLfaMgr";

    private AliLfaMgr() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0093, code lost:
    
        if (r9 != r1) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0095, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x006d, code lost:
    
        if (r9 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0048  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @kotlin.jvm.JvmStatic
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object startVoiceConvert(java.io.File r7, java.lang.String r8, kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            boolean r0 = r9 instanceof com.wakeup.module.tts.ali.AliLfaMgr$startVoiceConvert$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.module.tts.ali.AliLfaMgr$startVoiceConvert$1 r0 = (com.wakeup.module.tts.ali.AliLfaMgr$startVoiceConvert$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.module.tts.ali.AliLfaMgr$startVoiceConvert$1 r0 = new com.wakeup.module.tts.ali.AliLfaMgr$startVoiceConvert$1
            r0.<init>(r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            java.lang.String r3 = ""
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L48
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r7 = r0.L$0
            java.io.File r7 = (java.io.File) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L96
        L33:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3b:
            java.lang.Object r7 = r0.L$1
            r8 = r7
            java.lang.String r8 = (java.lang.String) r8
            java.lang.Object r7 = r0.L$0
            java.io.File r7 = (java.io.File) r7
            kotlin.ResultKt.throwOnFailure(r9)
            goto L70
        L48:
            kotlin.ResultKt.throwOnFailure(r9)
            java.lang.String r9 = com.wakeup.module.tts.ali.AliLfaMgr.TAG
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r6 = "start language "
            r2.<init>(r6)
            java.lang.StringBuilder r2 = r2.append(r8)
            java.lang.String r2 = r2.toString()
            java.lang.Object[] r2 = new java.lang.Object[]{r2}
            com.wakeup.common.log.LogUtils.i(r9, r2)
            r0.L$0 = r7
            r0.L$1 = r8
            r0.label = r5
            java.lang.Object r9 = com.wakeup.module.tts.ali.BaseAliMgr.getToken(r0)
            if (r9 != r1) goto L70
            goto L95
        L70:
            java.lang.String r9 = (java.lang.String) r9
            r2 = r9
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto Le0
            boolean r2 = com.blankj.utilcode.util.NetworkUtils.isAvailable()
            if (r2 != 0) goto L82
            goto Le0
        L82:
            com.wakeup.module.tts.ali.AliLfaMgr r2 = com.wakeup.module.tts.ali.AliLfaMgr.INSTANCE
            java.lang.String r8 = com.wakeup.module.tts.ali.BaseAliMgr.getMapKey(r8)
            r0.L$0 = r7
            r5 = 0
            r0.L$1 = r5
            r0.label = r4
            java.lang.Object r9 = r2.postFile(r8, r7, r9, r0)
            if (r9 != r1) goto L96
        L95:
            return r1
        L96:
            com.wakeup.common.ali.AliQueryInfo r9 = (com.wakeup.common.ali.AliQueryInfo) r9
            com.blankj.utilcode.util.FileUtils.delete(r7)
            int r7 = r9.getStatus()
            r8 = 20000000(0x1312d00, float:3.2542052E-38)
            if (r7 != r8) goto Lb6
            java.lang.String r7 = r9.getResult()
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto Lb1
            goto Lb6
        Lb1:
            java.lang.String r7 = r9.getResult()
            return r7
        Lb6:
            java.lang.String r7 = com.wakeup.module.tts.ali.AliLfaMgr.TAG
            int r8 = r9.getStatus()
            java.lang.String r9 = r9.getMessage()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "start fail "
            r0.<init>(r1)
            java.lang.StringBuilder r8 = r0.append(r8)
            java.lang.String r0 = " ,desc: "
            java.lang.StringBuilder r8 = r8.append(r0)
            java.lang.StringBuilder r8 = r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            com.wakeup.common.log.LogUtils.w(r7, r8)
        Le0:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.tts.ali.AliLfaMgr.startVoiceConvert(java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object postFile(String str, File file, String str2, Continuation<? super AliQueryInfo> continuation) {
        if (!NetworkUtils.isConnected()) {
            return new AliQueryInfo("", "", 0, "网络异常");
        }
        HashMap hashMap = new HashMap();
        hashMap.put("appkey", str);
        hashMap.put("enable_punctuation_prediction", Boxing.boxBoolean(true));
        return RetrofitManager.INSTANCE.getInstance().getApiAli().postAudioFile("https://nls-gateway-cn-shanghai.aliyuncs.com/stream/v1/asr?" + CryptTools.parseMapToPathParam(hashMap), str2, RequestBody.INSTANCE.create(MediaType.INSTANCE.parse("application/octet-stream"), file), continuation);
    }
}
