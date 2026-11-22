package com.baidu.mapapi.bikenavi.model;

/* loaded from: classes13.dex */
public class BikeSimpleMapInfo {
    private int distToNextGP;
    private String nextRouteName;
    private boolean nextStepTurnMsg;
    private int paragraphLength;

    public int getDistToNextGP() {
        return this.distToNextGP;
    }

    public String getNextRouteName() {
        return this.nextRouteName;
    }

    public int getParagraphLength() {
        return this.paragraphLength;
    }

    public boolean isNextStepTurnMsg() {
        return this.nextStepTurnMsg;
    }

    public void setDistToNextGP(int i) {
        this.distToNextGP = i;
    }

    public void setNextRouteName(String str) {
        this.nextRouteName = str;
    }

    public void setNextStepTurnMsg(boolean z) {
        this.nextStepTurnMsg = z;
    }

    public void setParagraphLength(int i) {
        this.paragraphLength = i;
    }
}
