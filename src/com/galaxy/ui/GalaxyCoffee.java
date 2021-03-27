/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.galaxy.ui;

import com.galaxy.ui.login;
import com.galaxy.entity.DanhMucBean;
import com.galaxy.utils.ChuyenMangHinhtroller;
import com.galaxy.utils.MsgBox;
import com.galaxy.utils.XImage;
import java.awt.event.ActionEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.Timer;

/**
 *
 * @author ACER
 */
public class GalaxyCoffee extends javax.swing.JFrame {

    /**
     * Creates new form GalaxyCoffee
     */
    public GalaxyCoffee() {
        initComponents();
        init();
        this.startDongHo();
        this.setLocationRelativeTo(null);

        setTitle("Quản lý Quán Cà Phê");

        ChuyenMangHinhtroller controller = new ChuyenMangHinhtroller(jpnview);
        controller.setView(jpntrangchu, jlbtrangchu);

        List<DanhMucBean> listItem = new ArrayList<>();
        listItem.add(new DanhMucBean("TrangChu", jpntrangchu, jlbtrangchu));
        listItem.add(new DanhMucBean("HoaDon", jpndonhang, jlbdonhang));
        listItem.add(new DanhMucBean("LoaiHang", jpnloaihang, jlbloaihang));
        listItem.add(new DanhMucBean("SanPham", jpnsanpham, jlbsanpham));
        listItem.add(new DanhMucBean("NhanVien", jpnnhanvien, jlbNhanvien));
        listItem.add(new DanhMucBean("KhachHang", jpnkhachhang, jlbkhachhang));
        listItem.add(new DanhMucBean("NhaCungCap", jpnnhacungcap, jlbnhacungcap));
        listItem.add(new DanhMucBean("ThanhToan", jpnthanhtoan, jlbthanhtoan));

        controller.setEvent(listItem);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu4 = new javax.swing.JMenu();
        jpnRoot = new javax.swing.JPanel();
        jpnmenu = new javax.swing.JPanel();
        jpntrangchu = new javax.swing.JPanel();
        jlbtrangchu = new javax.swing.JLabel();
        jpndonhang = new javax.swing.JPanel();
        jlbdonhang = new javax.swing.JLabel();
        jpnnhacungcap = new javax.swing.JPanel();
        jlbnhacungcap = new javax.swing.JLabel();
        jpnthongke = new javax.swing.JPanel();
        jlbthongke = new javax.swing.JLabel();
        jpnsanpham = new javax.swing.JPanel();
        jlbsanpham = new javax.swing.JLabel();
        jpnloaihang = new javax.swing.JPanel();
        jlbloaihang = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        btndangxuat = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jpnnhanvien = new javax.swing.JPanel();
        jlbNhanvien = new javax.swing.JLabel();
        jpnkhachhang = new javax.swing.JPanel();
        jlbkhachhang = new javax.swing.JLabel();
        jpnthanhtoan = new javax.swing.JPanel();
        jlbthanhtoan = new javax.swing.JLabel();
        jpnview = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        btndongho = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();

        jMenu4.setText("jMenu4");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jpnRoot.setBackground(new java.awt.Color(51, 51, 51));

        jpnmenu.setBackground(new java.awt.Color(51, 51, 51));

        jpntrangchu.setBackground(new java.awt.Color(247, 167, 77));

        jlbtrangchu.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbtrangchu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/home (2).png"))); // NOI18N
        jlbtrangchu.setText("Trang chủ");

        javax.swing.GroupLayout jpntrangchuLayout = new javax.swing.GroupLayout(jpntrangchu);
        jpntrangchu.setLayout(jpntrangchuLayout);
        jpntrangchuLayout.setHorizontalGroup(
            jpntrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpntrangchuLayout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jlbtrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpntrangchuLayout.setVerticalGroup(
            jpntrangchuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpntrangchuLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbtrangchu)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbdonhang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbdonhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/shopping-cart.png"))); // NOI18N
        jlbdonhang.setText("Đơn Hàng");

        javax.swing.GroupLayout jpndonhangLayout = new javax.swing.GroupLayout(jpndonhang);
        jpndonhang.setLayout(jpndonhangLayout);
        jpndonhangLayout.setHorizontalGroup(
            jpndonhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpndonhangLayout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jlbdonhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpndonhangLayout.setVerticalGroup(
            jpndonhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpndonhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbdonhang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbnhacungcap.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbnhacungcap.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/truck.png"))); // NOI18N
        jlbnhacungcap.setText("Nhà Cung Cấp");

        javax.swing.GroupLayout jpnnhacungcapLayout = new javax.swing.GroupLayout(jpnnhacungcap);
        jpnnhacungcap.setLayout(jpnnhacungcapLayout);
        jpnnhacungcapLayout.setHorizontalGroup(
            jpnnhacungcapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnnhacungcapLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlbnhacungcap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnnhacungcapLayout.setVerticalGroup(
            jpnnhacungcapLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnnhacungcapLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbnhacungcap)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbthongke.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbthongke.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/bar-chart.png"))); // NOI18N
        jlbthongke.setText("Thống Kê");

        javax.swing.GroupLayout jpnthongkeLayout = new javax.swing.GroupLayout(jpnthongke);
        jpnthongke.setLayout(jpnthongkeLayout);
        jpnthongkeLayout.setHorizontalGroup(
            jpnthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnthongkeLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jlbthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnthongkeLayout.setVerticalGroup(
            jpnthongkeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnthongkeLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbthongke)
                .addContainerGap())
        );

        jlbsanpham.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbsanpham.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/product.png"))); // NOI18N
        jlbsanpham.setText("Sản Phẩm");

        javax.swing.GroupLayout jpnsanphamLayout = new javax.swing.GroupLayout(jpnsanpham);
        jpnsanpham.setLayout(jpnsanphamLayout);
        jpnsanphamLayout.setHorizontalGroup(
            jpnsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnsanphamLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jlbsanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnsanphamLayout.setVerticalGroup(
            jpnsanphamLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnsanphamLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbsanpham)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbloaihang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbloaihang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/bill.png"))); // NOI18N
        jlbloaihang.setText("Loại Hàng");

        javax.swing.GroupLayout jpnloaihangLayout = new javax.swing.GroupLayout(jpnloaihang);
        jpnloaihang.setLayout(jpnloaihangLayout);
        jpnloaihangLayout.setHorizontalGroup(
            jpnloaihangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnloaihangLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(jlbloaihang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnloaihangLayout.setVerticalGroup(
            jpnloaihangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnloaihangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbloaihang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btndangxuat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/logout.png"))); // NOI18N
        btndangxuat.setText("Đăng Xuất");
        btndangxuat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndangxuatActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btndangxuat, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/icon galaxy2.png"))); // NOI18N

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("GalaxyCoffee.com.vn");

        jlbNhanvien.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbNhanvien.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/employees.png"))); // NOI18N
        jlbNhanvien.setText("Nhân Viên");

        javax.swing.GroupLayout jpnnhanvienLayout = new javax.swing.GroupLayout(jpnnhanvien);
        jpnnhanvien.setLayout(jpnnhanvienLayout);
        jpnnhanvienLayout.setHorizontalGroup(
            jpnnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnnhanvienLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jlbNhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnnhanvienLayout.setVerticalGroup(
            jpnnhanvienLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnnhanvienLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jlbNhanvien)
                .addContainerGap())
        );

        jlbkhachhang.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbkhachhang.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/value.png"))); // NOI18N
        jlbkhachhang.setText("Khách Hàng");

        javax.swing.GroupLayout jpnkhachhangLayout = new javax.swing.GroupLayout(jpnkhachhang);
        jpnkhachhang.setLayout(jpnkhachhangLayout);
        jpnkhachhangLayout.setHorizontalGroup(
            jpnkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnkhachhangLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlbkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnkhachhangLayout.setVerticalGroup(
            jpnkhachhangLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnkhachhangLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbkhachhang)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jlbthanhtoan.setFont(new java.awt.Font("Tahoma", 0, 15)); // NOI18N
        jlbthanhtoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/value.png"))); // NOI18N
        jlbthanhtoan.setText("Thanh Toán");

        javax.swing.GroupLayout jpnthanhtoanLayout = new javax.swing.GroupLayout(jpnthanhtoan);
        jpnthanhtoan.setLayout(jpnthanhtoanLayout);
        jpnthanhtoanLayout.setHorizontalGroup(
            jpnthanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnthanhtoanLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jlbthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnthanhtoanLayout.setVerticalGroup(
            jpnthanhtoanLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnthanhtoanLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jlbthanhtoan)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jpnmenuLayout = new javax.swing.GroupLayout(jpnmenu);
        jpnmenu.setLayout(jpnmenuLayout);
        jpnmenuLayout.setHorizontalGroup(
            jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnmenuLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel9)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jpnmenuLayout.createSequentialGroup()
                .addGroup(jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnloaihang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnsanpham, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnthongke, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnnhacungcap, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpndonhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpntrangchu, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jpnmenuLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 4, Short.MAX_VALUE))
                    .addComponent(jpnkhachhang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnnhanvien, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnthanhtoan, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnmenuLayout.setVerticalGroup(
            jpnmenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnmenuLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpntrangchu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addComponent(jpndonhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnnhacungcap, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnthongke, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnsanpham, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnloaihang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnnhanvien, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jpnkhachhang, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jpnthanhtoan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel9)
                .addGap(7, 7, 7))
        );

        jpnview.setToolTipText("");

        javax.swing.GroupLayout jpnviewLayout = new javax.swing.GroupLayout(jpnview);
        jpnview.setLayout(jpnviewLayout);
        jpnviewLayout.setHorizontalGroup(
            jpnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        jpnviewLayout.setVerticalGroup(
            jpnviewLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(240, 240, 240));
        jLabel2.setText("HAHA");

        btndongho.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btndongho.setForeground(new java.awt.Color(240, 240, 240));
        btndongho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/com/galaxy/icon/sale-time.png"))); // NOI18N
        btndongho.setText("time");

        jLabel11.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(240, 240, 240));
        jLabel11.setText("hoho");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel2)
                .addGap(96, 96, 96)
                .addComponent(jLabel11)
                .addGap(244, 244, 244)
                .addComponent(btndongho)
                .addContainerGap(625, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(34, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel11)
                    .addComponent(btndongho))
                .addContainerGap())
        );

        javax.swing.GroupLayout jpnRootLayout = new javax.swing.GroupLayout(jpnRoot);
        jpnRoot.setLayout(jpnRootLayout);
        jpnRootLayout.setHorizontalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jpnmenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnRootLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jpnview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jpnRootLayout.setVerticalGroup(
            jpnRootLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnmenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jpnRootLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jpnview, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jpnRoot, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btndangxuatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndangxuatActionPerformed
        // TODO add your handling code here:
        this.ketThuc();
    }//GEN-LAST:event_btndangxuatActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GalaxyCoffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GalaxyCoffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GalaxyCoffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GalaxyCoffee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new GalaxyCoffee().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndangxuat;
    private javax.swing.JLabel btndongho;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JLabel jlbNhanvien;
    private javax.swing.JLabel jlbdonhang;
    private javax.swing.JLabel jlbkhachhang;
    private javax.swing.JLabel jlbloaihang;
    private javax.swing.JLabel jlbnhacungcap;
    private javax.swing.JLabel jlbsanpham;
    private javax.swing.JLabel jlbthanhtoan;
    private javax.swing.JLabel jlbthongke;
    private javax.swing.JLabel jlbtrangchu;
    private javax.swing.JPanel jpnRoot;
    private javax.swing.JPanel jpndonhang;
    private javax.swing.JPanel jpnkhachhang;
    private javax.swing.JPanel jpnloaihang;
    private javax.swing.JPanel jpnmenu;
    private javax.swing.JPanel jpnnhacungcap;
    private javax.swing.JPanel jpnnhanvien;
    private javax.swing.JPanel jpnsanpham;
    private javax.swing.JPanel jpnthanhtoan;
    private javax.swing.JPanel jpnthongke;
    private javax.swing.JPanel jpntrangchu;
    private javax.swing.JPanel jpnview;
    // End of variables declaration//GEN-END:variables

    void startDongHo() {
        SimpleDateFormat formater = new SimpleDateFormat("hh:mm:ss a");
        new Timer(1000, (ActionEvent e) -> {
            btndongho.setText(formater.format(new Date()));
        }).start();
    }

    void ketThuc() {
        if (MsgBox.confirm(this, "Bạn muốn kết thúc ứng dụng?")) {
            System.exit(0);
        }
    }

    void init() {
        setSize(1000, 600);
        setLocationRelativeTo(null);

        new ChaoJDialog(this, true).setVisible(true);
        new login(this, true).setVisible(true);
        this.startDongHo();
    }
}
