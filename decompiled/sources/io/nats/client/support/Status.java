package io.nats.client.support;

import java.util.HashMap;
import java.util.Map;

/* loaded from: classes6.dex */
public class Status {
    public static String BAD_REQUEST = "Bad Request";
    public static final int BAD_REQUEST_CODE = 400;
    public static String BATCH_COMPLETED = "Batch Completed";
    private static final Map<Integer, String> CODE_TO_TEXT;
    public static final int CONFLICT_CODE = 409;
    public static String CONSUMER_DELETED = "Consumer Deleted";
    public static String CONSUMER_IS_PUSH_BASED = "Consumer is push based";
    public static String EXCEEDED_MAX_REQUEST_BATCH = "Exceeded MaxRequestBatch";
    public static String EXCEEDED_MAX_REQUEST_EXPIRES = "Exceeded MaxRequestExpires";
    public static String EXCEEDED_MAX_REQUEST_MAX_BYTES = "Exceeded MaxRequestMaxBytes";
    public static String EXCEEDED_MAX_WAITING = "Exceeded MaxWaiting";
    public static final String FLOW_CONTROL_TEXT = "FlowControl Request";
    public static final int FLOW_OR_HEARTBEAT_STATUS_CODE = 100;
    public static final String HEARTBEAT_TEXT = "Idle Heartbeat";
    public static String MESSAGE_SIZE_EXCEEDS_MAX_BYTES = "Message Size Exceeds MaxBytes";
    public static final int NOT_FOUND_CODE = 404;
    public static String NO_MESSAGES = "No Messages";
    public static final int NO_RESPONDERS_CODE = 503;
    public static final String NO_RESPONDERS_TEXT = "No Responders Available For Request";
    public static final int REQUEST_TIMEOUT_CODE = 408;
    private final int code;
    private final String message;

    static {
        HashMap hashMap = new HashMap();
        CODE_TO_TEXT = hashMap;
        hashMap.put(503, NO_RESPONDERS_TEXT);
    }

    public Status(int i, String str) {
        this.code = i;
        this.message = str == null ? makeMessage(i) : str;
    }

    public Status(Token token, Token token2) {
        this(extractCode(token), extractMessage(token2));
    }

    public int getCode() {
        return this.code;
    }

    public String getMessage() {
        return this.message;
    }

    public String getMessageWithCode() {
        return this.code + " " + this.message;
    }

    private static String extractMessage(Token token) {
        if (token.hasValue()) {
            return token.getValue();
        }
        return null;
    }

    private static int extractCode(Token token) {
        try {
            return Integer.parseInt(token.getValue());
        } catch (Exception unused) {
            throw new IllegalArgumentException(NatsConstants.INVALID_HEADER_STATUS_CODE);
        }
    }

    private String makeMessage(int i) {
        String str = CODE_TO_TEXT.get(Integer.valueOf(i));
        return str == null ? "Server Status Message: " + i : str;
    }

    public String toString() {
        return "Status{code=" + this.code + ", message='" + this.message + "'}";
    }

    public boolean isFlowControl() {
        return this.code == 100 && this.message.equals(FLOW_CONTROL_TEXT);
    }

    public boolean isHeartbeat() {
        return this.code == 100 && this.message.equals(HEARTBEAT_TEXT);
    }

    public boolean isNoResponders() {
        return this.code == 503 && this.message.equals(NO_RESPONDERS_TEXT);
    }
}
