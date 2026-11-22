package com.wakeup.common.opt;

import android.text.TextUtils;
import com.blankj.utilcode.util.CollectionUtils;
import com.wakeup.common.log.LogUtils;
import com.wakeup.common.network.entity.opts.DialogAdModel;
import com.wakeup.common.network.entity.opts.DialogAdNewModel;
import com.wakeup.common.storage.CacheManager;
import com.wakeup.common.utils.AdvConstance;
import com.wakeup.common.utils.DateUtil;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: AdvDialogHelper.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0006\u0010\b\u001a\u00020\u0005H\u0007J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0007H\u0002J\u000e\u0010\f\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0005J\u0006\u0010\u000e\u001a\u00020\nJ\u000e\u0010\u000f\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u0011J\u000e\u0010\u0012\u001a\u00020\r2\u0006\u0010\u0013\u001a\u00020\u0005R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082D¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lcom/wakeup/common/opt/AdvDialogHelper;", "", "<init>", "()V", "TAG", "", "canAdvDialogShow", "Lcom/wakeup/common/network/entity/opts/DialogAdModel;", "advId", "advIdCanShow", "", "model", "recordAdvDialogClose", "", "isTimeOut", "saveAdvDataCache", "data", "Lcom/wakeup/common/network/entity/opts/DialogAdNewModel;", "saveShowDialog", "modelId", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdvDialogHelper {
    public static final AdvDialogHelper INSTANCE = new AdvDialogHelper();
    private static final String TAG = "AdvDialogHelper";

    private AdvDialogHelper() {
    }

    @JvmStatic
    public static final DialogAdModel canAdvDialogShow(String advId) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        if (TextUtils.isEmpty(advId) || advId == "-1") {
            LogUtils.i(TAG, "canAdvDialogShow invalid");
            return null;
        }
        DialogAdNewModel dialogAdNewModel = (DialogAdNewModel) CacheManager.INSTANCE.getData(AdvConstance.ADV_CACHE_DATA_KEY, DialogAdNewModel.class);
        if (dialogAdNewModel == null) {
            LogUtils.i(TAG, "canAdvDialogShow cacheModel is null");
            return null;
        }
        if (dialogAdNewModel.getMap() == null) {
            LogUtils.i(TAG, "canAdvDialogShow cacheModel map is null");
            return null;
        }
        if (!dialogAdNewModel.getMap().containsKey(advId)) {
            LogUtils.i(TAG, "canAdvDialogShow not containsKey advId:" + advId);
            return null;
        }
        if (CollectionUtils.isEmpty(dialogAdNewModel.getMap().get(advId))) {
            LogUtils.i(TAG, "canAdvDialogShow list isEmpty");
            return null;
        }
        List<DialogAdModel> list = dialogAdNewModel.getMap().get(advId);
        Intrinsics.checkNotNull(list);
        DialogAdModel dialogAdModel = list.get(0);
        if (dialogAdModel == null) {
            LogUtils.i(TAG, "canAdvDialogShow bean is null");
            return null;
        }
        if (!INSTANCE.advIdCanShow(dialogAdModel)) {
            LogUtils.i(TAG, "canAdvDialogShow advIdCanShow Non pop");
            return null;
        }
        if (System.currentTimeMillis() - (dialogAdNewModel.getIntervalTime() * 1000) <= dialogAdNewModel.getCloseDialogTime()) {
            LogUtils.i(TAG, "canAdvDialogShow Non time:" + dialogAdNewModel.getCloseDialogTime());
            return null;
        }
        LogUtils.i(TAG, "canAdvDialogShow success Conformance advId:" + advId);
        return dialogAdModel;
    }

    private final boolean advIdCanShow(DialogAdModel model) {
        String id2 = model.getId();
        int popFrequency = model.getPopFrequency();
        if (popFrequency == 0) {
            return !CacheManager.INSTANCE.getBoolean(new StringBuilder(AdvConstance.CACHE_ONE_KEY).append(id2).toString());
        }
        if (popFrequency != 1) {
            return popFrequency == 2 && model.getPopCount() > 0;
        }
        return !DateUtil.isSameDay(DateUtil.getCurrentTimestamp(), CacheManager.INSTANCE.getInt(new StringBuilder(AdvConstance.CACHE_DAY_KEY).append(id2).toString()));
    }

    public final void recordAdvDialogClose(String advId) {
        Intrinsics.checkNotNullParameter(advId, "advId");
        if (TextUtils.isEmpty(advId)) {
            LogUtils.i(TAG, "recordAdvDialogClose advId isEmpty");
            return;
        }
        DialogAdNewModel dialogAdNewModel = (DialogAdNewModel) CacheManager.INSTANCE.getData(AdvConstance.ADV_CACHE_DATA_KEY, DialogAdNewModel.class);
        if (dialogAdNewModel == null) {
            LogUtils.i(TAG, "recordAdvDialogClose cacheModel is null");
            return;
        }
        if (dialogAdNewModel.getMap() == null) {
            LogUtils.i(TAG, "recordAdvDialogClose cacheModel map is null");
            return;
        }
        if (!dialogAdNewModel.getMap().containsKey(advId)) {
            LogUtils.i(TAG, "recordAdvDialogClose not containsKey advId:" + advId);
            return;
        }
        List<DialogAdModel> list = dialogAdNewModel.getMap().get(advId);
        if (CollectionUtils.isEmpty(list)) {
            LogUtils.i(TAG, "recordAdvDialogClose list isEmpty");
            return;
        }
        Intrinsics.checkNotNull(list);
        DialogAdModel dialogAdModel = list.get(0);
        if (dialogAdModel == null) {
            LogUtils.i(TAG, "recordAdvDialogClose bean is null");
            return;
        }
        dialogAdNewModel.setCloseDialogTime(System.currentTimeMillis());
        dialogAdModel.setPopCount(dialogAdModel.getPopCount() - 1);
        String str = TAG;
        LogUtils.i(str, "recordAdvDialogClose save time:" + dialogAdNewModel.getCloseDialogTime());
        if (dialogAdModel.getPopFrequency() == 1 && dialogAdModel.getPopCount() <= 0) {
            LogUtils.i(str, "recordAdvDialogClose save bean.popCount <= 0");
            CacheManager.INSTANCE.saveInt(AdvConstance.CACHE_DAY_KEY + dialogAdModel.getId(), DateUtil.getCurrentTimestamp());
        }
        CacheManager.INSTANCE.saveData(AdvConstance.ADV_CACHE_DATA_KEY, dialogAdNewModel);
    }

    public final boolean isTimeOut() {
        long currentTimeMillis = System.currentTimeMillis() / 1000;
        long j = CacheManager.INSTANCE.getLong(AdvConstance.ADV_CACHE_DATA_TIME) / 1000;
        LogUtils.i(TAG, "today:" + currentTimeMillis + "  oldTime:" + j);
        return Math.abs(DateUtil.getTimeDifferenceDays(j, currentTimeMillis)) >= 1;
    }

    public final void saveAdvDataCache(DialogAdNewModel data) {
        Intrinsics.checkNotNullParameter(data, "data");
        LogUtils.i(TAG, "saveAdvDialogCache");
        CacheManager.INSTANCE.saveLong(AdvConstance.ADV_CACHE_DATA_TIME, System.currentTimeMillis());
        CacheManager.INSTANCE.saveData(AdvConstance.ADV_CACHE_DATA_KEY, data);
    }

    public final void saveShowDialog(String modelId) {
        Intrinsics.checkNotNullParameter(modelId, "modelId");
        CacheManager.saveBoolean(AdvConstance.CACHE_ONE_KEY + modelId, true);
    }
}
