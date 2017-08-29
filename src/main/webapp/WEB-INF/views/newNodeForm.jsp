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
    <form:form action="${addAction}" commandName="node" method="POST">
    <table>
        <c:if test="${!empty node.nodeName}">
        <tr>
            <td>
                <form:label path="nodeId">
                    <spring:message text="ID"/>
                </form:label>
            </td>
            <td>
                <form:input path="nodeId" readonly="true" size="8"  disabled="true" />
                <form:hidden path="nodeId" />
            </td>
        </tr>
        </c:if>
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
                <c:if test="${empty node.nodeName}">
                    <input type="submit" value="<spring:message text='Create' />" />
                </c:if>
                <c:if test="${!empty node.nodeName}">
                    <input type="submit" value="<spring:message text='Update' />" />
                </c:if>
            </td>
        </tr>
    </table>
    </form:form>
    </body>
<html>