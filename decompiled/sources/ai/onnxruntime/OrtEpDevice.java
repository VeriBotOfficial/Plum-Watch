package ai.onnxruntime;

import java.util.Map;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes.dex */
public final class OrtEpDevice {
    private final OrtHardwareDevice device;
    private final Map<String, String> epMetadata;
    private final String epName;
    private final Map<String, String> epOptions;
    private final String epVendor;
    private final long nativeHandle;

    private static native long getDeviceHandle(long j, long j2);

    private static native String[][] getEpMetadata(long j, long j2);

    private static native String getEpName(long j, long j2);

    private static native String[][] getEpOptions(long j, long j2);

    private static native String getEpVendor(long j, long j2);

    OrtEpDevice(long j) {
        this.nativeHandle = j;
        this.epName = getEpName(OnnxRuntime.ortApiHandle, j);
        this.epVendor = getEpVendor(OnnxRuntime.ortApiHandle, j);
        this.epMetadata = OrtUtil.convertToMap(getEpMetadata(OnnxRuntime.ortApiHandle, j));
        this.epOptions = OrtUtil.convertToMap(getEpOptions(OnnxRuntime.ortApiHandle, j));
        this.device = new OrtHardwareDevice(getDeviceHandle(OnnxRuntime.ortApiHandle, j));
    }

    long getNativeHandle() {
        return this.nativeHandle;
    }

    public String getEpName() {
        return this.epName;
    }

    public String getEpVendor() {
        return this.epVendor;
    }

    public Map<String, String> getEpMetadata() {
        return this.epMetadata;
    }

    public Map<String, String> getEpOptions() {
        return this.epOptions;
    }

    public OrtHardwareDevice getDevice() {
        return this.device;
    }

    public String toString() {
        return "OrtEpDevice{epName='" + this.epName + "', epVendor='" + this.epVendor + "', epMetadata=" + this.epMetadata + ", epOptions=" + this.epOptions + ", device=" + this.device + AbstractJsonLexerKt.END_OBJ;
    }
}
