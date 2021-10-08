package com.wllx.filter;

import javax.servlet.*;
import java.io.IOException;

/**
 * @Description:
 * @Author: wllx
 * @Date: 2021/10/07 22:13:17
 * @Version: 1.0
 * @Tel/QQ: 691033
 */
public class CustomFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        Filter.super.init(filterConfig);
        System.out.println("==========CustomFilter>>>init==========");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        System.out.println("==========CustomFilter>>>doFilternit==========");
        filterChain.doFilter(servletRequest,servletResponse);
    }

    @Override
    public void destroy() {
        Filter.super.destroy();
        System.out.println("==========CustomFilter>>>destroy==========");
    }
}
