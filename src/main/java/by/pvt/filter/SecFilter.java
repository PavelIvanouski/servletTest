package by.pvt.filter;

import org.apache.log4j.Logger;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;

public class SecFilter implements Filter {

    static final private Logger LOGGER = Logger.getLogger(SecFilter.class);

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain)
            throws IOException, ServletException {

        HttpServletRequest req = (HttpServletRequest) servletRequest;
        LOGGER.info("SEC filter invoked");
        String authentication = req.getHeader("Authentication");
        if (checkInDb(authentication)){
            filterChain.doFilter(servletRequest,servletResponse);
        } else {
            servletResponse.getWriter().println("Not allowed to call this method!");
        }
    }

    private boolean checkInDb(String authentication) {
        return authentication.equals("12345");
    }

    @Override
    public void destroy() {

    }
}
