<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%--
  Created by IntelliJ IDEA.
  User: zhongl
  Date: 14-1-3
  Time: 上午9:13
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>


<html>
<head>

    <title>My JSP 'MyJsp.jsp' starting page</title>
    <base href="<%=basePath%>">
    <!--
        <link rel="stylesheet" type="text/css" href="styles.css">-->
</head>
<body>
用户注册! <br>

<form action="${pageContext.request.contextPath}/user/addUser.action" method="post">
   用户名:<input type="text" name="username"/><br/><br/>
   密 码:<input type="password" name="password"/><br/>
   地 址:<input type="text" name="userdetail.address"/><br/>
   电 话:<input type="text" name="userdetail.phone"/><br/>
   姓 名:<input type="text" name="userdetail.realname"/><br/>
   年 龄:<input type="text" name="userdetail.age"/><br/>
    <input type="submit" value="提交注册"/>


</form>

</body>

</html>
        
            
                
                    
                        
                            
                                
                                    
                                        
                                            
                                                
                                                    
                                                        
                                                            