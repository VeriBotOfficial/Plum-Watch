package io.nats.client.support;

import android.gov.nist.core.Separators;
import java.nio.charset.StandardCharsets;
import java.time.Duration;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.text.Typography;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes6.dex */
public abstract class Validator {
    static final char[] WILD_GT = {'*', Typography.greater};
    static final char[] WILD_GT_DOT = {'*', Typography.greater, '.'};
    static final char[] WILD_GT_DOT_SLASHES = {'*', Typography.greater, '.', AbstractJsonLexerKt.STRING_ESC, '/'};
    static final Pattern SEMVER_PATTERN = Pattern.compile("^(0|[1-9]\\d*)\\.(0|[1-9]\\d*)\\.(0|[1-9]\\d*)(?:-((?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*)(?:\\.(?:0|[1-9]\\d*|\\d*[a-zA-Z-][0-9a-zA-Z-]*))*))?(?:\\+([0-9a-zA-Z-]+(?:\\.[0-9a-zA-Z-]+)*))?$");

    interface Check {
        String check();
    }

    public static boolean isGtEqZero(long j) {
        return j >= 0;
    }

    public static boolean zeroOrLtMinus1(long j) {
        return j == 0 || j < -1;
    }

    private Validator() {
    }

    public static String validateSubject(String str, boolean z) {
        return validateSubject(str, "Subject", z, false);
    }

    public static String validateSubject(String str, String str2, boolean z, boolean z2) {
        if (emptyAsNull(str) == null) {
            if (z) {
                throw new IllegalArgumentException(str2 + " cannot be null or empty.");
            }
            return null;
        }
        String[] split = str.split("\\.");
        for (int i = 0; i < split.length; i++) {
            String str3 = split[i];
            if (str3.equals(Separators.GREATER_THAN)) {
                if (z2 || i != split.length - 1) {
                    throw new IllegalArgumentException(str2 + " cannot contain '>'");
                }
            } else if (!str3.equals("*") && notPrintable(str3)) {
                throw new IllegalArgumentException(str2 + " must be printable characters only.");
            }
        }
        return str;
    }

    public static String validateReplyTo(String str, boolean z) {
        return validatePrintableExceptWildGt(str, "Reply To", z);
    }

    public static String validateQueueName(String str, boolean z) {
        return validatePrintableExceptWildDotGt(str, "Queue", z);
    }

    public static String validateStreamName(String str, boolean z) {
        return validatePrintableExceptWildDotGtSlashes(str, "Stream", z);
    }

    public static String validateDurable(String str, boolean z) {
        return validatePrintableExceptWildDotGtSlashes(str, "Durable", z);
    }

    public static String validateConsumerName(String str, boolean z) {
        return validatePrintableExceptWildDotGtSlashes(str, "Name", z);
    }

    public static String validatePrefixOrDomain(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda2
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validatePrefixOrDomain$0(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validatePrefixOrDomain$0(String str, String str2) {
        if (str.startsWith(".")) {
            throw new IllegalArgumentException(str2 + " cannot start with '.' [" + str + "]");
        }
        if (notPrintableOrHasWildGt(str)) {
            throw new IllegalArgumentException(str2 + " must be in the printable ASCII range and cannot include '*', '>' [" + str + "]");
        }
        return str;
    }

    public static String validateKvKeyWildcardAllowedRequired(String str) {
        return validateWildcardKvKey(str, "Key", true);
    }

    public static String validateNonWildcardKvKeyRequired(String str) {
        return validateNonWildcardKvKey(str, "Key", true);
    }

    public static void validateNotSupplied(String str, NatsJetStreamClientError natsJetStreamClientError) {
        if (!nullOrEmpty(str)) {
            throw natsJetStreamClientError.instance();
        }
    }

    public static String validateMustMatchIfBothSupplied(String str, String str2, NatsJetStreamClientError natsJetStreamClientError) {
        String emptyAsNull = emptyAsNull(str);
        String emptyAsNull2 = emptyAsNull(str2);
        if (emptyAsNull == null) {
            return emptyAsNull2;
        }
        if (emptyAsNull2 == null || emptyAsNull.equals(emptyAsNull2)) {
            return emptyAsNull;
        }
        throw natsJetStreamClientError.instance();
    }

    public static String required(String str, String str2) {
        if (emptyAsNull(str) != null) {
            return str;
        }
        throw new IllegalArgumentException(str2 + " cannot be null or empty.");
    }

    public static <T> T required(T t, String str) {
        if (t != null) {
            return t;
        }
        throw new IllegalArgumentException(str + " cannot be null.");
    }

    public static void required(List<?> list, String str) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException(str + " cannot be null or empty.");
        }
    }

    public static void required(Map<?, ?> map, String str) {
        if (map == null || map.isEmpty()) {
            throw new IllegalArgumentException(str + " cannot be null or empty.");
        }
    }

    public static String _validate(String str, boolean z, String str2, Check check) {
        if (emptyAsNull(str) != null) {
            return check.check();
        }
        if (z) {
            throw new IllegalArgumentException(str2 + " cannot be null or empty.");
        }
        return null;
    }

    public static String validateMaxLength(final String str, final int i, boolean z, final String str2) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda1
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validateMaxLength$1(str, i, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validateMaxLength$1(String str, int i, String str2) {
        int length = str.getBytes(StandardCharsets.UTF_8).length;
        if (length <= i) {
            return str;
        }
        throw new IllegalArgumentException(str2 + " cannot be longer than " + i + " bytes but was " + length + " bytes");
    }

    public static String validatePrintable(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda3
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validatePrintable$2(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validatePrintable$2(String str, String str2) {
        if (notPrintable(str)) {
            throw new IllegalArgumentException(str2 + " must be in the printable ASCII range [" + str + "]");
        }
        return str;
    }

    public static String validatePrintableExceptWildDotGt(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda4
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validatePrintableExceptWildDotGt$3(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validatePrintableExceptWildDotGt$3(String str, String str2) {
        if (notPrintableOrHasWildGtDot(str)) {
            throw new IllegalArgumentException(str2 + " must be in the printable ASCII range and cannot include '*', '.' or '>' [" + str + "]");
        }
        return str;
    }

    public static String validatePrintableExceptWildDotGtSlashes(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda6
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validatePrintableExceptWildDotGtSlashes$4(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validatePrintableExceptWildDotGtSlashes$4(String str, String str2) {
        if (notPrintableOrHasWildGtDotSlashes(str)) {
            throw new IllegalArgumentException(str2 + " must be in the printable ASCII range and cannot include '*', '.', '>', '\\' or  '/' [" + str + "]");
        }
        return str;
    }

    public static String validatePrintableExceptWildGt(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda5
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validatePrintableExceptWildGt$5(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validatePrintableExceptWildGt$5(String str, String str2) {
        if (notPrintableOrHasWildGt(str)) {
            throw new IllegalArgumentException(str2 + " must be in the printable ASCII range and cannot include '*' or '>' [" + str + "]");
        }
        return str;
    }

    public static String validateIsRestrictedTerm(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda8
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validateIsRestrictedTerm$6(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validateIsRestrictedTerm$6(String str, String str2) {
        if (notRestrictedTerm(str)) {
            throw new IllegalArgumentException(str2 + " must only contain A-Z, a-z, 0-9, '-' or '_' [" + str + "]");
        }
        return str;
    }

    public static String validateBucketName(String str, boolean z) {
        return validateIsRestrictedTerm(str, "Bucket Name", z);
    }

    public static String validateWildcardKvKey(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda9
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validateWildcardKvKey$7(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validateWildcardKvKey$7(String str, String str2) {
        if (notWildcardKvKey(str)) {
            throw new IllegalArgumentException(str2 + " must only contain A-Z, a-z, 0-9, '*', '-', '_', '/', '=', '>' or '.' and cannot start with '.' [" + str + "]");
        }
        return str;
    }

    public static String validateNonWildcardKvKey(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda0
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validateNonWildcardKvKey$8(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validateNonWildcardKvKey$8(String str, String str2) {
        if (notNonWildcardKvKey(str)) {
            throw new IllegalArgumentException(str2 + " must only contain A-Z, a-z, 0-9, '-', '_', '/', '=' or '.' and cannot start with '.' [" + str + "]");
        }
        return str;
    }

    public static long validateMaxConsumers(long j) {
        return validateGtZeroOrMinus1(j, "Max Consumers");
    }

    public static long validateMaxMessages(long j) {
        return validateGtZeroOrMinus1(j, "Max Messages");
    }

    public static long validateMaxMessagesPerSubject(long j) {
        return validateGtZeroOrMinus1(j, "Max Messages Per Subject");
    }

    public static int validateMaxHistory(int i) {
        if (i < 1 || i > 64) {
            throw new IllegalArgumentException("Max History must be from 1 to 64 inclusive.");
        }
        return i;
    }

    public static long validateMaxBytes(long j) {
        return validateGtZeroOrMinus1(j, "Max Bytes");
    }

    public static long validateMaxBucketBytes(long j) {
        return validateGtZeroOrMinus1(j, "Max Bucket Bytes");
    }

    public static long validateMaxMessageSize(long j) {
        return validateGtZeroOrMinus1(j, "Max Message Size");
    }

    public static long validateMaxValueSize(long j) {
        return validateGtZeroOrMinus1(j, "Max Value Size");
    }

    public static int validateNumberOfReplicas(int i) {
        if (i < 1 || i > 5) {
            throw new IllegalArgumentException("Replicas must be from 1 to 5 inclusive.");
        }
        return i;
    }

    public static Duration validateDurationRequired(Duration duration) {
        if (duration == null || duration.isZero() || duration.isNegative()) {
            throw new IllegalArgumentException("Duration required and must be greater than 0.");
        }
        return duration;
    }

    public static Duration validateDurationNotRequiredGtOrEqZero(Duration duration, Duration duration2) {
        if (duration == null) {
            return duration2;
        }
        if (duration.isNegative()) {
            throw new IllegalArgumentException("Duration must be greater than or equal to 0.");
        }
        return duration;
    }

    public static Duration validateDurationNotRequiredGtOrEqZero(long j) {
        if (j < 0) {
            throw new IllegalArgumentException("Duration must be greater than or equal to 0.");
        }
        return Duration.ofMillis(j);
    }

    public static String validateNotNull(String str, String str2) {
        if (str != null) {
            return str;
        }
        throw new IllegalArgumentException(str2 + " cannot be null");
    }

    public static Object validateNotNull(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new IllegalArgumentException(str + " cannot be null");
    }

    public static int validateGtZero(int i, String str) {
        if (i >= 1) {
            return i;
        }
        throw new IllegalArgumentException(str + " must be greater than zero");
    }

    public static long validateGtZeroOrMinus1(long j, String str) {
        if (zeroOrLtMinus1(j)) {
            throw new IllegalArgumentException(str + " must be greater than zero or -1 for unlimited");
        }
        return j;
    }

    public static long validateGtEqMinus1(long j, String str) {
        if (j >= -1) {
            return j;
        }
        throw new IllegalArgumentException(str + " must be greater than zero or -1 for unlimited");
    }

    public static long validateNotNegative(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " cannot be negative");
    }

    public static long validateGtEqZero(long j, String str) {
        if (j >= 0) {
            return j;
        }
        throw new IllegalArgumentException(str + " must be greater than or equal to zero");
    }

    public static boolean nullOrEmpty(String str) {
        return str == null || str.trim().length() == 0;
    }

    public static boolean notPrintable(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                return true;
            }
        }
        return false;
    }

    public static boolean notPrintableOrHasChars(String str, char[] cArr) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '!' || charAt > '~') {
                return true;
            }
            for (char c : cArr) {
                if (charAt == c) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean notRestrictedTerm(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '0') {
                if (charAt != '-') {
                    return true;
                }
            } else if (charAt < ':') {
                continue;
            } else {
                if (charAt < 'A') {
                    return true;
                }
                if (charAt < '[') {
                    continue;
                } else if (charAt < 'a') {
                    if (charAt != '_') {
                        return true;
                    }
                } else if (charAt > 'z') {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean notNonWildcardKvKey(String str) {
        if (str.charAt(0) == '.') {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '0') {
                if (charAt != '-' && charAt != '.' && charAt != '/') {
                    return true;
                }
            } else if (charAt < ':') {
                continue;
            } else if (charAt < 'A') {
                if (charAt != '=') {
                    return true;
                }
            } else if (charAt < '[') {
                continue;
            } else if (charAt < 'a') {
                if (charAt != '_') {
                    return true;
                }
            } else if (charAt > 'z') {
                return true;
            }
        }
        return false;
    }

    public static boolean notWildcardKvKey(String str) {
        if (str.charAt(0) == '.') {
            return true;
        }
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt < '0') {
                if (charAt != '*' && charAt != '-' && charAt != '.' && charAt != '/') {
                    return true;
                }
            } else if (charAt < ':') {
                continue;
            } else if (charAt < 'A') {
                if (charAt != '=' && charAt != '>') {
                    return true;
                }
            } else if (charAt < '[') {
                continue;
            } else if (charAt < 'a') {
                if (charAt != '_') {
                    return true;
                }
            } else if (charAt > 'z') {
                return true;
            }
        }
        return false;
    }

    private static boolean notPrintableOrHasWildGt(String str) {
        return notPrintableOrHasChars(str, WILD_GT);
    }

    private static boolean notPrintableOrHasWildGtDot(String str) {
        return notPrintableOrHasChars(str, WILD_GT_DOT);
    }

    private static boolean notPrintableOrHasWildGtDotSlashes(String str) {
        return notPrintableOrHasChars(str, WILD_GT_DOT_SLASHES);
    }

    public static String emptyAsNull(String str) {
        if (nullOrEmpty(str)) {
            return null;
        }
        return str;
    }

    public static String emptyOrNullAs(String str, String str2) {
        return nullOrEmpty(str) ? str2 : str;
    }

    public static Duration ensureNotNullAndNotLessThanMin(Duration duration, Duration duration2, Duration duration3) {
        return (duration == null || duration.toNanos() < duration2.toNanos()) ? duration3 : duration;
    }

    public static Duration ensureDurationNotLessThanMin(long j, Duration duration, Duration duration2) {
        return ensureNotNullAndNotLessThanMin(Duration.ofMillis(j), duration, duration2);
    }

    public static String ensureEndsWithDot(String str) {
        return (str == null || str.endsWith(".")) ? str : str + ".";
    }

    public static String validateSemVer(final String str, final String str2, boolean z) {
        return _validate(str, z, str2, new Check() { // from class: io.nats.client.support.Validator$$ExternalSyntheticLambda7
            @Override // io.nats.client.support.Validator.Check
            public final String check() {
                return Validator.lambda$validateSemVer$9(str, str2);
            }
        });
    }

    static /* synthetic */ String lambda$validateSemVer$9(String str, String str2) {
        if (isSemVer(str)) {
            return str;
        }
        throw new IllegalArgumentException(str2 + " must be a valid SemVer");
    }

    public static boolean isSemVer(String str) {
        return SEMVER_PATTERN.matcher(str).find();
    }

    public static <T> boolean listsAreEqual(List<T> list, List<T> list2, boolean z) {
        if (list == null) {
            return list2 == null;
        }
        if (list2 == null) {
            return z && list.size() == 0;
        }
        return list.equals(list2);
    }

    public static boolean mapsAreEqual(Map<String, String> map, Map<String, String> map2, boolean z) {
        if (map == null) {
            return map2 == null;
        }
        if (map2 == null) {
            return z && map.size() == 0;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry<String, String> entry : map.entrySet()) {
            if (!entry.getValue().equals(map2.get(entry.getKey()))) {
                return false;
            }
        }
        return true;
    }
}
