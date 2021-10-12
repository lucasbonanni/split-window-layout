import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;
import java.awt.*;

import static javax.swing.WindowConstants.EXIT_ON_CLOSE;

public class SQLClient extends JPanel {
    JTree tree;
    JTable jtb;
    JScrollPane jsp;
    JScrollPane jspTable;
    JTextArea ta;
    JScrollPane jspText;
    JPanel jspQuery;


    public SQLClient(){
        DefaultMutableTreeNode top = new DefaultMutableTreeNode( "Principal");
        setSize(1000,500);
        tree = new JTree(top);
        jsp = new JScrollPane(tree);

        ta = new JTextArea();

        /*
        ta.setMinimumSize(new Dimension(250,250));
        ta.setSize(100,250);
        ta.setAutoscrolls(true);
        ta.setColumns(50);
        ta.setRows(10);*/
        jspText = new JScrollPane(ta);
        //jspText.setMinimumSize(new Dimension(250,250));
        //jspText.setBounds(0,0,250,250);

        final String[] colHeads = {"File Name", "Size", "Read Only", "Hidden"};
        String[][] data = {{"","","",""}};

        jtb = new JTable(data, colHeads);
        jspTable = new JScrollPane(jtb);

    }
}
