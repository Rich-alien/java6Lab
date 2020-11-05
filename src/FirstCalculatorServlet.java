import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/firstCalculatorServlet")
public class FirstCalculatorServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        Float val1 =Float.parseFloat(request.getParameter("val1"));
        Float val2 =Float.parseFloat(request.getParameter("val2"));
        String action =(String) request.getParameter("action");
        System.out.println(action);
        Float result=0f;
        switch (action){
            case ("add"):result=val1+val2;break;
            case("sub"):result=val1-val2;break;
            case("multi"):result=val1*val2;break;
            case("div"):result=val1/val2;break;
            default:out.print("Exeption??");break;
        }
        System.out.println(val1);
        System.out.println(val2);
        System.out.println(result);
        request.setAttribute("result",result);
        //response.sendRedirect("http://localhost:8080/laba6_war_exploded/calc1.jsp");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calc1.jsp");
        requestDispatcher.forward(request, response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out =response.getWriter();
        out.print("<br>Как вы сюда попали??<br>Перейдите на ...war/calc1.jsp");
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calc1.jsp");
        requestDispatcher.forward(request, response);
    }
}
