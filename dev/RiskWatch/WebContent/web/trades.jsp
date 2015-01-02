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
            <div id="trades">
            </div>
        </div>
    </div>
    	
	</div>
	<script>
		$("#trades").datatable({
			perPage: 5,
			title: 'Trades',
			url: '/RiskWatch/AccountTrades',
			showPagination: true,
			showFilter: true,
			filterModal: $("#myModal"),
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
					filter: true
		        },
				{
					title: "Account Name",
					field: "accountName",
					sortable: true,
					filter: true
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
					sortable: true,
					filter: true
				},
				{
					title: "Price",
					field: "price",
					css: { textAlign: 'right' },
					sortable: true
		        }
		    ]
		});
	</script>
</body>
</html>