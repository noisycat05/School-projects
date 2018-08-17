import javax.swing.JOptionPane;

public class Dialog{

   public static void main(String[] args) {
      
      JOptionPane.showMessageDialog(null,"Hello human!");
      String answer = JOptionPane.showInputDialog("How are you?");
      System.out.println(answer);
      JOptionPane.showMessageDialog(null,"Thats great! I'm glad your feeling "+answer+" today.");
      
   }

}