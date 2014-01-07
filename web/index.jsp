<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%--
  Created by IntelliJ IDEA.
  User: zhongl
  Date: 14-1-2
  Time: 下午2:37
  To change this template use File | Settings | File Templates.
--%>
<%  String path = request.getContextPath();
    String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";%>

<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
  <head>
    
    <title>My JSP 'MyJsp.jsp' starting page</title>
    <base href="<%=basePath%>">
<!--
    <link rel="stylesheet" type="text/css" href="styles.css">-->
      <script type="text/javascript" >
          var num=2.446257;
          alert(num.toFixed(5));
          var person = {name :'Saad', age : 26, department : {ID : 15, name : "RD"} };
          var stringFromPerson = JSON.stringify(person);
          alert(stringFromPerson);
          /* stringFromPerson is equal to "{"name":"Saad","age":26,"department":{"ID":15,"name":"RD"}}"*/
          var personFromString = JSON.parse(stringFromPerson);
          /* personFromString is equal to person object  */
          alert(personFromString);
//          setInterval(function(){
//              alert("aa");
//          },1000);

      </script>
  </head>
  <body>
    welcome!登录 <br>
  <form action="/user/login.action" method="post">
      用户名:<input type="text" name="username"/><br/>
      密码:<input type="password" name="password"/><br/>
      <input type="submit" value="提交"/>&nbsp;<a href="/user/insert.action">马上注册</a>
  </form>
  ${result}


  </body>
  
</html>
        
            
                
                    
                        
                            
                                
                                    
                                        
                                            
                                                
                                                    
                                                        
                                                            