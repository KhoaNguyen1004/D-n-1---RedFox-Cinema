
package Model;




public class Ve{
    String MaVe;
    String MaSuat;
    int ViTriGhe;
    String NgayBan;
    String GiaVe;
    String KhachHang;
    String NhanVien;

    public Ve() {
    }

    public Ve(String MaVe, String MaSuat, int ViTriGhe, String NgayBan, String GiaVe, String KhachHang, String NhanVien) {
        this.MaVe = MaVe;
        this.MaSuat = MaSuat;
        this.ViTriGhe = ViTriGhe;
        this.NgayBan = NgayBan;
        this.GiaVe = GiaVe;
        this.KhachHang = KhachHang;
        this.NhanVien = NhanVien;
    }

    public String getMaVe() {
        return MaVe;
    }

    public void setMaVe(String MaVe) {
        this.MaVe = MaVe;
    }

    public String getMaSuat() {
        return MaSuat;
    }

    public void setMaSuat(String MaSuat) {
        this.MaSuat = MaSuat;
    }

    public int getViTriGhe() {
        return ViTriGhe;
    }

    public void setViTriGhe(int ViTriGhe) {
        this.ViTriGhe = ViTriGhe;
    }

    public String getNgayBan() {
        return NgayBan;
    }

    public void setNgayBan(String NgayBan) {
        this.NgayBan = NgayBan;
    }

    public String getGiaVe() {
        return GiaVe;
    }

    public void setGiaVe(String GiaVe) {
        this.GiaVe = GiaVe;
    }

    public String getKhachHang() {
        return KhachHang;
    }

    public void setKhachHang(String KhachHang) {
        this.KhachHang = KhachHang;
    }

    public String getNhanVien() {
        return NhanVien;
    }

    public void setNhanVien(String NhanVien) {
        this.NhanVien = NhanVien;
    }
    
    
}   
