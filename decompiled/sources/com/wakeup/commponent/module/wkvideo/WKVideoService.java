package com.wakeup.commponent.module.wkvideo;

import android.content.Context;
import android.os.Parcelable;
import com.alibaba.android.arouter.facade.template.IProvider;
import com.baidu.platform.comapi.map.MapBundleKey;
import com.umeng.analytics.pro.ak;
import com.wakeup.common.network.entity.video.AttrsEntity;
import com.wakeup.common.network.entity.video.UploadVideoParams;
import com.wakeup.common.network.entity.video.VideoEntity;
import com.wakeup.common.storage.model.UserModel;
import com.wakeup.feature.health.bloodGlucose.diabetes.DiabetesRiskFormActivity;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: WKVideoService.kt */
@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J \u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\fH&JH\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u00102\u0016\u0010\u0013\u001a\u0012\u0012\u0004\u0012\u00020\u00150\u0014j\b\u0012\u0004\u0012\u00020\u0015`\u00162\u0006\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0010H&JE\u0010\u001a\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c23\u0010\u001d\u001a/\u0012%\u0012#\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u001eH&J\u0010\u0010$\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&JE\u0010%\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c23\u0010\u001d\u001a/\u0012%\u0012#\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020 0\u001f¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u001eH&J\u0010\u0010&\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J?\u0010'\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2-\u0010\u001d\u001a)\u0012\u001f\u0012\u001d\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020 0(¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u001eH&J\u0010\u0010)\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&J3\u0010*\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001c2!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b!\u0012\b\b\"\u0012\u0004\b\b(#\u0012\u0004\u0012\u00020\u00030\u001eH&J\u0010\u0010+\u001a\u00020\u00032\u0006\u0010\u001b\u001a\u00020\u001cH&¨\u0006,"}, d2 = {"Lcom/wakeup/commponent/module/wkvideo/WKVideoService;", "Lcom/alibaba/android/arouter/facade/template/IProvider;", "commitUser", "", "user", "Lcom/wakeup/common/storage/model/UserModel;", DiabetesRiskFormActivity.MODE_UPLOAD, "context", "Landroid/content/Context;", "attrsEntity", "Lcom/wakeup/common/network/entity/video/AttrsEntity;", "uploadVideoParams", "Lcom/wakeup/common/network/entity/video/UploadVideoParams;", "createRangePlayArgs", "Landroid/os/Parcelable;", "loaderType", "", "page", "maxPage", "list", "Ljava/util/ArrayList;", "Lcom/wakeup/common/network/entity/video/VideoEntity;", "Lkotlin/collections/ArrayList;", "collectId", "", "current", "subscribeVideoLikeEvent", MapBundleKey.MapObjKey.OBJ_SL_OBJ, "", "action", "Lkotlin/Function1;", "Lkotlin/Triple;", "", "Lkotlin/ParameterName;", "name", ak.aH, "unsubscribeVideoLikeEvent", "subscribeVideoCollectEvent", "unsubscribeVideoCollectEvent", "subscribeVideoFollowEvent", "Lkotlin/Pair;", "unsubscribeVideoFollowEvent", "subscribeBlackListEvent", "unsubscribeBlackListEvent", "commponent_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface WKVideoService extends IProvider {
    void commitUser(UserModel user);

    Parcelable createRangePlayArgs(int loaderType, int page, int maxPage, ArrayList<VideoEntity> list, String collectId, int current);

    void subscribeBlackListEvent(Object obj, Function1<? super String, Unit> action);

    void subscribeVideoCollectEvent(Object obj, Function1<? super Triple<String, Integer, Boolean>, Unit> action);

    void subscribeVideoFollowEvent(Object obj, Function1<? super Pair<String, Boolean>, Unit> action);

    void subscribeVideoLikeEvent(Object obj, Function1<? super Triple<String, Integer, Boolean>, Unit> action);

    void unsubscribeBlackListEvent(Object obj);

    void unsubscribeVideoCollectEvent(Object obj);

    void unsubscribeVideoFollowEvent(Object obj);

    void unsubscribeVideoLikeEvent(Object obj);

    void upload(Context context, AttrsEntity attrsEntity, UploadVideoParams uploadVideoParams);
}
