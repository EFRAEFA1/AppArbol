import java.awt.Color;
import javax.swing.JFrame;

public class AppÁrbol {
    
    public static void main(String[] args) {
        JFrame ventana = new JFrame("GRAFO");
        
        ventana.add(new Lienzo());
        ventana.setBackground(Color.cyan);
        ventana.setSize(600, 600);
        ventana.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        ventana.setVisible(true);

    }

}
