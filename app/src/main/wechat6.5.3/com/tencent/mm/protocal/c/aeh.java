package com.tencent.mm.protocal.c;

import a.a.a.b;
import a.a.a.c.a;
import java.util.LinkedList;

public final class aeh extends aqx {
    public String cHf;
    public String lZC;
    public String lZp;
    public String mEL;
    public String mEM;
    public String mEN;
    public int mEO;
    public ads mmP;

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
            if (this.mmP != null) {
                aVar.dX(2, this.mmP.aHr());
                this.mmP.a(aVar);
            }
            if (this.mEM != null) {
                aVar.e(3, this.mEM);
            }
            if (this.lZC != null) {
                aVar.e(4, this.lZC);
            }
            if (this.lZp != null) {
                aVar.e(5, this.lZp);
            }
            if (this.mEN != null) {
                aVar.e(6, this.mEN);
            }
            aVar.dV(7, this.mEO);
            if (this.mEL != null) {
                aVar.e(8, this.mEL);
            }
            if (this.cHf == null) {
                return 0;
            }
            aVar.e(9, this.cHf);
            return 0;
        } else if (i == 1) {
            if (this.mQl != null) {
                r0 = a.a.a.a.dU(1, this.mQl.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.mmP != null) {
                r0 += a.a.a.a.dU(2, this.mmP.aHr());
            }
            if (this.mEM != null) {
                r0 += a.a.a.b.b.a.f(3, this.mEM);
            }
            if (this.lZC != null) {
                r0 += a.a.a.b.b.a.f(4, this.lZC);
            }
            if (this.lZp != null) {
                r0 += a.a.a.b.b.a.f(5, this.lZp);
            }
            if (this.mEN != null) {
                r0 += a.a.a.b.b.a.f(6, this.mEN);
            }
            r0 += a.a.a.a.dS(7, this.mEO);
            if (this.mEL != null) {
                r0 += a.a.a.b.b.a.f(8, this.mEL);
            }
            if (this.cHf != null) {
                r0 += a.a.a.b.b.a.f(9, this.cHf);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqx.a(aVar2); r0 > 0; r0 = aqx.a(aVar2)) {
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
            aeh com_tencent_mm_protocal_c_aeh = (aeh) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            LinkedList zQ;
            int size;
            byte[] bArr;
            a.a.a.a.a aVar4;
            boolean z;
            switch (intValue) {
                case 1:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        eo eoVar = new eo();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = eoVar.a(aVar4, eoVar, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aeh.mQl = eoVar;
                    }
                    return 0;
                case 2:
                    zQ = aVar3.zQ(intValue);
                    size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        bArr = (byte[]) zQ.get(intValue);
                        ads com_tencent_mm_protocal_c_ads = new ads();
                        aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (z = true; z; z = com_tencent_mm_protocal_c_ads.a(aVar4, com_tencent_mm_protocal_c_ads, aqx.a(aVar4))) {
                        }
                        com_tencent_mm_protocal_c_aeh.mmP = com_tencent_mm_protocal_c_ads;
                    }
                    return 0;
                case 3:
                    com_tencent_mm_protocal_c_aeh.mEM = aVar3.pMj.readString();
                    return 0;
                case 4:
                    com_tencent_mm_protocal_c_aeh.lZC = aVar3.pMj.readString();
                    return 0;
                case 5:
                    com_tencent_mm_protocal_c_aeh.lZp = aVar3.pMj.readString();
                    return 0;
                case 6:
                    com_tencent_mm_protocal_c_aeh.mEN = aVar3.pMj.readString();
                    return 0;
                case 7:
                    com_tencent_mm_protocal_c_aeh.mEO = aVar3.pMj.mH();
                    return 0;
                case 8:
                    com_tencent_mm_protocal_c_aeh.mEL = aVar3.pMj.readString();
                    return 0;
                case 9:
                    com_tencent_mm_protocal_c_aeh.cHf = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}