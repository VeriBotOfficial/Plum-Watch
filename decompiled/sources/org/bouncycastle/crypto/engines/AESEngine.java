package org.bouncycastle.crypto.engines;

import com.beken.iot.smartsdk.core.pack.TransmissionUnpacked;
import com.bluetrum.fota.manager.OtaCommandGenerator;
import com.facebook.imageutils.JfifUtil;
import com.hispark.crashdump.protocol.ProtocolBytes;
import com.wakeup.common.DeviceFeatures;
import java.lang.reflect.Array;
import org.apache.commons.net.telnet.TelnetCommand;
import org.bouncycastle.crypto.BlockCipher;
import org.bouncycastle.crypto.CipherParameters;
import org.bouncycastle.crypto.DataLengthException;
import org.bouncycastle.crypto.OutputLengthException;
import org.bouncycastle.crypto.params.KeyParameter;
import org.bouncycastle.crypto.signers.PSSSigner;
import org.bouncycastle.util.Arrays;
import org.bouncycastle.util.Pack;
import org.tensorflow.lite.schema.BuiltinOptions;

/* loaded from: classes8.dex */
public class AESEngine implements BlockCipher {
    private static final int BLOCK_SIZE = 16;
    private static final int m1 = -2139062144;
    private static final int m2 = 2139062143;
    private static final int m3 = 27;
    private static final int m4 = -1061109568;
    private static final int m5 = 1061109567;
    private int C0;
    private int C1;
    private int C2;
    private int C3;
    private int ROUNDS;
    private int[][] WorkingKey = null;
    private boolean forEncryption;
    private byte[] s;
    private static final byte[] S = {BuiltinOptions.DensifyOptions, BuiltinOptions.BitcastOptions, BuiltinOptions.UnsortedSegmentMaxOptions, BuiltinOptions.SignOptions, -14, BuiltinOptions.HashtableOptions, BuiltinOptions.VarHandleOptions, -59, BuiltinOptions.SliceOptions, 1, BuiltinOptions.CallOnceOptions, BuiltinOptions.PadV2Options, -2, -41, -85, BuiltinOptions.UnsortedSegmentProdOptions, -54, -126, -55, BuiltinOptions.BitwiseXorOptions, -6, BuiltinOptions.QuantizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, TransmissionUnpacked.HD_VAL_MAGIC_HB, -83, -44, -94, ProtocolBytes.SOF, -100, -92, BuiltinOptions.RandomOptions, -64, -73, -3, -109, BuiltinOptions.DequantizeOptions, BuiltinOptions.NotEqualOptions, 63, -9, -52, BuiltinOptions.ExpandDimsOptions, -91, -27, -15, BuiltinOptions.AssignVariableOptions, -40, BuiltinOptions.TransposeConvOptions, 21, 4, -57, 35, -61, 24, -106, 5, -102, 7, 18, Byte.MIN_VALUE, -30, -21, BuiltinOptions.MaximumMinimumOptions, -78, BuiltinOptions.DynamicUpdateSliceOptions, 9, -125, BuiltinOptions.GreaterOptions, 26, 27, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.MatrixSetDiagOptions, OtaCommandGenerator.CMD_OTA_INFO, BuiltinOptions.AddNOptions, BuiltinOptions.PackOptions, -42, -77, BuiltinOptions.LessOptions, -29, BuiltinOptions.SelectOptions, -124, BuiltinOptions.GatherNdOptions, -47, 0, -19, 32, -4, -79, BuiltinOptions.HardSwishOptions, BuiltinOptions.Conv3DOptions, -53, -66, BuiltinOptions.ArgMinOptions, BuiltinOptions.ResizeNearestNeighborOptions, BuiltinOptions.SquaredDifferenceOptions, BuiltinOptions.MatrixDiagOptions, -49, -48, -17, -86, -5, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.MirrorPadOptions, BuiltinOptions.TileOptions, -123, BuiltinOptions.BidirectionalSequenceLSTMOptions, -7, 2, Byte.MAX_VALUE, BuiltinOptions.UniqueOptions, BuiltinOptions.LogicalOrOptions, -97, -88, BuiltinOptions.ReverseV2Options, -93, 64, -113, OtaCommandGenerator.CMD_GET_INFO_TLV, -99, BuiltinOptions.PowOptions, -11, PSSSigner.TRAILER_IMPLICIT, -74, -38, BuiltinOptions.ExpOptions, 16, -1, -13, -46, -51, 12, 19, -20, BuiltinOptions.NonMaxSuppressionV4Options, -105, BuiltinOptions.FillOptions, 23, -60, -89, BuiltinOptions.RightShiftOptions, 61, BuiltinOptions.SegmentSumOptions, BuiltinOptions.WhileOptions, 25, BuiltinOptions.BucketizeOptions, BuiltinOptions.NonMaxSuppressionV5Options, -127, BuiltinOptions.SplitVOptions, -36, 34, BuiltinOptions.NegOptions, OtaCommandGenerator.CMD_NOTIFY_STATUS, -120, BuiltinOptions.BidirectionalSequenceRNNOptions, -18, -72, 20, -34, BuiltinOptions.DepthToSpaceOptions, 11, -37, -32, BuiltinOptions.SparseToDenseOptions, 58, 10, BuiltinOptions.RangeOptions, 6, BuiltinOptions.LogSoftmaxOptions, BuiltinOptions.IfOptions, -62, -45, -84, BuiltinOptions.SelectV2Options, OtaCommandGenerator.CMD_GET_INFO, -107, -28, BuiltinOptions.UnsortedSegmentSumOptions, -25, -56, BuiltinOptions.ShapeOptions, BuiltinOptions.HashtableImportOptions, -115, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.AbsOptions, -87, BuiltinOptions.HashtableFindOptions, BuiltinOptions.RankOptions, -12, -22, BuiltinOptions.BatchMatMulOptions, BuiltinOptions.ATan2Options, -82, 8, -70, BuiltinOptions.UnsortedSegmentMinOptions, BuiltinOptions.CastOptions, BuiltinOptions.LessEqualOptions, 28, -90, -76, -58, -24, -35, BuiltinOptions.GeluOptions, 31, BuiltinOptions.LeakyReluOptions, -67, -117, -118, BuiltinOptions.ReadVariableOptions, BuiltinOptions.LogicalAndOptions, -75, BuiltinOptions.CumsumOptions, BuiltinOptions.FloorModOptions, 3, -10, 14, BuiltinOptions.ScatterNdOptions, BuiltinOptions.EqualOptions, BuiltinOptions.ReverseSequenceOptions, -71, -122, -63, 29, -98, -31, -8, -104, 17, BuiltinOptions.Rfft2dOptions, -39, -114, -108, -101, 30, -121, -23, -50, BuiltinOptions.WhereOptions, BuiltinOptions.ArgMaxOptions, -33, -116, -95, -119, 13, -65, -26, BuiltinOptions.SquareOptions, BuiltinOptions.BroadcastToOptions, BuiltinOptions.FloorDivOptions, -103, BuiltinOptions.GreaterEqualOptions, 15, -80, BuiltinOptions.CosOptions, -69, 22};
    private static final byte[] Si = {BuiltinOptions.AddNOptions, 9, BuiltinOptions.Conv3DOptions, TransmissionUnpacked.HD_VAL_MAGIC_LB, BuiltinOptions.SliceOptions, BuiltinOptions.NotEqualOptions, -91, BuiltinOptions.PowOptions, -65, 64, -93, -98, -127, -13, -41, -5, BuiltinOptions.BitcastOptions, -29, BuiltinOptions.ArgMinOptions, -126, -101, BuiltinOptions.SelectOptions, -1, -121, BuiltinOptions.ExpandDimsOptions, -114, BuiltinOptions.ZerosLikeOptions, BuiltinOptions.FillOptions, -60, -34, -23, -53, BuiltinOptions.CosOptions, BuiltinOptions.SignOptions, -108, BuiltinOptions.SparseToDenseOptions, -90, -62, 35, 61, -18, BuiltinOptions.SquaredDifferenceOptions, -107, 11, BuiltinOptions.SquareOptions, -6, -61, BuiltinOptions.AbsOptions, 8, BuiltinOptions.LessEqualOptions, -95, BuiltinOptions.CumsumOptions, BuiltinOptions.ArgMaxOptions, -39, BuiltinOptions.LogSoftmaxOptions, -78, BuiltinOptions.UnsortedSegmentProdOptions, BuiltinOptions.HardSwishOptions, -94, BuiltinOptions.RangeOptions, BuiltinOptions.HashtableImportOptions, -117, -47, BuiltinOptions.CastOptions, BuiltinOptions.RandomOptions, -8, -10, BuiltinOptions.SegmentSumOptions, -122, BuiltinOptions.BroadcastToOptions, -104, 22, -44, -92, BuiltinOptions.IfOptions, -52, BuiltinOptions.WhileOptions, BuiltinOptions.BatchMatMulOptions, -74, OtaCommandGenerator.CMD_GET_INFO_TLV, BuiltinOptions.HashtableFindOptions, BuiltinOptions.ReadVariableOptions, BuiltinOptions.FloorModOptions, BuiltinOptions.UniqueOptions, -3, -19, -71, -38, BuiltinOptions.DepthToSpaceOptions, 21, BuiltinOptions.BidirectionalSequenceRNNOptions, BuiltinOptions.ReverseSequenceOptions, -89, -115, -99, -124, OtaCommandGenerator.CMD_NOTIFY_STATUS, -40, -85, 0, -116, PSSSigner.TRAILER_IMPLICIT, -45, 10, -9, -28, BuiltinOptions.MatrixDiagOptions, 5, -72, -77, BuiltinOptions.BidirectionalSequenceLSTMOptions, 6, -48, BuiltinOptions.GreaterOptions, 30, -113, -54, 63, 15, 2, -63, ProtocolBytes.SOF, -67, 3, 1, 19, -118, BuiltinOptions.HashtableOptions, 58, OtaCommandGenerator.CMD_GET_INFO, 17, BuiltinOptions.FloorDivOptions, BuiltinOptions.SplitVOptions, BuiltinOptions.CallOnceOptions, -36, -22, -105, -14, -49, -50, TransmissionUnpacked.HD_VAL_MAGIC_HB, -76, -26, BuiltinOptions.BucketizeOptions, -106, -84, BuiltinOptions.GeluOptions, 34, -25, -83, BuiltinOptions.EqualOptions, -123, -30, -7, BuiltinOptions.ShapeOptions, -24, 28, BuiltinOptions.DynamicUpdateSliceOptions, -33, BuiltinOptions.HashtableSizeOptions, BuiltinOptions.UnidirectionalSequenceLSTMOptions, -15, 26, BuiltinOptions.AssignVariableOptions, 29, BuiltinOptions.LessOptions, -59, -119, BuiltinOptions.VarHandleOptions, -73, BuiltinOptions.SelectV2Options, 14, -86, 24, -66, 27, -4, BuiltinOptions.RankOptions, BuiltinOptions.LogicalAndOptions, BuiltinOptions.LeakyReluOptions, -58, -46, BuiltinOptions.UnsortedSegmentSumOptions, 32, -102, -37, -64, -2, BuiltinOptions.UnsortedSegmentMinOptions, -51, BuiltinOptions.MatrixSetDiagOptions, -12, 31, -35, -88, BuiltinOptions.TileOptions, -120, 7, -57, BuiltinOptions.TransposeConvOptions, -79, 18, 16, BuiltinOptions.QuantizeOptions, BuiltinOptions.MaximumMinimumOptions, Byte.MIN_VALUE, -20, BuiltinOptions.NonMaxSuppressionV4Options, BuiltinOptions.NonMaxSuppressionV5Options, BuiltinOptions.ReverseV2Options, Byte.MAX_VALUE, -87, 25, -75, BuiltinOptions.ResizeNearestNeighborOptions, 13, BuiltinOptions.GreaterEqualOptions, -27, BuiltinOptions.ATan2Options, -97, -109, -55, -100, -17, OtaCommandGenerator.CMD_OTA_INFO, -32, BuiltinOptions.PackOptions, BuiltinOptions.MirrorPadOptions, -82, BuiltinOptions.NegOptions, -11, -80, -56, -21, -69, BuiltinOptions.LogicalOrOptions, -125, BuiltinOptions.GatherNdOptions, -103, BuiltinOptions.ScatterNdOptions, 23, BuiltinOptions.PadV2Options, 4, BuiltinOptions.RightShiftOptions, -70, BuiltinOptions.UnsortedSegmentMaxOptions, -42, BuiltinOptions.DequantizeOptions, -31, BuiltinOptions.Rfft2dOptions, 20, BuiltinOptions.DensifyOptions, BuiltinOptions.WhereOptions, BuiltinOptions.ExpOptions, 12, BuiltinOptions.BitwiseXorOptions};
    private static final int[] rcon = {1, 2, 4, 8, 16, 32, 64, 128, 27, 54, 108, JfifUtil.MARKER_SOI, DeviceFeatures.AI_AUDIO_SEARCH, 77, 154, 47, 94, 188, 99, 198, 151, 53, 106, 212, DeviceFeatures.MAP_MODE, 125, 250, TelnetCommand.EOR, DeviceFeatures.NETWORK_SHARE, 145};
    private static final int[] T0 = {-1520213050, -2072216328, -1720223762, -1921287178, 234025727, -1117033514, -1318096930, 1422247313, 1345335392, 50397442, -1452841010, 2099981142, 436141799, 1658312629, -424957107, -1703512340, 1170918031, -1652391393, 1086966153, -2021818886, 368769775, -346465870, -918075506, 200339707, -324162239, 1742001331, -39673249, -357585083, -1080255453, -140204973, -1770884380, 1539358875, -1028147339, 486407649, -1366060227, 1780885068, 1513502316, 1094664062, 49805301, 1338821763, 1546925160, -190470831, 887481809, 150073849, -1821281822, 1943591083, 1395732834, 1058346282, 201589768, 1388824469, 1696801606, 1589887901, 672667696, -1583966665, 251987210, -1248159185, 151455502, 907153956, -1686077413, 1038279391, 652995533, 1764173646, -843926913, -1619692054, 453576978, -1635548387, 1949051992, 773462580, 756751158, -1301385508, -296068428, -73359269, -162377052, 1295727478, 1641469623, -827083907, 2066295122, 1055122397, 1898917726, -1752923117, -179088474, 1758581177, 0, 753790401, 1612718144, 536673507, -927878791, -312779850, -1100322092, 1187761037, -641810841, 1262041458, -565556588, -733197160, -396863312, 1255133061, 1808847035, 720367557, -441800113, 385612781, -985447546, -682799718, 1429418854, -1803188975, -817543798, 284817897, 100794884, -2122350594, -263171936, 1144798328, -1163944155, -475486133, -212774494, -22830243, -1069531008, -1970303227, -1382903233, -1130521311, 1211644016, 83228145, -541279133, -1044990345, 1977277103, 1663115586, 806359072, 452984805, 250868733, 1842533055, 1288555905, 336333848, 890442534, 804056259, -513843266, -1567123659, -867941240, 957814574, 1472513171, -223893675, -2105639172, 1195195770, -1402706744, -413311558, 723065138, -1787595802, -1604296512, -1736343271, -783331426, 2145180835, 1713513028, 2116692564, -1416589253, -2088204277, -901364084, 703524551, -742868885, 1007948840, 2044649127, -497131844, 487262998, 1994120109, 1004593371, 1446130276, 1312438900, 503974420, -615954030, 168166924, 1814307912, -463709000, 1573044895, 1859376061, -273896381, -1503501628, -1466855111, -1533700815, 937747667, -1954973198, 854058965, 1137232011, 1496790894, -1217565222, -1936880383, 1691735473, -766620004, -525751991, -1267962664, -95005012, 133494003, 636152527, -1352309302, -1904575756, -374428089, 403179536, -709182865, -2005370640, 1864705354, 1915629148, 605822008, -240736681, -944458637, 1371981463, 602466507, 2094914977, -1670089496, 555687742, -582268010, -591544991, -2037675251, -2054518257, -1871679264, 1111375484, -994724495, -1436129588, -666351472, 84083462, 32962295, 302911004, -1553899070, 1597322602, -111716434, -793134743, -1853454825, 1489093017, 656219450, -1180787161, 954327513, 335083755, -1281845205, 856756514, -1150719534, 1893325225, -1987146233, -1483434957, -1231316179, 572399164, -1836611819, 552200649, 1238290055, -11184726, 2015897680, 2061492133, -1886614525, -123625127, -2138470135, 386731290, -624967835, 837215959, -968736124, -1201116976, -1019133566, -1332111063, 1999449434, 286199582, -877612933, -61582168, -692339859, 974525996};
    private static final int[] Tinv0 = {1353184337, 1399144830, -1012656358, -1772214470, -882136261, -247096033, -1420232020, -1828461749, 1442459680, -160598355, -1854485368, 625738485, -52959921, -674551099, -2143013594, -1885117771, 1230680542, 1729870373, -1743852987, -507445667, 41234371, 317738113, -1550367091, -956705941, -413167869, -1784901099, -344298049, -631680363, 763608788, -752782248, 694804553, 1154009486, 1787413109, 2021232372, 1799248025, -579749593, -1236278850, 397248752, 1722556617, -1271214467, 407560035, -2110711067, 1613975959, 1165972322, -529046351, -2068943941, 480281086, -1809118983, 1483229296, 436028815, -2022908268, -1208452270, 601060267, -503166094, 1468997603, 715871590, 120122290, 63092015, -1703164538, -1526188077, -226023376, -1297760477, -1167457534, 1552029421, 723308426, -1833666137, -252573709, -1578997426, -839591323, -708967162, 526529745, -1963022652, -1655493068, -1604979806, 853641733, 1978398372, 971801355, -1427152832, 111112542, 1360031421, -108388034, 1023860118, -1375387939, 1186850381, -1249028975, 90031217, 1876166148, -15380384, 620468249, -1746289194, -868007799, 2006899047, -1119688528, -2004121337, 945494503, -605108103, 1191869601, -384875908, -920746760, 0, -2088337399, 1223502642, -1401941730, 1316117100, -67170563, 1446544655, 517320253, 658058550, 1691946762, 564550760, -783000677, 976107044, -1318647284, 266819475, -761860428, -1634624741, 1338359936, -1574904735, 1766553434, 370807324, 179999714, -450191168, 1138762300, 488053522, 185403662, -1379431438, -1180125651, -928440812, -2061897385, 1275557295, -1143105042, -44007517, -1624899081, -1124765092, -985962940, 880737115, 1982415755, -590994485, 1761406390, 1676797112, -891538985, 277177154, 1076008723, 538035844, 2099530373, -130171950, 288553390, 1839278535, 1261411869, -214912292, -330136051, -790380169, 1813426987, -1715900247, -95906799, 577038663, -997393240, 440397984, -668172970, -275762398, -951170681, -1043253031, -22885748, 906744984, -813566554, 685669029, 646887386, -1530942145, -459458004, 227702864, -1681105046, 1648787028, -1038905866, -390539120, 1593260334, -173030526, -1098883681, 2090061929, -1456614033, -1290656305, 999926984, -1484974064, 1852021992, 2075868123, 158869197, -199730834, 28809964, -1466282109, 1701746150, 2129067946, 147831841, -420997649, -644094022, -835293366, -737566742, -696471511, -1347247055, 824393514, 815048134, -1067015627, 935087732, -1496677636, -1328508704, 366520115, 1251476721, -136647615, 240176511, 804688151, -1915335306, 1303441219, 1414376140, -553347356, -474623586, 461924940, -1205916479, 2136040774, 82468509, 1563790337, 1937016826, 776014843, 1511876531, 1389550482, 861278441, 323475053, -1939744870, 2047648055, -1911228327, -1992551445, -299390514, 902390199, -303751967, 1018251130, 1507840668, 1064563285, 2043548696, -1086863501, -355600557, 1537932639, 342834655, -2032450440, -2114736182, 1053059257, 741614648, 1598071746, 1925389590, 203809468, -1958134744, 1100287487, 1895934009, -558691320, -1662733096, -1866377628, 1636092795, 1890988757, 1952214088, 1113045200};

    public AESEngine() {
    }

    private static int FFmulX(int i) {
        return (((i & m1) >>> 7) * 27) ^ ((m2 & i) << 1);
    }

    private static int FFmulX2(int i) {
        int i2 = (m5 & i) << 2;
        int i3 = i & m4;
        int i4 = i3 ^ (i3 >>> 1);
        return (i4 >>> 5) ^ (i2 ^ (i4 >>> 2));
    }

    private void decryptBlock(int[][] iArr) {
        int i = this.C0;
        int i2 = this.ROUNDS;
        int[] iArr2 = iArr[i2];
        char c = 0;
        int i3 = i ^ iArr2[0];
        int i4 = 1;
        int i5 = this.C1 ^ iArr2[1];
        char c2 = 2;
        int i6 = this.C2 ^ iArr2[2];
        int i7 = i2 - 1;
        int i8 = iArr2[3] ^ this.C3;
        while (i7 > i4) {
            int[] iArr3 = Tinv0;
            int shift = (((iArr3[i3 & 255] ^ shift(iArr3[(i8 >> 8) & 255], 24)) ^ shift(iArr3[(i6 >> 16) & 255], 16)) ^ shift(iArr3[(i5 >> 24) & 255], 8)) ^ iArr[i7][c];
            char c3 = c;
            int shift2 = (((shift(iArr3[(i3 >> 8) & 255], 24) ^ iArr3[i5 & 255]) ^ shift(iArr3[(i8 >> 16) & 255], 16)) ^ shift(iArr3[(i6 >> 24) & 255], 8)) ^ iArr[i7][i4];
            int i9 = i4;
            int shift3 = (((shift(iArr3[(i5 >> 8) & 255], 24) ^ iArr3[i6 & 255]) ^ shift(iArr3[(i3 >> 16) & 255], 16)) ^ shift(iArr3[(i8 >> 24) & 255], 8)) ^ iArr[i7][c2];
            int shift4 = shift(iArr3[(i3 >> 24) & 255], 8) ^ ((iArr3[i8 & 255] ^ shift(iArr3[(i6 >> 8) & 255], 24)) ^ shift(iArr3[(i5 >> 16) & 255], 16));
            int i10 = i7 - 1;
            int i11 = shift4 ^ iArr[i7][3];
            int shift5 = (((iArr3[shift & 255] ^ shift(iArr3[(i11 >> 8) & 255], 24)) ^ shift(iArr3[(shift3 >> 16) & 255], 16)) ^ shift(iArr3[(shift2 >> 24) & 255], 8)) ^ iArr[i10][c3];
            int shift6 = (((iArr3[shift2 & 255] ^ shift(iArr3[(shift >> 8) & 255], 24)) ^ shift(iArr3[(i11 >> 16) & 255], 16)) ^ shift(iArr3[(shift3 >> 24) & 255], 8)) ^ iArr[i10][i9];
            char c4 = c2;
            int shift7 = (((shift(iArr3[(shift2 >> 8) & 255], 24) ^ iArr3[shift3 & 255]) ^ shift(iArr3[(shift >> 16) & 255], 16)) ^ shift(iArr3[(i11 >> 24) & 255], 8)) ^ iArr[i10][c4];
            i7 -= 2;
            i8 = iArr[i10][3] ^ (((iArr3[i11 & 255] ^ shift(iArr3[(shift3 >> 8) & 255], 24)) ^ shift(iArr3[(shift2 >> 16) & 255], 16)) ^ shift(iArr3[(shift >> 24) & 255], 8));
            i3 = shift5;
            i5 = shift6;
            i6 = shift7;
            c = c3;
            i4 = i9;
            c2 = c4;
        }
        char c5 = c;
        int i12 = i4;
        char c6 = c2;
        int[] iArr4 = Tinv0;
        int shift8 = (((iArr4[i3 & 255] ^ shift(iArr4[(i8 >> 8) & 255], 24)) ^ shift(iArr4[(i6 >> 16) & 255], 16)) ^ shift(iArr4[(i5 >> 24) & 255], 8)) ^ iArr[i7][c5];
        int shift9 = (((iArr4[i5 & 255] ^ shift(iArr4[(i3 >> 8) & 255], 24)) ^ shift(iArr4[(i8 >> 16) & 255], 16)) ^ shift(iArr4[(i6 >> 24) & 255], 8)) ^ iArr[i7][i12];
        int shift10 = (((iArr4[i6 & 255] ^ shift(iArr4[(i5 >> 8) & 255], 24)) ^ shift(iArr4[(i3 >> 16) & 255], 16)) ^ shift(iArr4[(i8 >> 24) & 255], 8)) ^ iArr[i7][c6];
        int shift11 = (shift(iArr4[(i3 >> 24) & 255], 8) ^ ((iArr4[i8 & 255] ^ shift(iArr4[(i6 >> 8) & 255], 24)) ^ shift(iArr4[(i5 >> 16) & 255], 16))) ^ iArr[i7][3];
        byte[] bArr = Si;
        int i13 = bArr[shift8 & 255] & 255;
        byte[] bArr2 = this.s;
        int i14 = ((i13 ^ ((bArr2[(shift11 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(shift10 >> 16) & 255] & 255) << 16)) ^ (bArr[(shift9 >> 24) & 255] << 24);
        int[] iArr5 = iArr[c5];
        this.C0 = i14 ^ iArr5[c5];
        this.C1 = ((((bArr2[shift9 & 255] & 255) ^ ((bArr2[(shift8 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(shift10 >> 24) & 255] << 24)) ^ iArr5[i12];
        this.C2 = ((((bArr2[shift10 & 255] & 255) ^ ((bArr[(shift9 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift8 >> 16) & 255] & 255) << 16)) ^ (bArr2[(shift11 >> 24) & 255] << 24)) ^ iArr5[c6];
        this.C3 = ((((bArr[shift11 & 255] & 255) ^ ((bArr2[(shift10 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(shift9 >> 16) & 255] & 255) << 16)) ^ (bArr2[(shift8 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    private void encryptBlock(int[][] iArr) {
        int i = this.C0;
        char c = 0;
        int[] iArr2 = iArr[0];
        int i2 = i ^ iArr2[0];
        int i3 = 1;
        int i4 = this.C1 ^ iArr2[1];
        char c2 = 2;
        int i5 = this.C2 ^ iArr2[2];
        int i6 = iArr2[3] ^ this.C3;
        int i7 = 1;
        while (i7 < this.ROUNDS - i3) {
            int[] iArr3 = T0;
            int shift = (((iArr3[i2 & 255] ^ shift(iArr3[(i4 >> 8) & 255], 24)) ^ shift(iArr3[(i5 >> 16) & 255], 16)) ^ shift(iArr3[(i6 >> 24) & 255], 8)) ^ iArr[i7][c];
            char c3 = c;
            int shift2 = (((shift(iArr3[(i5 >> 8) & 255], 24) ^ iArr3[i4 & 255]) ^ shift(iArr3[(i6 >> 16) & 255], 16)) ^ shift(iArr3[(i2 >> 24) & 255], 8)) ^ iArr[i7][i3];
            int i8 = i3;
            int shift3 = (((shift(iArr3[(i6 >> 8) & 255], 24) ^ iArr3[i5 & 255]) ^ shift(iArr3[(i2 >> 16) & 255], 16)) ^ shift(iArr3[(i4 >> 24) & 255], 8)) ^ iArr[i7][c2];
            int shift4 = ((shift(iArr3[(i2 >> 8) & 255], 24) ^ iArr3[i6 & 255]) ^ shift(iArr3[(i4 >> 16) & 255], 16)) ^ shift(iArr3[(i5 >> 24) & 255], 8);
            int i9 = i7 + 1;
            int i10 = shift4 ^ iArr[i7][3];
            int shift5 = (((iArr3[shift & 255] ^ shift(iArr3[(shift2 >> 8) & 255], 24)) ^ shift(iArr3[(shift3 >> 16) & 255], 16)) ^ shift(iArr3[(i10 >> 24) & 255], 8)) ^ iArr[i9][c3];
            int shift6 = (((iArr3[shift2 & 255] ^ shift(iArr3[(shift3 >> 8) & 255], 24)) ^ shift(iArr3[(i10 >> 16) & 255], 16)) ^ shift(iArr3[(shift >> 24) & 255], 8)) ^ iArr[i9][i8];
            char c4 = c2;
            int shift7 = (((shift(iArr3[(i10 >> 8) & 255], 24) ^ iArr3[shift3 & 255]) ^ shift(iArr3[(shift >> 16) & 255], 16)) ^ shift(iArr3[(shift2 >> 24) & 255], 8)) ^ iArr[i9][c4];
            i7 += 2;
            i6 = (((iArr3[i10 & 255] ^ shift(iArr3[(shift >> 8) & 255], 24)) ^ shift(iArr3[(shift2 >> 16) & 255], 16)) ^ shift(iArr3[(shift3 >> 24) & 255], 8)) ^ iArr[i9][3];
            i2 = shift5;
            i4 = shift6;
            i5 = shift7;
            c = c3;
            i3 = i8;
            c2 = c4;
        }
        char c5 = c;
        int i11 = i3;
        char c6 = c2;
        int[] iArr4 = T0;
        int shift8 = (((iArr4[i2 & 255] ^ shift(iArr4[(i4 >> 8) & 255], 24)) ^ shift(iArr4[(i5 >> 16) & 255], 16)) ^ shift(iArr4[(i6 >> 24) & 255], 8)) ^ iArr[i7][c5];
        int shift9 = (((iArr4[i4 & 255] ^ shift(iArr4[(i5 >> 8) & 255], 24)) ^ shift(iArr4[(i6 >> 16) & 255], 16)) ^ shift(iArr4[(i2 >> 24) & 255], 8)) ^ iArr[i7][i11];
        int shift10 = (((iArr4[i5 & 255] ^ shift(iArr4[(i6 >> 8) & 255], 24)) ^ shift(iArr4[(i2 >> 16) & 255], 16)) ^ shift(iArr4[(i4 >> 24) & 255], 8)) ^ iArr[i7][c6];
        int shift11 = (((shift(iArr4[(i2 >> 8) & 255], 24) ^ iArr4[i6 & 255]) ^ shift(iArr4[(i4 >> 16) & 255], 16)) ^ shift(iArr4[(i5 >> 24) & 255], 8)) ^ iArr[i7][3];
        byte[] bArr = S;
        int i12 = (bArr[shift8 & 255] & 255) ^ ((bArr[(shift9 >> 8) & 255] & 255) << 8);
        byte[] bArr2 = this.s;
        int i13 = (i12 ^ ((bArr2[(shift10 >> 16) & 255] & 255) << 16)) ^ (bArr2[(shift11 >> 24) & 255] << 24);
        int[] iArr5 = iArr[i7 + 1];
        this.C0 = i13 ^ iArr5[c5];
        this.C1 = ((((bArr2[shift9 & 255] & 255) ^ ((bArr[(shift10 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift11 >> 16) & 255] & 255) << 16)) ^ (bArr2[(shift8 >> 24) & 255] << 24)) ^ iArr5[i11];
        this.C2 = ((((bArr2[shift10 & 255] & 255) ^ ((bArr[(shift11 >> 8) & 255] & 255) << 8)) ^ ((bArr[(shift8 >> 16) & 255] & 255) << 16)) ^ (bArr[(shift9 >> 24) & 255] << 24)) ^ iArr5[c6];
        this.C3 = ((((bArr2[shift11 & 255] & 255) ^ ((bArr2[(shift8 >> 8) & 255] & 255) << 8)) ^ ((bArr2[(shift9 >> 16) & 255] & 255) << 16)) ^ (bArr[(shift10 >> 24) & 255] << 24)) ^ iArr5[3];
    }

    private int[][] generateWorkingKey(byte[] bArr, boolean z) {
        int i;
        int length = bArr.length;
        if (length < 16 || length > 32 || (length & 7) != 0) {
            throw new IllegalArgumentException("Key length not 128/192/256 bits.");
        }
        int i2 = length >>> 2;
        this.ROUNDS = i2 + 6;
        int[][] iArr = (int[][]) Array.newInstance((Class<?>) Integer.TYPE, i2 + 7, 4);
        if (i2 == 4) {
            i = 1;
            int littleEndianToInt = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt;
            int littleEndianToInt2 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt2;
            int littleEndianToInt3 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt3;
            int littleEndianToInt4 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt4;
            for (int i3 = 1; i3 <= 10; i3++) {
                littleEndianToInt ^= subWord(shift(littleEndianToInt4, 8)) ^ rcon[i3 - 1];
                int[] iArr2 = iArr[i3];
                iArr2[0] = littleEndianToInt;
                littleEndianToInt2 ^= littleEndianToInt;
                iArr2[1] = littleEndianToInt2;
                littleEndianToInt3 ^= littleEndianToInt2;
                iArr2[2] = littleEndianToInt3;
                littleEndianToInt4 ^= littleEndianToInt3;
                iArr2[3] = littleEndianToInt4;
            }
        } else if (i2 == 6) {
            i = 1;
            int littleEndianToInt5 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt5;
            int littleEndianToInt6 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt6;
            int littleEndianToInt7 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt7;
            int littleEndianToInt8 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt8;
            int littleEndianToInt9 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt9;
            int littleEndianToInt10 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt10;
            int subWord = littleEndianToInt5 ^ (subWord(shift(littleEndianToInt10, 8)) ^ 1);
            int[] iArr3 = iArr[1];
            iArr3[2] = subWord;
            int i4 = littleEndianToInt6 ^ subWord;
            iArr3[3] = i4;
            int i5 = littleEndianToInt7 ^ i4;
            int[] iArr4 = iArr[2];
            iArr4[0] = i5;
            int i6 = littleEndianToInt8 ^ i5;
            iArr4[1] = i6;
            int i7 = littleEndianToInt9 ^ i6;
            iArr4[2] = i7;
            int i8 = littleEndianToInt10 ^ i7;
            iArr4[3] = i8;
            int i9 = 2;
            for (int i10 = 3; i10 < 12; i10 += 3) {
                int subWord2 = subWord ^ (subWord(shift(i8, 8)) ^ i9);
                int[] iArr5 = iArr[i10];
                iArr5[0] = subWord2;
                int i11 = i4 ^ subWord2;
                iArr5[1] = i11;
                int i12 = i5 ^ i11;
                iArr5[2] = i12;
                int i13 = i6 ^ i12;
                iArr5[3] = i13;
                int i14 = i7 ^ i13;
                int i15 = i10 + 1;
                int[] iArr6 = iArr[i15];
                iArr6[0] = i14;
                int i16 = i8 ^ i14;
                iArr6[1] = i16;
                int subWord3 = subWord(shift(i16, 8)) ^ (i9 << 1);
                i9 <<= 2;
                subWord = subWord2 ^ subWord3;
                int[] iArr7 = iArr[i15];
                iArr7[2] = subWord;
                i4 = i11 ^ subWord;
                iArr7[3] = i4;
                i5 = i12 ^ i4;
                int[] iArr8 = iArr[i10 + 2];
                iArr8[0] = i5;
                i6 = i13 ^ i5;
                iArr8[1] = i6;
                i7 = i14 ^ i6;
                iArr8[2] = i7;
                i8 = i16 ^ i7;
                iArr8[3] = i8;
            }
            int subWord4 = (subWord(shift(i8, 8)) ^ i9) ^ subWord;
            int[] iArr9 = iArr[12];
            iArr9[0] = subWord4;
            int i17 = subWord4 ^ i4;
            iArr9[1] = i17;
            int i18 = i17 ^ i5;
            iArr9[2] = i18;
            iArr9[3] = i18 ^ i6;
        } else {
            if (i2 != 8) {
                throw new IllegalStateException("Should never get here");
            }
            int littleEndianToInt11 = Pack.littleEndianToInt(bArr, 0);
            iArr[0][0] = littleEndianToInt11;
            int littleEndianToInt12 = Pack.littleEndianToInt(bArr, 4);
            iArr[0][1] = littleEndianToInt12;
            int littleEndianToInt13 = Pack.littleEndianToInt(bArr, 8);
            iArr[0][2] = littleEndianToInt13;
            int littleEndianToInt14 = Pack.littleEndianToInt(bArr, 12);
            iArr[0][3] = littleEndianToInt14;
            int littleEndianToInt15 = Pack.littleEndianToInt(bArr, 16);
            iArr[1][0] = littleEndianToInt15;
            int littleEndianToInt16 = Pack.littleEndianToInt(bArr, 20);
            iArr[1][1] = littleEndianToInt16;
            int littleEndianToInt17 = Pack.littleEndianToInt(bArr, 24);
            iArr[1][2] = littleEndianToInt17;
            int littleEndianToInt18 = Pack.littleEndianToInt(bArr, 28);
            iArr[1][3] = littleEndianToInt18;
            int i19 = 1;
            i = 1;
            for (int i20 = 2; i20 < 14; i20 += 2) {
                int subWord5 = subWord(shift(littleEndianToInt18, 8)) ^ i19;
                i19 <<= 1;
                littleEndianToInt11 ^= subWord5;
                int[] iArr10 = iArr[i20];
                iArr10[0] = littleEndianToInt11;
                littleEndianToInt12 ^= littleEndianToInt11;
                iArr10[1] = littleEndianToInt12;
                littleEndianToInt13 ^= littleEndianToInt12;
                iArr10[2] = littleEndianToInt13;
                littleEndianToInt14 ^= littleEndianToInt13;
                iArr10[3] = littleEndianToInt14;
                littleEndianToInt15 ^= subWord(littleEndianToInt14);
                int[] iArr11 = iArr[i20 + 1];
                iArr11[0] = littleEndianToInt15;
                littleEndianToInt16 ^= littleEndianToInt15;
                iArr11[1] = littleEndianToInt16;
                littleEndianToInt17 ^= littleEndianToInt16;
                iArr11[2] = littleEndianToInt17;
                littleEndianToInt18 ^= littleEndianToInt17;
                iArr11[3] = littleEndianToInt18;
            }
            int subWord6 = (subWord(shift(littleEndianToInt18, 8)) ^ i19) ^ littleEndianToInt11;
            int[] iArr12 = iArr[14];
            iArr12[0] = subWord6;
            int i21 = subWord6 ^ littleEndianToInt12;
            iArr12[1] = i21;
            int i22 = i21 ^ littleEndianToInt13;
            iArr12[2] = i22;
            iArr12[3] = i22 ^ littleEndianToInt14;
        }
        if (!z) {
            for (int i23 = i; i23 < this.ROUNDS; i23++) {
                for (int i24 = 0; i24 < 4; i24++) {
                    int[] iArr13 = iArr[i23];
                    iArr13[i24] = inv_mcol(iArr13[i24]);
                }
            }
        }
        return iArr;
    }

    private static int inv_mcol(int i) {
        int shift = shift(i, 8) ^ i;
        int FFmulX = i ^ FFmulX(shift);
        int FFmulX2 = shift ^ FFmulX2(FFmulX);
        return FFmulX ^ (FFmulX2 ^ shift(FFmulX2, 16));
    }

    private void packBlock(byte[] bArr, int i) {
        int i2 = this.C0;
        bArr[i] = (byte) i2;
        bArr[i + 1] = (byte) (i2 >> 8);
        bArr[i + 2] = (byte) (i2 >> 16);
        bArr[i + 3] = (byte) (i2 >> 24);
        int i3 = this.C1;
        bArr[i + 4] = (byte) i3;
        bArr[i + 5] = (byte) (i3 >> 8);
        bArr[i + 6] = (byte) (i3 >> 16);
        bArr[i + 7] = (byte) (i3 >> 24);
        int i4 = this.C2;
        bArr[i + 8] = (byte) i4;
        bArr[i + 9] = (byte) (i4 >> 8);
        bArr[i + 10] = (byte) (i4 >> 16);
        bArr[i + 11] = (byte) (i4 >> 24);
        int i5 = this.C3;
        bArr[i + 12] = (byte) i5;
        bArr[i + 13] = (byte) (i5 >> 8);
        bArr[i + 14] = (byte) (i5 >> 16);
        bArr[i + 15] = (byte) (i5 >> 24);
    }

    private static int shift(int i, int i2) {
        return (i << (-i2)) | (i >>> i2);
    }

    private static int subWord(int i) {
        byte[] bArr = S;
        return (bArr[(i >> 24) & 255] << 24) | (bArr[i & 255] & 255) | ((bArr[(i >> 8) & 255] & 255) << 8) | ((bArr[(i >> 16) & 255] & 255) << 16);
    }

    private void unpackBlock(byte[] bArr, int i) {
        int i2 = bArr[i] & 255;
        this.C0 = i2;
        int i3 = ((bArr[i + 1] & 255) << 8) | i2;
        this.C0 = i3;
        int i4 = i3 | ((bArr[i + 2] & 255) << 16);
        this.C0 = i4;
        this.C0 = i4 | (bArr[i + 3] << 24);
        int i5 = bArr[i + 4] & 255;
        this.C1 = i5;
        int i6 = ((bArr[i + 5] & 255) << 8) | i5;
        this.C1 = i6;
        int i7 = i6 | ((bArr[i + 6] & 255) << 16);
        this.C1 = i7;
        this.C1 = i7 | (bArr[i + 7] << 24);
        int i8 = bArr[i + 8] & 255;
        this.C2 = i8;
        int i9 = ((bArr[i + 9] & 255) << 8) | i8;
        this.C2 = i9;
        int i10 = i9 | ((bArr[i + 10] & 255) << 16);
        this.C2 = i10;
        this.C2 = i10 | (bArr[i + 11] << 24);
        int i11 = bArr[i + 12] & 255;
        this.C3 = i11;
        int i12 = ((bArr[i + 13] & 255) << 8) | i11;
        this.C3 = i12;
        int i13 = i12 | ((bArr[i + 14] & 255) << 16);
        this.C3 = i13;
        this.C3 = (bArr[i + 15] << 24) | i13;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public String getAlgorithmName() {
        return "AES";
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int getBlockSize() {
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void init(boolean z, CipherParameters cipherParameters) {
        if (!(cipherParameters instanceof KeyParameter)) {
            throw new IllegalArgumentException("invalid parameter passed to AES init - " + cipherParameters.getClass().getName());
        }
        this.WorkingKey = generateWorkingKey(((KeyParameter) cipherParameters).getKey(), z);
        this.forEncryption = z;
        if (z) {
            this.s = Arrays.clone(S);
        } else {
            this.s = Arrays.clone(Si);
        }
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public int processBlock(byte[] bArr, int i, byte[] bArr2, int i2) {
        if (this.WorkingKey == null) {
            throw new IllegalStateException("AES engine not initialised");
        }
        if (i + 16 > bArr.length) {
            throw new DataLengthException("input buffer too short");
        }
        if (i2 + 16 > bArr2.length) {
            throw new OutputLengthException("output buffer too short");
        }
        boolean z = this.forEncryption;
        unpackBlock(bArr, i);
        int[][] iArr = this.WorkingKey;
        if (z) {
            encryptBlock(iArr);
        } else {
            decryptBlock(iArr);
        }
        packBlock(bArr2, i2);
        return 16;
    }

    @Override // org.bouncycastle.crypto.BlockCipher
    public void reset() {
    }
}
