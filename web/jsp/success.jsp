<%@ page language="java" import="java.util.*" pageEncoding="UTF-8" %>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%--
  Created by IntelliJ IDEA.
  User: zhongl
  Date: 14-1-2
  Time: 下午11:12
  To change this template use File | Settings | File Templates.
--%>
<% String path = request.getContextPath();
    String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort() + path + "/";%>


<html>
<head>

    <title>My JSP 'MyJsp.jsp' starting page</title>
    <base href="<%=basePath%>">
    <!--
        <link rel="stylesheet" type="text/css" href="styles.css">-->
</head>
<body>
welcome! ${result}<br>
</body>

</html>
        
            
                
                    
                        
                            
                                
                                    
                                        
                                            
                                                
                                                    
                                                        
                                                            