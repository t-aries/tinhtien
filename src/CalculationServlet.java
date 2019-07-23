import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(name = "CalculationServlet", urlPatterns = {"/calculation"})
public class CalculationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String descp = request.getParameter("desc");
        float lis = Float.parseFloat(request.getParameter("list"));
        float dis = Float.parseFloat(request.getParameter("disc"));
        double cal = lis * dis /1000;
        double total = lis - cal;
        PrintWriter writer = response.getWriter();
        writer.println("<html>");
        writer.println("<h1>Product Discount Calculator</h1>");
        writer.println("<h4>Product Description: " + descp + "</h4>");
        writer.println("<h4>Price: $" + lis + " </h4>");
        writer.println("<h4>Discount Percent:" + dis + "%</h4>");
        writer.println("<h4>Discount Amount: $" + cal + "</h4>");
        writer.println("<h4>Discount Price: $" + total + "</h4>");
        writer.println("</html>");
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
