package com.tencent.mm.protocal.c;

import a.a.a.c.a;
import java.util.LinkedList;

public final class qq extends aqp {
    public String hOy;
    public String mgw;
    public String mpB;
    public String muw;
    public String mux;
    public String muy;

    protected final int a(int i, Object... objArr) {
        if (i == 0) {
            a aVar = (a) objArr[0];
            if (this.mPU != null) {
                aVar.dX(1, this.mPU.aHr());
                this.mPU.a(aVar);
            }
            if (this.muw != null) {
                aVar.e(2, this.muw);
            }
            if (this.mgw != null) {
                aVar.e(3, this.mgw);
            }
            if (this.hOy != null) {
                aVar.e(4, this.hOy);
            }
            if (this.mux != null) {
                aVar.e(5, this.mux);
            }
            if (this.muy != null) {
                aVar.e(6, this.muy);
            }
            if (this.mpB == null) {
                return 0;
            }
            aVar.e(7, this.mpB);
            return 0;
        } else if (i == 1) {
            if (this.mPU != null) {
                r0 = a.a.a.a.dU(1, this.mPU.aHr()) + 0;
            } else {
                r0 = 0;
            }
            if (this.muw != null) {
                r0 += a.a.a.b.b.a.f(2, this.muw);
            }
            if (this.mgw != null) {
                r0 += a.a.a.b.b.a.f(3, this.mgw);
            }
            if (this.hOy != null) {
                r0 += a.a.a.b.b.a.f(4, this.hOy);
            }
            if (this.mux != null) {
                r0 += a.a.a.b.b.a.f(5, this.mux);
            }
            if (this.muy != null) {
                r0 += a.a.a.b.b.a.f(6, this.muy);
            }
            if (this.mpB != null) {
                r0 += a.a.a.b.b.a.f(7, this.mpB);
            }
            return r0;
        } else if (i == 2) {
            a.a.a.a.a aVar2 = new a.a.a.a.a((byte[]) objArr[0], unknownTagHandler);
            for (r0 = aqp.a(aVar2); r0 > 0; r0 = aqp.a(aVar2)) {
                if (!super.a(aVar2, this, r0)) {
                    aVar2.bQL();
                }
            }
            return 0;
        } else if (i != 3) {
            return -1;
        } else {
            a.a.a.a.a aVar3 = (a.a.a.a.a) objArr[0];
            qq qqVar = (qq) objArr[1];
            int intValue = ((Integer) objArr[2]).intValue();
            switch (intValue) {
                case 1:
                    LinkedList zQ = aVar3.zQ(intValue);
                    int size = zQ.size();
                    for (intValue = 0; intValue < size; intValue++) {
                        byte[] bArr = (byte[]) zQ.get(intValue);
                        en enVar = new en();
                        a.a.a.a.a aVar4 = new a.a.a.a.a(bArr, unknownTagHandler);
                        for (boolean z = true; z; z = enVar.a(aVar4, enVar, aqp.a(aVar4))) {
                        }
                        qqVar.mPU = enVar;
                    }
                    return 0;
                case 2:
                    qqVar.muw = aVar3.pMj.readString();
                    return 0;
                case 3:
                    qqVar.mgw = aVar3.pMj.readString();
                    return 0;
                case 4:
                    qqVar.hOy = aVar3.pMj.readString();
                    return 0;
                case 5:
                    qqVar.mux = aVar3.pMj.readString();
                    return 0;
                case 6:
                    qqVar.muy = aVar3.pMj.readString();
                    return 0;
                case 7:
                    qqVar.mpB = aVar3.pMj.readString();
                    return 0;
                default:
                    return -1;
            }
        }
    }
}
