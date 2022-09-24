package com.qfedu.mtl.filters;

import org.apache.catalina.filters.ExpiresFilter;
import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

/**
 * @Description
 * @Author 千锋涛哥
 * 公众号： Java架构栈
 */
@Component
@WebFilter("/")
public class LoginFilter implements Filter {

    private String[] excludePath = {"/", "/index.html", "/brand/list", "/goods/listByBrand", "/basicInfo/list",
            "/price/count", "/login.html", "/user/login"};
    private String[] excludeExts = {".jpg", ".css", ".js", ".png", ".gif"};

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        //1.获取请求路径
        String uri = request.getRequestURI();
        //2.如果此请求的路径是非受限资源，则直接放行
        boolean b = judge(uri);
        if (b) {
            filterChain.doFilter(servletRequest, servletResponse);
        } else {
            //表示受限资源，需要验证是否登录
            HttpSession session = request.getSession();
            if (session.getAttribute("user") == null) {
                //未登录
                request.setAttribute("tips", "请先登录！");
                request.getRequestDispatcher("/login.html").forward(request, response);
            } else {
                filterChain.doFilter(servletRequest, servletResponse);
            }
        }

    }

    private boolean judge(String path) {
        boolean flag = false;
        for (String s : excludePath) {
            if (s.equals(path)) {
                flag = true;
                break;
            }
        }
        for (String ext : excludeExts) {
            if (path.endsWith(ext)) {
                flag = true;
                break;
            }
        }
        return flag;
    }

}
