package com.wllx.filter;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import java.io.IOException;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/07 22:13:17
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
@WebFilter(filterName = "CustomFilter2",urlPatterns = {"/*"})
public class CustomFilter2 implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("==========CustomFilter2>>>init==========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("==========CustomFilter2>>>doFilternit==========");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("==========CustomFilter2>>>destroy==========");
    }
}
