package com.taobao;

import javax.servlet.*;
import java.io.IOException;

public class HelloServlet implements Servlet {
    public void init(ServletConfig servletConfig) throws ServletException {

    }

    public ServletConfig getServletConfig() {
        return null;
    }

    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        //获取参数，加入逻辑。
        System.out.println("lsaldkjf");
        servletRequest.getRequestDispatcher("/hello.html").forward(servletRequest,servletResponse);
    }

    public String getServletInfo() {
        return null;
    }

    public void destroy() {

    }
}
