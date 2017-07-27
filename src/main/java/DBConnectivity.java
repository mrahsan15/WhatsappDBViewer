
import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JFileChooser;

/**
 *
 * @author ahsan
 */
public class DBConnectivity {
    private Connection connection;
    private String DBName;
    
    public DBConnectivity(){
        
    }
    public Connection SqliteConnect(){
        try {
            Class.forName("org.sqlite.JDBC");
            File file;
            JFileChooser filechooser = new JFileChooser("Select Sqlite Database");
            filechooser.showOpenDialog(filechooser);
            file = filechooser.getSelectedFile();
            DBName = file.getName();
            connection = DriverManager.getConnection("jdbc:sqlite:"+file.getAbsolutePath());
        }catch(Exception ex){
            System.out.println(ex);
        }
        return connection;
    }
    public Connection SqliteConnect(String DBAddress){
        try {
            Class.forName("org.sqlite.JDBC");
            File file;
            file = new File(DBAddress);
            DBName = file.getName();
            connection = DriverManager.getConnection("jdbc:sqlite:"+file.getAbsolutePath());
        }catch(Exception ex){
            System.out.println(ex);
        }
        return connection;
    }
}
