import javax.swing.JOptionPane;

class Snr{
	public static void main(String[] args) {
		String num1,num2;

		num1 = JOptionPane.showInputDialog("Enter First Number:- ");

		num2 = JOptionPane.showInputDialog("Enter Second Number:- ");

		int firstnum = Integer.parseInt(num1);
		int secondnum = Integer.parseInt(num2);

		int add = firstnum+secondnum;

		JOptionPane.showMessageDialog(null, "Sum is "+add , "Snr", JOptionPane.PLAIN_MESSAGE);
	}
}