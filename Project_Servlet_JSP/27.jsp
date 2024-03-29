<%@taglib prefix="jlc"  uri="http://jlcindia.com/tags"%>
<%@taglib prefix="core" uri="http://java.sun.com/jsp/jstl/core"%>

<html>
<head>
<title>JlC Online Book Shop</title>
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/css/indexstyle.css">
</head>
<body bgcolor="lightgray">
<jlc:validateSession />

<core:if test="${SELECTED_BOOK_LIST eq null}">
<jsp:forward page="searchBoodDef.jsp" />
</core:if>

<%
session.removeAttribute("TOTAL_BOOK_AMOUNT");
session.removeAttribute("TOTAL_BOOK_QUANTITY");
%>

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
<jsp:include page="WEB-INF/pages/showCart.jsp"/>
</td>
</tr>
<tr height="2px" valign="bottom">
<td align="center">
<jsp:include page="WEB-INF/pages/footer.html" />
</td></tr></table></body></html>




















