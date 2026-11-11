import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {
    public static Connection abrir() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/MERCADO";
        String usuario = "root";
        String senha = System.getenv("MYSQL_SENHA");
        return DriverManager.getConnection(url, usuario, senha);
    }

    public static void conectar(){
        try (Connection conexao = Conexao.abrir()) {
            System.out.println("Conectado ao MySQL!");
        } catch (SQLException e) {
            System.out.println("Erro ao conectar: " + e.getMessage());
        }
    }
}
