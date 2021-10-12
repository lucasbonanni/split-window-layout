import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

public class Main extends JFrame {
    JTree tree;
    JScrollPane jsp;
    Main(){
        super("SQL Client");
        DefaultMutableTreeNode top = new DefaultMutableTreeNode( "Principal");
        tree = new JTree(top);
        jsp = new JScrollPane(tree);
        add(new SQLClient(),BorderLayout.CENTER);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(1000,500);
        setVisible(true);
    }

    public static void main(String[] args) {
        //new Main();
        //SplitPanel.createAndShowGUI();
        new MainPanel();
    }
}
