package com.baidu.mapapi.search.sug;

import com.baidu.mapapi.BMapManager;
import com.baidu.mapapi.search.core.b;
import com.baidu.platform.core.sug.ISuggestionSearch;
import com.baidu.platform.core.sug.a;

/* loaded from: classes13.dex */
public class SuggestionSearch extends b {
    private boolean b = false;

    /* renamed from: a, reason: collision with root package name */
    ISuggestionSearch f8179a = new a();

    private SuggestionSearch() {
    }

    public static SuggestionSearch newInstance() {
        BMapManager.init();
        return new SuggestionSearch();
    }

    public void destroy() {
        if (this.b) {
            return;
        }
        this.b = true;
        this.f8179a.destroy();
        BMapManager.destroy();
    }

    public boolean requestSuggestion(SuggestionSearchOption suggestionSearchOption) {
        ISuggestionSearch iSuggestionSearch = this.f8179a;
        if (iSuggestionSearch == null) {
            throw new IllegalStateException("BDMapSDKException: suggestionsearch is null, please call newInstance() first.");
        }
        if (suggestionSearchOption == null || suggestionSearchOption.mKeyword == null || suggestionSearchOption.mCity == null) {
            throw new IllegalArgumentException("BDMapSDKException: option or keyword or city can not be null");
        }
        return iSuggestionSearch.requestSuggestion(suggestionSearchOption);
    }

    public void setOnGetSuggestionResultListener(OnGetSuggestionResultListener onGetSuggestionResultListener) {
        ISuggestionSearch iSuggestionSearch = this.f8179a;
        if (iSuggestionSearch == null) {
            throw new IllegalStateException("BDMapSDKException: suggestionsearch is null, please call newInstance() first.");
        }
        if (onGetSuggestionResultListener == null) {
            throw new IllegalArgumentException("BDMapSDKException: listener can not be null");
        }
        iSuggestionSearch.setOnGetSuggestionResultListener(onGetSuggestionResultListener);
    }
}
