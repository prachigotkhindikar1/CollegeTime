<%@page import="com.sun.xml.internal.bind.v2.runtime.Location"%>
<%@ page import="java.io.*"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>University Recommendation</title>
</head>
<body>
<%
HttpSession sess = request.getSession(false);
String locInJsp = sess.getAttribute("location").toString();

String fName = "/home/rashmi/workspace_CollegeTime/FinalCollegeTime/src/codes/"+locInJsp+".csv";
String thisLine;
int count=0;
FileInputStream fis = new FileInputStream(fName);
DataInputStream myInput = new DataInputStream(fis);
int i=0;
%>
<table cellpadding="15"cellspacing="5">
<tr>
    <th>University</th>
    <th>Location</th>
    <th>Expenses</th>
    <th>SAT Verbal</th>
    <th>SAT Math</th>
     </tr>
 </table>   
<table cellpadding="15"cellspacing="5">
<tr>
<%
while ((thisLine = myInput.readLine()) != null)
{
String strar[] = thisLine.split(",");

for(int j=0;j<strar.length;j++)
{
if(i!=0)
{
out.print(" " +strar[j]+ " ");
}
else
{
out.print(" <b>" +strar[j]+ "</b> ");
}
}
out.println("<br>");
//i++;
} 
%>
</tr>
</table>

</body>
</html>