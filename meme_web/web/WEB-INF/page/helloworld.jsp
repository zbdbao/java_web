<jsp:include page="generic_header.jsp"/>
<html>
<head>
    <jsp:include page="generic_include.jsp"/>
    <script type="text/javascript">
        $(function(){
            $('#selected_input').click(function(e){
                e.preventDefault();
                console.log('selected_input clicked');

                var data = {};
                data.title = "title";
                data.message = "message";

                $.ajax({
                    type: 'POST',
                    data: JSON.stringify(data),
                    contentType: 'application/json',
                    url: 'http://localhost:8080/json/user/1',
                    success: function(data) {
                        console.log('success');
                        console.log(JSON.stringify(data));
                    }
                });

            });
        });
    </script>
</head>
<body>
This is the main page.
<input id="selected_input" type="button">
<jsp:include page="generic_footer.jsp"/>
</body>
</html>
