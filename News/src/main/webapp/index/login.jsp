<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 13-11-2
  Time: 上午8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <table width="600px" height="700px" align="center">
        <tr height="200px"><td></td></tr>
        <tr>
            <td bgcolor="#000000">
                <table>
                    <tr><td>
                        <s:textfield  name="user.name"></s:textfield>
                    </td></tr>
                    <tr><td>
                       <s:password name="user.password"></s:password>
                    </td></tr>
                    <tr><td>
                        <s:submit></s:submit>
                    </td></tr>
                </table>
            </td>
        </tr>
        <tr height="200px"><td></td></tr>
    </table>
</body>
</html>