package com.wakeup.module.tts.lfa;

import com.anythink.core.common.m.a;
import com.autonavi.aps.amapapi.config.Const;
import com.wakeup.common.network.RetrofitManager;
import com.wakeup.common.network.entity.xunfei.XFBaseRsp;
import com.wakeup.common.network.entity.xunfei.XFCreateInfo;
import com.wakeup.common.utils.AdvConstance;
import com.wakeup.commponent.module.data.HealthData;
import com.wakeup.module.tts.lfa.sign.LfasrSignature;
import com.wakeup.module.tts.lfa.utils.CryptTools;
import java.io.File;
import java.util.HashMap;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.Boxing;
import okhttp3.MediaType;
import okhttp3.RequestBody;

/* compiled from: LfaMgr.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J \u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\u0012J$\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00150\u00142\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u0012J\u001e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00142\u0006\u0010\u0018\u001a\u00020\u0005H\u0082@¢\u0006\u0002\u0010\u0019R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lcom/wakeup/module/tts/lfa/LfaMgr;", "", "<init>", "()V", "TAG", "", "onceTime", "", "firstOnceTime", HealthData.STATISTICS_MAXIMUM, "", Const.SP_KEY_CALL_LOC_COUNT, "appId", "keySecret", "start", "audioFile", "Ljava/io/File;", "language", "(Ljava/io/File;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "postFile", "Lcom/wakeup/common/network/entity/xunfei/XFBaseRsp;", "Lcom/wakeup/common/network/entity/xunfei/XFCreateInfo;", "queryResult", "Lcom/wakeup/common/network/entity/xunfei/XFQueryInfo;", "orderId", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "module-tts_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LfaMgr {
    private static final String TAG = "LfaMgr";
    private static int count = 0;
    private static final long firstOnceTime = 10000;
    private static final int maximum = 5;
    private static final long onceTime = 10000;
    public static final LfaMgr INSTANCE = new LfaMgr();
    private static final String appId = "7dd8be5c";
    private static final String keySecret = "6e19956fb7462badd39d1cdd678a5205";

    private LfaMgr() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x009f, code lost:
    
        if (r11 == r1) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0085, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(10000, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0029  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object start(java.io.File r9, java.lang.String r10, kotlin.coroutines.Continuation<? super java.lang.String> r11) {
        /*
            Method dump skipped, instructions count: 248
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.tts.lfa.LfaMgr.start(java.io.File, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object postFile(File file, String str, Continuation<? super XFBaseRsp<XFCreateInfo>> continuation) {
        HashMap hashMap = new HashMap();
        String str2 = appId;
        hashMap.put("appId", str2);
        hashMap.put("fileSize", Boxing.boxLong(file.length()));
        hashMap.put("fileName", file.getName());
        hashMap.put("duration", AdvConstance.DEVICE_FIRMWARE_UPDATE);
        hashMap.put("language", str);
        LfasrSignature lfasrSignature = new LfasrSignature(str2, keySecret);
        hashMap.put("signa", lfasrSignature.getSigna());
        hashMap.put("ts", lfasrSignature.getTs());
        return RetrofitManager.INSTANCE.getInstance().getApiXunfei().postAudioFile("https://raasr.xfyun.cn/v2/api/upload?" + CryptTools.parseMapToPathParam(hashMap), RequestBody.INSTANCE.create(MediaType.INSTANCE.parse(a.f3976q), file), continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x010f, code lost:
    
        if (kotlinx.coroutines.DelayKt.delay(10000, r4) == r0) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object queryResult(java.lang.String r12, kotlin.coroutines.Continuation<? super com.wakeup.common.network.entity.xunfei.XFBaseRsp<com.wakeup.common.network.entity.xunfei.XFQueryInfo>> r13) {
        /*
            Method dump skipped, instructions count: 339
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.module.tts.lfa.LfaMgr.queryResult(java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
