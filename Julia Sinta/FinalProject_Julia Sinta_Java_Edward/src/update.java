import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;

public class update extends JFrame implements ActionListener {
	JFrame frame;
	JButton update = new JButton("Update");
	JButton exit = new JButton("Exit");
	JTable table;
	
	public update() {
		// TODO Auto-generated constructor stub
		initframe();
	}
	
	public void initframe() {
		frame=new JFrame("Update Data");
		frame.setSize(600, 600);
		initlabel();
		initjtabel();
		initmenubawah();
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocation(500,150);
		frame.setVisible(true);
	}
	
	public void initlabel() {
		JLabel label=new JLabel("Pilih baris yang ingin diupdate");
		label.setHorizontalAlignment(label.CENTER);
		label.setFont(new Font(null, Font.ROMAN_BASELINE, 14));
		frame.add(label, BorderLayout.NORTH);
	}
	
	public void initjtabel() {
		Vector<String> columns = new Vector<>();
		columns.add("Kode Menu");
		columns.add("Nama Menu");
		columns.add("Harga Menu");
		columns.add("Stok Menu");
	}
	
	public void initmenubawah() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		update.addActionListener(this);
		exit.addActionListener(this);
		update.setBackground(Color.green);
		update.setOpaque(true);
		update.setForeground(Color.BLACK);
		exit.setBackground(Color.RED);
		exit.setOpaque(true);
		exit.setForeground(Color.BLACK);
		panel.add(update);
		panel.add(exit);
		frame.add(panel,BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}