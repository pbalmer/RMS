<!DOCTYPE html>
<html lang="en">
<%@include  file="head.html" %>
<body role="document">
	<%@include  file="navigation.html" %>
	<div class="container theme-showcase" role="main">
		<div id="message"></div>
		<div class="row col-md-12">
			<h2>System Audit</h2>
		</div>
		
		<!-- form onsubmit="$.cookie('concentrationLevel', $('#concentrationLevel').val()); $.cookie('minSize', $('#minSize').val());" action="/RiskWatch/web/concentration.jsp" role="search" class="navbar-form navbar-left">
			<div class="row">
				<div class="col-md-3">
					Displaying values above (%)
				</div>
				<div class="col-md-3">
					<input id="concentrationLevel" type="text" placeholder="Level" autocomplete="off" class="form-control">
				</div>
				<div class="col-md-3">
					Displaying values above (USD)
				</div>
				<div class="col-md-3">
					<input id="minSize" type="text" placeholder="Min value" text="" autocomplete="off" class="form-control">
				</div>
				<div class="col-md-3">
					<input id="update" type="submit" class="btn btn-primary">
				</div>
			</div>
		</form-->
		
		<div class="row">
			<div class="col-md-12">
				<div id="audit">
				</div>
			</div>
		</div>
		
	</div>
	
	<script>
		$("#audit").datatable({
			perPage: 5,
			title: '',
			url: '/RiskWatch/AuditSearch',
			showPagination: false,
			showFilter: false,
			post: {concentration: "true", concentrationLevel: $.cookie('concentrationLevel'), minSize: $.cookie('minSize')},
			columns: [
				{
					title: "Username",
					field: "username",
					sortable: true,
					filter: true
				},
				{
					title: "Object",
					field: "systemObject",
					sortable: true,
					filter: true
				},
				{
					title: "Event Type",
					field: "eventType",
					sortable: true,
					filter: true
				},
				{
					title: "Comment",
					field: "comment",
					sortable: true
				},
				{
					title: "Timestamp",
					field: "timestamp",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatDate(data[cell.field]);
					},
					sortable: true,
					filter: true
				}
			]
		});

	</script>
</body>
</html>