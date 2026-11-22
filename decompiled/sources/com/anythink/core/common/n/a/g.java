package com.anythink.core.common.n.a;

import com.anythink.core.common.n.a.d;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/* loaded from: classes12.dex */
public class g extends d {
    public g(String str, int i, long j) {
        super(str, i, j);
    }

    private g(String str, int i, long j, int i2) {
        super(str, i, j, i2);
    }

    @Override // com.anythink.core.common.n.a.d
    final e a(d.a aVar, String str, String str2, int i) {
        b bVar = new b((short) (Math.random() * 65535.0d), i, str2);
        byte[] b = bVar.b();
        InetAddress byName = InetAddress.getByName(str);
        DatagramSocket datagramSocket = null;
        try {
            final DatagramSocket datagramSocket2 = new DatagramSocket();
            try {
                DatagramPacket datagramPacket = new DatagramPacket(b, b.length, byName, this.b);
                try {
                    datagramSocket2.setSoTimeout((int) this.f4037a);
                } catch (Throwable unused) {
                    datagramSocket2.setSoTimeout(500);
                }
                aVar.f4038a.add(new Runnable() { // from class: com.anythink.core.common.n.a.g.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        try {
                            datagramSocket2.disconnect();
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                        try {
                            datagramSocket2.close();
                        } catch (Exception e2) {
                            e2.printStackTrace();
                        }
                    }
                });
                datagramSocket2.send(datagramPacket);
                DatagramPacket datagramPacket2 = new DatagramPacket(new byte[1500], 1500);
                datagramSocket2.receive(datagramPacket2);
                new Object[]{str, str2};
                e eVar = new e(str, bVar, datagramPacket2.getData());
                datagramSocket2.close();
                return eVar;
            } catch (Throwable th) {
                th = th;
                datagramSocket = datagramSocket2;
                if (datagramSocket != null) {
                    datagramSocket.close();
                }
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
        }
    }
}
