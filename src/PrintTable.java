import de.vandermeer.asciitable.AsciiTable;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class PrintTable {

    public static void main(String[] args) {
        selectAndPrintAll();
    }

    private static void selectAndPrintAll() {
        AsciiTable at = new AsciiTable();
        final String URL = "jdbc:postgresql://localhost/postgres?user=postgres&password=12345";
        try (Connection conn = DriverManager.getConnection(URL)) {
            Statement stmt1 = conn.createStatement();
            ResultSet rs1 = stmt1.executeQuery("SELECT name, model, year FROM cars");
            ResultSetMetaData rsmd = rs1.getMetaData();
            int count = rsmd.getColumnCount();
            int sizeList = count - 1;

            List<String> list = new ArrayList<>();
            for (int j = 0; j <= sizeList; j++) {
                list.add(rsmd.getColumnName(j + 1));
            }

            at.addRule();
            at.addRow(list);
            at.addRule();

            while (rs1.next()) {
                List<Object> listqq = new ArrayList<>();
                for (int j = 0; j <= sizeList; j++) {
                    if (rsmd.getColumnType(j + 1) == 12) {
                        listqq.add(rs1.getString(j + 1));
                    } else {
                        listqq.add(rs1.getInt(j + 1));
                    }
                }
                at.addRow(listqq);
            }
            rs1.close();
            stmt1.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        at.addRule();
        String rend = at.render();
        System.out.println(rend);
    }
}
