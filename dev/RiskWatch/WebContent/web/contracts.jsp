<!DOCTYPE html>
<html lang="en">
<%@include  file="head.html" %>
<body role="document">
	<%@include  file="navigation.html" %>
	<div class="container theme-showcase" role="main">
		<div id="message"></div>
		<div class="row col-md-12">
			<h2>Contract summary for <script>document.write($.cookie("productCode"))</script></h2>
		</div>
		
		<div class="row">
			<form onsubmit="$.cookie('productCode', $('#productSearch').val())" action="/RiskWatch/web/contracts.jsp" role="search" class="navbar-form navbar-left">
				<div class="form-group">
					<input id="productSearch" type="text" placeholder="Contract Search" autocomplete="off" class="form-control" data-provide="typeahead">
				</div>
			</form>
		</div>
		
		<div class="row col-md-12">
			<h3>Overview</h3>
		</div>
		<div class="row">
			<div class="col-sm-6">
				<table class="table table-striped">
					<tr><th>Long Book</th><td style="text-align: right;"id="longPos"></td></tr>
					<tr><th>Short Book</th><td style="text-align: right;" id="shortPos"></td></tr>
					<tr><th>Net Book</th><td style="text-align: right;" id="netPos"></td></tr>
				</table>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
				<div id="products">
				</div>
			</div>
		</div>
		
	</div>
	
	<script>
		// Search for products
		$('#productSearch').typeahead({
			source: function (query, process) {
				return $.get('/RiskWatch/ProductSearch?search=' + $('#productSearch').val(), { query: query }, function (data) {
					var products = [];
					for (i = 0; i < data.product.length; i++) {
						products[i] = data.product[i].productName + ' (' + data.product[i].productCode + ')';
					}
					return process(products);
				});
			},
			updater: function (item) {
				var n = item.indexOf('(');
				if (n) item = item.substring(n + 1, item.length - 1);
				return item;
			}
		});
		
		productCode = $.cookie('productCode');
		
		if ( productCode ) {
			$("#products").datatable({
				perPage: 5,
				title: '',
				url: '/RiskWatch/AccountPositions',
				showPagination: false,
				showFilter: false,
				post: {productCode: $.cookie('productCode')},
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
			
			$.ajax({
				url: "/RiskWatch/AccountPositions",
				data: { productCode: $.cookie('productCode'), aggregateLongShort: "true" }
			}).done(function(msg) {
				console.log(msg);
				if (msg.longShortPosition && msg.longShortPosition[0]) {
					pos = msg.longShortPosition[0];
					$( "#longPos" ).html( formatNumber( pos.longQty ) );
					$( "#shortPos" ).html( formatNumber( pos.shortQty ) );
					$( "#netPos" ).html( formatNumber( pos.longQty + pos.shortQty ) );
				}
			});
		}
	</script>
</body>
</html>