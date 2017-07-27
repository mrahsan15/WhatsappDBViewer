
 
import javax.swing.*; 
import javax.swing.table.*; 
 
/** 
 * The standard class for testing the TextAreaRenderer class. 
 * This class inherits from JFrame, a standard component class. 
 * 
 * @author Manivel 
 * @see JFrame 
 */ 
public class TextAreaRendererInTable extends JFrame { 
 
    /** 
     * Creates a TextAreaRendererInTable object. 
     */ 
    public TextAreaRendererInTable() { 
    } 
 
    /** 
     * This method build the table. 
     */ 
    void showTable() { 
        JTable table = new JTable(5, 3); 
 
        TableColumnModel cmodel = table.getColumnModel(); 
        TextAreaRenderer textAreaRenderer = new TextAreaRenderer(); 
 
        cmodel.getColumn(0).setCellRenderer(new DefaultTableCellRenderer()); 
        cmodel.getColumn(1).setCellRenderer(textAreaRenderer); 
        cmodel.getColumn(2).setCellRenderer(textAreaRenderer); 
 
        addRows(table); 
 
        getContentPane().add(new JScrollPane(table)); 
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setTitle("Text Area Renderer In Table"); 
        setVisible(true); 
 
    } 
 
    /** 
     * This method will add rows into table. 
     * 
     * @param table - JTable object 
     */ 
    private void addRows(JTable table) { 
        String props = "Joy is not in things but in us"; 
        for (int i = 0; i < 5; i++) { 
            table.setValueAt(props + "-" + props, i, 0); 
            table.setValueAt(props, i, 1); 
            table.setValueAt(props + "-" + props + "-" + props, i, 2); 
        } 
    } 
 
    /** 
     * Main method of TextAreaRendererInTable class 
     * 
     * @param args - Defualt main method string args 
     */ 
    public static void main(String[] args) { 
        new TextAreaRendererInTable().showTable(); 
    } 
} 
