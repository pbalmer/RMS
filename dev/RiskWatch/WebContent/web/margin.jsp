<!DOCTYPE html>
<html lang="en">
<%@include  file="head.html" %>
<body role="document">
	<%@include  file="navigation.html" %>
    <div class="container theme-showcase" role="main">
    	<div id="message"></div>
    	
    	 <!-- Modal -->
  <div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
    <div class="modal-dialog">
      <div class="modal-content">
        <div class="modal-header">
          <button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
          <h4 class="modal-title">Modal title</h4>
        </div>
        <div class="modal-body">
          ...
        </div>
        <div class="modal-footer">
          <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
          <button type="button" class="btn btn-primary">Save changes</button>
        </div>
      </div><!-- /.modal-content -->
    </div><!-- /.modal-dialog -->
  </div><!-- /.modal -->
		
		<div class="row">
        <div class="col-md-12">
            <div id="table-container_1"></div>
            <div id="table-container_1-filter" class="modal hide">
                <div class="modal-header">
                    <button class="close" data-dismiss="modal">x</button>
                    <h3>Filter Options</h3>
                </div>
                <div class="modal-body">
                    <form method="post">
                        <fieldset>
                            <legend>Legend text</legend>
                            <div class="control-group">
                                <label class="control-label" for="input01">Text input</label>

                                <div class="controls">
                                    <input type="text" class="input-xlarge" id="input01">
                                    <p class="help-block">Supporting help text</p>
                                </div>
                            </div>
                        </fieldset>
                    </form>
                </div>
                <div class="modal-footer">
                    <a href="#" class="btn">Close</a>
                    <a href="#" class="btn btn-primary">Save changes</a>
                </div>
            </div>
        </div>
    </div>

    <div class="row">
        <div class="col-md-12">
            <div id="margin">
            </div>
        </div>
    </div>
    	
	</div>
	<script>
		$("#margin").datatable({
			perPage: 5,
			title: 'Margin Call',
			url: '/RiskWatch/MarginCallReport',
			showPagination: true,
			showFilter: true,
			filterModal: $("#myModal"),
			columns: [
				{
					title: "Account Group",
					field: "accountGroup",
					sortable: true,
					filter: true,
					hidden: true
		        },
		        {
					title: "Account Code",
					field: "accountCode",
					callback: function ( data, cell ) {
						return formatAccount(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Account Name",
					field: "accountName",
					sortable: true,
					filter: true
		        },
				{
					title: "Ccy",
					field: "ccy",
					sortable: true,
					filter: true
		        },
				{
					title: "GLV",
					field: "totalEquity",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Margin",
					field: "initialMargin",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Free Equity",
					field: "freeEquity",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Gross Exposure",
					field: "value",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Margin Call %",
					field: "marginCall",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Low FE",
					field: "lowFE",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatNumber(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Last Email",
					field: "lastEmail",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatDate(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Last SMS",
					field: "lastSMS",
					css: { textAlign: 'right' },
					callback: function ( data, cell ) {
						return formatDate(data[cell.field]);
					},
					sortable: true,
					filter: true
		        },
				{
					title: "Last Note",
					field: "lastNote",
					sortable: true,
					filter: true
		        },
				{
					title: "Email",
					field: "accountName",
					callback: function (data, cell ) {
						return '<button type="button" onclick="sendMail(\'Email\', \'Low FE\', \'' + data['accountCode'] + '\')" class="btn btn-primary">Email</button>';
					},
					hidable: false
		        },
				{
					title: "SMS",
					field: "accountName",
					callback: function (data, cell ) {
						return '<button type="button" onclick="sendMail(\'SMS\', \'Low FE\', \'' + data['accountCode'] + '\')" class="btn btn-primary">SMS</button>';
					},
					hidable: false
		        }
		    ]
		});
	</script>
</body>
</html>