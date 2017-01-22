<%@ page import="com.example.other.Person" %>

<html>
 <head><title>Result</title></head>
	<body>
	<%
	String name = request.getParameter("username"); // get user name submited by form
	// simply create new Cookie 
    // The Cookie constructor takes a name/value String pair:
		Cookie cookie = new Cookie("username",name); // make a new cookie to store user name
	     // create a Person object using inputed name from form:
		 Person person = new Person(name);
		 
		 // create HttpSession object and set person attribute, then 
		 // we will test listener event in console if its working:
		 request.getSession().setAttribute("person",person);
		 
		 // set cookie Domain:
		 // cookie.setDomain(".com.example.servlet"); // if you specify like this now it 
		 // will be invisible because it will look for www.com.example.servlet
		 
		 // Add the cookie as a "Set-Cookie" response header:
		 response.addCookie(cookie);
		 out.println("Created cookie, is that cookie secure? " + cookie.getSecure());
		 cookie.setSecure(true);
		 out.println("<br>Then make it secure, is it now secure? " + cookie.getSecure());
		 
	%>
	<br> Get from new created cookie domain:<br>
	Domain:<b><%=cookie.getDomain()%> </b>
	<br>Getting the cookie(s) from the client request:<hr>
	<%
	 Cookie[] cookies = request.getCookies(); // from request you can get Cookies array
	 if (cookies != null) {
		for(int i = 0; i < cookies.length; i++){
			Cookie temp_cookie = cookies[i];
		 // Keep it alive on the client for 30 minutes:
		 temp_cookie.setMaxAge(30*60);
			out.println("cookie[<b>"+i+"</b>] Name: <b>" + temp_cookie.getName() + 
			"</b>, Value: <b>" + temp_cookie.getValue() + "</b>, MAX AGE(seconds): <b>"+
			temp_cookie.getMaxAge() + "</b><br>");
			if(temp_cookie.getName().equals("username")){
				String userName =  temp_cookie.getValue();
				out.println("<h3>Hello " + userName + "</hr3>");
			}
		}
	}
	%>
	
	<a href="servlet2.do">click here</a>
	</body>
<html>	
