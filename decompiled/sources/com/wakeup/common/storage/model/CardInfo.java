package com.wakeup.common.storage.model;

import java.io.Serializable;

/* loaded from: classes2.dex */
public class CardInfo implements Serializable {
    private String NFCCardUID;
    private int bgID;
    private String cardName;

    /* renamed from: id, reason: collision with root package name */
    private String f14275id;

    public void setId(String id2) {
        this.f14275id = id2;
    }

    public String getId() {
        return this.f14275id;
    }

    public String getNFCCardUID() {
        return this.NFCCardUID;
    }

    public void setNFCCardUID(String NFCCardUID) {
        this.NFCCardUID = NFCCardUID;
    }

    public String getCardName() {
        return this.cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

    public int getBgID() {
        return this.bgID;
    }

    public void setBgID(int bgID) {
        this.bgID = bgID;
    }

    public String toString() {
        return "CardInfo{id=" + this.f14275id + ", cardName='" + this.cardName + "', bgID=" + this.bgID + ", NFCCardUID='" + this.NFCCardUID + "'}";
    }
}
