package com.wakeup.common.network.entity.sport;

import com.wakeup.common.rn.RnConstants;
import java.io.Serializable;
import kotlin.Metadata;

/* compiled from: SportUploadRecordResponse.kt */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u0007\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0011\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u001aX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001eR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001a\u0010(\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001a\u0010+\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001a\u0010.\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b0\u00101\"\u0004\b2\u00103R\u001a\u00104\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001a\u00107\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001a\u0010:\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\u001a\u0010=\u001a\u00020/X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u00101\"\u0004\b?\u00103¨\u0006@"}, d2 = {"Lcom/wakeup/common/network/entity/sport/SportUploadRecordResponse;", "Ljava/io/Serializable;", "<init>", "()V", "bestRecordId", "", "getBestRecordId", "()I", "setBestRecordId", "(I)V", "userId", "getUserId", "setUserId", "sportTypeId", "getSportTypeId", "setSportTypeId", "longestTime", "getLongestTime", "setLongestTime", "farthestDistance", "getFarthestDistance", "setFarthestDistance", "bestPace", "getBestPace", "setBestPace", "bestSpeed", "", "getBestSpeed", "()F", "setBestSpeed", "(F)V", "shortestTimeThreeKm", "getShortestTimeThreeKm", "setShortestTimeThreeKm", "shortestTimeFiveKm", "getShortestTimeFiveKm", "setShortestTimeFiveKm", "shortestTimeTenKm", "getShortestTimeTenKm", "setShortestTimeTenKm", "shortestTimeHalfMarathon", "getShortestTimeHalfMarathon", "setShortestTimeHalfMarathon", "shortestTimeFullMarathon", "getShortestTimeFullMarathon", "setShortestTimeFullMarathon", "startingTime", "", "getStartingTime", "()J", "setStartingTime", "(J)V", "shortestTime", "getShortestTime", "setShortestTime", "refresh", "getRefresh", "setRefresh", RnConstants.KEY_SPORT_COUNT, "getSportCount", "setSportCount", "appTime", "getAppTime", "setAppTime", "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class SportUploadRecordResponse implements Serializable {
    private long appTime;
    private int bestPace;
    private int bestRecordId;
    private float bestSpeed;
    private int farthestDistance;
    private int longestTime;
    private int refresh;
    private int shortestTime;
    private int shortestTimeFiveKm;
    private int shortestTimeFullMarathon;
    private int shortestTimeHalfMarathon;
    private int shortestTimeTenKm;
    private int shortestTimeThreeKm;
    private int sportCount;
    private int sportTypeId;
    private long startingTime;
    private int userId;

    public final int getBestRecordId() {
        return this.bestRecordId;
    }

    public final void setBestRecordId(int i) {
        this.bestRecordId = i;
    }

    public final int getUserId() {
        return this.userId;
    }

    public final void setUserId(int i) {
        this.userId = i;
    }

    public final int getSportTypeId() {
        return this.sportTypeId;
    }

    public final void setSportTypeId(int i) {
        this.sportTypeId = i;
    }

    public final int getLongestTime() {
        return this.longestTime;
    }

    public final void setLongestTime(int i) {
        this.longestTime = i;
    }

    public final int getFarthestDistance() {
        return this.farthestDistance;
    }

    public final void setFarthestDistance(int i) {
        this.farthestDistance = i;
    }

    public final int getBestPace() {
        return this.bestPace;
    }

    public final void setBestPace(int i) {
        this.bestPace = i;
    }

    public final float getBestSpeed() {
        return this.bestSpeed;
    }

    public final void setBestSpeed(float f) {
        this.bestSpeed = f;
    }

    public final int getShortestTimeThreeKm() {
        return this.shortestTimeThreeKm;
    }

    public final void setShortestTimeThreeKm(int i) {
        this.shortestTimeThreeKm = i;
    }

    public final int getShortestTimeFiveKm() {
        return this.shortestTimeFiveKm;
    }

    public final void setShortestTimeFiveKm(int i) {
        this.shortestTimeFiveKm = i;
    }

    public final int getShortestTimeTenKm() {
        return this.shortestTimeTenKm;
    }

    public final void setShortestTimeTenKm(int i) {
        this.shortestTimeTenKm = i;
    }

    public final int getShortestTimeHalfMarathon() {
        return this.shortestTimeHalfMarathon;
    }

    public final void setShortestTimeHalfMarathon(int i) {
        this.shortestTimeHalfMarathon = i;
    }

    public final int getShortestTimeFullMarathon() {
        return this.shortestTimeFullMarathon;
    }

    public final void setShortestTimeFullMarathon(int i) {
        this.shortestTimeFullMarathon = i;
    }

    public final long getStartingTime() {
        return this.startingTime;
    }

    public final void setStartingTime(long j) {
        this.startingTime = j;
    }

    public final int getShortestTime() {
        return this.shortestTime;
    }

    public final void setShortestTime(int i) {
        this.shortestTime = i;
    }

    public final int getRefresh() {
        return this.refresh;
    }

    public final void setRefresh(int i) {
        this.refresh = i;
    }

    public final int getSportCount() {
        return this.sportCount;
    }

    public final void setSportCount(int i) {
        this.sportCount = i;
    }

    public final long getAppTime() {
        return this.appTime;
    }

    public final void setAppTime(long j) {
        this.appTime = j;
    }
}
