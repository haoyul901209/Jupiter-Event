package rpc;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Servlet implementation class Recommendation
 */
@WebServlet("/Recommendation")
public class RecommendItem extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RecommendItem() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		JSONArray array = new JSONArray();
		try {
			array.put(new JSONObject().put("name","abcd"));
			array.put(new JSONObject().put("name","1234"));
			array.put(new JSONObject().put("address","San Francisco"));
			array.put(new JSONObject().put("address","San Jose"));
			array.put(new JSONObject().put("time","01/01/2017"));
			array.put(new JSONObject().put("time","01/02/2017"));

		}
		catch (JSONException e) {
			e.printStackTrace();	
		}
		RpcHelper.writeJsonArray(response, array);		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
