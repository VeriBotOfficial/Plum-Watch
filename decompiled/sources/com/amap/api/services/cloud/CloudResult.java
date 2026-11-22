package com.amap.api.services.cloud;

import com.amap.api.services.cloud.CloudSearch;
import java.util.ArrayList;

/* loaded from: classes11.dex */
public final class CloudResult {

    /* renamed from: a, reason: collision with root package name */
    private int f2096a;
    private ArrayList<CloudItem> b;
    private int c;
    private int d;
    private CloudSearch.Query e;
    private CloudSearch.SearchBound f;

    private CloudResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        this.e = query;
        this.c = i;
        this.d = i2;
        this.f2096a = a(i);
        this.b = arrayList;
        this.f = searchBound;
    }

    private int a(int i) {
        return ((i + r0) - 1) / this.d;
    }

    public static CloudResult createPagedResult(CloudSearch.Query query, int i, CloudSearch.SearchBound searchBound, int i2, ArrayList<CloudItem> arrayList) {
        return new CloudResult(query, i, searchBound, i2, arrayList);
    }

    public CloudSearch.SearchBound getBound() {
        return this.f;
    }

    public ArrayList<CloudItem> getClouds() {
        return this.b;
    }

    public int getPageCount() {
        return this.f2096a;
    }

    public CloudSearch.Query getQuery() {
        return this.e;
    }

    public int getTotalCount() {
        return this.c;
    }
}
