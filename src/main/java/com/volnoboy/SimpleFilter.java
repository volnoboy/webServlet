package com.volnoboy;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * @author Volodymyr Volnoboy (vvolnoboy@luxoft.com)
 * @since 7/6/15 10:57 AM
 */
public class SimpleFilter implements Filter {
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("Filter");
		// pass the request along the filter chain
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {

	}
}
