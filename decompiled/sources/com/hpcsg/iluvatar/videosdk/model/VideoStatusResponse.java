package com.hpcsg.iluvatar.videosdk.model;

/* loaded from: classes12.dex */
public class VideoStatusResponse {
    private Status status;

    public enum Status {
        SUCCESS,
        PROCESSING,
        FAILED,
        NOT_FOUND
    }

    public Status getStatus() {
        return this.status;
    }
}
