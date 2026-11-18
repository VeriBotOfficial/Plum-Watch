package com.baidu.bdhttpdns;

import java.util.ArrayList;

/* JADX INFO: loaded from: classes16.dex */
public class BDHttpDnsResult {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private ResolveType f7444a;
    private final ResolveStatus b;
    private ArrayList<String> c;
    private ArrayList<String> d;

    public enum ResolveStatus {
        BDHttpDnsResolveOK,
        BDHttpDnsInputError,
        BDHttpDnsResolveErrorCacheMiss,
        BDHttpDnsResolveErrorDnsResolve
    }

    public enum ResolveType {
        RESOLVE_NONE,
        RESOLVE_NONEED,
        RESOLVE_FROM_HTTPDNS_CACHE,
        RESOLVE_FROM_HTTPDNS_EXPIRED_CACHE,
        RESOLVE_FROM_DNS_CACHE,
        RESOLVE_FROM_DNS
    }

    public BDHttpDnsResult(ResolveStatus resolveStatus) {
        this.f7444a = ResolveType.RESOLVE_NONE;
        this.b = resolveStatus;
    }

    public BDHttpDnsResult(ResolveType resolveType, ResolveStatus resolveStatus, ArrayList<String> arrayList, ArrayList<String> arrayList2) {
        ResolveType resolveType2 = ResolveType.RESOLVE_NONE;
        this.f7444a = resolveType;
        this.b = resolveStatus;
        this.c = arrayList;
        this.d = arrayList2;
    }

    public ArrayList<String> getIpv4List() {
        return this.c;
    }

    public ArrayList<String> getIpv6List() {
        return this.d;
    }

    public ResolveStatus getResolveStatus() {
        return this.b;
    }

    public ResolveType getResolveType() {
        return this.f7444a;
    }
}
