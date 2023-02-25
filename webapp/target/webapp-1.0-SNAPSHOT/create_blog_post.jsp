<%@ page import="java.io.OutputStream" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@page import="com.example.webapp.retrieveBlogPost_dao"%>
<%

  String sid = request.getParameter("id");
  int id = Integer.parseInt(sid);
  byte[] byteArray = retrieveBlogPost_dao.getPhoto(id);
  response.setContentType("image/gif");
  OutputStream os = response.getOutputStream();
  os.write(byteArray);
  os.flush();
  os.close();

%>
