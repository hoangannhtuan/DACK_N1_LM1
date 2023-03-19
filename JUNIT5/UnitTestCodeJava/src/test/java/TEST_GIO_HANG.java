import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

// Phạm Hoàng Tuấn Anh Commit
public class TEST_GIO_HANG {
    GIOHANG gh = new GIOHANG();

    //Thêm sản phẩm
    @Test
    void test01() {
        gh.Themsanpham("Áo 3 Lỗ",102000,10);
        boolean result =  gh.KIEMTRA(1,"Áo 3 Lỗ");
        assertTrue(result);
    }

    //Sửa sản phẩm
    @Test
    void test02() {
        gh.Themsanpham("Áo 3 Lỗ",102000,10);
        gh.Suasanpham("Áo 3 Lỗ",102000,20);
        boolean result =  gh.KIEMTRA(2,"Áo 3 Lỗ");
        assertTrue(result);
    }

    //Xoá sản phẩm
    @Test
    void test03() {
        gh.Themsanpham("Áo 3 Lỗ",102000,10);
        gh.Xoasanpham("Áo 3 Lỗ");
        boolean result =  gh.KIEMTRA(3,"Áo 3 Lỗ");
        assertTrue(result);
    }
}
