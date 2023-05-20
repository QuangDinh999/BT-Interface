package Day_8.BT_generic_2;

public class ITinhToanPhanSo implements ITinhToan <PhanSo>{
    @Override
    public PhanSo cong(PhanSo t1, PhanSo t2) {
        PhanSo tong = new PhanSo();
        if( t1.getPhanMau() == t2.getPhanMau()){
            tong.setPhanTu(t1.getPhanTu() + t2.getPhanTu());
            tong.setPhanMau(t1.getPhanMau());

        }else{
            tong.setPhanTu(t1.getPhanTu()*t2.getPhanMau() + t2.getPhanTu()*t1.getPhanMau());
            tong.setPhanMau(t1.getPhanMau()*t2.getPhanMau());

        }
        return tong;
    }

    @Override
    public PhanSo tru(PhanSo t1, PhanSo t2) {
        PhanSo hieu = new PhanSo();
        if( t1.getPhanMau() == t2.getPhanMau()){
            hieu.setPhanTu(t1.getPhanTu() - t2.getPhanTu());
            hieu.setPhanMau(t1.getPhanMau());

        }else{
            hieu.setPhanTu(t1.getPhanTu()*t2.getPhanMau() - t2.getPhanTu()*t1.getPhanMau());
            hieu.setPhanMau(t1.getPhanMau()*t2.getPhanMau());

        }
        return hieu;
    }

    @Override
    public PhanSo nhan(PhanSo t1, PhanSo t2) {
        PhanSo tich = new PhanSo();
        tich.setPhanTu(t1.getPhanTu()*t2.getPhanTu());
        tich.setPhanMau(t1.getPhanMau()*t2.getPhanMau());
        return tich;
    }

    @Override
    public PhanSo chia(PhanSo t1, PhanSo t2) {
        PhanSo thuong = new PhanSo();
        thuong.setPhanTu(t1.getPhanTu()*t2.getPhanMau());
        thuong.setPhanMau(t1.getPhanMau()*t2.getPhanTu());
        return thuong;
    }
}
