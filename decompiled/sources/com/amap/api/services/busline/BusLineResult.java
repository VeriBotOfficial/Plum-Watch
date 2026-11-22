package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class BusLineResult {

    /* renamed from: a, reason: collision with root package name */
    private int f2088a;
    private ArrayList<BusLineItem> b;
    private BusLineQuery c;
    private List<String> d;
    private List<SuggestionCity> e;

    private BusLineResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        this.b = new ArrayList<>();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = busLineQuery;
        this.f2088a = a(i);
        this.e = list;
        this.d = list2;
        this.b = arrayList;
    }

    private int a(int i) {
        int pageSize = ((i + r0) - 1) / this.c.getPageSize();
        if (pageSize > 30) {
            return 30;
        }
        return pageSize;
    }

    public static BusLineResult createPagedResult(BusLineQuery busLineQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusLineItem> arrayList) {
        return new BusLineResult(busLineQuery, i, list, list2, arrayList);
    }

    public List<BusLineItem> getBusLines() {
        return this.b;
    }

    public int getPageCount() {
        return this.f2088a;
    }

    public BusLineQuery getQuery() {
        return this.c;
    }

    public List<SuggestionCity> getSearchSuggestionCities() {
        return this.e;
    }

    public List<String> getSearchSuggestionKeywords() {
        return this.d;
    }
}
