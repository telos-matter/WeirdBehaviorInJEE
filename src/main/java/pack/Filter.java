package pack;

import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;

@WebFilter("/*")
public class Filter extends HttpFilter {
	private static final long serialVersionUID = 1L;

    public Filter() {
        super();
    }

	public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) servletRequest;
		HttpServletResponse response = (HttpServletResponse) servletResponse;
		final String path = request.getRequestURI().replaceFirst(request.getContextPath(), "");
		
		WriteToFile.write("In filter with path `" +path +"`");
		System.out.println("In filter with path `" +path +"`");
		PartTest.testPart(request);
		
//		chain.doFilter(request, response);
		
		request.getRequestDispatcher("/servA").forward(request, response);
//		request.getRequestDispatcher("/servB").forward(request, response);
//		request.getRequestDispatcher("/servC").forward(request, response);
		
		WriteToFile.write("Out filter");
		System.out.println("Out filter");
	}

	public void init(FilterConfig fConfig) throws ServletException {}

	public void destroy() {}
	
}
