<!DOCTYPE html>
<html lang="en">
<%@include  file="head.html" %>
<body role="document">
	<%@include  file="navigation.html" %>
	<div class="container theme-showcase" role="main">
		<div id="message"></div>
		<div class="row col-md-12">
			<h2>Summary for <script>document.write($.cookie("accountCode"))</script></h2>
		</div>
		
		<div class="row">
			<div class="col-sm-4">
				<h4>Organisation</h4>
				<span id="organisation" />
			</div>
			<div class="col-sm-4">
				<h4>Account Group</h4>
				<span id="acctGroup" />
			</div>
		</div>
		
		<div class="row">
			<div class="col-sm-4">
				<h4>Account Name</h4>
				<span id="acctName" />
			</div>
			<div class="col-sm-4">
				<h4>Email</h4>
				<span id="acctEmail" />
			</div>
			<div class="col-sm-4">
				<h4>Mobile</h4>
				<span id="acctMobile" />
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
				<h2>Portfolio (<span id="acctCcy"></span>)</h2>
			</div>
			<div class="col-sm-6">
				<table class="table table-striped">
					<tr><th>GLV</th><td style="text-align: right;"id="glv"></td><td></td></tr>
					<tr><th>Initial Margin</th><td style="text-align: right;" id="margin"></td><td></td></tr>
					<tr><th>Free Equity</th><td style="text-align: right;" id="freeEquity"></td><td><span id="callBadge" class="badge">Call</span></td></tr>
					<tr><th>FE/GLV %</th><td style="text-align: right;" id="feToGlv"></td><td><span id="lowFeBadge" class="badge">Low FE</span></td></tr>
					<tr><th>Uncleared Funds</th><td style="text-align: right;" id="uncleared"></td><td></td></tr>
				</table>
			</div>
			<div class="col-sm-6">
				<p id="emailMargin"><button type="button" onclick="sendMail('Email', 'Margin Call', $.cookie('accountCode'))" class="btn btn-warning">Email Margin Call / Low F.E.</button></p>
				<p id="smsMargin"><button type="button" onclick="sendMail('SMS', 'Margin Call', $.cookie('accountCode'))" class="btn btn-warning">SMS Margin Call / Low F.E.</button></p>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
				<div id="positions">
				</div>
				<button type="button" onclick="sendMail('Email', 'Positions', $.cookie('accountCode'))" class="btn btn-primary">Email Positions</button>
				<button type="button" onclick="sendMail('SMS', 'Positions', $.cookie('accountCode'))" class="btn btn-primary">SMS Positions</button>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
				<div id="cashTrans">
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
				<div id="cashPos">
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-md-12">
				<div id="notes">
				</div>
				<button type="button" onclick="$('#addNote').modal('show')" class="btn btn-primary">Add note</button>
			</div>
		</div>
		
		<div id="addNote" class="modal fade">
			<div class="modal-dialog">
				<div class="modal-content">
					<div class="modal-header">
						<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
						<h4 class="modal-title">Add a note</h4>
					</div>
					<div class="modal-body">
						<p>Please enter the note:</p>
						<textarea class="form-control" id="noteText" cols="68" rows="5" ></textarea>
						<p class="text-warning"><small>If you don't save, your changes will be lost.</small></p>
					</div>
					<div class="modal-footer">
						<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
						<button type="button" class="btn btn-primary" data-dismiss="modal" onclick="addNote($.cookie('accountCode'), $('#noteText').val())">Save</button>
					</div>
				</div>
			</div>
		</div>
		
	</div>
	
	<script>
		accountCode = $.cookie('accountCode');
		
		if ( accountCode ) {
			$("#positions").datatable({
				perPage: 5,
				title: 'Positions',
				url: '/RiskWatch/AccountPositions',
				showPagination: false,
				showFilter: false,
				post: {accountCode: $.cookie('accountCode')},
				columns: [
					{
						title: "Account Code",
						field: "accountCode",
						callback: function ( data, cell ) {
							return formatAccount(data[cell.field]);
						},
						sortable: true,
						filter: true,
						hidden: true
					},
					{
						title: "Account Name",
						field: "accountName",
						sortable: true,
						filter: true,
						hidden: true
					},
					{
						title: "Instrument",
						field: "instrument",
						callback: function ( data, cell ) {
							return formatProdTrades(data[cell.field]);
						},
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
						callback: function ( data, cell ) {
							return formatCash(data[cell.field]);
						},
						sortable: true,
						filter: true
					},
					{
						title: "Average Price",
						field: "avgPrice",
						css: { textAlign: 'right' },
						sortable: true
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
					}
				]
			});

			$("#acashTrans").datatable({
				perPage: 5,
				title: 'Cash Transactions',
				url: '/RiskWatch/AccountCashTransactions',
				showPagination: false,
				showFilter: false,
				post: {accountCode: $.cookie('accountCode')},
				columns: [
					{
						title: "Timestamp",
						field: "timestamp",
						callback: function ( data, cell ) {
							return formatDate(data[cell.field]);
						},
						sortable: true,
						filter: true
					},
					{
						title: "Account Code",
						field: "accountCode",
						callback: function ( data, cell ) {
							return formatAccount(data[cell.field]);
						},
						sortable: true,
						filter: true,
						hidden: true
					},
					{
						title: "Account Name",
						field: "accountName",
						sortable: true,
						filter: true,
						hidden: true
					},
					{
						title: "Txn Type",
						field: "type",
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
						sortable: true,
						filter: true
					},
					{
						title: "Ccy",
						field: "ccy",
						callback: function ( data, cell ) {
							return formatCash(data[cell.field]);
						},
						sortable: true,
						filter: true
					},
					{
						title: "Description",
						field: "description",
						sortable: true,
						filter: true
					}
				]
			});

			$("#cashPos").datatable({
				perPage: 5,
				title: 'Currency Ledger',
				url: '/RiskWatch/AccountCashLedger',
				showPagination: false,
				showFilter: false,
				post: {accountCode: $.cookie('accountCode')},
				columns: [
					{
						title: "Account Code",
						field: "accountCode",
						hidden: true,
						callback: function ( data, cell ) {
							return formatAccount(data[cell.field]);
						}
					},
					{
						title: "Account Name",
						field: "accountName",
						hidden: true
					},
					{
						title: "Ccy",
						field: "ccy",
						callback: function ( data, cell ) {
							return formatCash(data[cell.field]);
						}
					},
					{
						title: "Cash",
						field: "cash",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						}
					},
					{
						title: "Unrealised P/L",
						field: "unrealisedPL",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						}
					},
					{
						title: "Total Equity",
						field: "totalEquity",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						}
					},
					{
						title: "Initial Margin",
						field: "initialMargin",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						}
					},
					{
						title: "Free Equity",
						field: "freeEquity",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						}
					},
					{
						title: "Exch Rate",
						field: "exchRate",
						css: { textAlign: 'right' }
					},
					{
						title: "Cash (Base)",
						field: "cashBase",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						},
						hidden: true
					},
					{
						title: "Unrealised P/L (Base)",
						field: "unrealisedPLBase",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						},
						hidden: true
					},
					{
						title: "Total Equity (Base)",
						field: "totalEquityBase",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						},
						hidden: true
					},
					{
						title: "Initial Margin (Base)",
						field: "initialMarginBase",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						},
						hidden: true
					},
					{
						title: "Free Equity (Base)",
						field: "freeEquityBase",
						css: { textAlign: 'right' },
						callback: function ( data, cell ) {
							return formatNumber(data[cell.field]);
						},
						hidden: true
					}
				]
			});
			
			$("#notes").datatable({
				perPage: 5,
				title: 'Notes',
				url: '/RiskWatch/AccountNotes',
				showPagination: false,
				showFilter: false,
				post: {accountCode: $.cookie('accountCode')},
				columns: [
					{
						title: "Timestamp",
						field: "timestamp",
						callback: function ( data, cell ) {
							return formatDate(data[cell.field]);
						},
						sortable: true,
						filter: true
					},
					{
						title: "Dealer",
						field: "dealer",
					},
					{
						title: "Note",
						field: "accountNote"
					}
				]
			});
			
			// Tidy up the UI.
			$( "#callBadge" ).hide();
			$( "#lowFeBadge" ).hide();
			$( "#emailMargin" ).hide();
			$( "#smsMargin" ).hide();
			
			$.ajax({
				url: "/RiskWatch/AccountDetails",
				data: { accountCode: $.cookie('accountCode') }
			}).done(function(msg) {
				console.log(msg);
				if (msg.account && msg.account[0]) {
					account = msg.account[0];
					$( "#acctCcy" ).text( account.accountCcy );
					$( "#acctName" ).text( account.accountName );
					$( "#acctEmail" ).html( formatEmail( account.email ) );
					$( "#acctMobile" ).html( formatPhone( account.phone ) );
					$( "#organisation" ).html( formatOrg( account.org ) );
					$( "#acctGroup" ).html( formatAcctGroup( account.org, account.accountGroup ) );
					$( "#glv" ).html( formatNumber( account.totalEquity ) );
					$( "#margin" ).html( formatNumber( account.initalMargin ) );
					$( "#freeEquity" ).html( formatNumber( account.freeEquity ) );
					feToGlv = (account.totalEquity ? (account.freeEquity / account.totalEquity) * 100 : 0);
					$( "#feToGlv" ).html( formatNumber( feToGlv ) );
					$( "#uncleared" ).html( formatNumber( 0 ) );
					
					// Display things relating to funding.
					if (account.freeEquity < 0) $( "#callBadge" ).show();
					else $( "#callBadge" ).hide();
					if (feToGlv < 5) $( "#lowFeBadge" ).show();
					else $( "#lowFeBadge" ).hide();
					if (account.freeEquity < 0 || feToGlv < 5) {
						$( "#emailMargin" ).show();
						$( "#smsMargin" ).show();
					}
					else {
						$( "#emailMargin" ).hide();
						$( "#smsMargin" ).hide();
					}
				}
			});
		}
		else {
			feedback('info', 'Select Account.', 'Please search for an account.');
		}
	</script>
</body>
</html>