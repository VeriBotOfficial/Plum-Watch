package com.hispark.clouddiag.manager;

import java.util.Arrays;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CompletableDeferred;

/* compiled from: MqttPublishPriorityQueue.kt */
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0012\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\b\u0080\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001b\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\u0011\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000bHÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u0003HÆ\u0003J[\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010#\u001a\u00020\t2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010%\u001a\u00020&HÖ\u0001J\t\u0010'\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0016R\u0019\u0010\n\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0011R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u0011¨\u0006("}, d2 = {"Lcom/hispark/clouddiag/manager/QueuedMqttPublish;", "", "topic", "", "payload", "", "priority", "Lcom/hispark/clouddiag/manager/MqttPublishPriority;", "isBinary", "", "completion", "Lkotlinx/coroutines/CompletableDeferred;", "progressKey", "supersedesProgressKey", "<init>", "(Ljava/lang/String;[BLcom/hispark/clouddiag/manager/MqttPublishPriority;ZLkotlinx/coroutines/CompletableDeferred;Ljava/lang/String;Ljava/lang/String;)V", "getTopic", "()Ljava/lang/String;", "getPayload", "()[B", "getPriority", "()Lcom/hispark/clouddiag/manager/MqttPublishPriority;", "()Z", "getCompletion", "()Lkotlinx/coroutines/CompletableDeferred;", "getProgressKey", "getSupersedesProgressKey", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class QueuedMqttPublish {
    private final CompletableDeferred<Boolean> completion;
    private final boolean isBinary;
    private final byte[] payload;
    private final MqttPublishPriority priority;
    private final String progressKey;
    private final String supersedesProgressKey;
    private final String topic;

    public static /* synthetic */ QueuedMqttPublish copy$default(QueuedMqttPublish queuedMqttPublish, String str, byte[] bArr, MqttPublishPriority mqttPublishPriority, boolean z, CompletableDeferred completableDeferred, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = queuedMqttPublish.topic;
        }
        if ((i & 2) != 0) {
            bArr = queuedMqttPublish.payload;
        }
        if ((i & 4) != 0) {
            mqttPublishPriority = queuedMqttPublish.priority;
        }
        if ((i & 8) != 0) {
            z = queuedMqttPublish.isBinary;
        }
        if ((i & 16) != 0) {
            completableDeferred = queuedMqttPublish.completion;
        }
        if ((i & 32) != 0) {
            str2 = queuedMqttPublish.progressKey;
        }
        if ((i & 64) != 0) {
            str3 = queuedMqttPublish.supersedesProgressKey;
        }
        String str4 = str2;
        String str5 = str3;
        CompletableDeferred completableDeferred2 = completableDeferred;
        MqttPublishPriority mqttPublishPriority2 = mqttPublishPriority;
        return queuedMqttPublish.copy(str, bArr, mqttPublishPriority2, z, completableDeferred2, str4, str5);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTopic() {
        return this.topic;
    }

    /* renamed from: component2, reason: from getter */
    public final byte[] getPayload() {
        return this.payload;
    }

    /* renamed from: component3, reason: from getter */
    public final MqttPublishPriority getPriority() {
        return this.priority;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsBinary() {
        return this.isBinary;
    }

    public final CompletableDeferred<Boolean> component5() {
        return this.completion;
    }

    /* renamed from: component6, reason: from getter */
    public final String getProgressKey() {
        return this.progressKey;
    }

    /* renamed from: component7, reason: from getter */
    public final String getSupersedesProgressKey() {
        return this.supersedesProgressKey;
    }

    public final QueuedMqttPublish copy(String topic, byte[] payload, MqttPublishPriority priority, boolean isBinary, CompletableDeferred<Boolean> completion, String progressKey, String supersedesProgressKey) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(priority, "priority");
        return new QueuedMqttPublish(topic, payload, priority, isBinary, completion, progressKey, supersedesProgressKey);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QueuedMqttPublish)) {
            return false;
        }
        QueuedMqttPublish queuedMqttPublish = (QueuedMqttPublish) other;
        return Intrinsics.areEqual(this.topic, queuedMqttPublish.topic) && Intrinsics.areEqual(this.payload, queuedMqttPublish.payload) && this.priority == queuedMqttPublish.priority && this.isBinary == queuedMqttPublish.isBinary && Intrinsics.areEqual(this.completion, queuedMqttPublish.completion) && Intrinsics.areEqual(this.progressKey, queuedMqttPublish.progressKey) && Intrinsics.areEqual(this.supersedesProgressKey, queuedMqttPublish.supersedesProgressKey);
    }

    public int hashCode() {
        int hashCode = ((((((this.topic.hashCode() * 31) + Arrays.hashCode(this.payload)) * 31) + this.priority.hashCode()) * 31) + Boolean.hashCode(this.isBinary)) * 31;
        CompletableDeferred<Boolean> completableDeferred = this.completion;
        int hashCode2 = (hashCode + (completableDeferred == null ? 0 : completableDeferred.hashCode())) * 31;
        String str = this.progressKey;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.supersedesProgressKey;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public String toString() {
        return "QueuedMqttPublish(topic=" + this.topic + ", payload=" + Arrays.toString(this.payload) + ", priority=" + this.priority + ", isBinary=" + this.isBinary + ", completion=" + this.completion + ", progressKey=" + this.progressKey + ", supersedesProgressKey=" + this.supersedesProgressKey + ')';
    }

    public QueuedMqttPublish(String topic, byte[] payload, MqttPublishPriority priority, boolean z, CompletableDeferred<Boolean> completableDeferred, String str, String str2) {
        Intrinsics.checkNotNullParameter(topic, "topic");
        Intrinsics.checkNotNullParameter(payload, "payload");
        Intrinsics.checkNotNullParameter(priority, "priority");
        this.topic = topic;
        this.payload = payload;
        this.priority = priority;
        this.isBinary = z;
        this.completion = completableDeferred;
        this.progressKey = str;
        this.supersedesProgressKey = str2;
    }

    public /* synthetic */ QueuedMqttPublish(String str, byte[] bArr, MqttPublishPriority mqttPublishPriority, boolean z, CompletableDeferred completableDeferred, String str2, String str3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, bArr, mqttPublishPriority, z, (i & 16) != 0 ? null : completableDeferred, (i & 32) != 0 ? null : str2, (i & 64) != 0 ? null : str3);
    }

    public final String getTopic() {
        return this.topic;
    }

    public final byte[] getPayload() {
        return this.payload;
    }

    public final MqttPublishPriority getPriority() {
        return this.priority;
    }

    public final boolean isBinary() {
        return this.isBinary;
    }

    public final CompletableDeferred<Boolean> getCompletion() {
        return this.completion;
    }

    public final String getProgressKey() {
        return this.progressKey;
    }

    public final String getSupersedesProgressKey() {
        return this.supersedesProgressKey;
    }
}
