import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class WelcomeServlet extends HttpServlet
{
   
    

   public void doGet(HttpServletRequest request,HttpServletResponse response)throws ServletException,IOException
    {
        response.setContentType("text/html");
	PrintWriter out= response.getWriter();
        out.println("<H1>Welcome</H1>");

    }
}