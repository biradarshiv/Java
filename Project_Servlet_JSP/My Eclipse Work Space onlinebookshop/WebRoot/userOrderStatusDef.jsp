<%@taglib prefix="jlc"  uri="http://jlcindia.com/tags"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>JlC Online Book Shop</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/indexstyle.css">
</head>
<body bgcolor="lightgray">
<jlc:validateSession />
<jlc:removeSearchInfoFromSessionTag />

<core:if test="${USER_TO.role ne 'User'}">
<jsp:forward page="userHomeDef.jsp" />
</core:if>
<table width="90%" align="center" height="97%">
<tr height="5px" valign="top">
<td align="center">
<jsp:include page="WEB-INF/pages/header.jsp"/>
</td></tr>
<tr valign="top" bgcolor="maroon" height="3px">
<td align="center">
<jsp:include page="WEB-INF/pages/userMenu.jsp"/>
</td>
</tr>
<tr valign="top">
<td align="center">
<jsp:include page="WEB-INF/pages/userOrderStatus.jsp"/>
</td>
</tr>
<tr height="2px" valign="bottom">
<td align="center">
<jsp:include page="WEB-INF/pages/footer.html" />
</td></tr></table></body></html>




















