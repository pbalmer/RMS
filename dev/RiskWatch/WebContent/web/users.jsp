<!DOCTYPE html>
<html lang="en">
<%@include  file="head.html" %>
<body role="document">
	<%@include  file="navigation.html" %>
	<div class="container theme-showcase" role="main">
		<div id="message"></div>
		
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
			<div id="users">
			</div>
			<button type="button" onclick="eval(getEditData(newUser)); $('#editUser').modal('show')" class="btn btn-primary">Add user</button>
			
		</div>
	</div>
	
	</div>
	
	<div id="editUser" class="modal fade">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal" aria-hidden="true">&times;</button>
					<h4 class="modal-title">Add/Edit User</h4>
				</div>
				<div class="modal-body">
					<p>Please update the fields and save your changes.</p>
					<span class="hidden">
						<div class="col-md-3">
							<p>User ID</p>
						</div>
						<div class="col-md-9">
							<input class="form-control" id="userId" type="text"/>
						</div>
					</span>
					<p class="row">
						<div class="col-md-3">
							<p>Username</p>
						</div>
						<div class="col-md-9">
							<input class="form-control" id="username" type="text"/>
						</div>
					</p>
					<p class="row">
						<div class="col-md-3">
							<p>Password</p>
						</div>
						<div class="col-md-9">
							<input class="form-control" placeholder="Change password" id="password" type="text"/>
						</div>
					</p>
					<p class="row">
						<div class="col-md-3">
							<p>Locked</p>
						</div>
						<div class="col-md-9">
							<div class="btn-group">
								<button id="locked" type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
									<span class="selection">Yes</span> <span class="caret"></span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Yes</a></li>
									<li><a href="#">No</a></li>
								</ul>
							</div>
						</div>
					</p>
					<p class="row">
						<div class="col-md-3">
							<p>Email</p>
						</div>
						<div class="col-md-9">
							<input class="form-control" id="email" type="text"/>
						</div>
					</p>
					<p class="row">
						<div class="col-md-3">
							<p>Organisation</p>
						</div>
						<div class="col-md-9">
							<input class="form-control" id="org" type="text"/>
						</div>
					</p>
					<p class="row">
						<div class="col-md-3">
							<p>Role</p>
						</div>
						<div class="col-md-9">
							<div class="btn-group">
								<button id="role" type="button" class="btn btn-default dropdown-toggle" data-toggle="dropdown">
									<span class="selection">Read Only</span> <span class="caret"></span>
								</button>
								<ul class="dropdown-menu" role="menu">
									<li><a href="#">Admin</a></li>
									<li><a href="#">Dealer</a></li>
									<li><a href="#">Read Only</a></li>
								</ul>
							</div>
						</div>
					</p>
					<p class="row">
						<div class="col-md-3">
							<p>Comment</p>
						</div>
						<div class="col-md-9">
							<textarea class="form-control" id="comment" cols="68" rows="5" ></textarea>
						</div>
					</p>
					<p class="row">
						<div class="col-md-3">
							<p>Expires</p>
						</div>
						<div class="col-md-9">
							<!-- input id="dp1" class="form-control" type="text" value="12-02-2012"-->
							<input id="expires" class="form-control" type="text">
						</div>
					</p>
					<p class="text-warning"><small>If you don't save, your changes will be lost.</small></p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
					<button type="button" class="btn btn-primary">Save</button>
				</div>
			</div>
		</div>
	</div>
	
	<script>
		// Set-up the date picker
		var dp = $('#expires').datepicker({
			format: 'dd-mm-yyyy'
		}).on('changeDate', function(ev) {
			  dp.hide();
		}).data('datepicker');
		
		// Dropdown change the text.
		$(".dropdown-menu li a").click(function(){

			  $(this).parents(".btn-group").find('.selection').text($(this).text());
			  $(this).parents(".btn-group").find('.selection').val($(this).text());

			});
		
		$("#users").datatable({
			perPage: 5,
			title: 'Users',
			url: '/RiskWatch/UserSearch',
			showPagination: true,
			showFilter: true,
			filterModal: $("#myModal"),
			columns: [
				{
					title: "Username",
					field: "username",
					sortable: true
				},
				{
					title: "Email",
					field: "email",
					callback: function ( data, cell ) {
						return formatEmail(data[cell.field]);
					},
					sortable: true
				},
				{
					title: "Organisation",
					field: "org",
					sortable: true
				},
				{
					title: "Role",
					field: "role"
				},
				{
					title: "Locked",
					field: "locked",
					callback: function ( data, cell ) {
						return formatYesNo(data[cell.field]);
					}
				},
				{
					title: "Comment",
					field: "comment"
				},
				{
					title: "Expiry",
					field: "expires",
					callback: function ( data, cell ) {
						return formatDate(data[cell.field]);
					},
					sortable: true,
					filter: true
				},
				{
					title: "Edit",
					field: "userID",
					callback: function (data, cell ) {
						return '<button type="button" onclick="' + getEditData(data) + ' $(\'#editUser\').modal(\'show\')" class="btn btn-primary">Edit</button>';
					},
					hidable: false
				}
			]
		});
		
		newUser = []; 
		newUser['userId'] = 'new'; 
		newUser['username'] = ''; 
		newUser['email'] = ''; 
		newUser['org'] = '${organisation}'; 
		newUser['role'] = 'Read Only'; 
		newUser['locked'] = 'Yes'; 
		newUser['comment'] = ''; 
		newUser['expires'] = new Date();
		
		function getEditData(data) {
			d = new Date(data["expires"]);
			date = d.toLocaleDateString().replace(new RegExp("/", 'g'), "-");
			
			locked = data["locked"] ? "Yes" : "No";
			
			return "$(\'#userId\').val('" + data["userID"] + "'); " +
					"$(\'#username\').val('" + data["username"] + "'); " +
					"$(\'#email\').val('" + data["email"] + "'); " +
					"$(\'#org\').val('" + data["org"] + "'); " +
					"$(\'#role\').parents('.btn-group').find('.selection').text('" + data["role"] + "'); " +
					"$(\'#role\').parents('.btn-group').find('.selection').val('" + data["role"] + "'); " +
					"$(\'#locked\').parents('.btn-group').find('.selection').text('" + locked + "'); " +
					"$(\'#locked\').parents('.btn-group').find('.selection').val('" + locked + "'); " +
					"$(\'#comment\').val('" + data["comment"] + "'); " +
					"$(\'#expires\').val('" + date + "'); ";
		}
	</script>
</body>
</html>