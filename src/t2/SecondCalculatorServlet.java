package t2;

import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/secondCalculatorServlet")
public class SecondCalculatorServlet extends HttpServlet {
    @EJB
    OperationsSessionBeanStateful bean;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name2 =request.getParameter("name2");
        String action2 =request.getParameter("action2");
        Float buf =Float.parseFloat(request.getParameter("val3"));
        if (bean.name == null) bean.name = name2;
        if (bean.num == null){ bean.num = buf;}
        else
            switch (action2){
                case ("add"):bean.num=bean.add(bean.num,buf);break;
                case("sub"):bean.num=bean.subtract(bean.num,buf);break;
                case("multi"):bean.num=bean.multiply(bean.num,buf);break;
                case("div"):bean.num=bean.divide(bean.num,buf);break;
                default:out.print("Exeption??");
            }
        request.setAttribute("result2",bean.num);
        request.setAttribute("name2",bean.name);
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calc2.jsp");
        requestDispatcher.forward(request, response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        RequestDispatcher requestDispatcher = request.getRequestDispatcher("/calc2.jsp");
        requestDispatcher.forward(request, response);
    }
}
