<%--
  Created by IntelliJ IDEA.
  User: gz
  Date: 13-11-2
  Time: 上午8:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page import="org.apache.struts2.ServletActionContext" %>
<%-- Created by IntelliJ IDEA. --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
    <style type="text/css">
        body  {
            margin:0;
            padding:0;
            background-color:#FFFFFF;
        }
    </style>
</head>
<body>
<table align="center" cellpadding="0" cellspacing="0" border="0" width="1200" height="550">
    <tr height="108">
        <td width="1200">
            <table ellpadding="0" cellspacing="0"  width="100%" height="108">
            <tr>
                <td bgcolor="#2882DA">
                </td>
            </tr>
        </table>
        </td>
    </tr>
    <tr height="17">
        <td background="images/tg2.jpg"></td>
    </tr>
    <tr><!-- 中间部分 -->
        <td>
            <table cellpadding="0" cellspacing="0"   width="100%" height="330">
                <tr>
                    <td>
                        <iframe name="iframe1" frameborder="0" scrolling="no" style="width:200px; height:320px; " src="left.jsp"></iframe>
                        <iframe name="iframe2" style="width:980px; height:320px; " src="right.jsp"></iframe>
                    </td>
                </tr>
            </table>
        </td>
    </tr>
    <tr height="17">
        <td background="images/tg2.jpg"></td>
    </tr>
    <tr height="70">
        <td align="center" bgcolor="#2882DA">
            <font size="-1" color="#BBBBCE">
                Copyright&copy;2005-2012<br />西安科技大学高新学院<br/>京ICP证080047号
            </font>
        </td>
    </tr>
</table>
</body>
</html>