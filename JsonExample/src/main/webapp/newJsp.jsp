<%@ page import="java.io.PrintWriter"%>
 <%@ page import="org.json.simple.JSONObject"%>
<%@ page import="org.json.simple.JSONValue"%>


<%
	request.setCharacterEncoding("utf8");
	response.setContentType("application/json");
	PrintWriter outt = response.getWriter();
	JSONObject jsonObj = (JSONObject) JSONValue.parse(request
			.getParameter("para"));
	System.out.println(jsonObj.get("msg"));
	JSONObject obj = new JSONObject();
	obj.put("res", "hello...");
	out.print(obj);
%>