<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
	<script src='https://cdn.jsdelivr.net/npm/fullcalendar@6.1.8/index.global.min.js'></script>
	<script>

		document.addEventListener('DOMContentLoaded', function() {
			var calendarEl = document.getElementById('calendar');
			var calendar = new FullCalendar.Calendar(calendarEl, {
				initialView: 'dayGridMonth',
				titleFormat: function (date) {
					// YYYY년 MM월
					return `${date.date.year}년 ${date.date.month + 1}월`;
				},
			});
			calendar.render();
		});

	</script>
</head>
<body>
<div id='calendar'></div>
</body>
</html>