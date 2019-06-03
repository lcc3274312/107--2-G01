
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import bgm.Music;

public class PainterFrame extends JFrame implements ActionListener {
	private JButton start;
	private JButton stop;
	private JPanel p1;// 首頁
	private JPanel p2;// 遊戲介面
	private JPanel shapeType;
	private Music music;
	private CardLayout cards;// 分隔兩個所用的指令
	private Icon startic;
	private JLabel map;
	
	public PainterFrame() {
		super();

		p1 = new JPanel(new BorderLayout());
		p2 = new JPanel();
		shapeType = new JPanel();
		map = new JLabel(new ImageIcon(getClass().getResource("Map.jpg")));
		
		music = new Music();

		cards = new CardLayout();

		shapeType.setLayout(cards);

		start = new JButton("");
		startic = new ImageIcon(getClass().getResource("start.png"));
		start.setOpaque(false);
		start.setContentAreaFilled(false);
		start.setBorder(null);
		start.setIcon(startic);


	

	start.addActionListener(this);

	p1.add(start,BorderLayout.SOUTH);p1.setBackground(Color.WHITE);

	shapeType.add(p1,"cards1");

	p2.add(map);
	
	shapeType.add(p2,"cards2");

	add(shapeType,BorderLayout.CENTER);
}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO
		if (e.getSource() == start) {
			cards.show(shapeType, "cards2");

		}
	}
}
