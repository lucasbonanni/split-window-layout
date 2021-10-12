import javax.swing.*;

public class GridPanel {

    public static JScrollPane GetGridPanel(){
        final String[] colHeads = {"File Name", "Size", "Read Only", "Hidden"};
        String[][] data = {{"","","",""}};

        JTable jtb = new JTable(data, colHeads);
        jtb.setAutoCreateRowSorter(true);
        jtb.setDragEnabled(false);
        return new JScrollPane(jtb);
    }
}
