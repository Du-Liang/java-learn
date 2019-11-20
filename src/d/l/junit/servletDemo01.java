package d.l.junit;

import javax.servlet.*;
import java.io.IOException;

public class servletDemo01 implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("hi Init!");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    //实现服务的方法
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("Hello Servlet");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("   destroy over!");
    }
}
