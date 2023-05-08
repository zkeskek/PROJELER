import java.awt.*;
import java.awt.event.*;

public class ButtonExample3 {
    public static void main(String[] args) {
        // create instance of frame with the label
        Frame f = new Frame("Button Example");

        final TextField tf = new TextField();
        tf.setBounds(50, 50, 150, 20);

        // create instance of button with label
        Button b = new Button("Click Here");
        tf.setText(b.getLabel());
        b.setLabel("Button");
       
        

        // set the position for the button in frame
        b.setBounds(50, 100, 60, 30);

        b.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                tf.setText("Welcome to Javatpoint.");
                System.out.println(b.getActionCommand());
                System.out.println(b.getActionListeners());
                System.out.println(e);
                System.out.println(b.getAlignmentX());
                System.out.println(b.getAlignmentY());
                System.out.println(b.getBaseline(0, 0));
                System.out.println(b.getFocusTraversalKeysEnabled());
                System.out.println(b.getHeight());
                System.out.println(b.getIgnoreRepaint());
                System.out.println(b.getLabel());
                System.out.println(b.getName());
                System.out.println(b.getTreeLock());
                System.out.println(b.getWidth());
                System.out.println(b.getX());
                System.out.println(b.getY());
                System.out.println(b.getClass());
                System.out.println(b.getAccessibleContext());
                System.out.println(b.getActionListeners());
                System.out.println(b.getBackground());
                System.out.println(b.getBaselineResizeBehavior());
                System.out.println(b.getBounds(null));
                System.out.println(b.getColorModel());
                System.out.println(b.getComponentAt(0, 0));
                
                System.out.println(b.getComponentListeners());
                System.out.println(b.getComponentOrientation());
                System.out.println(b.getCursor());
                System.out.println(b.getDropTarget());
                System.out.println(b.getFocusCycleRootAncestor());
                System.out.println(b.getFocusCycleRootAncestor());
                System.out.println(b.getFocusListeners());
                System.out.println(b.getFocusTraversalKeys(0));
                System.out.println(b.getFont());
               
                System.out.println(b.getForeground());
                System.out.println(b.getGraphics());
                



            }
        });

        // adding button the frame
        f.add(b);

        // adding textfield the frame
        f.add(tf);

        // setting size, layout and visibility
        f.setSize(400, 400);
        f.setLayout(null);
        f.setVisible(true);
    }
}