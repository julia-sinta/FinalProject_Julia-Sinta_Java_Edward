import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;
import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.text.MaskFormatter;

public class bentuk extends JFrame implements ActionListener {
	JButton savebutton = new JButton("Save");
	JButton cancelbutton = new JButton("Cancel");
	JFormattedTextField txtcode;
	JTextField txtname;
	JTextField txtprice;
	JTextField txtstock;
	MaskFormatter formatter;
	
	public bentuk() {
		// TODO Auto-generated constructor stub
		initframe();
	}
	
	public void initframe() {
		setTitle("Masukkan Data");
		setSize(600, 600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new GridLayout(0,2));
		komponen();
		setLocation(500,150);
		setVisible(true);
	}
	
	public void komponen() {
		JLabel labelkode = new JLabel("Kode Menu: ");
		txtkode = new JFormattedTextField(formatter);
		JLabel labelnama = new JLabel("Nama Menu: ");
		txtname = new JTextField();
		JLabel labelharga = new JLabel("Harga Menu: ");
		txtprice = new JTextField();
		JLabel labelstok = new JLabel("Stok Menu: ");
		txtstock = new JTextField();
		add(labelkode);
		add(txtkode);
		add(labelnama);
		add(txtname);
		add(labelharga);
		add(txtprice);
		add(labelstok);
		add(txtstock);
		add(savebutton);
		add(cancelbutton);
		savebutton.addActionListener(this);
		cancelbutton.addActionListener(this);
	}
	
	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
		if (e.getSource().equals(savebutton)) {
			int harga = Integer.parseInt(txtprice.getText());
			int stok = Integer.parseInt(txtstock.getText());
			JOptionPane.showMessageDialog(null, "Menu dengan kode "+ txtkode.getText()+" bernama "+ txtname.getText()
			+" seharga Rp"+harga+" dengan jumlah stok "+stok+" berhasil dimasukkan");
		} else if (e.getSource().equals(cancelbutton)) {
			JOptionPane.showMessageDialog(null, "Data tidak dimasukkan");
			setVisible(false);
			new main();
		}
	}
}
