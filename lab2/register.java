import java.io.*;
import java.util.*;
import javax.servlet.*;
import javax.servlet.http.*;
public class register extends HttpServlet
{
    public void doPost(HttpServletRequest request, HttpServletResponse response)throws ServletException,IOException
  {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
                String f = request.getParameter("fname");
                String l = request.getParameter("lname");
                String c = request.getParameter("cno");
                String e = request.getParameter("eaddr");
		out.println(f);
         out.println(l);
         out.println(c);
         out.println(e);
String a[ ]=request.getParameterValues("cou");
                  for(int i=0;i<a.length;i++)
          out.println(a[i]);                       
  }
}