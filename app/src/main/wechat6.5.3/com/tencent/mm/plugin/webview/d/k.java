package com.tencent.mm.plugin.webview.d;

import com.tencent.mm.network.j;
import com.tencent.mm.network.p;
import com.tencent.mm.protocal.c.adt;
import com.tencent.mm.protocal.c.adu;
import com.tencent.mm.sdk.platformtools.v;
import com.tencent.mm.v.b;
import com.tencent.mm.v.b.a;
import com.tencent.mm.v.e;

public final class k extends com.tencent.mm.v.k implements j {
    public final b cif;
    private e cxf;

    public k(String str, String str2) {
        a aVar = new a();
        aVar.czn = new adt();
        aVar.czo = new adu();
        aVar.uri = "/cgi-bin/mmpay-bin/payibggetuseropenid";
        aVar.czm = 1566;
        aVar.czp = 0;
        aVar.czq = 0;
        this.cif = aVar.Bv();
        adt com_tencent_mm_protocal_c_adt = (adt) this.cif.czk.czs;
        com_tencent_mm_protocal_c_adt.gln = str2;
        com_tencent_mm_protocal_c_adt.glj = str;
    }

    public final void a(int i, int i2, int i3, String str, p pVar, byte[] bArr) {
        v.i("MicroMsg.NetSceneGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), str});
        this.cxf.a(i2, i3, str, this);
    }

    public final int getType() {
        return 1566;
    }

    public final int a(com.tencent.mm.network.e eVar, e eVar2) {
        v.i("MicroMsg.NetSceneGetUserOpenId", "doScene");
        this.cxf = eVar2;
        return a(eVar, this.cif, this);
    }
}
