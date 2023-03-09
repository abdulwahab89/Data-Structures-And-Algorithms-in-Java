import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        new array();
    }
}
class array extends  JFrame {
    Button b;
    JFrame frame = new JFrame();
    JPanel panel;
    void set() {
        panel=new JPanel();
        setSize(600,600);
        b=new Button();
 b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                System.out.println("clicked");
            }
        });
        panel.add(b);
        add(panel);
        setVisible(true);
        /*
        ArrayList<String> departments = new ArrayList<String>();
        public void setDepartments (ArrayList < String > departments) {
            this.departments = departments;
        }
        public void getDepartments () {
            for (String i : departments
            ) {
                System.out.print(departments);
            }
        } */
    }
}