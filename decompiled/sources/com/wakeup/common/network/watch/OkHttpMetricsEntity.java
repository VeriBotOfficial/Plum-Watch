package com.wakeup.common.network.watch;

import android.os.SystemClock;
import com.yandex.div.core.timer.TimerController;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.Request;
import okhttp3.Response;

/* compiled from: OkHttpMetricsEntity.kt */
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\bG\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010p\u001a\u00020qJ\u0006\u0010r\u001a\u00020qR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\u0007\"\u0004\b\f\u0010\tR\u001a\u0010\r\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u0007\"\u0004\b\u000f\u0010\tR\u001a\u0010\u0010\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0007\"\u0004\b\u0012\u0010\tR\u001a\u0010\u0013\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0007\"\u0004\b\u0015\u0010\tR\u001a\u0010\u0016\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0007\"\u0004\b\u0018\u0010\tR\u001a\u0010\u0019\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001a\u0010\u0007\"\u0004\b\u001b\u0010\tR\u001a\u0010\u001c\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0007\"\u0004\b\u001e\u0010\tR\u001a\u0010\u001f\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b \u0010\u0007\"\u0004\b!\u0010\tR\u001a\u0010\"\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0007\"\u0004\b$\u0010\tR\u001a\u0010%\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010\u0007\"\u0004\b'\u0010\tR\u001a\u0010(\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0007\"\u0004\b*\u0010\tR\u001a\u0010+\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b,\u0010\u0007\"\u0004\b-\u0010\tR\u001a\u0010.\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u0010\u0007\"\u0004\b0\u0010\tR\u001a\u00101\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b2\u0010\u0007\"\u0004\b3\u0010\tR\u001a\u00104\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b5\u0010\u0007\"\u0004\b6\u0010\tR\u001a\u00107\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b8\u0010\u0007\"\u0004\b9\u0010\tR\u001a\u0010:\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b;\u0010\u0007\"\u0004\b<\u0010\tR\u001a\u0010=\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b>\u0010\u0007\"\u0004\b?\u0010\tR\u001a\u0010@\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bA\u0010\u0007\"\u0004\bB\u0010\tR\u001a\u0010C\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bD\u0010\u0007\"\u0004\bE\u0010\tR\u001a\u0010F\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bG\u0010\u0007\"\u0004\bH\u0010\tR\u001a\u0010I\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bJ\u0010\u0007\"\u0004\bK\u0010\tR\u001c\u0010L\u001a\u0004\u0018\u00010MX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bN\u0010O\"\u0004\bP\u0010QR\u001a\u0010R\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bS\u0010\u0007\"\u0004\bT\u0010\tR\u001c\u0010U\u001a\u0004\u0018\u00010VX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bW\u0010X\"\u0004\bY\u0010ZR\u001a\u0010[\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\\\u0010\u0007\"\u0004\b]\u0010\tR\u001a\u0010^\u001a\u00020_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR\u001a\u0010d\u001a\u00020_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\be\u0010a\"\u0004\bf\u0010cR\u001a\u0010g\u001a\u00020_X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bh\u0010a\"\u0004\bi\u0010cR\u001a\u0010j\u001a\u00020kX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\bl\u0010m\"\u0004\bn\u0010o¨\u0006s"}, d2 = {"Lcom/wakeup/common/network/watch/OkHttpMetricsEntity;", "", "<init>", "()V", "callStartTimestamp", "", "getCallStartTimestamp", "()J", "setCallStartTimestamp", "(J)V", "realExecuteTimestamp", "getRealExecuteTimestamp", "setRealExecuteTimestamp", "dnsStartTimestamp", "getDnsStartTimestamp", "setDnsStartTimestamp", "dnsEndTimestamp", "getDnsEndTimestamp", "setDnsEndTimestamp", "connectStartTimestamp", "getConnectStartTimestamp", "setConnectStartTimestamp", "connectEndTimestamp", "getConnectEndTimestamp", "setConnectEndTimestamp", "connectFailedTimestamp", "getConnectFailedTimestamp", "setConnectFailedTimestamp", "requestHeadersStartTimestamp", "getRequestHeadersStartTimestamp", "setRequestHeadersStartTimestamp", "requestHeadersEndTimestamp", "getRequestHeadersEndTimestamp", "setRequestHeadersEndTimestamp", "requestBodyStartTimestamp", "getRequestBodyStartTimestamp", "setRequestBodyStartTimestamp", "requestBodyEndTimestamp", "getRequestBodyEndTimestamp", "setRequestBodyEndTimestamp", "requestFailedTimestamp", "getRequestFailedTimestamp", "setRequestFailedTimestamp", "responseHeadersStartTimestamp", "getResponseHeadersStartTimestamp", "setResponseHeadersStartTimestamp", "responseHeadersEndTimestamp", "getResponseHeadersEndTimestamp", "setResponseHeadersEndTimestamp", "responseBodyStartTimestamp", "getResponseBodyStartTimestamp", "setResponseBodyStartTimestamp", "responseBodyEndTimestamp", "getResponseBodyEndTimestamp", "setResponseBodyEndTimestamp", "responseFailedTimestamp", "getResponseFailedTimestamp", "setResponseFailedTimestamp", "callEndTimestamp", "getCallEndTimestamp", "setCallEndTimestamp", "callFailedTimestamp", "getCallFailedTimestamp", "setCallFailedTimestamp", "canceledTimestamp", "getCanceledTimestamp", "setCanceledTimestamp", "callFinishTimestamp", "getCallFinishTimestamp", "setCallFinishTimestamp", "connectAcquiredTimestamp", "getConnectAcquiredTimestamp", "setConnectAcquiredTimestamp", "connectReleaseTimestamp", "getConnectReleaseTimestamp", "setConnectReleaseTimestamp", "request", "Lokhttp3/Request;", "getRequest", "()Lokhttp3/Request;", "setRequest", "(Lokhttp3/Request;)V", "requestBodyByteCount", "getRequestBodyByteCount", "setRequestBodyByteCount", "response", "Lokhttp3/Response;", "getResponse", "()Lokhttp3/Response;", "setResponse", "(Lokhttp3/Response;)V", "responseBodyByteCount", "getResponseBodyByteCount", "setResponseBodyByteCount", "dnsCached", "", "getDnsCached", "()Z", "setDnsCached", "(Z)V", "phoneCall", "getPhoneCall", "setPhoneCall", "bgRun", "getBgRun", "setBgRun", "protocol", "", "getProtocol", "()Ljava/lang/String;", "setProtocol", "(Ljava/lang/String;)V", "updateRealExecuteTimestamp", "", TimerController.RESET_COMMAND, "common_overseasRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OkHttpMetricsEntity {
    private boolean bgRun;
    private long callEndTimestamp;
    private long callFailedTimestamp;
    private long callFinishTimestamp;
    private long callStartTimestamp;
    private long canceledTimestamp;
    private long connectAcquiredTimestamp;
    private long connectEndTimestamp;
    private long connectFailedTimestamp;
    private long connectReleaseTimestamp;
    private long connectStartTimestamp;
    private boolean dnsCached;
    private long dnsEndTimestamp;
    private long dnsStartTimestamp;
    private boolean phoneCall;
    private String protocol = "";
    private long realExecuteTimestamp;
    private Request request;
    private long requestBodyByteCount;
    private long requestBodyEndTimestamp;
    private long requestBodyStartTimestamp;
    private long requestFailedTimestamp;
    private long requestHeadersEndTimestamp;
    private long requestHeadersStartTimestamp;
    private Response response;
    private long responseBodyByteCount;
    private long responseBodyEndTimestamp;
    private long responseBodyStartTimestamp;
    private long responseFailedTimestamp;
    private long responseHeadersEndTimestamp;
    private long responseHeadersStartTimestamp;

    public final long getCallStartTimestamp() {
        return this.callStartTimestamp;
    }

    public final void setCallStartTimestamp(long j) {
        this.callStartTimestamp = j;
    }

    public final long getRealExecuteTimestamp() {
        return this.realExecuteTimestamp;
    }

    public final void setRealExecuteTimestamp(long j) {
        this.realExecuteTimestamp = j;
    }

    public final long getDnsStartTimestamp() {
        return this.dnsStartTimestamp;
    }

    public final void setDnsStartTimestamp(long j) {
        this.dnsStartTimestamp = j;
    }

    public final long getDnsEndTimestamp() {
        return this.dnsEndTimestamp;
    }

    public final void setDnsEndTimestamp(long j) {
        this.dnsEndTimestamp = j;
    }

    public final long getConnectStartTimestamp() {
        return this.connectStartTimestamp;
    }

    public final void setConnectStartTimestamp(long j) {
        this.connectStartTimestamp = j;
    }

    public final long getConnectEndTimestamp() {
        return this.connectEndTimestamp;
    }

    public final void setConnectEndTimestamp(long j) {
        this.connectEndTimestamp = j;
    }

    public final long getConnectFailedTimestamp() {
        return this.connectFailedTimestamp;
    }

    public final void setConnectFailedTimestamp(long j) {
        this.connectFailedTimestamp = j;
    }

    public final long getRequestHeadersStartTimestamp() {
        return this.requestHeadersStartTimestamp;
    }

    public final void setRequestHeadersStartTimestamp(long j) {
        this.requestHeadersStartTimestamp = j;
    }

    public final long getRequestHeadersEndTimestamp() {
        return this.requestHeadersEndTimestamp;
    }

    public final void setRequestHeadersEndTimestamp(long j) {
        this.requestHeadersEndTimestamp = j;
    }

    public final long getRequestBodyStartTimestamp() {
        return this.requestBodyStartTimestamp;
    }

    public final void setRequestBodyStartTimestamp(long j) {
        this.requestBodyStartTimestamp = j;
    }

    public final long getRequestBodyEndTimestamp() {
        return this.requestBodyEndTimestamp;
    }

    public final void setRequestBodyEndTimestamp(long j) {
        this.requestBodyEndTimestamp = j;
    }

    public final long getRequestFailedTimestamp() {
        return this.requestFailedTimestamp;
    }

    public final void setRequestFailedTimestamp(long j) {
        this.requestFailedTimestamp = j;
    }

    public final long getResponseHeadersStartTimestamp() {
        return this.responseHeadersStartTimestamp;
    }

    public final void setResponseHeadersStartTimestamp(long j) {
        this.responseHeadersStartTimestamp = j;
    }

    public final long getResponseHeadersEndTimestamp() {
        return this.responseHeadersEndTimestamp;
    }

    public final void setResponseHeadersEndTimestamp(long j) {
        this.responseHeadersEndTimestamp = j;
    }

    public final long getResponseBodyStartTimestamp() {
        return this.responseBodyStartTimestamp;
    }

    public final void setResponseBodyStartTimestamp(long j) {
        this.responseBodyStartTimestamp = j;
    }

    public final long getResponseBodyEndTimestamp() {
        return this.responseBodyEndTimestamp;
    }

    public final void setResponseBodyEndTimestamp(long j) {
        this.responseBodyEndTimestamp = j;
    }

    public final long getResponseFailedTimestamp() {
        return this.responseFailedTimestamp;
    }

    public final void setResponseFailedTimestamp(long j) {
        this.responseFailedTimestamp = j;
    }

    public final long getCallEndTimestamp() {
        return this.callEndTimestamp;
    }

    public final void setCallEndTimestamp(long j) {
        this.callEndTimestamp = j;
    }

    public final long getCallFailedTimestamp() {
        return this.callFailedTimestamp;
    }

    public final void setCallFailedTimestamp(long j) {
        this.callFailedTimestamp = j;
    }

    public final long getCanceledTimestamp() {
        return this.canceledTimestamp;
    }

    public final void setCanceledTimestamp(long j) {
        this.canceledTimestamp = j;
    }

    public final long getCallFinishTimestamp() {
        return this.callFinishTimestamp;
    }

    public final void setCallFinishTimestamp(long j) {
        this.callFinishTimestamp = j;
    }

    public final long getConnectAcquiredTimestamp() {
        return this.connectAcquiredTimestamp;
    }

    public final void setConnectAcquiredTimestamp(long j) {
        this.connectAcquiredTimestamp = j;
    }

    public final long getConnectReleaseTimestamp() {
        return this.connectReleaseTimestamp;
    }

    public final void setConnectReleaseTimestamp(long j) {
        this.connectReleaseTimestamp = j;
    }

    public final Request getRequest() {
        return this.request;
    }

    public final void setRequest(Request request) {
        this.request = request;
    }

    public final long getRequestBodyByteCount() {
        return this.requestBodyByteCount;
    }

    public final void setRequestBodyByteCount(long j) {
        this.requestBodyByteCount = j;
    }

    public final Response getResponse() {
        return this.response;
    }

    public final void setResponse(Response response) {
        this.response = response;
    }

    public final long getResponseBodyByteCount() {
        return this.responseBodyByteCount;
    }

    public final void setResponseBodyByteCount(long j) {
        this.responseBodyByteCount = j;
    }

    public final boolean getDnsCached() {
        return this.dnsCached;
    }

    public final void setDnsCached(boolean z) {
        this.dnsCached = z;
    }

    public final boolean getPhoneCall() {
        return this.phoneCall;
    }

    public final void setPhoneCall(boolean z) {
        this.phoneCall = z;
    }

    public final boolean getBgRun() {
        return this.bgRun;
    }

    public final void setBgRun(boolean z) {
        this.bgRun = z;
    }

    public final String getProtocol() {
        return this.protocol;
    }

    public final void setProtocol(String str) {
        Intrinsics.checkNotNullParameter(str, "<set-?>");
        this.protocol = str;
    }

    public final void updateRealExecuteTimestamp() {
        if (this.realExecuteTimestamp == 0) {
            this.realExecuteTimestamp = SystemClock.elapsedRealtime();
        }
    }

    public final void reset() {
        this.callStartTimestamp = 0L;
        this.realExecuteTimestamp = 0L;
        this.dnsStartTimestamp = 0L;
        this.dnsEndTimestamp = 0L;
        this.connectStartTimestamp = 0L;
        this.connectEndTimestamp = 0L;
        this.connectFailedTimestamp = 0L;
        this.requestHeadersStartTimestamp = 0L;
        this.requestHeadersEndTimestamp = 0L;
        this.requestBodyStartTimestamp = 0L;
        this.requestBodyEndTimestamp = 0L;
        this.requestFailedTimestamp = 0L;
        this.responseHeadersStartTimestamp = 0L;
        this.responseHeadersEndTimestamp = 0L;
        this.responseBodyStartTimestamp = 0L;
        this.responseBodyEndTimestamp = 0L;
        this.responseFailedTimestamp = 0L;
        this.callEndTimestamp = 0L;
        this.callFailedTimestamp = 0L;
        this.canceledTimestamp = 0L;
        this.callFinishTimestamp = 0L;
        this.connectAcquiredTimestamp = 0L;
        this.request = null;
        this.requestBodyByteCount = 0L;
        this.response = null;
        this.responseBodyByteCount = 0L;
        this.dnsCached = false;
        this.phoneCall = false;
        this.bgRun = false;
        this.protocol = "";
    }
}
