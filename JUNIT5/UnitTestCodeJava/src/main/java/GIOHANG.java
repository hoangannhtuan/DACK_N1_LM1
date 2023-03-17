import java.util.ArrayList;

public class GIOHANG {
    double thanhtien;
    SANPHAM sp ;
    ArrayList<SANPHAM> data = new ArrayList<>();
    public  GIOHANG(){
        data.add(new SANPHAM("Áo Sơ Mi Trắng",10000000,100));
    }

    //Kiem tra
    public boolean KIEMTRA(int i,String ten){
        switch (i){
            case 1:
                if (data.get(data.size()-1).tensp != ten) return false;
                break;
            case 2:
                int lenght = data.size();
                for (int j = 0; i < lenght; i++){
                    if(data.get(j).tensp == ten){
                        if(data.get(i).dongia == data.get(lenght-1).dongia && data.get(i).soluong == data.get(lenght-1).soluong)
                        return false;
                    }
                }
                break;
            case 3:
                for (int j = 0; j < data.size(); j++){
                    if(data.get(j).tensp == ten)  return false;
                }
                break;
            default: return false;
        }
        return true;
    }

    //Sửa sản phẩm
    public ArrayList<SANPHAM> Suasanpham(String ten,int gia, int sl){
        for(int i = 0; i < data.size(); i++){
            if(data.get(i).tensp == ten){
                data.add(data.get(i));
                data.get(i).dongia = gia;
                data.get(i).soluong = sl;
                break;
            }
        }
        return data;
    }

    //Thêm sản phẩm
    public ArrayList<SANPHAM> Themsanpham(String ten,int gia, int sl) {
        data.add(new SANPHAM(ten,gia,sl));
        return data;
    }

    //Xoá Sản Phẩm
    public ArrayList<SANPHAM> Xoasanpham(String ten){
        for(int i = 0; i < data.size(); i++){
            if(data.get(i).tensp == ten){
                data.remove(i);
            }
        }
        return data;
    }

}
