package com.wakeup.common.network.entity.other;

import com.alipay.sdk.m.c0.d;
import com.anythink.core.d.l;
import com.facebook.hermes.intl.Constants;
import com.tencent.open.SocialConstants;
import kotlin.Metadata;

/* compiled from: AdvertiseModel.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b?\u0018\u00002\u00020\u0001B\u008f\u0002\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u001a\u0010\u001bR\u001e\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR\u001e\u0010\u0004\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR\u001e\u0010\u0005\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b#\u0010\u001d\"\u0004\b$\u0010\u001fR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b%\u0010\u001d\"\u0004\b&\u0010\u001fR\u001e\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b'\u0010\u001d\"\u0004\b(\u0010\u001fR\u001e\u0010\b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b)\u0010\u001d\"\u0004\b*\u0010\u001fR\u001e\u0010\t\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b+\u0010\u001d\"\u0004\b,\u0010\u001fR\u001e\u0010\n\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b-\u0010\u001d\"\u0004\b.\u0010\u001fR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b/\u0010\u001d\"\u0004\b0\u0010\u001fR\u001e\u0010\f\u001a\u0004\u0018\u00010\u0003X\u0086\u000e¢\u0006\u0010\n\u0002\u0010 \u001a\u0004\b1\u0010\u001d\"\u0004\b2\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b3\u00104\"\u0004\b5\u00106R\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b7\u00104\"\u0004\b8\u00106R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b9\u00104\"\u0004\b:\u00106R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b=\u00104\"\u0004\b>\u00106R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b?\u00104\"\u0004\b@\u00106R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u00104\"\u0004\bB\u00106R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bC\u00104\"\u0004\bD\u00106R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bE\u00104\"\u0004\bF\u00106R\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u00104\"\u0004\bH\u00106R\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bI\u00104\"\u0004\bJ\u00106R\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u000eX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bK\u00104\"\u0004\bL\u00106¨\u0006M"}, d2 = {"Lcom/wakeup/common/network/entity/other/AdvertiseModel;", "", "id", "", "advMenuId", "platform", "languageId", "jumpType", "status", "popFrequency", "areaType", "menuId", Constants.SORT, "advName", "", "name", "url", SocialConstants.PARAM_IMG_URL, "title", "onlineTimeStr", "onlineTimeAndOfflineTime", "offlineTimeStr", "createTime", l.a.ac, "onlineTime", "offlineTime", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getId", "()Ljava/lang/Integer;", "setId", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getAdvMenuId", "setAdvMenuId", "getPlatform", "setPlatform", "getLanguageId", "setLanguageId", "getJumpType", "setJumpType", "getStatus", "setStatus", "getPopFrequency", "setPopFrequency", "getAreaType", "setAreaType", "getMenuId", "setMenuId", "getSort", "setSort", "getAdvName", "()Ljava/lang/String;", "setAdvName", "(Ljava/lang/String;)V", "getName", "setName", "getUrl", "setUrl", "getImg", "setImg", "getTitle", d.p, "getOnlineTimeStr", "setOnlineTimeStr", "getOnlineTimeAndOfflineTime", "setOnlineTimeAndOfflineTime", "getOfflineTimeStr", "setOfflineTimeStr", "getCreateTime", "setCreateTime", "getUpdateTime", "setUpdateTime", "getOnlineTime", "setOnlineTime", "getOfflineTime", "setOfflineTime", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdvertiseModel {
    private Integer advMenuId;
    private String advName;
    private Integer areaType;
    private String createTime;
    private Integer id;
    private String img;
    private Integer jumpType;
    private Integer languageId;
    private Integer menuId;
    private String name;
    private String offlineTime;
    private String offlineTimeStr;
    private String onlineTime;
    private String onlineTimeAndOfflineTime;
    private String onlineTimeStr;
    private Integer platform;
    private Integer popFrequency;
    private Integer sort;
    private Integer status;
    private String title;
    private String updateTime;
    private String url;

    public AdvertiseModel() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 4194303, null);
    }

    public AdvertiseModel(Integer num, Integer num2, Integer num3, Integer num4, Integer num5, Integer num6, Integer num7, Integer num8, Integer num9, Integer num10, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, String str11, String str12) {
        this.id = num;
        this.advMenuId = num2;
        this.platform = num3;
        this.languageId = num4;
        this.jumpType = num5;
        this.status = num6;
        this.popFrequency = num7;
        this.areaType = num8;
        this.menuId = num9;
        this.sort = num10;
        this.advName = str;
        this.name = str2;
        this.url = str3;
        this.img = str4;
        this.title = str5;
        this.onlineTimeStr = str6;
        this.onlineTimeAndOfflineTime = str7;
        this.offlineTimeStr = str8;
        this.createTime = str9;
        this.updateTime = str10;
        this.onlineTime = str11;
        this.offlineTime = str12;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public /* synthetic */ AdvertiseModel(java.lang.Integer r24, java.lang.Integer r25, java.lang.Integer r26, java.lang.Integer r27, java.lang.Integer r28, java.lang.Integer r29, java.lang.Integer r30, java.lang.Integer r31, java.lang.Integer r32, java.lang.Integer r33, java.lang.String r34, java.lang.String r35, java.lang.String r36, java.lang.String r37, java.lang.String r38, java.lang.String r39, java.lang.String r40, java.lang.String r41, java.lang.String r42, java.lang.String r43, java.lang.String r44, java.lang.String r45, int r46, kotlin.jvm.internal.DefaultConstructorMarker r47) {
        /*
            Method dump skipped, instructions count: 277
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.wakeup.common.network.entity.other.AdvertiseModel.<init>(java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.Integer, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, java.lang.String, int, kotlin.jvm.internal.DefaultConstructorMarker):void");
    }

    public final Integer getId() {
        return this.id;
    }

    public final void setId(Integer num) {
        this.id = num;
    }

    public final Integer getAdvMenuId() {
        return this.advMenuId;
    }

    public final void setAdvMenuId(Integer num) {
        this.advMenuId = num;
    }

    public final Integer getPlatform() {
        return this.platform;
    }

    public final void setPlatform(Integer num) {
        this.platform = num;
    }

    public final Integer getLanguageId() {
        return this.languageId;
    }

    public final void setLanguageId(Integer num) {
        this.languageId = num;
    }

    public final Integer getJumpType() {
        return this.jumpType;
    }

    public final void setJumpType(Integer num) {
        this.jumpType = num;
    }

    public final Integer getStatus() {
        return this.status;
    }

    public final void setStatus(Integer num) {
        this.status = num;
    }

    public final Integer getPopFrequency() {
        return this.popFrequency;
    }

    public final void setPopFrequency(Integer num) {
        this.popFrequency = num;
    }

    public final Integer getAreaType() {
        return this.areaType;
    }

    public final void setAreaType(Integer num) {
        this.areaType = num;
    }

    public final Integer getMenuId() {
        return this.menuId;
    }

    public final void setMenuId(Integer num) {
        this.menuId = num;
    }

    public final Integer getSort() {
        return this.sort;
    }

    public final void setSort(Integer num) {
        this.sort = num;
    }

    public final String getAdvName() {
        return this.advName;
    }

    public final void setAdvName(String str) {
        this.advName = str;
    }

    public final String getName() {
        return this.name;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public final String getImg() {
        return this.img;
    }

    public final void setImg(String str) {
        this.img = str;
    }

    public final String getTitle() {
        return this.title;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final String getOnlineTimeStr() {
        return this.onlineTimeStr;
    }

    public final void setOnlineTimeStr(String str) {
        this.onlineTimeStr = str;
    }

    public final String getOnlineTimeAndOfflineTime() {
        return this.onlineTimeAndOfflineTime;
    }

    public final void setOnlineTimeAndOfflineTime(String str) {
        this.onlineTimeAndOfflineTime = str;
    }

    public final String getOfflineTimeStr() {
        return this.offlineTimeStr;
    }

    public final void setOfflineTimeStr(String str) {
        this.offlineTimeStr = str;
    }

    public final String getCreateTime() {
        return this.createTime;
    }

    public final void setCreateTime(String str) {
        this.createTime = str;
    }

    public final String getUpdateTime() {
        return this.updateTime;
    }

    public final void setUpdateTime(String str) {
        this.updateTime = str;
    }

    public final String getOnlineTime() {
        return this.onlineTime;
    }

    public final void setOnlineTime(String str) {
        this.onlineTime = str;
    }

    public final String getOfflineTime() {
        return this.offlineTime;
    }

    public final void setOfflineTime(String str) {
        this.offlineTime = str;
    }
}
