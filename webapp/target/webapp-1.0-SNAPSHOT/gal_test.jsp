<%@page import="com.example.webapp.Utils"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.sql.Blob"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%
        try {
            request.getParameter("id");
            Connection con = Utils.getConnection();
            PreparedStatement ps = con.prepareStatement("select * from thebtsc.gallery");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Blob blob = rs.getBlob("image");
                byte[] byteArray = blob.getBytes(1, (int) blob.length());
                response.setContentType("image/gif");
                OutputStream os = response.getOutputStream();
                os.write(byteArray);
                os.flush();
                os.close();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
        %>
<html>
<head>
    <title>gal_test</title>
</head>
<body>

</body>
</html>
