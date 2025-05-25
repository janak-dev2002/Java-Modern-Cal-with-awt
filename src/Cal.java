
import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Menu;
import java.awt.MenuBar;
import java.awt.MenuItem;
import java.awt.Panel;
import java.awt.TextField;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.StringSelection;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import javax.imageio.ImageIO;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author 94762
 */
public class Cal extends Frame implements ActionListener {

    Label about, close, MainUIpanel, adminframe, anima, bmc, bmr, bc, b_back, bx2, bsqrt, bpecent, b_divd, b7, b8, b9, bx, b4, b5, b6, bm, b1, b2, b3, bp, bpm, b0, bdot, bequal;
    TextField tf1;
    String fv, sv, op, pv;
    double fvd, svd, tot;
    Font tr = new Font("DS-Digital Normal", Font.BOLD, 70);
    Panel keybord;

    Cal() {

        interface_componets();
        interface_componets2();

        adminframe = new Label() {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\ui3.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 600;
                int height = 844;
                g.drawImage(image, 0, 0, width, height, this);
            }

        };

        adminframe.setBounds(0, 0, 600, 844);
        adminframe.setBackground(new Color(0, 0, 0, 240)); 
        adminframe.setVisible(true);
        add(adminframe);

        MenuBar mnbar = new MenuBar();

        MenuItem mi1 = new MenuItem("New");
        MenuItem mi2 = new MenuItem("Exit");
        mi2.addActionListener(this);
        MenuItem mi3 = new MenuItem("Copy");
        mi3.addActionListener(this);
        MenuItem mi4 = new MenuItem("Paste");
        mi4.addActionListener(this);
        MenuItem mi5 = new MenuItem("Help");
        mi5.addActionListener(this);
        MenuItem mi6 = new MenuItem("About");
        mi6.addActionListener(this);
        MenuItem mi7 = new MenuItem("Calculator");
        mi7.addActionListener(this);

        Menu m1 = new Menu("File");
        m1.add(mi1);
        m1.add(mi2);

        Menu m2 = new Menu("Edit");
        m2.add(mi3);
        m2.add(mi4);

        Menu m3 = new Menu("Help");
        m3.add(mi5);
        m3.add(mi6);
        m3.add(mi7);

        mnbar.add(m1);
        mnbar.add(m2);
        mnbar.add(m3);

        setSize(600, 864);
        setLayout(null);
        setUndecorated(true);
//        setBackground(new Color(10, 30, 40, 0));
        setOpacity(0.9f);
        setVisible(true);
        setLocationRelativeTo(null);
        setMenuBar(mnbar);

    }

    public static void main(String[] args) {

        Cal calculator = new Cal();

    }

    private void interface_componets() {

        GridLayout g1 = new GridLayout(1, 0, 3, 3);

        Panel menuItems = new Panel();
        menuItems.setBounds(10, 10, 290, 50);
        menuItems.setBackground(new Color(0, 0, 0, 0));
        menuItems.setLayout(g1);
        menuItems.setVisible(true);
        add(menuItems);

        close = new Label() {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\exitbut.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 54;
                int height = 54;
                g.drawImage(image, 20, 0, width, height, this);
            }

        };

        close.setBounds(0, 100, 91, 38);
        menuItems.add(close);

        MainUIpanel = new Label() {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\lines.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 363;
                int height = 55;
                g.drawImage(image, 0, 0, width, height, this);
            }

        };

        MainUIpanel.setBounds(20, 100, 363, 55);
        MainUIpanel.setBackground(new Color(27, 51, 64, 230));
        add(MainUIpanel);

        anima = new Label() {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\new_ani\\12.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 84;
                int height = 83;
                g.drawImage(image, 0, 0, width, height, this);
            }

        };

        anima.setBounds(460, 60, 84, 83);
        anima.setBackground(new Color(27, 51, 64, 230));
        add(anima);

    }

    private void interface_componets2() {

        tf1 = new TextField(50);
        tf1.setFont(tr);
        tf1.setEditable(false);
        tf1.setForeground(new Color(11, 126, 238, 240));
        tf1.setBackground(new Color(0, 0, 0, 0));
        tf1.setBounds(50, 180, 500, 100);
        add(tf1);

        GridLayout g2 = new GridLayout(6, 4, 3, 3);

        keybord = new Panel();
        keybord.setBackground(new Color(27, 51, 64, 230));
        keybord.setBounds(50, 300, 500, 520);
        keybord.setLayout(g2);
        keybord.setVisible(true);
        add(keybord);

        about = new Label() {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\about.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 484;
                int height = 260;
                g.drawImage(image, 0, 0, width, height, this);
            }

        };

        about.setBounds(50, 360, 484, 260);
        about.setBackground(new Color(27, 51, 64, 230));
        about.setVisible(false);
        add(about);

        // create cursors
        Cursor c = new Cursor(CROSSHAIR_CURSOR);
        Cursor c1 = new Cursor(HAND_CURSOR);

        bmc = new Label("MC") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\bmc.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bmc.setBounds(0, 100, 105, 52);
        bmc.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bmc);

        bmr = new Label("MR") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\bmr.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bmr.setBounds(0, 100, 105, 52);
        bmr.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bmr);

        bc = new Label("C") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\bC.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bc.setBounds(0, 100, 105, 52);
        bc.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bc);

        b_back = new Label("back") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b_back.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b_back.setBounds(0, 100, 105, 52);
        b_back.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b_back);

        bx2 = new Label("X^2") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\bx2.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bx2.setBounds(0, 100, 105, 52);
        bx2.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bx2);

        bsqrt = new Label("X_SQRT") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\bsqrt.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bsqrt.setBounds(0, 100, 105, 52);
        bsqrt.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bsqrt);

        bpecent = new Label("%") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b%.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bpecent.setBounds(0, 100, 105, 52);
        bpecent.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bpecent);

        b_divd = new Label("/") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b_divd.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b_divd.setBounds(0, 100, 105, 52);
        b_divd.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b_divd);

        b7 = new Label("7") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b7.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b7.setBounds(0, 100, 105, 52);
        b7.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b7);

        b8 = new Label("8") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b8.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b8.setBounds(0, 100, 105, 52);
        b8.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b8);

        b9 = new Label("9") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b9.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b9.setBounds(0, 100, 105, 52);
        b9.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b9);

        bx = new Label("*") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\bx.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bx.setBounds(0, 100, 105, 52);
        bx.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bx);

        b4 = new Label("4") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b4.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b4.setBounds(0, 100, 105, 52);
        b4.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b4);

        b5 = new Label("5") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b5.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b5.setBounds(0, 100, 105, 52);
        b5.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b5);

        b6 = new Label("6") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b6.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b6.setBounds(0, 100, 105, 52);
        b6.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b6);

        bm = new Label("-") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b-.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bm.setBounds(0, 100, 105, 52);
        bm.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bm);

        b1 = new Label("1") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b1.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b1.setBounds(0, 100, 105, 52);
        b1.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b1);

        b2 = new Label("2") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b2.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b2.setBounds(0, 100, 105, 52);
        b2.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b2);

        b3 = new Label("3") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b3.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b3.setBounds(0, 100, 105, 52);
        b3.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b3);

        bp = new Label("+") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b+.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bp.setBounds(0, 100, 105, 52);
        bp.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bp);

        bpm = new Label("+/-") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b+-.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bpm.setBounds(0, 100, 105, 52);
        bpm.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bpm);

        b0 = new Label("0") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b0.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        b0.setBounds(0, 100, 105, 52);
        b0.setForeground(new Color(27, 51, 64, 230));
        keybord.add(b0);

        bdot = new Label(".") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b_dot.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bdot.setBounds(0, 100, 105, 52);
        bdot.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bdot);

        bequal = new Label("=") {

            @Override
            public void paint(Graphics g) {
                // Load the image
                BufferedImage image = null;
                try {
                    image = ImageIO.read(new File("D:\\Java_Institute\\subjects\\SAD\\Cal_assigment\\src\\img\\b=.png"));
                } catch (Exception e) {
                    e.printStackTrace();
                }

                int width = 105;
                int height = 52;
                g.drawImage(image, 0, 5, width, height, this);
            }

        };

        bequal.setBounds(0, 100, 105, 52);
        bequal.setForeground(new Color(27, 51, 64, 230));
        keybord.add(bequal);

// Mouse Listners ---------------------------------------------------------------------------

        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                close.setCursor(c1);
            }
        });

        close.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.exit(0);
            }
        });
//----------------------------------------------------------------------
        bmc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bmc.setCursor(c1);
            }
        });

        bmc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println(bmc.getText());
            }
        });

        //---------------------------------------
        bmr.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bmr.setCursor(c1);
            }
        });

        bmr.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                System.out.println(bmr.getText());
            }
        });

        //---------------------------------------
        bc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bc.setCursor(c1);
            }
        });

        bc.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText("");

                System.out.println(bc.getText());
            }
        });

        //---------------------------------------
        b_back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b_back.setCursor(c1);
            }
        });

        b_back.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                String text = tf1.getText();
                int text_length = text.length();
                if (text_length > 0) {
                    text = text.substring(0, text_length - 1);
                    tf1.setText(text);
                }
                System.out.println(b_back.getText());
            }
        });

        //---------------------------------------
        bx2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bx2.setCursor(c1);
            }
        });

        bx2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                fv = tf1.getText();
                fvd = Double.parseDouble(fv);
//          op = bx2.getText();
                tf1.setText(fvd * fvd + "");
                System.out.println(bx2.getText());
            }
        });

        //---------------------------------------
        bsqrt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bsqrt.setCursor(c1);
            }
        });

        bsqrt.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                fv = tf1.getText();
                fvd = Double.parseDouble(fv);
                double squareRoot = Math.sqrt(fvd);
//          op = bx2.getText();
                tf1.setText(Double.toString(squareRoot));
                
                System.out.println(bsqrt.getText());
            }
        });

        //---------------------------------------
        bpecent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bpecent.setCursor(c1);
            }
        });

        bpecent.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                if (pv != null) {

                    double pvd = Double.parseDouble(pv);
                    double answer = pvd / 100;
                    tf1.setText(Double.toString(answer));
                }

                System.out.println(bpecent.getText());
            }
        });

        //---------------------------------------
        b_divd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b_divd.setCursor(c1);
            }
        });

        b_divd.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                fv = tf1.getText();
                op = b_divd.getText();
                tf1.setText("");
                System.out.println(b_divd.getText());
            }
        });

        //---------------------------------------
        b7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b7.setCursor(c1);
            }
        });

        b7.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b7.getText());

                System.out.println(b7.getText());
            }
        });

        //---------------------------------------
        b8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b8.setCursor(c1);
            }
        });

        b8.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b8.getText());
                System.out.println(b8.getText());
            }
        });

        //---------------------------------------
        b9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b9.setCursor(c1);
            }
        });

        b9.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b9.getText());
                System.out.println(b9.getText());
            }
        });

        //---------------------------------------
        bx.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bx.setCursor(c1);
            }
        });

        bx.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                fv = tf1.getText();
                op = bx.getText();
                tf1.setText("");

                System.out.println(bx.getText());
            }
        });

        //---------------------------------------
        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b4.setCursor(c1);
            }
        });

        b4.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b4.getText());
                System.out.println(b4.getText());
            }
        });

        //---------------------------------------
        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b5.setCursor(c1);
            }
        });

        b5.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b5.getText());
                System.out.println(b5.getText());
            }
        });

        //---------------------------------------
        b6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b6.setCursor(c1);
            }
        });

        b6.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b6.getText());
                System.out.println(b6.getText());
            }
        });

        //---------------------------------------
        bm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bm.setCursor(c1);
            }
        });

        bm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                fv = tf1.getText();
                op = bm.getText();
                tf1.setText("");
                System.out.println(bm.getText());
            }
        });

        //---------------------------------------
        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b1.setCursor(c1);
            }
        });

        b1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b1.getText());
                System.out.println(b1.getText());
            }
        });

        //---------------------------------------
        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b2.setCursor(c1);
            }
        });

        b2.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b2.getText());
                System.out.println(b2.getText());
            }
        });

        //---------------------------------------
        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b3.setCursor(c1);
            }
        });

        b3.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b3.getText());
                System.out.println(b3.getText());
            }
        });

        //---------------------------------------
        bp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bp.setCursor(c1);
            }
        });

        bp.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                fv = tf1.getText();
                op = bp.getText();
                tf1.setText("");
                System.out.println(bp.getText());
            }
        });

        //---------------------------------------
        bpm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bpm.setCursor(c1);
            }
        });

        bpm.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText("-" + tf1.getText());
                System.out.println(bpm.getText());
            }
        });

        //---------------------------------------
        b0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                b0.setCursor(c1);
            }
        });

        b0.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + b0.getText());
                System.out.println(b0.getText());
            }
        });

        //---------------------------------------
        bdot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bdot.setCursor(c1);
            }
        });

        bdot.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                tf1.setText(tf1.getText() + bdot.getText());
                System.out.println(bdot.getText());
            }
        });

        //---------------------------------------
        bequal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                bequal.setCursor(c1);
            }
        });

        bequal.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {

                sv = tf1.getText();

                if (fv != null) {

                    fvd = Double.parseDouble(fv);
                    svd = Double.parseDouble(sv);

                    if (op.equals(bp.getText())) {
                        tf1.setText(fvd + svd + "");
                    } else if (op.equals(bm.getText())) {
                        tf1.setText(fvd - svd + "");
                    } else if (op.equals(bx.getText())) {
                        tf1.setText(fvd * svd + "");
                        pv = Double.toString((fvd * svd));
                    } else if (op.equals(b_divd.getText())) {
                        tf1.setText(fvd / svd + "");
                    }

                }
                System.out.println(bequal.getText());
            }
        });

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

        Clipboard clpbrd = Toolkit.getDefaultToolkit().getSystemClipboard();

        if (ae.getActionCommand().equals("Exit")) {
            System.exit(0);
        } else if (ae.getActionCommand().equals("Copy")) {
            StringSelection stringSelection = new StringSelection(tf1.getText());
            clpbrd.setContents(stringSelection, null);
        } else if (ae.getActionCommand().equals("Paste")) {
            // Get the clipboard contents as a string
            String clipText = "";
            try {
                clipText = (String) clpbrd.getData(DataFlavor.stringFlavor);
            } catch (Exception ex) {
                ex.printStackTrace();
            }

            // Set the clipboard contents as the text of the text field
            tf1.setText(clipText);
        } else if (ae.getActionCommand().equals("About")) {
            keybord.setVisible(false);
            about.setVisible(true);
        } else if (ae.getActionCommand().equals("Calculator")) {
            keybord.setVisible(true);
            about.setVisible(false);
        }
    }
}
