/**
 * Created by vitaly94 on 17/01/2017.
 */
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

/**
 * FORM BASED Authorization
 */
public class LoginServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP GET and POST methods.
     * @param request servlet request
     * @param response servlet response
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        PrintWriter out = response.getWriter();
        try {
            /* Primer intento de extraer datos sin haber iniciado sesión */
            String userName = request.getParameter("j_username");
            String password = request.getParameter("j_password");

            out.println("Before Login" + "<br><br>");
            out.println("IsUserInRole?.."
                    + request.isUserInRole("admin")+"<br>");
            out.println("getRemoteUser?.." + request.getRemoteUser()+"<br>");
            out.println("getUserPrincipal?.."
                    + request.getUserPrincipal()+"<br>");
            out.println("getAuthType?.." + request.getAuthType()+"<br><br>");

            try {
                /* Inicia sesión */
                request.login(userName, password);
            } catch(ServletException ex) {
                out.println("Login Failed with a ServletException.."
                        + ex.getMessage());
                return;
            }
            /* Segundo intento de extraer datos con sesión iniciada */
            out.println("After Login..."+"<br><br>");
            out.println("IsUserInRole?.."
                    + request.isUserInRole("admin")+"<br>");
            out.println("getRemoteUser?.." + request.getRemoteUser()+"<br>");
            out.println("getUserPrincipal?.."
                    + request.getUserPrincipal()+"<br>");
            out.println("getAuthType?.." + request.getAuthType()+"<br><br>");

            request.logout();

            /* Tercer intento de extraer datos con sesión finalizada */
            out.println("After Logout..."+"<br><br>");
            out.println("IsUserInRole?.."
                    + request.isUserInRole("admin")+"<br>");
            out.println("getRemoteUser?.." + request.getRemoteUser()+"<br>");
            out.println("getUserPrincipal?.."
                    + request.getUserPrincipal()+"<br>");
            out.println("getAuthType?.." + request.getAuthType()+"<br>");
        } finally {
            out.close();
        }
    }
}