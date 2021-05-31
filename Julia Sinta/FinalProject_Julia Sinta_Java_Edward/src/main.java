import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class main extends JFrame implements ActionListener {
	JFrame frame;
	JButton button1=new JButton("Insert Data");
	JButton button2=new JButton("View Data");
	JButton button3=new JButton("Update Data");
	JButton button4=new JButton("Delete Data");
	JButton Start=new JButton("Start");
	JButton Exit=new JButton("Exit");
	
	public main() {
		initframe();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new main();
	}
	

	public void initframe() {
		frame=new JFrame("BobaCool");
		frame.setSize(600, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		initlabel();
		initmenu();
		initmenubawah();
		frame.setLocation(500,150);
		frame.setVisible(true);
	}
	
	public void initlabel() {
		JLabel label=new JLabel("BobaCool");
		label.setHorizontalAlignment(label.CENTER);
		label.setFont(new Font(null, Font.BOLD, 24));
		frame.add(label, BorderLayout.NORTH);
	}
	
	public void initmenu() {
		JPanel panel= new JPanel();
		panel.setLayout(new GridLayout(2,2));
		button1.addActionListener(this);
		button2.addActionListener(this);
		button3.addActionListener(this);
		button4.addActionListener(this);
		panel.add(button1);
		panel.add(button2);
		panel.add(button3);
		panel.add(button4);
		frame.add(panel);
	}
	
	public void initmenubawah() {
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		Exit.addActionListener(this);
		Start.setBackground(Color.green);
		Start.setOpaque(true);
		Start.setForeground(Color.BLACK);
		Exit.setBackground(Color.RED);
		Exit.setOpaque(true);
		Exit.setForeground(Color.BLACK);
		panel.add(Start);
		panel.add(Exit);
		frame.add(panel,BorderLayout.SOUTH);
	}

	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button1)) {
			JOptionPane.showMessageDialog(null, "Buat data");
			new bentuk();
			frame.setVisible(false);
		} else if (e.getSource().equals(button2)) {
			new tabel();
			frame.setVisible(false);
		} else if (e.getSource().equals(button3)) {
			new update();
			frame.setVisible(false);
		} else if (e.getSource().equals(button4)) {
			new delete();
			frame.setVisible(false);
		} else if (e.getSource().equals(Exit)) {
			System.exit(0);
		}
	}
}