import javax.swing.JOptionPane;

public class JOptionMethod {

	public static void main(String[] args) {
		String name = JOptionPane.showInputDialog("What is your Name?");
		String age = JOptionPane.showInputDialog("What is your Age?");
		String email = JOptionPane.showInputDialog("What is your Email?");
		String faculty = JOptionPane.showInputDialog("What is your Faculty?");
		JOptionPane.showMessageDialog(null, "Your Name is: " + name + "\nYour Age is: " + age + "\nYour Email is: "
				+ email + "\nYour Faculty is: " + faculty);

	}

}
