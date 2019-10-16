<html>
<body>
<%
String u=request.getParameter("name");
String i=request.getParameter("id");
String p=request.getParameter("per");
String a=request.getParameter("addr");
%>
<jsp:useBean id="std" class="std.Student" scope="session">
<jsp:setProperty name="std" property="stdname" value="<%=u%>"/>
<jsp:setProperty name="std" property="stdid" value="<%=i%>"/>
<jsp:setProperty name="std" property="stdper" value="<%=p%>"/>
<jsp:setProperty name="std" property="stdaddr" value="<%=a%>"/>

<jsp:getProperty name="std" property="stdname"/>
<jsp:getProperty name="std" property="stdid"/>
<jsp:getProperty name="std" property="stdper"/>
<jsp:getProperty name="std" property="stdaddr"/>
</jsp:useBean>
</body>
</html>
