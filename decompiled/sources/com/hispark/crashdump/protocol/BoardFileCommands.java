package com.hispark.crashdump.protocol;

import androidx.credentials.playservices.controllers.CredentialProviderBaseController;
import com.hispark.crashdump.BoardLinkType;
import com.hispark.crashdump.protocol.BoardProtocolListItem;
import com.yandex.div.core.timer.TimerController;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.ShortCompanionObject;
import kotlin.ranges.RangesKt;
import kotlin.text.CharsKt;
import kotlin.text.StringsKt;

/* compiled from: BoardFileProtocol.kt */
@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u0005\n\u0002\b\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0012\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\n\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\"\u001a\b\u0012\u0004\u0012\u00020$0#2\u0006\u0010%\u001a\u00020&J\u0016\u0010'\u001a\u00020&2\u0006\u0010(\u001a\u00020)2\u0006\u0010*\u001a\u00020+J6\u0010,\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020+J6\u00103\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020+J&\u00104\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00106\u001a\u00020&2\u0006\u0010*\u001a\u00020+J.\u00107\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00052\u0006\u00108\u001a\u00020\u00052\u0006\u00105\u001a\u00020\u00052\u0006\u00109\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+J\u0016\u0010:\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+J\u0016\u0010;\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010*\u001a\u00020+J\u001e\u0010<\u001a\u00020&2\u0006\u0010/\u001a\u00020)2\u0006\u0010=\u001a\u00020>2\u0006\u0010*\u001a\u00020+J\u0010\u0010?\u001a\u0004\u0018\u00010)2\u0006\u0010@\u001a\u00020&J\u0015\u0010A\u001a\u0004\u0018\u00010>2\u0006\u0010@\u001a\u00020&¢\u0006\u0002\u0010BJ\u0016\u0010C\u001a\u00020&2\u0006\u0010/\u001a\u00020)2\u0006\u0010*\u001a\u00020+J\u0010\u0010D\u001a\u0004\u0018\u00010E2\u0006\u0010@\u001a\u00020&J\u0015\u0010F\u001a\u0004\u0018\u00010\u00052\u0006\u0010@\u001a\u00020&¢\u0006\u0002\u0010GJ\u0010\u0010H\u001a\u0004\u0018\u00010I2\u0006\u0010@\u001a\u00020&J\u0010\u0010J\u001a\u0004\u0018\u00010K2\u0006\u0010@\u001a\u00020&J\u0010\u0010L\u001a\u0004\u0018\u00010M2\u0006\u0010@\u001a\u00020&JH\u0010N\u001a\u00020&2\u0006\u0010-\u001a\u00020\u00052\u0006\u0010O\u001a\u0002012\u0006\u0010P\u001a\u0002012\u0006\u0010.\u001a\u00020\u00052\u0006\u0010/\u001a\u00020)2\u0006\u00100\u001a\u0002012\u0006\u00102\u001a\u0002012\u0006\u0010*\u001a\u00020+H\u0002J0\u0010Q\u001a\u00020&2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0002J0\u0010V\u001a\u00020&2\u0006\u0010R\u001a\u00020\n2\u0006\u0010S\u001a\u00020\n2\u0006\u0010T\u001a\u00020\n2\u0006\u0010U\u001a\u00020&2\u0006\u0010*\u001a\u00020+H\u0002J\u001a\u0010W\u001a\u0004\u0018\u00010$2\u0006\u0010X\u001a\u00020\n2\u0006\u0010Y\u001a\u00020&H\u0002J\u0012\u0010Z\u001a\u0004\u0018\u00010&2\u0006\u0010[\u001a\u00020&H\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001e\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001f\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010 \u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010!\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000¨\u0006\\"}, d2 = {"Lcom/hispark/crashdump/protocol/BoardFileCommands;", "", "<init>", "()V", "START_DOWNLOAD_BIT_FIELD", "", "START_UPLOAD_BIT_FIELD", "DOWNLOAD_TYPE", "UPLOAD_TYPE", "REQUEST_MODULE_ID", "", "REQUEST_COMMAND_ID", CredentialProviderBaseController.REQUEST_TAG, "REPLY_MODULE_ID", "REPLY_COMMAND_ID", "REPLY_TYPE", "FILE_LIST_MODULE_ID", "FILE_LIST_COMMAND_ID", "FILE_LIST_TYPE", "NEGOTIATE_MODULE_ID", "NEGOTIATE_COMMAND_ID", "NEGOTIATE_TYPE", "STOP_MODULE_ID", "STOP_COMMAND_ID", "STOP_TYPE", "NOTIFY_MODULE_ID", "NOTIFY_COMMAND_ID", "NOTIFY_TYPE", "DELETE_MODULE_ID", "DELETE_COMMAND_ID", "DELETE_TYPE", "CREATE_DIRECTORY_MODULE_ID", "CREATE_DIRECTORY_COMMAND_ID", "CREATE_DIRECTORY_TYPE", "resolveFrames", "", "Lcom/hispark/crashdump/protocol/BoardProtocolFrame;", "raw", "", "queryList", "path", "", "linkType", "Lcom/hispark/crashdump/BoardLinkType;", "downloadNegotiate", "transmitId", "totalSize", "remotePath", "blockNum", "", "blockSize", "uploadNegotiate", "reply", "offset", "data", "request", "cnt", "length", TimerController.STOP_COMMAND, "notifyFinished", "deletePath", "isDirectory", "", "parseDeletePath", "payload", "parseDeleteResult", "([B)Ljava/lang/Boolean;", "createDirectory", "parseListItem", "Lcom/hispark/crashdump/protocol/BoardProtocolListItem;", "parseTransmitId", "([B)Ljava/lang/Integer;", "parseNotifyState", "Lcom/hispark/crashdump/protocol/NotifyState;", "parseReply", "Lcom/hispark/crashdump/protocol/ReplyChunk;", "parseRequest", "Lcom/hispark/crashdump/protocol/UploadRequest;", "negotiate", "bitField", "transmitType", "frame", "mid", "cid", "type", "value", "mcAndTlv", "parseContent", "ctrl", "content", "parseFirstTlvValue", "tlv", "cloud-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BoardFileCommands {
    private static final byte CREATE_DIRECTORY_COMMAND_ID = 9;
    private static final byte CREATE_DIRECTORY_MODULE_ID = 6;
    private static final byte CREATE_DIRECTORY_TYPE = 1;
    private static final byte DELETE_COMMAND_ID = 8;
    private static final byte DELETE_MODULE_ID = 6;
    private static final byte DELETE_TYPE = 1;
    private static final int DOWNLOAD_TYPE = 0;
    private static final byte FILE_LIST_COMMAND_ID = 7;
    private static final byte FILE_LIST_MODULE_ID = 6;
    private static final byte FILE_LIST_TYPE = 1;
    public static final BoardFileCommands INSTANCE = new BoardFileCommands();
    private static final byte NEGOTIATE_COMMAND_ID = 2;
    private static final byte NEGOTIATE_MODULE_ID = 6;
    private static final byte NEGOTIATE_TYPE = 1;
    private static final byte NOTIFY_COMMAND_ID = 5;
    private static final byte NOTIFY_MODULE_ID = 6;
    private static final byte NOTIFY_TYPE = 1;
    private static final byte REPLY_COMMAND_ID = 4;
    private static final byte REPLY_MODULE_ID = 6;
    private static final byte REPLY_TYPE = 1;
    private static final byte REQUEST_COMMAND_ID = 3;
    private static final byte REQUEST_MODULE_ID = 6;
    private static final byte REQUEST_TYPE = 1;
    private static final int START_DOWNLOAD_BIT_FIELD = 12288;
    private static final int START_UPLOAD_BIT_FIELD = 32767;
    private static final byte STOP_COMMAND_ID = 6;
    private static final byte STOP_MODULE_ID = 6;
    private static final byte STOP_TYPE = 1;
    private static final int UPLOAD_TYPE = 2;

    private BoardFileCommands() {
    }

    public final List<BoardProtocolFrame> resolveFrames(byte[] raw) {
        Intrinsics.checkNotNullParameter(raw, "raw");
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < raw.length) {
            while (i < raw.length && raw[i] != -81) {
                i++;
            }
            int i2 = i + 4;
            if (i2 > raw.length) {
                break;
            }
            int littleUnsignedShort = ProtocolBytes.INSTANCE.littleUnsignedShort(raw, i + 2);
            if (littleUnsignedShort > 2) {
                int i3 = littleUnsignedShort + 4 + i;
                if (i3 > raw.length) {
                    break;
                }
                int i4 = littleUnsignedShort + i2;
                int i5 = i4 - 2;
                byte[] copyOfRange = ArraysKt.copyOfRange(raw, i2, i5);
                if (Arrays.equals(ArraysKt.copyOfRange(raw, i5, i4), ProtocolBytes.INSTANCE.crc16(copyOfRange))) {
                    BoardProtocolFrame parseContent = parseContent(raw[i + 1], copyOfRange);
                    if (parseContent != null) {
                        arrayList.add(parseContent);
                    }
                    i = i3;
                }
            }
            i++;
        }
        return arrayList;
    }

    public final byte[] queryList(String path, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(path, "path");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = (path + (char) 0).getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArr = new byte[bytes.length + 4];
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(bytes.length), 0, bArr, 0, 4);
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        return frame((byte) 6, (byte) 7, (byte) 1, bArr, linkType);
    }

    public final byte[] downloadNegotiate(int transmitId, int totalSize, String remotePath, short blockNum, short blockSize, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = (remotePath + (char) 0).getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        byte[] bArr = new byte[bytes.length + 24];
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(transmitId), 0, bArr, 0, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) 12288), 0, bArr, 4, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) 0), 0, bArr, 6, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(totalSize), 0, bArr, 8, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes(blockNum), 0, bArr, 12, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes(blockSize), 0, bArr, 14, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(bytes.length + 4), 0, bArr, 18, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) bytes.length), 0, bArr, 20, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) 0), 0, bArr, 22, 2);
        System.arraycopy(bytes, 0, bArr, 24, bytes.length);
        return frame((byte) 6, (byte) 2, (byte) 1, bArr, linkType);
    }

    public final byte[] uploadNegotiate(int transmitId, int totalSize, String remotePath, short blockNum, short blockSize, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        return negotiate(transmitId, ShortCompanionObject.MAX_VALUE, (short) 2, totalSize, remotePath, blockNum, blockSize, linkType);
    }

    public final byte[] reply(int transmitId, int offset, byte[] data, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        byte[] bArr = new byte[data.length + 12];
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(transmitId), 0, bArr, 0, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(offset), 0, bArr, 4, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(data.length), 0, bArr, 8, 4);
        System.arraycopy(data, 0, bArr, 12, data.length);
        return frame((byte) 6, (byte) 4, (byte) 1, bArr, linkType);
    }

    public final byte[] request(int transmitId, int cnt, int offset, int length, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        byte[] bArr = new byte[16];
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(transmitId), 0, bArr, 0, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(cnt), 0, bArr, 4, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(offset), 0, bArr, 8, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(length), 0, bArr, 12, 4);
        return frame((byte) 6, (byte) 3, (byte) 1, bArr, linkType);
    }

    public final byte[] stop(int transmitId, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        byte[] bArr = new byte[8];
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(transmitId), 0, bArr, 0, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(0), 0, bArr, 4, 4);
        return frame((byte) 6, (byte) 6, (byte) 1, bArr, linkType);
    }

    public final byte[] notifyFinished(int transmitId, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        byte[] bArr = new byte[12];
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(transmitId), 0, bArr, 0, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(11), 0, bArr, 4, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(0), 0, bArr, 8, 4);
        return frame((byte) 6, (byte) 5, (byte) 1, bArr, linkType);
    }

    public final byte[] deletePath(String remotePath, boolean isDirectory, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        return frame((byte) 6, (byte) 8, (byte) 1, ProtocolBytes.INSTANCE.deletePathPayload(remotePath, isDirectory ? (byte) 1 : (byte) 0, (byte) 0), linkType);
    }

    public final String parseDeletePath(byte[] payload) {
        int littleUnsignedShort;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 5 || (littleUnsignedShort = ProtocolBytes.INSTANCE.littleUnsignedShort(payload, 0)) <= 0 || payload.length < littleUnsignedShort + 4) {
            return null;
        }
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return new String(payload, 4, littleUnsignedShort - 1, UTF_8);
    }

    public final Boolean parseDeleteResult(byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length == 0 || parseDeletePath(payload) != null) {
            return true;
        }
        if (payload.length >= 4) {
            return Boolean.valueOf(ProtocolBytes.INSTANCE.littleInt(payload, 0) == 0);
        }
        if (payload.length == 1) {
            return Boolean.valueOf(payload[0] == 0);
        }
        return null;
    }

    public final byte[] createDirectory(String remotePath, BoardLinkType linkType) {
        Intrinsics.checkNotNullParameter(remotePath, "remotePath");
        Intrinsics.checkNotNullParameter(linkType, "linkType");
        return frame((byte) 6, (byte) 9, (byte) 1, ProtocolBytes.INSTANCE.deletePathPayload(remotePath, (byte) 1, (byte) 1), linkType);
    }

    public final BoardProtocolListItem parseListItem(byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 8) {
            return null;
        }
        byte[] copyOfRange = ArraysKt.copyOfRange(payload, 0, 2);
        if (copyOfRange[0] == -1 && copyOfRange[1] == -1) {
            return BoardProtocolListItem.End.INSTANCE;
        }
        int i = payload[2] & 255;
        if (i <= 0 || payload.length < i + 7) {
            return null;
        }
        int littleInt = ProtocolBytes.INSTANCE.littleInt(payload, 4);
        boolean z = payload[3] == 0;
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        return new BoardProtocolListItem.Entry(new String(payload, 8, i - 1, UTF_8), z, littleInt);
    }

    public final Integer parseTransmitId(byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 4) {
            return null;
        }
        return Integer.valueOf(ProtocolBytes.INSTANCE.littleInt(payload, 0));
    }

    public final NotifyState parseNotifyState(byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 12) {
            return null;
        }
        return new NotifyState(ProtocolBytes.INSTANCE.littleInt(payload, 0), ProtocolBytes.INSTANCE.littleInt(payload, 4), ProtocolBytes.INSTANCE.littleInt(payload, 8), payload.length >= 16 ? Integer.valueOf(ProtocolBytes.INSTANCE.littleInt(payload, 12)) : null);
    }

    public final ReplyChunk parseReply(byte[] payload) {
        int i;
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 12) {
            return null;
        }
        int littleInt = ProtocolBytes.INSTANCE.littleInt(payload, 0);
        int littleInt2 = ProtocolBytes.INSTANCE.littleInt(payload, 4);
        int littleInt3 = ProtocolBytes.INSTANCE.littleInt(payload, 8);
        if (littleInt3 < 0 || payload.length < (i = littleInt3 + 12)) {
            return null;
        }
        return new ReplyChunk(littleInt, littleInt2, littleInt3, ArraysKt.copyOfRange(payload, 12, i));
    }

    public final UploadRequest parseRequest(byte[] payload) {
        Intrinsics.checkNotNullParameter(payload, "payload");
        if (payload.length < 16) {
            return null;
        }
        UploadRequest uploadRequest = new UploadRequest(ProtocolBytes.INSTANCE.littleInt(payload, 0), ProtocolBytes.INSTANCE.littleInt(payload, 4), ProtocolBytes.INSTANCE.littleInt(payload, 8), ProtocolBytes.INSTANCE.littleInt(payload, 12));
        if (uploadRequest.getCount() < 0 || uploadRequest.getOffset() < 0 || uploadRequest.getSize() <= 0) {
            return null;
        }
        return uploadRequest;
    }

    private final byte[] negotiate(int transmitId, short bitField, short transmitType, int totalSize, String remotePath, short blockNum, short blockSize, BoardLinkType linkType) {
        Charset UTF_8 = StandardCharsets.UTF_8;
        Intrinsics.checkNotNullExpressionValue(UTF_8, "UTF_8");
        byte[] bytes = (remotePath + (char) 0).getBytes(UTF_8);
        Intrinsics.checkNotNullExpressionValue(bytes, "getBytes(...)");
        if (bytes.length > 65531) {
            throw new IllegalArgumentException(("Remote path is too long: " + bytes.length).toString());
        }
        int length = bytes.length;
        int i = length + 4;
        byte[] bArr = new byte[i];
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) bytes.length), 0, bArr, 0, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) 0), 0, bArr, 2, 2);
        System.arraycopy(bytes, 0, bArr, 4, bytes.length);
        byte[] bArr2 = new byte[length + 24];
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(transmitId), 0, bArr2, 0, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes(bitField), 0, bArr2, 4, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes(transmitType), 0, bArr2, 6, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.intToLittleBytes(totalSize), 0, bArr2, 8, 4);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes(blockNum), 0, bArr2, 12, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes(blockSize), 0, bArr2, 14, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) 0), 0, bArr2, 16, 2);
        System.arraycopy(ProtocolBytes.INSTANCE.shortToLittleBytes((short) i), 0, bArr2, 18, 2);
        System.arraycopy(bArr, 0, bArr2, 20, i);
        return frame((byte) 6, (byte) 2, (byte) 1, bArr2, linkType);
    }

    private final byte[] frame(byte mid, byte cid, byte type, byte[] value, BoardLinkType linkType) {
        return ProtocolBytes.INSTANCE.uploadFrame(mcAndTlv(mid, cid, type, value, linkType));
    }

    private final byte[] mcAndTlv(byte mid, byte cid, byte type, byte[] value, BoardLinkType linkType) {
        byte b = linkType == BoardLinkType.BLE ? (byte) 3 : (byte) 4;
        ProtocolBytes protocolBytes = ProtocolBytes.INSTANCE;
        StringBuilder sb = new StringBuilder("1");
        String substring = ProtocolBytes.INSTANCE.bitString(type).substring(1);
        Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
        byte bitStringToByte = protocolBytes.bitStringToByte(sb.append(substring).toString());
        if (value.length > 127) {
            String num = Integer.toString(value.length, CharsKt.checkRadix(16));
            Intrinsics.checkNotNullExpressionValue(num, "toString(...)");
            if (num.length() % 2 != 0) {
                num = "0" + num;
            }
            List<String> chunked = StringsKt.chunked(num, 2);
            ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(chunked, 10));
            Iterator<T> it = chunked.iterator();
            while (it.hasNext()) {
                arrayList.add(Byte.valueOf((byte) Integer.parseInt((String) it.next(), CharsKt.checkRadix(16))));
            }
            byte[] byteArray = CollectionsKt.toByteArray(CollectionsKt.reversed(arrayList));
            int length = byteArray.length;
            ProtocolBytes protocolBytes2 = ProtocolBytes.INSTANCE;
            String num2 = Integer.toString(length, CharsKt.checkRadix(2));
            Intrinsics.checkNotNullExpressionValue(num2, "toString(...)");
            byte bitStringToByte2 = protocolBytes2.bitStringToByte(StringsKt.padStart(num2, 8, '0'));
            byte[] bArr = new byte[byteArray.length + 5 + value.length];
            bArr[0] = b;
            bArr[1] = mid;
            bArr[2] = cid;
            bArr[3] = bitStringToByte;
            bArr[4] = bitStringToByte2;
            System.arraycopy(byteArray, 0, bArr, 5, byteArray.length);
            System.arraycopy(value, 0, bArr, byteArray.length + 5, value.length);
            return bArr;
        }
        ProtocolBytes protocolBytes3 = ProtocolBytes.INSTANCE;
        StringBuilder sb2 = new StringBuilder("1");
        String substring2 = ProtocolBytes.INSTANCE.bitString((byte) value.length).substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        byte bitStringToByte3 = protocolBytes3.bitStringToByte(sb2.append(substring2).toString());
        byte[] bArr2 = new byte[value.length + 5];
        bArr2[0] = b;
        bArr2[1] = mid;
        bArr2[2] = cid;
        bArr2[3] = bitStringToByte;
        bArr2[4] = bitStringToByte3;
        System.arraycopy(value, 0, bArr2, 5, value.length);
        return bArr2;
    }

    private final BoardProtocolFrame parseContent(byte ctrl, byte[] content) {
        int i = ((ctrl >>> 1) & 1) != 1 ? 0 : 1;
        if (content.length < i + 4) {
            return null;
        }
        byte b = content[i];
        byte b2 = content[i + 1];
        int i2 = i + 2;
        byte b3 = content[i2];
        byte[] parseFirstTlvValue = parseFirstTlvValue(ArraysKt.copyOfRange(content, i2, content.length));
        if (parseFirstTlvValue == null) {
            return null;
        }
        return new BoardProtocolFrame(b, b2, b3, parseFirstTlvValue);
    }

    private final byte[] parseFirstTlvValue(byte[] tlv) {
        if (tlv.length < 2) {
            return null;
        }
        String bitString = ProtocolBytes.INSTANCE.bitString(tlv[1]);
        if (StringsKt.startsWith$default(bitString, "1", false, 2, (Object) null)) {
            String substring = bitString.substring(1);
            Intrinsics.checkNotNullExpressionValue(substring, "substring(...)");
            int parseInt = Integer.parseInt(substring, CharsKt.checkRadix(2)) + 2;
            if (tlv.length < parseInt) {
                return null;
            }
            return ArraysKt.copyOfRange(tlv, 2, parseInt);
        }
        String substring2 = bitString.substring(1);
        Intrinsics.checkNotNullExpressionValue(substring2, "substring(...)");
        int parseInt2 = Integer.parseInt(substring2, CharsKt.checkRadix(2));
        byte[] bArr = new byte[4];
        int i = parseInt2 + 2;
        if (tlv.length < i) {
            return null;
        }
        System.arraycopy(tlv, 2, bArr, 0, RangesKt.coerceAtMost(parseInt2, 4));
        int littleInt = ProtocolBytes.INSTANCE.littleInt(bArr, 0) + i;
        if (tlv.length < littleInt) {
            return null;
        }
        return ArraysKt.copyOfRange(tlv, i, littleInt);
    }
}
