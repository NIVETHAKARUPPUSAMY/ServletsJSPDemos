import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/addproduct")
public class AddProduct extends HttpServlet {

	private static final long serialVersionUID = 1L;
	Connection connection;

	@Override
	public void init() throws ServletException {

		try {
			System.out.println("AddProduct.init() method. DB connection created");
			Class.forName("com.mysql.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost/mydb", "root", "Nivetha@5642");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		int Product_id = Integer.parseInt(request.getParameter("Product_id"));
		String Prodcut_name = request.getParameter("Prodcut_name");
		int cost = Integer.parseInt(request.getParameter("cost"));
		int Availablity = Integer.parseInt(request.getParameter("Availablity"));
		


		try (Statement statement = connection.createStatement();) {

			// resultset = read from db where email = 'x'
			// if resultset.hasnext() { pw.write("User already exists"); }

			String query = "insert into Product values('" + Product_id + "', '" + Prodcut_name + "', '" + cost + "', '"
					+ Availablity + "')";
			System.out.println("Query being executed: " + query);
			int rowsInserted = statement.executeUpdate(query);
			System.out.println("Number of rows inserted: " + rowsInserted);

			PrintWriter pw = response.getWriter();
			pw.write("Products Successfully added");
			pw.write("<p><a href=\"producthome.html\">Home</a></p>");
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}
	
	@Override
	public void destroy() {
		try {
			System.out.println("AddProduct.destroy() method. DB connection closed");
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}

