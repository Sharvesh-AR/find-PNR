import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;


public class abc extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        double p = Double.parseDouble(request.getParameter("p"));
        double n = Double.parseDouble(request.getParameter("n"));
        double r = Double.parseDouble(request.getParameter("r"));

        double interest = (p * n * r) / 100;

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        out.println("<html><body>");
        out.println("<h2>Simple Interest Calculation</h2>");
        out.println("Principal (P): " + p + "<br>");
        out.println("Time (N): " + n + " years<br>");
        out.println("Rate (R): " + r + "%<br>");
        out.println("<strong>Simple Interest = " + interest + "</strong>");
        out.println("</body></html>");
    }
}
