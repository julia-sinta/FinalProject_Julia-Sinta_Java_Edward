import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Vector;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class tabel extends JFrame implements ActionListener{
	JButton exit;
	
	public tabel() {
		// TODO Auto-generated constructor stub
		initframe();
	}
	
	public void initframe() {
		setTitle("View Data");
		setSize(600, 600);
		initjtabel();
		komponen();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocation(500,150);
		setVisible(true);
	}
	
	public void initjtabel() {
		Vector<String> columns = new Vector<>();
		columns.add("Kode Menu");
		columns.add("Nama Menu");
		columns.add("Harga Menu");
		columns.add("Stok Menu");
	}

	public void komponen() {
		exit= new JButton("Exit");
		exit.addActionListener(this);
		JPanel bawah= new JPanel();
		bawah.setLayout(new FlowLayout());
		bawah.add(exit);
		add(bawah);
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource().equals(exit)) {
			new main();
			setVisible(false);
		}
	}
}