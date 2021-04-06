<%@page import="model.aBean"%>


<%
aBean bean = (aBean) request.getAttribute("bean");
out.print("You wanted , " + bean.getmName());

out.print("<p> this is what you got</p>");

out.print("<ul>");


for (int i = 0; i < bean.getQueryName().size(); i++) {
	out.print("<li>");
	out.print(bean.getQueryName().get(i));
	out.print(", ");
	out.print(bean.getQueryPhone().get(i));
	out.print("</li>");
}





out.print("</ul>");
%>