import javax.swing.*; 

import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author ahsan
 */
public class StartUpClass extends JFrame {
    
    private void addRows(JTable table) { 
        String props = "Ahsan Mahmood"; 
        for (int i = 0; i < 2; i++) { 
            table.setValueAt(props + "-", i, 2); 
            table.setValueAt(props + "-" + props, i, 1); 
            table.setValueAt(props + "-" + props + "-" + props, i, 0); 
        }
    }
    void showTable() { 
        JTable table = new JTable(); 
 
        TableColumnModel cmodel = table.getColumnModel(); 
        TextAreaRenderer textAreaRenderer = new TextAreaRenderer(); 
 
        cmodel.getColumn(0).setCellRenderer(new DefaultTableCellRenderer()); 
        
        addRows(table); 
 
        getContentPane().add(new JScrollPane(table)); 
        setSize(500, 400); 
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        setLocationRelativeTo(null); 
        setTitle("Text Area Renderer In Table"); 
        setVisible(true); 
 
    } 
     
    public static void main(String[] args) {
        new TextAreaRendererInTable().showTable(); 
    }
    
}
