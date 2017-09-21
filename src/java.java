import javax.swing.JOptionPane;

public class java {

	public static void main(String[] args) {
		String name;
		int money = 0, lemprice = 1, lemons = 10, price = 3, day = 1, lemonade = 0, costomers, sweet, usweet, today = 0,
				win = 1;
		name = JOptionPane.showInputDialog("Hi! what is your name?");
		JOptionPane.showMessageDialog(null,
				"Hi! " + name + " you are given equipments to start your own lemonade business by your parents"
						+ "\nthe goal is to raise 800$ to buy a computer for yourself");
		JOptionPane.showMessageDialog(null,
				"To start off you have 10 lemons and will need to refill them as they run out"
						+ "\n for every 2 lemon you can make a cup of lemonade\neach lemon costs 2 dollar"
						+ " you will need to put decide the sweetness of the lemonade which is from a range of 1-10");
		do {
			JOptionPane.showMessageDialog(null, "day " + day);
			costomers = (int) (Math.random() * (Math.random() * 21));
			today = 0;
			if (costomers <= 5) {
				JOptionPane.showMessageDialog(null, " r a i n . . . \nr a i n . . . \nr a i n . . .");
			}
			for (int x = 0; x < costomers; x++) {
				int pay = (int) (Math.random() * 11 + 10);
				sweet = (int) (Math.random() * (Math.random() * 9) + 2);
				JOptionPane.showMessageDialog(null, "costomer " + (x + 1));
				String howSweet = JOptionPane.showInputDialog("How sweet would you like to put for your costomer? ");
				usweet = Integer.parseInt(howSweet);
				if (usweet >= (sweet - 1) && usweet <= (sweet + 1)) {
					JOptionPane.showMessageDialog(null,
							"Costomer: I like your lemonade I am going to pay you " + pay + " dollar");
					money = money + pay;
					today = today + pay;
					lemons = lemons - 2;
				} else {
					JOptionPane.showMessageDialog(null,
							"Costomer " + (x + 1) + ": your lemonade is disgusting, It's too crappy for " + pay
									+ " dollar so I'm going to pay you nothing");
					lemons = lemons - 2;
				}
				if (lemons <= 0) {
					String[] lemon = { "buy", "end" };
					int buy = JOptionPane.showOptionDialog(null, "No lemons :(", "purchase?",
							JOptionPane.WARNING_MESSAGE, 0, null, lemon, lemon[0]);
					String choice = lemon[buy];
					if (choice.equals("buy")) {
						String howMuch;

						do {
							howMuch = JOptionPane.showInputDialog(
									"How many lemons would you like to buy? each lemon costs 2$\n and you have " + money
											+ " dollars right now");
							if ((Integer.parseInt(howMuch)) * 2 > money) {
								JOptionPane.showMessageDialog(null, "you don't have enough money choose again");
							}
						} while (Integer.parseInt(howMuch) <= 0 || (Integer.parseInt(howMuch))>money );
						money = money - ((Integer.parseInt(howMuch)) * 2);
						lemons = lemons + (Integer.parseInt(howMuch));
						if (choice.equals("end")) {
							win = 0;
						}

					}
				}

			}

			JOptionPane.showMessageDialog(null,
					"you had " + costomers + " costomers today and have raised " + today + " dollars today and need "
							+ (800 - money) + " more "
							+ "money to finish your lemonade business and get your computer");
			day = day + 1;

		} while (money < 800 || win != 0);
		if (win == 1) {
			JOptionPane.showMessageDialog(null,
					"you are so horrible at business and have run out of all resoures and should go to learn business in school :( ");
		} else {
			JOptionPane.showMessageDialog(null,
					"wow " + name + "it seems like you have enough money to buy your computer after " + day
							+ " days of suffering . . ." + "\nafter you got it your parents took it away from you :(");
			JOptionPane.showMessageDialog(null, "T H E E N D");
		}
	}
}
