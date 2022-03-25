package com.itheima.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import java.io.IOException;

/*
* 编写servlet的步骤
* 1.实现servlet方法 重写方法
* 2.配置servlet的映射路径（目的就是让浏览器访问当servlet）
*方式1：配置文件方式配置
*方式2：注解方式配置
*
*
* */
@WebServlet(urlPatterns = "/demo01",loadOnStartup = 1)
public class ServletDemo01  implements Servlet {
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("servlet demo01被创建出来了");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("我一定要快乐呀");
    }

    @Override
    public String getServletInfo() {
        return null;
    }

    @Override
    public void destroy() {
        System.out.println("servlet被销毁了");
    }
}
