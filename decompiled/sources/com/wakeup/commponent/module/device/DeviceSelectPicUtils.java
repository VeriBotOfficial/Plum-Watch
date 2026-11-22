package com.wakeup.commponent.module.device;

import android.app.Activity;
import com.autonavi.aps.amapapi.config.Const;
import com.luck.picture.lib.entity.LocalMedia;
import com.luck.picture.lib.interfaces.OnResultCallbackListener;
import com.wakeup.commonui.utils.ActivityUtils;
import com.wakeup.commonui.utils.pictureselector.PictureSelectorUtil;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: DeviceSelectPicUtils.kt */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0015\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J0\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\b\b\u0002\u0010\f\u001a\u00020\u0005H\u0086@¢\u0006\u0002\u0010\rJ(\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\u0010\u001a\u00020\u0011H\u0082@¢\u0006\u0002\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/wakeup/commponent/module/device/DeviceSelectPicUtils;", "", "<init>", "()V", "selectPic", "", Const.STR_PROCESS_TAG, "Landroid/app/Activity;", "resolution", "", "screenType", "", "fileName", "(Landroid/app/Activity;[IILjava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "selectPicture", "Lcom/luck/picture/lib/entity/LocalMedia;", "isRound", "", "(Landroid/app/Activity;[IZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class DeviceSelectPicUtils {
    public static final DeviceSelectPicUtils INSTANCE = new DeviceSelectPicUtils();

    private DeviceSelectPicUtils() {
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0053 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r7v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object selectPic(android.app.Activity r5, int[] r6, int r7, java.lang.String r8, kotlin.coroutines.Continuation<? super java.lang.String> r9) {
        /*
            r4 = this;
            boolean r0 = r9 instanceof com.wakeup.commponent.module.device.DeviceSelectPicUtils$selectPic$1
            if (r0 == 0) goto L14
            r0 = r9
            com.wakeup.commponent.module.device.DeviceSelectPicUtils$selectPic$1 r0 = (com.wakeup.commponent.module.device.DeviceSelectPicUtils$selectPic$1) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r1 = r1 & r2
            if (r1 == 0) goto L14
            int r9 = r0.label
            int r9 = r9 - r2
            r0.label = r9
            goto L19
        L14:
            com.wakeup.commponent.module.device.DeviceSelectPicUtils$selectPic$1 r0 = new com.wakeup.commponent.module.device.DeviceSelectPicUtils$selectPic$1
            r0.<init>(r4, r9)
        L19:
            java.lang.Object r9 = r0.result
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.label
            r3 = 1
            if (r2 == 0) goto L39
            if (r2 != r3) goto L31
            int r5 = r0.I$0
            java.lang.Object r6 = r0.L$0
            r8 = r6
            java.lang.String r8 = (java.lang.String) r8
            kotlin.ResultKt.throwOnFailure(r9)
            goto L4f
        L31:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L39:
            kotlin.ResultKt.throwOnFailure(r9)
            if (r7 != 0) goto L40
            r7 = r3
            goto L41
        L40:
            r7 = 0
        L41:
            r0.L$0 = r8
            r0.I$0 = r7
            r0.label = r3
            java.lang.Object r9 = r4.selectPicture(r5, r6, r7, r0)
            if (r9 != r1) goto L4e
            return r1
        L4e:
            r5 = r7
        L4f:
            com.luck.picture.lib.entity.LocalMedia r9 = (com.luck.picture.lib.entity.LocalMedia) r9
            if (r9 != 0) goto L56
            java.lang.String r5 = ""
            return r5
        L56:
            java.lang.String r6 = r9.getCompressPath()
            if (r5 == 0) goto L65
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r6)
            android.graphics.Bitmap r5 = com.wakeup.common.utils.BitmapUtils.getCircleBitmap(r5)
            goto L69
        L65:
            android.graphics.Bitmap r5 = android.graphics.BitmapFactory.decodeFile(r6)
        L69:
            r7 = r8
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            java.lang.String r9 = ".png"
            if (r7 == 0) goto L90
            long r7 = java.lang.System.currentTimeMillis()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "album_photo_"
            r0.<init>(r1)
            java.lang.StringBuilder r7 = r0.append(r7)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r5 = com.wakeup.commonui.utils.ImageUtils.saveBitMap(r5, r7)
            goto La5
        L90:
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            r7.<init>()
            java.lang.StringBuilder r7 = r7.append(r8)
            java.lang.StringBuilder r7 = r7.append(r9)
            java.lang.String r7 = r7.toString()
            java.lang.String r5 = com.wakeup.commonui.utils.ImageUtils.saveBitMap(r5, r7)
        La5:
            com.wakeup.common.utils.FileUtils.delete(r6)
            kotlin.jvm.internal.Intrinsics.checkNotNull(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.commponent.module.device.DeviceSelectPicUtils.selectPic(android.app.Activity, int[], int, java.lang.String, kotlin.coroutines.Continuation):java.lang.Object");
    }

    public static /* synthetic */ Object selectPic$default(DeviceSelectPicUtils deviceSelectPicUtils, Activity activity, int[] iArr, int i, String str, Continuation continuation, int i2, Object obj) {
        if ((i2 & 8) != 0) {
            str = "";
        }
        return deviceSelectPicUtils.selectPic(activity, iArr, i, str, continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object selectPicture(Activity activity, int[] iArr, boolean z, Continuation<? super LocalMedia> continuation) {
        if (!ActivityUtils.assertValidRequest(activity)) {
            return null;
        }
        SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        final SafeContinuation safeContinuation2 = safeContinuation;
        PictureSelectorUtil.selectPicSingleWithCropRatio(activity, z, iArr[0], iArr[1], new OnResultCallbackListener<LocalMedia>() { // from class: com.wakeup.commponent.module.device.DeviceSelectPicUtils$selectPicture$2$1
            @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
            public void onResult(ArrayList<LocalMedia> result) {
                Intrinsics.checkNotNullParameter(result, "result");
                Continuation<LocalMedia> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m14057constructorimpl(result.get(0)));
            }

            @Override // com.luck.picture.lib.interfaces.OnResultCallbackListener
            public void onCancel() {
                Continuation<LocalMedia> continuation2 = safeContinuation2;
                Result.Companion companion = Result.INSTANCE;
                continuation2.resumeWith(Result.m14057constructorimpl(null));
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }
}
