package com.baidu.mapapi.map;

import android.content.Context;
import android.graphics.Bitmap;
import com.baidu.mapapi.map.entity.BackgroundNaviEntity;

/* loaded from: classes13.dex */
public abstract class AbsBackgroundDrawNaviLayer extends b<BackgroundNaviEntity> {

    public enum EraseEffect {
        NONE,
        ALREADY_PASSED_NOT_SHOW,
        ALREADY_PASSED_CHANGE_COLOR
    }

    AbsBackgroundDrawNaviLayer(Context context) {
        super(context);
    }

    @Override // com.baidu.mapapi.map.BaseBackgroundDrawLayer
    public /* bridge */ /* synthetic */ int getLife() {
        return super.getLife();
    }

    @Override // com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    public /* bridge */ /* synthetic */ void onCreate() {
        super.onCreate();
    }

    @Override // com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    @Override // com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    public /* bridge */ /* synthetic */ void onSizeChanged(int i, int i2) {
        super.onSizeChanged(i, i2);
    }

    @Override // com.baidu.mapapi.map.BaseBackgroundDrawLayer, com.baidu.mapapi.map.IBackgroundDrawLayer
    public /* bridge */ /* synthetic */ void onUpdated() {
        super.onUpdated();
    }

    public abstract void setEraseColor(int i);

    public abstract void setEraseEffect(EraseEffect eraseEffect);

    public abstract void setIsLocationDirectionFollowPhone(boolean z);

    public abstract void setIsNeedShowStartAndEndMark(boolean z);

    public abstract void setNaviEndMark(Bitmap bitmap);

    public abstract void setNaviLocationMark(Bitmap bitmap);

    public abstract void setNaviRouteColor(int i);

    public abstract void setNaviRouteWidth(int i);

    public abstract void setNaviStartMark(Bitmap bitmap);

    AbsBackgroundDrawNaviLayer(Context context, int i) {
        super(context, i);
    }
}
