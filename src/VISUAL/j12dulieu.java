package VISUAL;

import java.sql.*;
import Database.ConnectDB;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;

public class j12dulieu extends javax.swing.JFrame {

   Connection con =null;
    PreparedStatement pst =null;
    ResultSet rs =null;
    
    public j12dulieu() throws ClassNotFoundException {
        initComponents();
        setLocation(100,50);
        setResizable(false);
        con = ConnectDB.connectdb();           
    }

    public void listnv()
       {
           String sql = "SELECT * FROM qlnv ORDER BY id ASC";
           try
           {
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               tbqlnv.setModel(DbUtils.resultSetToTableModel(rs));     
               
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    
    public void search1()
       {
           String sql = "SELECT * FROM qlnv WHERE lower(name) like ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch.getText()+"%");
               rs = pst.executeQuery();
               tbqlnv.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    
    public void search2()
       {
           String sql = "SELECT * FROM qlnv WHERE lower(chucvu) like ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch.getText()+"%");
               rs = pst.executeQuery();
               tbqlnv.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    
    public void search3()
       {
           String sql = "SELECT * FROM qlnv WHERE lower(gioitinh) like ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch.getText()+"%");
               rs = pst.executeQuery();
               tbqlnv.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search4()
       {
           String sql = "SELECT * FROM qlnv WHERE lower(diachi) like ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch.getText()+"%");
               rs = pst.executeQuery();
               tbqlnv.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search5()
       {
           String sql = "SELECT * FROM qlnv WHERE lower(sdt) like ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch.getText()+"%");
               rs = pst.executeQuery();
               tbqlnv.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search6()
       {
           String sql = "SELECT * FROM qlnv WHERE lower(email) like ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch.getText()+"%");
               rs = pst.executeQuery();
               tbqlnv.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    
   //==============================================================================
    public void listsp()
       {
           String sql = "select s.serial,c.*,n.gia\n" +
"from nhap n, chitietsanpham c, sanpham s\n" +
"where n.serial=s.serial and s.ma_sp=c.ma_sp";
           try
           {
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));     
               
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    
    public void search13()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(ten_sp) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search14()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(nsx) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search15()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(cpu) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search16()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(ram) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search17()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(rom) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search18()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(manhinh) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search19()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(baohanh) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search10()
       {
           String sql = "SELECT s.serial,c.*,n.gia\n" +
"FROM nhap n, chitietsanpham c, sanpham s\n" +
"WHERE n.serial=s.serial and s.ma_sp=c.ma_sp AND lower(gia) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch1.getText()+"%");
               rs = pst.executeQuery();
               tbsp.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    
    //==========================================================================
    public void listncc()
       {
           String sql = "Select * From nhacungcap";
           try
           {
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               tbncc.setModel(DbUtils.resultSetToTableModel(rs));     
               
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search21()
       {
           String sql = "Select * FROM nhacungcap Where lower(name) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch2.getText()+"%");
               rs = pst.executeQuery();
               tbncc.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search22()
       {
           String sql = "SELECT * FROM nhacungcap WHERE lower(diachi) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch2.getText()+"%");
               rs = pst.executeQuery();
               tbncc.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search23()
       {
           String sql = "SELECT * FROM nhacungcap WHERE lower(sdt) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch2.getText()+"%");
               rs = pst.executeQuery();
               tbncc.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search24()
       {
           String sql = "SELECT * FROM nhacungcap WHERE lower(email) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch2.getText()+"%");
               rs = pst.executeQuery();
               tbncc.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    //==========================================================================
     public void listkh()
       {
           String sql = "Select * From khachhang";
           try
           {
               pst = con.prepareStatement(sql);
               rs = pst.executeQuery();
               tbkh.setModel(DbUtils.resultSetToTableModel(rs));     
               
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search31()
       {
           String sql = "Select * FROM khachhang Where lower(name) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch3.getText()+"%");
               rs = pst.executeQuery();
               tbkh.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search32()
       {
           String sql = "SELECT * FROM khachhang WHERE lower(diachi) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch3.getText()+"%");
               rs = pst.executeQuery();
               tbkh.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search33()
       {
           String sql = "SELECT * FROM khachhang WHERE lower(sdt) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch3.getText()+"%");
               rs = pst.executeQuery();
               tbkh.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    public void search34()
       {
           String sql = "SELECT * FROM khachhang WHERE lower(email) LIKE ?";
           try
           {
               pst = con.prepareStatement(sql);
               pst.setString(1,"%"+tfsearch3.getText()+"%");
               rs = pst.executeQuery();
               tbkh.setModel(DbUtils.resultSetToTableModel(rs));   
           }
        catch(SQLException error)
        {
        JOptionPane.showMessageDialog(null, error);
        }
       }
    
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        jLabel21 = new javax.swing.JLabel();
        jButton7 = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbqlnv = new javax.swing.JTable();
        nv_name = new javax.swing.JRadioButton();
        nv_chucvu = new javax.swing.JRadioButton();
        nv_gioitinh = new javax.swing.JRadioButton();
        nv_email = new javax.swing.JRadioButton();
        nv_sdt = new javax.swing.JRadioButton();
        nv_diachi = new javax.swing.JRadioButton();
        jButton1 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        tfsearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbsp = new javax.swing.JTable();
        sp_ram = new javax.swing.JRadioButton();
        sp_rom = new javax.swing.JRadioButton();
        sp_mh = new javax.swing.JRadioButton();
        sp_name = new javax.swing.JRadioButton();
        sp_nsx = new javax.swing.JRadioButton();
        sp_bh = new javax.swing.JRadioButton();
        sp_gia = new javax.swing.JRadioButton();
        sp_cpu = new javax.swing.JRadioButton();
        tfsearch1 = new javax.swing.JTextField();
        jButton6 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        tfsearch2 = new javax.swing.JTextField();
        jButton8 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        ncc_name = new javax.swing.JRadioButton();
        ncc_diachi = new javax.swing.JRadioButton();
        ncc_sdt = new javax.swing.JRadioButton();
        ncc_email = new javax.swing.JRadioButton();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbncc = new javax.swing.JTable();
        jPanel4 = new javax.swing.JPanel();
        tfsearch3 = new javax.swing.JTextField();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        kh_name = new javax.swing.JRadioButton();
        kh_diachi = new javax.swing.JRadioButton();
        kh_sdt = new javax.swing.JRadioButton();
        kh_email = new javax.swing.JRadioButton();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbkh = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel7.setBackground(new java.awt.Color(45, 118, 232));

        jLabel21.setFont(new java.awt.Font("Verdana", 1, 24)); // NOI18N
        jLabel21.setForeground(new java.awt.Color(255, 255, 255));
        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setText("Dữ liệu");

        jButton7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/786_-_Logout-512.png"))); // NOI18N
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel21)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel7Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(jLabel21))
                    .addComponent(jButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );

        tbqlnv.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbqlnv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Họ và tên", "Chức vụ", "Ngày sinh", "Giới tính", "Địa chỉ", "Số điện thoại", "Email", "Ghi chú"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbqlnv);

        nv_name.setText("Họ và tên");

        nv_chucvu.setText("Chức vụ");

        nv_gioitinh.setText("Giới tính");

        nv_email.setText("Email");

        nv_sdt.setText("Số điện thoại");

        nv_diachi.setText("Địa chỉ");

        jButton1.setText("Refresh");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton5.setText("Tìm kiếm");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(189, 189, 189)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nv_name)
                            .addComponent(nv_diachi))
                        .addGap(200, 200, 200)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nv_chucvu)
                            .addComponent(nv_sdt))
                        .addGap(200, 200, 200)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nv_email)
                            .addComponent(nv_gioitinh))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                        .addComponent(jButton5)
                        .addGap(65, 65, 65)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton1, jButton5});

        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nv_name)
                    .addComponent(nv_chucvu)
                    .addComponent(nv_gioitinh))
                .addGap(40, 40, 40)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nv_diachi, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nv_sdt)
                        .addComponent(nv_email)))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 529, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel1Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton1, jButton5});

        jTabbedPane1.addTab("Nhân viên", jPanel1);

        jButton2.setText("Refresh");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        tbsp.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        tbsp.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial", "Mã sản phẩm", "Tên sản phẩm", "Nhà sản xuất", "CPU", "Ram", "ROM", "Màn hình", "Bảo hành", "Giá"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tbsp);

        sp_ram.setText("RAM");

        sp_rom.setText("ROM");

        sp_mh.setText("Màn hình");

        sp_name.setText("Tên sản phẩm");

        sp_nsx.setText("Nhà sản xuất");

        sp_bh.setText("Bảo hành");

        sp_gia.setText("Giá");

        sp_cpu.setText("CPU");

        jButton6.setText("Tìm kiếm");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 1320, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_ram)
                                    .addComponent(sp_name))
                                .addGap(50, 50, 50)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_rom)
                                    .addComponent(sp_nsx))
                                .addGap(102, 102, 102)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_cpu)
                                    .addComponent(sp_mh))
                                .addGap(130, 130, 130)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(sp_bh)
                                    .addComponent(sp_gia)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(tfsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton6)
                                .addGap(75, 75, 75)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton2, jButton6});

        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsearch1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_name)
                    .addComponent(sp_nsx)
                    .addComponent(sp_cpu)
                    .addComponent(sp_gia))
                .addGap(26, 26, 26)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(sp_bh)
                    .addComponent(sp_ram)
                    .addComponent(sp_rom)
                    .addComponent(sp_mh))
                .addGap(29, 29, 29)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 524, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel2Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton2, jButton6});

        jTabbedPane1.addTab("Sản phẩm", jPanel2);

        jButton8.setText("Tìm kiếm");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        ncc_name.setText("Tên nhà cung cấp");

        ncc_diachi.setText("Địa chỉ");

        ncc_sdt.setText("Số điện thoại");

        ncc_email.setText("Email");

        tbncc.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Nhà cung cấp", "Tên nhà cung cấp", "Địa chỉ", "Số điên thoại", "Email", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane4.setViewportView(tbncc);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(tfsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton8)
                                .addGap(75, 75, 75)
                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(ncc_name)
                                .addGap(100, 100, 100)
                                .addComponent(ncc_diachi)
                                .addGap(100, 100, 100)
                                .addComponent(ncc_sdt)
                                .addGap(100, 100, 100)
                                .addComponent(ncc_email)))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane4)))
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton4, jButton8});

        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsearch2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ncc_name)
                    .addComponent(ncc_diachi)
                    .addComponent(ncc_sdt)
                    .addComponent(ncc_email))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.DEFAULT_SIZE, 586, Short.MAX_VALUE)
                .addContainerGap())
        );

        jPanel3Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jButton4, jButton8});

        jTabbedPane1.addTab("Nhà cung cấp", jPanel3);

        jButton9.setText("Tìm kiếm");
        jButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton9ActionPerformed(evt);
            }
        });

        jButton10.setText("Refresh");
        jButton10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton10ActionPerformed(evt);
            }
        });

        kh_name.setText("Tên khách hàng");

        kh_diachi.setText("Địa chỉ");

        kh_sdt.setText("Số điện thoại");

        kh_email.setText("Email");

        tbkh.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID Khách hàng", "Tên khách hàng", "Địa chỉ", "Số điên thoại", "Email", "Note"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane5.setViewportView(tbkh);

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(138, 138, 138)
                                .addComponent(tfsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(jButton9)
                                .addGap(75, 75, 75)
                                .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel4Layout.createSequentialGroup()
                                .addGap(209, 209, 209)
                                .addComponent(kh_name)
                                .addGap(100, 100, 100)
                                .addComponent(kh_diachi)
                                .addGap(100, 100, 100)
                                .addComponent(kh_sdt)
                                .addGap(100, 100, 100)
                                .addComponent(kh_email)))
                        .addGap(0, 130, Short.MAX_VALUE))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane5)))
                .addContainerGap())
        );

        jPanel4Layout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jButton10, jButton9});

        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfsearch3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton10, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(37, 37, 37)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kh_name)
                    .addComponent(kh_diachi)
                    .addComponent(kh_sdt)
                    .addComponent(kh_email))
                .addGap(32, 32, 32)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 584, Short.MAX_VALUE)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Khách hàng", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 786, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        listnv();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        listsp();
        
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        if (nv_name.isSelected()) search1();
        if (nv_chucvu.isSelected()) search2();
        if (nv_gioitinh.isSelected()) search3();
        if (nv_diachi.isSelected()) search4();
        if (nv_sdt.isSelected()) search5();
        if (nv_email.isSelected()) search6();
        
    
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        if (sp_name.isSelected()) search13();
        if (sp_nsx.isSelected()) search14();
        if (sp_cpu.isSelected()) search15();
        if (sp_ram.isSelected()) search16();
        if (sp_rom.isSelected()) search17();
        if (sp_mh.isSelected()) search18();
        if (sp_bh.isSelected()) search19();
        if (sp_gia.isSelected()) search10();
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
          if (ncc_name.isSelected()) search21();
          if (ncc_diachi.isSelected()) search22();
          if (ncc_sdt.isSelected()) search23();
          if (ncc_email.isSelected()) search24();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        listncc();
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton9ActionPerformed
        // TODO add your handling code here:
        if (kh_name.isSelected()) search31();
        if (kh_diachi.isSelected()) search32();
        if (kh_sdt.isSelected()) search33();
        if (kh_email.isSelected()) search34();
        
    }//GEN-LAST:event_jButton9ActionPerformed

    private void jButton10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton10ActionPerformed
        // TODO add your handling code here:
        listkh();
    }//GEN-LAST:event_jButton10ActionPerformed

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
            java.util.logging.Logger.getLogger(j12dulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(j12dulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(j12dulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(j12dulieu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new j12dulieu().setVisible(true);
                } catch (ClassNotFoundException ex) {
                    Logger.getLogger(j12dulieu.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JRadioButton kh_diachi;
    private javax.swing.JRadioButton kh_email;
    private javax.swing.JRadioButton kh_name;
    private javax.swing.JRadioButton kh_sdt;
    private javax.swing.JRadioButton ncc_diachi;
    private javax.swing.JRadioButton ncc_email;
    private javax.swing.JRadioButton ncc_name;
    private javax.swing.JRadioButton ncc_sdt;
    private javax.swing.JRadioButton nv_chucvu;
    private javax.swing.JRadioButton nv_diachi;
    private javax.swing.JRadioButton nv_email;
    private javax.swing.JRadioButton nv_gioitinh;
    private javax.swing.JRadioButton nv_name;
    private javax.swing.JRadioButton nv_sdt;
    private javax.swing.JRadioButton sp_bh;
    private javax.swing.JRadioButton sp_cpu;
    private javax.swing.JRadioButton sp_gia;
    private javax.swing.JRadioButton sp_mh;
    private javax.swing.JRadioButton sp_name;
    private javax.swing.JRadioButton sp_nsx;
    private javax.swing.JRadioButton sp_ram;
    private javax.swing.JRadioButton sp_rom;
    private javax.swing.JTable tbkh;
    private javax.swing.JTable tbncc;
    private javax.swing.JTable tbqlnv;
    private javax.swing.JTable tbsp;
    private javax.swing.JTextField tfsearch;
    private javax.swing.JTextField tfsearch1;
    private javax.swing.JTextField tfsearch2;
    private javax.swing.JTextField tfsearch3;
    // End of variables declaration//GEN-END:variables
}
