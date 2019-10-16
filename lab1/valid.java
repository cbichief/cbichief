import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class valid extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
  {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
                String u = request.getParameter("uid");
        String p = request.getParameter("pid");
                        if((u.equals("rvr"))&&(p.equals("jc")))
           {
response.sendRedirect("http://localhost:8080/j2ee/WelcomeServlet");
           }
          else     
               response.sendRedirect("form.jsp");
         }
}