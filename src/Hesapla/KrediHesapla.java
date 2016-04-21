package Hesapla;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class KrediHesapla extends JPanel {

	 private JLabel dersAdı,dersHarfNotu,dersSaati,bos1,bos2;
	 private JTextField ders1, harfnot1,saat1;
	 private JTextField ders2, harfnot2,saat2;
	 private JTextField ders3, harfnot3,saat3;
	 private JTextField ders4, harfnot4,saat4;
	 private JTextField ders5, harfnot5,saat5;
	 private JTextField ders6, harfnot6,saat6;
	 private JTextField ders7, harfnot7,saat7;
	 private JTextField ders8, harfnot8,saat8;
	 private JTextField ders9, harfnot9,saat9;
	 private JButton hesapla;
	 private JLabel sonuc;
	
	 public KrediHesapla() {
		 
		 setPreferredSize(new Dimension(300, 500));
	     setLayout(new GridLayout(10,2));
	        
		 dersAdı = new JLabel("Dersler");
		 dersHarfNotu = new JLabel("Harf Notu");
		 dersSaati = new JLabel("Saatler");
		 bos1 = new JLabel("");

		 ders1 = new JTextField(10);
		 harfnot1 = new JTextField(3);
		 saat1 = new JTextField(3);
		 
		 ders2 = new JTextField(10); 
		 harfnot2 = new JTextField(3);
		 saat2 = new JTextField(3);
		 
		 ders3 = new JTextField(10);
		 harfnot3 = new JTextField(3);
		 saat3 = new JTextField(3);
		 
		 ders4 = new JTextField(10);
		 harfnot4 = new JTextField(3);
		 saat4 = new JTextField(3); 
		 
		 ders5 = new JTextField(10);
		 harfnot5 = new JTextField(3);
		 saat5 = new JTextField(3);
		 
		 ders6 = new JTextField(10);
		 harfnot6 = new JTextField(3);
		 saat6 = new JTextField(3);
		 
		 ders7 = new JTextField(10);
		 harfnot7 = new JTextField(3);
		 saat7 = new JTextField(3);
		 
		 ders8 = new JTextField(10);
		 harfnot8 = new JTextField(3);
		 saat8 = new JTextField(3);
		 
		 ders9 = new JTextField(10);
		 harfnot9 = new JTextField(3);
		 saat9 = new JTextField(3);
		 
		 bos2 = new JLabel("");
		 
		 hesapla = new JButton("Hesapla");
		 hesapla.addActionListener(new ButtonListener());
		 
		 sonuc = new JLabel("");
		 
		 add(dersAdı);
		 add(dersHarfNotu);
		 add(dersSaati);
		 add(bos1);
		 add(ders1);
		 add(harfnot1);
		 add(saat1);
		 add(ders2);
		 add(harfnot2);
		 add(saat2);
		 add(ders3);
		 add(harfnot3);
		 add(saat3);
		 add(ders4);
		 add(harfnot4);
		 add(saat4);
		 add(ders5);
		 add(harfnot5);
		 add(saat5);
		 add(ders6);
		 add(harfnot6);
		 add(saat6);
		 add(ders7);
		 add(harfnot7);
		 add(saat7);
		 add(ders8);
		 add(harfnot8);
		 add(saat8);
		 add(ders9);
		 add(harfnot9);
		 add(saat9);
		 add(bos2);
		 add(hesapla);
		 add(sonuc);
	 }	 
	 
     
	 private class ButtonListener implements ActionListener {
	        
	        @Override
	        public void actionPerformed(ActionEvent e) { 	
	        	
	        	double islem1 = (KrediDegeri(harfnot1.getText())*Integer.valueOf(saat1.getText()));
	        	double islem2 = (KrediDegeri(harfnot2.getText())*Integer.valueOf(saat2.getText()));
	        	double islem3 = (KrediDegeri(harfnot3.getText())*Integer.valueOf(saat3.getText()));
	        	double islem4 = (KrediDegeri(harfnot4.getText())*Integer.valueOf(saat4.getText()));
	        	double islem5 = (KrediDegeri(harfnot5.getText())*Integer.valueOf(saat5.getText()));
	        	double islem6 = (KrediDegeri(harfnot6.getText())*Integer.valueOf(saat6.getText()));
	        	double islem7 = (KrediDegeri(harfnot7.getText())*Integer.valueOf(saat7.getText()));
	        	double islem8 = (KrediDegeri(harfnot8.getText())*Integer.valueOf(saat8.getText()));
	        	double islem9 = (KrediDegeri(harfnot9.getText())*Integer.valueOf(saat9.getText()));
	        	double bolen = Integer.valueOf(saat1.getText())+ Integer.valueOf(saat2.getText())+ Integer.valueOf(saat3.getText())+ Integer.valueOf(saat4.getText())+ Integer.valueOf(saat5.getText())+ Integer.valueOf(saat6.getText())+ Integer.valueOf(saat7.getText())+Integer.valueOf(saat8.getText())+Integer.valueOf(saat9.getText());
	            
	        	sonuc.setText(String.valueOf((islem1+islem2+islem3+islem4+islem5+islem6+islem7+islem8+islem9)/bolen));       	
	        }	        
	 }    
	 
	 public static double KrediDegeri(String harfNotu) {
		 
		 double not=0;	 
		 
		 if(harfNotu=="AA" || harfNotu=="aa"  ) {
		     not=4;
		     
		 }
		 else if(harfNotu=="BA" || harfNotu=="ba"){
			 not=3.5;
		 }
		 else if(harfNotu=="BB" || harfNotu=="bb"){
			 not=3;
		 }
		 else if(harfNotu=="CB" || harfNotu=="cb"){
			 not=2.5;
		 }
		 else if(harfNotu=="CC" || harfNotu=="cc"){
			 not=2;
		 }
		 else if(harfNotu=="DC" || harfNotu=="dc"){
			 not=1.5;
		 }
		 else if(harfNotu=="DD" || harfNotu=="dd"){
			 not=1;
		 }
		 else if(harfNotu=="FD" || harfNotu=="fd"){
			 not=0.5;
		 }
		 else {
			 not=0;
		 }
		 return not;
	 }
}

