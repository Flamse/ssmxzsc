package ssmxzsc.filter;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.sun.org.apache.xalan.internal.xsltc.dom.Filter;


//@WebFilter("/*")
public class LoginFilter implements Filter {
	private String contextPath;
	/**
	 * Default constructor.
	 */
	public LoginFilter() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}
	/**
	 * @see Filter#doFilter(ServletRequest_j ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;
		HttpSession session = request.getSession();
		String servletPath = request.getServletPath();
		if(isPermitted(servletPath, session)){
			chain.doFilter(request, response);
		}else{
			response.sendRedirect(contextPath+"/"+(servletPath.split("/")[1])+"/page/login.html");
		}
	}
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		contextPath = fConfig.getServletContext().getContextPath();
	}
	/**
	 *  是否被允许访问
	 *	@param path
	 *	@param session
	 *	@return允许访问返回true
	 */
	public boolean isPermitted(String path, HttpSession session){
//		return true;
		if(null!=session.getAttribute("currentUser")) {
			return true;
			}
		if(path.endsWith(".css") || 
			path.endsWith(".js") || 
			path.endsWith(".json") || 
			path.endsWith(".jpg") || 
			path.endsWith(".png") || 
			path.endsWith(".eot") || 
			path.endsWith(".svg") || 
			path.endsWith(".ttf") || 
			path.endsWith(".woff") || 
			path.endsWith(".woff2") || 
			path.endsWith(".otf") || 
			path.endsWith("regist.html") || 
			path.endsWith("login.html") || 
			path.endsWith("login.do") || 
			path.endsWith("regist.do") || 
			path.endsWith("emailCheck.do") || 
			path.endsWith("phoneCheck.do") || 
			path.endsWith("unameCheck.dou")){
			return true;
		}
		return false;
	}
	@Override
	public boolean test(int arg0) {
		// TODO Auto-generated method stub
		return false;
	}
}