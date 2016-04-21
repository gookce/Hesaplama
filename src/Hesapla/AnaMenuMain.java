package Hesapla;

import javax.swing.JFrame;

import Hesapla.AnaMenu;

public class AnaMenuMain extends JFrame {

	public static void main(String[] args) {
        JFrame jFrame = new JFrame("Ana Menu");
        jFrame.setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        AnaMenu anaEkran = new AnaMenu();
        jFrame.getContentPane();
        jFrame.add(anaEkran);
        jFrame.pack();
        jFrame.setVisible(true);
    }
}
