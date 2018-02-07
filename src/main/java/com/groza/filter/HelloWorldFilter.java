package com.groza.filter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.container.ResourceInfo;
import javax.ws.rs.core.Context;
import java.io.IOException;
import java.lang.reflect.Method;

/**
 * HelloWorldFilter
 *
 * @author <a href="mailto:gzlin@coremail.cn">More</a>.
 */
//@javax.ws.rs.ext.Provider
@WebFilter(urlPatterns = "/api/*", filterName = "HelloWorldFilter")
public class HelloWorldFilter implements Filter {
    @Context
    private ResourceInfo resourceInfo;

    @Context
    private HttpServletRequest servletRequest;

    @Context
    private HttpServletResponse servletResponse;


    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        Method method = resourceInfo.getResourceMethod();
    }

    @Override
    public void destroy() {

    }


}
