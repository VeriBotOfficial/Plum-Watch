package com.baidu.mapapi.search.district;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.b;
import com.baidu.platform.core.district.IDistrictSearch;
import com.baidu.platform.core.district.d;

/* loaded from: classes13.dex */
public class DistrictSearch extends b {

    /* renamed from: a, reason: collision with root package name */
    private IDistrictSearch f8083a;
    private boolean b = false;

    DistrictSearch() {
        this.f8083a = null;
        this.f8083a = new d();
    }

    public static DistrictSearch newInstance() {
        BMapManager.init();
        return new DistrictSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f8083a.destroy();
        BMapManager.destroy();
    }

    public boolean searchDistrict(DistrictSearchOption districtSearchOption) {
        String str;
        if (this.f8083a == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (districtSearchOption == null || (str = districtSearchOption.mCityName) == null || str.equals("")) {
            throw new IllegalArgumentException("BDMapSDKException: option or city name can not be null or empty.");
        }
        return this.f8083a.searchDistrict(districtSearchOption);
    }

    public void setOnDistrictSearchListener(OnGetDistricSearchResultListener onGetDistricSearchResultListener) {
        IDistrictSearch iDistrictSearch = this.f8083a;
        if (iDistrictSearch == null) {
            throw new IllegalStateException("BDMapSDKException: searcher is null, please call newInstance first.");
        }
        if (onGetDistricSearchResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        iDistrictSearch.setOnDistrictSearchListener(onGetDistricSearchResultListener);
    }
}
