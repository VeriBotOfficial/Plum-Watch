package com.wakeup.howear.view.device.home;

import com.chad.library.adapter.base.entity.MultiItemEntity;

/* loaded from: classes4.dex */
public class HomeDeviceItem implements MultiItemEntity {
    public static final int TYPE_ADD = 1;
    public static final int TYPE_DEVICE = 0;
    public static final int TYPE_GLASSES = 3;
    public static final int TYPE_HEADSET = 2;
    private int itemType = 0;
    private String mac = "";
    private String bleName = "";
    private String imageUrl = "";

    private HomeDeviceItem() {
    }

    public static HomeDeviceItem createDevice(String str, String str2, String str3) {
        return createDev(str, str2, str3, 0);
    }

    public static HomeDeviceItem createHeadset(String str, String str2, String str3) {
        return createDev(str, str2, str3, 2);
    }

    public static HomeDeviceItem createGlasses(String str, String str2, String str3) {
        return createDev(str, str2, str3, 3);
    }

    private static HomeDeviceItem createDev(String str, String str2, String str3, int i) {
        HomeDeviceItem homeDeviceItem = new HomeDeviceItem();
        homeDeviceItem.itemType = i;
        homeDeviceItem.mac = str;
        homeDeviceItem.bleName = str2;
        homeDeviceItem.imageUrl = str3;
        return homeDeviceItem;
    }

    public static HomeDeviceItem createAdd() {
        HomeDeviceItem homeDeviceItem = new HomeDeviceItem();
        homeDeviceItem.itemType = 1;
        return homeDeviceItem;
    }

    public String getMac() {
        return this.mac;
    }

    public String getBleName() {
        return this.bleName;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    @Override // com.chad.library.adapter.base.entity.MultiItemEntity
    public int getItemType() {
        return this.itemType;
    }
}
