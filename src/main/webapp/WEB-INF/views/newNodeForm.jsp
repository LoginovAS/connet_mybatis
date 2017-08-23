<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<%@ page session="false" %>
<!DOCTYPE html>
<html>
    <head>
        <title>Создать Хост</title>
        <meta charset="UTF-8">
    </head>
    <body>
    <c:url var="addAction" value="/node/add"></c:url>
    <form:form var="${addAction}" commandName="node" method="POST">
    <table>
        <tr>
            <td>
                <form:label path="nodeName">
                    <spring:message text="Node name:"/>
                </form:label>
            </td>
            <td>
                <form:input path="nodeName" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="region">
                    <spring:message text="Region:"/>
                </form:label>
            </td>
            <td>
                <form:input path="region" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="street">
                    <spring:message text="Street:"/>
                </form:label>
            </td>
            <td>
                <form:input path="street" />
            </td>
        </tr>
        <tr>
            <td>
                <form:label path="building">
                    <spring:message text="Building: "/>
                </form:label>
            </td>
            <td>
                <form:input path="building" />
            </td>
        </tr>
        <tr>
            <td colspan="2">
                <input type="submit" value="<spring:message text='Create' />" />
            </td>
        </tr>
    </table>
    </form:form>
    </body>
<html>