package org.sen;

import org.eclipse.jetty.server.Server;
import org.eclipse.jetty.servlet.ServletContextHandler;
import org.eclipse.jetty.servlet.ServletHolder;

/**
 * This class demonstrates how to set up a Jetty server.
 */
public final class App {
    /**
     * The port number for the Jetty server.
     */
    private static final int PORT = 10010;

    /**
     * The number of minutes to sleep before stopping the server.
     */
    private static final int SLEEP_MINUTES = 5;

    /**
     * The number of seconds in a minute.
     */
    private static final int SECONDS_IN_MINUTE = 60;

    /**
     * The number of milliseconds in a second.
     */
    private static final int MILLISECONDS_IN_SECOND = 1000;

    private App() {
        // Private constructor to prevent instantiation
    }

    /**
     * Main method to run the Jetty server example.
     *
     * @param args command-line arguments
     */
    public static void main(final String[] args) {
        // Create a Jetty server that listens on the specified port
        Server server = new Server(PORT);

        // Create a servlet context
        ServletContextHandler context = new ServletContextHandler(
                ServletContextHandler.SESSIONS);
        context.setContextPath("/");

        // Add a servlet that handles incoming requests
        context.addServlet(new ServletHolder(new MyServlet()), "/*");

        server.setHandler(context);

        try {
            // Start the server and wait for the specified time
            server.start();
            server.join();
            Thread.sleep(SLEEP_MINUTES * SECONDS_IN_MINUTE
                    * MILLISECONDS_IN_SECOND); // Sleep for 5 minutes
            server.stop(); // Stop the server after 5 minutes
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
