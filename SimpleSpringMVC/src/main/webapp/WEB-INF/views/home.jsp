

<%@ taglib uri="http://tiles.apache.org/tags-tiles" prefix="tiles" %>
 
<tiles:insertDefinition name="defaultTemplate">
    <tiles:putAttribute name="body">
 
 
 
        <div class="body">
            <h1>Home page !</h1>
 
            <p>The time on the server is ${serverTime}.</p>
            <p><a href="welcome.htm">Click here to See Welcome Message... </a></P>
        </div>
 
 
 
    </tiles:putAttribute>
</tiles:insertDefinition>
