package io.nats.client.support;

import io.nats.client.Message;
import io.nats.client.api.KeyValueOperation;
import io.nats.client.impl.Headers;

/* loaded from: classes6.dex */
public abstract class NatsKeyValueUtil {
    public static final String KV_OPERATION_HEADER_KEY = "KV-Operation";
    public static final String KV_STREAM_PREFIX = "KV_";
    public static final int KV_STREAM_PREFIX_LEN = KV_STREAM_PREFIX.length();
    public static final String KV_SUBJECT_PREFIX = "$KV.";
    public static final String KV_SUBJECT_SUFFIX = ".>";

    private NatsKeyValueUtil() {
    }

    public static String extractBucketName(String str) {
        return str.substring(KV_STREAM_PREFIX_LEN);
    }

    public static String toStreamName(String str) {
        return KV_STREAM_PREFIX + str;
    }

    public static String toStreamSubject(String str) {
        return KV_SUBJECT_PREFIX + str + ".>";
    }

    public static String toKeyPrefix(String str) {
        return KV_SUBJECT_PREFIX + str + ".";
    }

    public static boolean hasPrefix(String str) {
        return str.startsWith(KV_STREAM_PREFIX);
    }

    public static String trimPrefix(String str) {
        return str.startsWith(KV_STREAM_PREFIX) ? str.substring(KV_STREAM_PREFIX.length()) : str;
    }

    public static String getOperationHeader(Headers headers) {
        if (headers == null) {
            return null;
        }
        return headers.getFirst(KV_OPERATION_HEADER_KEY);
    }

    public static KeyValueOperation getOperation(Headers headers) {
        return KeyValueOperation.getOrDefault(getOperationHeader(headers), KeyValueOperation.PUT);
    }

    public static Headers getDeleteHeaders() {
        return new Headers().put(KV_OPERATION_HEADER_KEY, KeyValueOperation.DELETE.getHeaderValue());
    }

    public static Headers getPurgeHeaders() {
        return new Headers().put(KV_OPERATION_HEADER_KEY, KeyValueOperation.PURGE.getHeaderValue()).put(NatsJetStreamConstants.ROLLUP_HDR, NatsJetStreamConstants.ROLLUP_HDR_SUBJECT);
    }

    public static class BucketAndKey {
        public final String bucket;
        public final String key;

        public BucketAndKey(Message message) {
            this(message.getSubject());
        }

        public BucketAndKey(String str) {
            String[] split = str.split("\\Q.\\E", 3);
            this.bucket = split[1];
            this.key = split[2];
        }

        public boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (obj == null || getClass() != obj.getClass()) {
                return false;
            }
            BucketAndKey bucketAndKey = (BucketAndKey) obj;
            if (this.bucket.equals(bucketAndKey.bucket)) {
                return this.key.equals(bucketAndKey.key);
            }
            return false;
        }

        public int hashCode() {
            return (this.bucket.hashCode() * 31) + this.key.hashCode();
        }
    }
}
