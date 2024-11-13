package org.sen;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * This servlet handles HTTP GET requests.
 */
public class MyServlet extends HttpServlet {
    /**
     * Handles the HTTP GET request.
     *
     * @param req
     * @param resp
     * @throws IOException
     */
    @Override
    protected void doGet(final HttpServletRequest req,
                         final HttpServletResponse resp)
            throws IOException {
        resp.setContentType("text/plain");
        resp.getWriter().println("Hello, this is your Java application "
                + "listening on port 10010.");
    }
}
