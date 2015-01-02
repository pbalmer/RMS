<!DOCTYPE html>
<html lang="en">
<%@include  file="head.html" %>
<body role="document">
	<%@include  file="navigation.html" %>
	<div class="container theme-showcase" role="main">
		<div id="message"></div>
		<div class="row col-md-12">
			<h2>Concentration Risk</h2>
		</div>
		
		<form onsubmit="$.cookie('concentrationLevel', $('#concentrationLevel').val()); $.cookie('minSize', $('#minSize').val());" action="/RiskWatch/web/concentration.jsp" role="search" class="navbar-form navbar-left">
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
		</form>
		
		<div class="row">
			<div class="col-md-12">
				<div id="concentration">
				</div>
			</div>
		</div>
		
	</div>
	
	<script>
		$("#concentration").datatable({
			perPage: 5,
			title: '',
			url: '/RiskWatch/AccountPositions',
			showPagination: false,
			showFilter: false,
			post: {concentration: "true", concentrationLevel: $.cookie('concentrationLevel'), minSize: $.cookie('minSize')},
			columns: [
				{
					title: "Account Code",
					field: "accountCode",
					callback: function ( data, cell ) {
						return formatAccount(data[cell.field]);
					},
					sortable: true,
					filter: true,
					hidden: false
				},
				{
					title: "Account Name",
					field: "accountName",
					sortable: true,
					filter: true,
					hidden: false
				},
				{
					title: "Instrument",
					field: "instrument",
					sortable: true,
					filter: true
				},
				{
					title: "Amount",
					field: "qty",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Ccy",
					field: "ccy",
					sortable: true,
					filter: true
				},
				{
					title: "Average Price",
					field: "avgPrice",
					css: { textAlign: 'right' },
					sortable: true,
					hidden: true
				},
				{
					title: "Exposure",
					field: "value",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Exposure (Base)",
					field: "valueBase",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					hidden: true
				},
				{
					title: "IM",
					field: "im",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Unrealised P/L",
					field: "unrealisedPL",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Unrealised P/L (Base)",
					field: "unrealisedPLBase",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					hidden: true
				},
				{
					title: "FE/GLV %",
					field: "lowFE",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Free Equity",
					field: "freeEquity",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Email",
					field: "email",
					css: { textAlign: 'left' },
					callback: function ( data, cell ) {
						return formatEmail(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Phone",
					field: "phone",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatPhone(data[cell.field]);
					},
					sortable: true
				}
			]
		});

		$('#concentrationLevel').val($.cookie('concentrationLevel'));
		$('#minSize').val($.cookie('minSize'));
	</script>
</body>
</html>