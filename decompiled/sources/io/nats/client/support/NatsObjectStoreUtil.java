package io.nats.client.support;

import io.nats.client.impl.Headers;
import java.nio.charset.StandardCharsets;
import java.util.Base64;

/* loaded from: classes6.dex */
public abstract class NatsObjectStoreUtil {
    public static final int DEFAULT_CHUNK_SIZE = 131072;
    public static final String OBJ_CHUNK_PART = ".C";
    public static final String OBJ_META_PART = ".M";
    public static final String OBJ_STREAM_PREFIX = "OBJ_";
    public static final int OBJ_STREAM_PREFIX_LEN = OBJ_STREAM_PREFIX.length();
    public static final String OBJ_SUBJECT_PREFIX = "$O.";
    public static final String OBJ_SUBJECT_SUFFIX = ".>";

    private NatsObjectStoreUtil() {
    }

    public static String extractBucketName(String str) {
        return str.substring(OBJ_STREAM_PREFIX_LEN);
    }

    public static String toStreamName(String str) {
        return OBJ_STREAM_PREFIX + str;
    }

    public static String toMetaStreamSubject(String str) {
        return OBJ_SUBJECT_PREFIX + str + ".M.>";
    }

    public static String toChunkStreamSubject(String str) {
        return OBJ_SUBJECT_PREFIX + str + ".C.>";
    }

    public static String toMetaPrefix(String str) {
        return OBJ_SUBJECT_PREFIX + str + ".M.";
    }

    public static String toChunkPrefix(String str) {
        return OBJ_SUBJECT_PREFIX + str + ".C.";
    }

    public static String encodeForSubject(String str) {
        return Base64.getEncoder().encodeToString(str.getBytes(StandardCharsets.UTF_8));
    }

    public static Headers getMetaHeaders() {
        return new Headers().put(NatsJetStreamConstants.ROLLUP_HDR, NatsJetStreamConstants.ROLLUP_HDR_SUBJECT);
    }
}
