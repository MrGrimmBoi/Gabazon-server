package net.mrgrimm.gabazon;




import java.io.IOException;
import java.sql.SQLException;

public class App
{
    public static DBConnection myDB;
    public static void main( String[] args ) throws IOException, SQLException {
        myDB=DBConnection.getConnection();
        SocketServer server = new SocketServer();
    }
}
