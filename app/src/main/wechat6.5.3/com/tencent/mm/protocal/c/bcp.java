package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class bcp extends aqx {
    public int mHB;
    public int mYk;
    public int mbT;
    public String mcN;
    public long mcb;
    public String mjT;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mQl == null) {
                throw new b("Not all required fields were included: BaseResponse");
            }
            if (this.mQl != null) {
                aVar.dX(1, this.mQl.aHr());
                this.mQl.a(aVar);
            }
            if (this.mcN != null) {
                aVar.e(2, this.mcN);
            }
            aVar.dV(3, this.mbT);
            aVar.dV(4, this.mHB);
            aVar.dV(5, this.mYk);
            aVar.C(6, this.mcb);
            if (this.mjT == null) {
                return 0;
            }
            aVar.e(7, this.mjT);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mcN != null) {
                r0 += a.a.a.b.b.a.f(2, this.mcN);
            }
            r0 = (((r0 + a.a.a.a.dS(3, this.mbT)) + a.a.a.a.dS(4, this.mHB)) + a.a.a.a.dS(5, this.mYk)) + a.a.a.a.B(6, this.mcb);
            if (this.mjT != null) {
                r0 += a.a.a.b.b.a.f(7, this.mjT);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = com.tencent.mm.ba.a.a(aVar2); r0 > 0; r0 = com.tencent.mm.ba.a.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            if (this.mQl != null) {
                return 0;
            }
            throw new b("Not all required fields were included: BaseResponse");
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            bcp com_tencent_mm_protocal_c_bcp = (bcp) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        com.tencent.mm.ba.a eoVar = new eo();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = eoVar.a(aVar4, eoVar, com.tencent.mm.ba.a.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_bcp.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    com_tencent_mm_protocal_c_bcp.mcN = aVar3.pMj.readString();
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_bcp.mbT = aVar3.pMj.mH();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_bcp.mHB = aVar3.pMj.mH();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_bcp.mYk = aVar3.pMj.mH();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_bcp.mcb = aVar3.pMj.mI();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_bcp.mjT = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
