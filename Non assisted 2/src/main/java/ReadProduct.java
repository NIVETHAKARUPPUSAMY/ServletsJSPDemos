import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/readproduct")
public class ReadProduct extends HttpServlet {

	Connection connection;

	@Override
	public void init() throws ServletException {

		try {
			System.out.println("ReadProduct.init() method. DB connection created");
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Nivetha@5642");
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
		
		int Product_id = Integer.parseInt(request.getParameter("Product_id"));
		PrintWriter out=response.getWriter();
		try (Statement statement = connection.createStatement();) {

			// resultset = read from db where email = 'x'
			// if resultset.hasnext() { pw.write("User already exists"); }

			ResultSet results = statement.executeQuery("select * from Product where Product_id=2");
			//PrintWriter out = response.getWriter();
			out.println("<table>");
			out.println("<tr>");
			out.println("<th>Product_id</th>");
			out.println("<th>Prodcut_name</th>");
			out.println("<th>cost</th>");
			out.println("<th>Availablity</th>");
			out.println("</tr>");
			while (results.next()) {
				out.println("<tr>");
				out.println("<td>" + results.getString(1) + "</td>");
				out.println("<td>" + results.getString(2) + "</td>");
				out.println("<td>" + results.getString(3) + "</td>");
				out.println("<td>" + results.getString(4) + "</td>");
				out.println("</tr>");
			}
			out.println("</table>");
			out.println("<p><a href=\"producthome.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void destroy() {
		try {
			System.out.println("ReadProduct.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}