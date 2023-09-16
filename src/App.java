import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        // String inputText=JOptionPane.showInputDialog("Введіть текст:");
        // System.out.println("Введений текст: " + inputText);
        // String inputNumber=JOptionPane.showInputDialog("Введіть число:");
        // double number = Double.parseDouble(inputNumber);
        // System.out.println("Введений текст: " + inputNumber);
        System.out.println("Hello, World!");
        JOptionPane.showMessageDialog(null,"Це повідомлення!");
        JOptionPane.showMessageDialog(null,"Це інформаційне повідомлення.", "Інформація", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null,"Сталася помилка!", "Помилка",JOptionPane.ERROR_MESSAGE);
    }
}
