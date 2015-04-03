import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;
import java.util.HashMap;
import java.util.Date;
 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 
@WebServlet(name = "MyThirdServlet", urlPatterns = {"/MyThirdServlet"})
public class MyThirdServlet extends HttpServlet {
 
    private static final long serialVersionUID = -1915463532411657451L;
 
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
    	throws ServletException, IOException {
    
    		
    	String username = request.getParameter("username");
    	String password = request.getParameter("password");
    	boolean success = validateUser(username, password);
    	
    	Map<String, String> data = getData();
    	Date currdat = new Date();
        response.setContentType("text/html; charset=UTF-8");
        PrintWriter out = response.getWriter();
        try{
        	/** write some content
        	out.println("<!DOCTYPE html>");
        	out.println("<html lang="en">");
        	out.println("<head>");
        	out.println("<title>Pie Chart</title>");
        	out.println("<meta charset="utf-8">");
        	out.println("<script src="piechart.js">");
        	out.println("</script>");
        	out.println("<style>");
        	out.println("</style>");
        	out.println("<script>
        		window.onload = createPieChart;
        		function createPieChart() {
        			var pieChart = new PieChart("piechart", 
        				{
        					includeLabels: true,
        					data: [40, 250, 70],
        					labels: ["11%", "69.6%", "17.4%"],
        					colors: [
        						["#FFDAB9", "#FFDAB9"],
        						["#E6E6FA", "#E6E6FA"],
        						["#E0FFFF", "#E0FFFF"]
        					]
        				}
        			);
        			pieChart.draw();
        		}");
        	out.println("</script>");
        	out.println("</head>");
        	out.println("<body>");
        	out.println("<canvas id="piechart" width="400" height="400">");
        	out.println("</canvas>");
        	out.println("</body>");
        	out.println("</html>");
        	out.println("</head>");
        	out.println("<body>");
        	out.println("<h2>Servlet MyThirdServlet at " + request.getContextPath()
        		+ "</h2>");
        	out.println("<h2>learn to fail, fail to learn!</h2>");
        	out.println("</body>");
        	out.println("</html>");*/
        	
        	
        	
        	out.println("<html>");
        	out.println("<head>");
        	out.println("<title>Request Information Example</title>");
        	out.println("</head>");
        	out.println("<body>");
        	
        	out.println("<h2><b>Request Information Example</b></h2>");
        	out.println("<hr>");
        	out.println("<p>Method: request.getMethod()</p>");
        	out.println("<p>Request URI: request.getRequestURI()</p>");
        	out.println("<p>Protocol: request.getProtocol()</p>");
        	out.println("<p>PathInfo: request.getPathInfo()</p>");
        	out.println("<p>Remote Address: request.getRemoteAddr()</p>");
        	
        	out.println("<h2>positive psychology prescription</h2>");
        	out.println("<hr>");
        	out.println("<p>30 minutes of physical exercise, 4 times a week.</p>");
        	out.println("<p>at least 15 minutes of mindful exercise 6 or 7 times a week.</p>");
        	out.println("<p>8 hours of sleep more or less per 24 hours.</p>");
        	out.println("<p>at least 12 hugs a day.</p>");
        	
        	out.println("<h3>Hello " + data.get("username") + "," + data.get("message") + "</h2>");
        	out.println("<hr>");
        	out.println("<p>The time right now is : " + currdat + "</p>");
        	out.println("<p>advice-one:		" + data.get("advice-one") + "</p>");
        	out.println("<p>advice-two:		" + data.get("advice-two") + "</p>");
        	out.println("<p>advice-three:	" + data.get("advice-three") + "</p>");
        	out.println("<p>advice-four:	" + data.get("advice-four") + "</p>");
        	out.println("<p>advice-five:	" + data.get("advice-five") + "</p>");
        	
        	if(success) {
        		out.println("<hr>");
        		out.println("<h3>Welcome Friend: " + username + "	recreation leads to creation</h3>");
        	} else {
        		out.println("<hr>");
        		out.println("<h3>Validate your self again.</h3>");
        	}
        	
        	out.println("</body>");
        	out.println("</html>");
        } finally{
        	out.close();
        }
        
    }
 
    @Override
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
        //Do some other work
        doGet(request, response);
    }
    
    @Override
    public String getServletInfo() {
    	return "learn to fail, fail to learn";
    }
    
    
    // This method will access some external system as database to get user name,
    // and his personalized message
    private Map<String, String> getData() {
    	Map<String, String> data = new HashMap<String, String>();
    	data.put("username", "bobo young");
    	data.put("message", "Welcome to my world !!");
    	data.put("advice-one", "permission to be human");
    	data.put("advice-two", "accept of the emotion");
    	data.put("advice-three", "accept that is difficult");
    	data.put("advice-four", "accept reality");
    	data.put("advice-five", "too much of a good thing");
    	return data;
    }

    private boolean validateUser(String username, String password) {
    	if(username.equals("boboyoung") && password.equals("13986512352")) 
    	{
    		return true;
    	}else {		
    		return false; }
    		
    }
    
}
