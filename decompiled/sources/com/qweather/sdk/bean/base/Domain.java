package com.qweather.sdk.bean.base;

/* loaded from: classes17.dex */
public class Domain {
    private String domainApi;
    private String domainDatasetApi;
    private String domainDevApi;
    private String domainGeoApi;
    private Integer domainTimeout;

    public String getDomainApi() {
        return this.domainApi;
    }

    public void setDomainApi(String str) {
        this.domainApi = str;
    }

    public String getDomainDevApi() {
        return this.domainDevApi;
    }

    public void setDomainDevApi(String str) {
        this.domainDevApi = str;
    }

    public String getDomainGeoApi() {
        return this.domainGeoApi;
    }

    public void setDomainGeoApi(String str) {
        this.domainGeoApi = str;
    }

    public String getDomainDatasetApi() {
        return this.domainDatasetApi;
    }

    public void setDomainDatasetApi(String str) {
        this.domainDatasetApi = str;
    }

    public Integer getDomainTimeout() {
        return this.domainTimeout;
    }

    public void setDomainTimeout(Integer num) {
        this.domainTimeout = num;
    }
}
