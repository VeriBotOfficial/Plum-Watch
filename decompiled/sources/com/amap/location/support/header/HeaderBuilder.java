package com.amap.location.support.header;

import com.google.flatbuffers.FlatBufferBuilder;

/* loaded from: classes11.dex */
public class HeaderBuilder {
    private static void checkParam() {
        if (HeaderConfig.getProductId() < 0 || isEmpty(HeaderConfig.getProductVerion())) {
            throw new RuntimeException("必须在 HeaderBuildre 中，设置好 productId, productVerion" + ((int) HeaderConfig.getProductId()) + HeaderConfig.getProductVerion() + "， 以及其他的值");
        }
    }

    public static int createFb(FlatBufferBuilder flatBufferBuilder) {
        checkParam();
        try {
            int createString = flatBufferBuilder.createString(HeaderConfig.getProcessName());
            int createString2 = flatBufferBuilder.createString(HeaderConfig.getProductVerion());
            String adiu = HeaderConfig.getAdiu();
            int createString3 = isEmpty(adiu) ? Integer.MIN_VALUE : flatBufferBuilder.createString(adiu);
            String tid = HeaderConfig.getTid();
            int createString4 = isEmpty(tid) ? Integer.MIN_VALUE : flatBufferBuilder.createString(tid);
            String diu = HeaderConfig.getDiu();
            int createString5 = isEmpty(diu) ? Integer.MIN_VALUE : flatBufferBuilder.createString(diu);
            String imsi = HeaderConfig.getImsi();
            int createString6 = isEmpty(imsi) ? Integer.MIN_VALUE : flatBufferBuilder.createString(imsi);
            String brand = HeaderConfig.getBrand();
            if (brand != null && brand.length() > 16) {
                brand = brand.substring(0, 16);
            }
            int createString7 = isEmpty(brand) ? Integer.MIN_VALUE : flatBufferBuilder.createString(brand);
            String deviceMode = HeaderConfig.getDeviceMode();
            if (deviceMode != null && deviceMode.length() > 16) {
                deviceMode = deviceMode.substring(0, 16);
            }
            int createString8 = isEmpty(deviceMode) ? Integer.MIN_VALUE : flatBufferBuilder.createString(deviceMode);
            int createString9 = isEmpty(HeaderConfig.getLicense()) ? Integer.MIN_VALUE : flatBufferBuilder.createString(HeaderConfig.getLicense());
            int createString10 = isEmpty(HeaderConfig.getMapkey()) ? Integer.MIN_VALUE : flatBufferBuilder.createString(HeaderConfig.getMapkey());
            THeader.startTHeader(flatBufferBuilder);
            THeader.addProductId(flatBufferBuilder, HeaderConfig.getProductId());
            THeader.addPackageName(flatBufferBuilder, createString);
            THeader.addProductVerion(flatBufferBuilder, createString2);
            THeader.addOsVer(flatBufferBuilder, (byte) HeaderConfig.getSystemVersionInt());
            THeader.addDeviceMac(flatBufferBuilder, HeaderConfig.getDeviceMacLong());
            if (createString3 != Integer.MIN_VALUE) {
                THeader.addAdiu(flatBufferBuilder, createString3);
            }
            if (createString4 != Integer.MIN_VALUE) {
                THeader.addUtdid(flatBufferBuilder, createString4);
            }
            if (createString5 != Integer.MIN_VALUE) {
                THeader.addImei(flatBufferBuilder, createString5);
            }
            if (createString6 != Integer.MIN_VALUE) {
                THeader.addImsi(flatBufferBuilder, createString6);
            }
            if (createString7 != Integer.MIN_VALUE) {
                THeader.addBrand(flatBufferBuilder, createString7);
            }
            if (createString8 != Integer.MIN_VALUE) {
                THeader.addModel(flatBufferBuilder, createString8);
            }
            if (createString9 != Integer.MIN_VALUE) {
                THeader.addLicense(flatBufferBuilder, createString9);
            }
            if (createString10 != Integer.MIN_VALUE) {
                THeader.addMapkey(flatBufferBuilder, createString10);
            }
            return THeader.endTHeader(flatBufferBuilder);
        } catch (Error | Exception unused) {
            return 0;
        }
    }

    private static boolean isEmpty(String str) {
        return str == null || str.length() == 0;
    }
}
