package com.baidu.mapapi.search.aoi;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.b;

/* loaded from: classes13.dex */
public class AoiSearch extends b {
    private boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    private final com.baidu.platform.core.aoi.b f8057a = new com.baidu.platform.core.aoi.b();

    public static AoiSearch newInstance() {
        BMapManager.init();
        return new AoiSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f8057a.destroy();
        BMapManager.destroy();
    }

    public boolean requestAoi(AoiSearchOption aoiSearchOption) {
        if (this.f8057a == null) {
            throw new IllegalStateException("BDMapSDKException: AoiSearch is null, please call newInstance() first.");
        }
        if (aoiSearchOption == null || aoiSearchOption.getLatLngList() == null || aoiSearchOption.getLatLngList().size() <= 0) {
            throw new IllegalStateException("BDMapSDKException: option or location can not be null");
        }
        return this.f8057a.searchAoi(aoiSearchOption);
    }

    public void setOnGetAoiSearchResultListener(OnGetAoiSearchResultListener onGetAoiSearchResultListener) {
        com.baidu.platform.core.aoi.b bVar = this.f8057a;
        if (bVar == null) {
            throw new IllegalStateException("BDMapSDKException: AoiSearch is null, please call newInstance first.");
        }
        if (onGetAoiSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        bVar.setOnAoiSearchListener(onGetAoiSearchResultListener);
    }
}
