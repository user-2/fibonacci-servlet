import java.io.*; 
import javax.servlet.*; 
import javax.servlet.http.*; 
public class Fib extends HttpServlet 
{ 
public void doPost(HttpServletRequest req,HttpServletResponse res) 
throws ServletException,IOException 
{ 
res.setContentType("text/html"); 
int n = Integer.parseInt( req.getParameter("range")); 
int first=0,second=1,next,c; 
PrintWriter out = res.getWriter(); 
 
out.printf("\n first %d terms of fibonacci series are \n",n); 
for(int i=0;i<n;i++) 
{ 
   if(i<=1) 
    next=i; 
   else 
     { 
         next=first+second; 
         first=second; 
          second=next; 
      } 
out.print(" "+next); 
  } 
} 
} 
