import javax.swing.JOptionPane;

public class ifElseIf {

	public static void main(String[] args) {
		
		int lemons = 10;
		String[] lemon = {"buy", "end"};
		int buy = JOptionPane.showOptionDialog(null, "No lemons :(", "purchase?", JOptionPane.WARNING_MESSAGE, 0, null, lemon, lemon[0]);
		String choice = lemon[buy];
		if (choice.equals("buy")) {
			String howMuch = JOptionPane.showInputDialog("How many lemons would you like to buy? ");
			lemons = lemons + (Integer.parseInt(howMuch));
		}
		if (choice.equals("end")) {
			JOptionPane.showMessageDialog(null, "you are so horrible at business and have run out of all resoures and should go to learn business in school :( ");
		}
	}

}
