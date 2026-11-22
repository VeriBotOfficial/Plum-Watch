package com.amap.api.services.busline;

import com.amap.api.services.core.SuggestionCity;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes11.dex */
public final class BusStationResult {

    /* renamed from: a, reason: collision with root package name */
    private int f2092a;
    private ArrayList<BusStationItem> b;
    private BusStationQuery c;
    private List<String> d;
    private List<SuggestionCity> e;

    private BusStationResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        this.b = new ArrayList<>();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.c = busStationQuery;
        this.f2092a = a(i);
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

    public static BusStationResult createPagedResult(BusStationQuery busStationQuery, int i, List<SuggestionCity> list, List<String> list2, ArrayList<BusStationItem> arrayList) {
        return new BusStationResult(busStationQuery, i, list, list2, arrayList);
    }

    public List<BusStationItem> getBusStations() {
        return this.b;
    }

    public int getPageCount() {
        return this.f2092a;
    }

    public BusStationQuery getQuery() {
        return this.c;
    }

    public List<SuggestionCity> getSearchSuggestionCities() {
        return this.e;
    }

    public List<String> getSearchSuggestionKeywords() {
        return this.d;
    }
}
