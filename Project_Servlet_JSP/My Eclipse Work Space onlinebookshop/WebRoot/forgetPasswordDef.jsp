<%@taglib prefix="jlc"  uri="http://jlcindia.com/tags"%>

<html>
<head>
<title>JlC Online Book Shop</title>
</head>

<body bgcolor="lightyellow">
<jlc:validateSession />
<jlc:removeSearchInfoFromSessionTag />

<table width="90%" align="center" height="97%">
<tr height="5px" valign="top">
<td align="center">
<jsp:include page="WEB-INF/pages/header.jsp"/>
</td></tr>
<tr valign="top">
<td align="center">
<jsp:include page="WEB-INF/pages/forgetPassword.jsp"/>
</td>
</tr>
<tr height="2px" valign="bottom">
<td align="center">
<jsp:include page="WEB-INF/pages/footer.html" />
</td></tr></table></body></html>



















