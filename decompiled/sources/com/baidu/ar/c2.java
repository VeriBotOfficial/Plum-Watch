package com.baidu.ar;

import java.nio.ByteBuffer;

/* loaded from: classes12.dex */
public class c2 extends q2 {
    public int h;
    public String i;

    public c2() {
        super(t9.CLOSING);
        a("");
        a(1000);
    }

    public void a(int i) {
        this.h = i;
        if (i == 1015) {
            this.h = 1005;
            this.i = "";
        }
        j();
    }

    public void a(String str) {
        if (str == null) {
            str = "";
        }
        this.i = str;
        j();
    }

    @Override // com.baidu.ar.r4
    public void a(ByteBuffer byteBuffer) {
        int i;
        this.h = 1005;
        this.i = "";
        byteBuffer.mark();
        if (byteBuffer.remaining() == 0) {
            i = 1000;
        } else {
            if (byteBuffer.remaining() != 1) {
                if (byteBuffer.remaining() >= 2) {
                    ByteBuffer allocate = ByteBuffer.allocate(4);
                    allocate.position(2);
                    allocate.putShort(byteBuffer.getShort());
                    allocate.position(0);
                    this.h = allocate.getInt();
                }
                byteBuffer.reset();
                try {
                    a(byteBuffer, byteBuffer.position());
                    return;
                } catch (t7 unused) {
                    this.h = 1007;
                    this.i = null;
                    return;
                }
            }
            i = 1002;
        }
        this.h = i;
    }

    public final void a(ByteBuffer byteBuffer, int i) {
        try {
            try {
                byteBuffer.position(byteBuffer.position() + 2);
                this.i = y1.b(byteBuffer);
            } catch (IllegalArgumentException unused) {
                throw new t7(1007);
            }
        } finally {
            byteBuffer.position(i);
        }
    }

    @Override // com.baidu.ar.r4
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c2.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        c2 c2Var = (c2) obj;
        if (this.h != c2Var.h) {
            return false;
        }
        String str = this.i;
        String str2 = c2Var.i;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.baidu.ar.r4, com.baidu.ar.q4
    public ByteBuffer f() {
        return this.h == 1005 ? n1.a() : super.f();
    }

    @Override // com.baidu.ar.q2, com.baidu.ar.r4
    public void g() {
        super.g();
        if (this.h == 1007 && this.i.isEmpty()) {
            throw new t7(1007, "Received text is no valid utf8 string!");
        }
        if (this.h == 1005 && this.i.length() > 0) {
            throw new t7(1002, "A close frame must have a closecode if it has a reason");
        }
        int i = this.h;
        if (i > 1015 && i < 3000) {
            throw new t7(1002, "Trying to send an illegal close code!");
        }
        if (i == 1006 || i == 1015 || i == 1005 || i > 4999 || i < 1000 || i == 1004) {
            throw new v7("closecode must not be sent over the wire: " + this.h);
        }
    }

    public int h() {
        return this.h;
    }

    @Override // com.baidu.ar.r4
    public int hashCode() {
        int hashCode = ((super.hashCode() * 31) + this.h) * 31;
        String str = this.i;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public String i() {
        return this.i;
    }

    public final void j() {
        byte[] b = y1.b(this.i);
        ByteBuffer allocate = ByteBuffer.allocate(4);
        allocate.putInt(this.h);
        allocate.position(2);
        ByteBuffer allocate2 = ByteBuffer.allocate(b.length + 2);
        allocate2.put(allocate);
        allocate2.put(b);
        allocate2.rewind();
        super.a(allocate2);
    }

    @Override // com.baidu.ar.r4
    public String toString() {
        return super.toString() + "code: " + this.h;
    }
}
