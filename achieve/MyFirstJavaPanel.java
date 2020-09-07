import javax.swing.*;
class MyFirstJavaPanel 
{
	public static void main(String[] args) 
	{
			JFrame frame = new JFrame("Hello World");
			JButton button = new JButton("OK!");
			button.setBounds(200, 150, 90, 50);
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			frame.add(button);
			frame.setSize(500, 500);
			frame.setLayout(null);
			frame.setVisible(true);
	}
}
