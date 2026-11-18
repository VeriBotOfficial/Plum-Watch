package com.amap.api.services.busline;

/* JADX INFO: loaded from: classes7.dex */
public class BusLineQuery implements Cloneable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f2086a;
    private String b;
    private SearchType e;
    private int c = 20;
    private int d = 1;
    private String f = "base";

    public enum SearchType {
        BY_LINE_ID,
        BY_LINE_NAME
    }

    public BusLineQuery(String str, SearchType searchType, String str2) {
        this.f2086a = str;
        this.e = searchType;
        this.b = str2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BusLineQuery busLineQuery = (BusLineQuery) obj;
        if (this.e != busLineQuery.e) {
            return false;
        }
        String str = this.b;
        if (str == null) {
            if (busLineQuery.b != null) {
                return false;
            }
        } else if (!str.equals(busLineQuery.b)) {
            return false;
        }
        if (this.d != busLineQuery.d || this.c != busLineQuery.c) {
            return false;
        }
        String str2 = this.f2086a;
        if (str2 == null) {
            if (busLineQuery.f2086a != null) {
                return false;
            }
        } else if (!str2.equals(busLineQuery.f2086a)) {
            return false;
        }
        String str3 = this.f;
        if (str3 == null) {
            if (busLineQuery.f != null) {
                return false;
            }
        } else if (!str3.equals(busLineQuery.f)) {
            return false;
        }
        return true;
    }

    public SearchType getCategory() {
        return this.e;
    }

    public String getCity() {
        return this.b;
    }

    public String getExtensions() {
        return this.f;
    }

    public int getPageNumber() {
        return this.d;
    }

    public int getPageSize() {
        return this.c;
    }

    public String getQueryString() {
        return this.f2086a;
    }

    public int hashCode() {
        SearchType searchType = this.e;
        int r0 = ((searchType == null ? 0 : searchType.hashCode()) + 31) * 31;
        String str = this.b;
        int r1 = (((((r0 + (str == null ? 0 : str.hashCode())) * 31) + this.d) * 31) + this.c) * 31;
        String str2 = this.f2086a;
        int r2 = (r1 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f;
        return r2 + (str3 != null ? str3.hashCode() : 0);
    }

    public void setCategory(SearchType searchType) {
        this.e = searchType;
    }

    public void setCity(String str) {
        this.b = str;
    }

    public void setExtensions(String str) {
        this.f = str;
    }

    public void setPageNumber(int r2) {
        if (r2 < 1) {
            r2 = 1;
        }
        this.d = r2;
    }

    public void setPageSize(int r1) {
        this.c = r1;
    }

    public void setQueryString(String str) {
        this.f2086a = str;
    }

    public boolean weakEquals(BusLineQuery busLineQuery) {
        if (this == busLineQuery) {
            return true;
        }
        if (busLineQuery == null) {
            return false;
        }
        if (this.f2086a == null) {
            if (busLineQuery.getQueryString() != null) {
                return false;
            }
        } else if (!busLineQuery.getQueryString().equals(this.f2086a)) {
            return false;
        }
        if (this.b == null) {
            if (busLineQuery.getCity() != null) {
                return false;
            }
        } else if (!busLineQuery.getCity().equals(this.b)) {
            return false;
        }
        return this.c == busLineQuery.getPageSize() && busLineQuery.getCategory().compareTo(this.e) == 0;
    }

    /* JADX INFO: renamed from: clone, reason: merged with bridge method [inline-methods] */
    public BusLineQuery m6885clone() {
        BusLineQuery busLineQuery = new BusLineQuery(this.f2086a, this.e, this.b);
        busLineQuery.setPageNumber(this.d);
        busLineQuery.setPageSize(this.c);
        busLineQuery.setExtensions(this.f);
        return busLineQuery;
    }
}
