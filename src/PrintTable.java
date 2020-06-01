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
            int sizeList = count-1;
            System.out.println("count "+ count);
            System.out.println("sizeList "+sizeList);

            System.out.println(rsmd.getColumnName(1));
            System.out.println(rsmd.getColumnName(2));
            System.out.println(rsmd.getColumnName(3));

            List<String> list = new ArrayList<>();
            for (int j = 0; j <= sizeList; j++) {
                list.add(rsmd.getColumnName(j+1));
            }

            StringBuilder sb = new StringBuilder();
            sb.append("\"");
            for (int i = 0; i < list.size(); i++) {
                sb.append(list.get(i));
                sb.append(",");
            }
            sb.append("\"");
           String result = sb.replace(sb.length()-2,sb.length()-1,"").toString();
            System.out.println(result);


            at.addRule();
            at.addRow("name", "model", "year");
            at.addRule();
            while (rs1.next()) {
                String name = rs1.getString(1);
                String model = rs1.getString(2);
                int year = rs1.getInt(3);
                at.addRow(name, model, year);
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
