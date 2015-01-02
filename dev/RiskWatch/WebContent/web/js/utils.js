function checkSession(validSession) {
	$.getJSON( "/RiskWatch/ValidateSession" ).done(function( data ) {
		
		if ( data.session != validSession ) {
			if ( !validSession ) {
				window.location.replace("/RiskWatch/web/home.jsp");
			}
			else {
				window.location.replace("/RiskWatch/index.jsp");
			}
		}
	} );
}

function replaceText(id, text) {
	$( "<span id='" + id + "'>" + text + "</span>" ).replaceAll( "#" + id );
}

function feedback(alertType, heading, message) {
	$("#message").empty().append('<div class="alert alert-' + alertType + ' alert-dismissible fade in" role="alert"><button type="button" class="close" data-dismiss="alert" aria-label="Close"><span aria-hidden="true">×</span></button><strong>' + heading + '</strong> ' + message + '</div>');
}

function login(org, user, pass) {
	$.getJSON( "/RiskWatch/Login", { username : user, password: pass } ).done(function( data ) {
		
		if ( data.locked ) {
			// This account is locked.
			feedback("danger", "Account Locked", "Your account is locked, please call the dealing desk for more information.");
		}
		else if (data.passwordExpired ) {
			// This account's password has expired - force to change.
			feedback("danger", "Password Expired", "Your password has expired, please call the dealing desk.");
		}
		else if (data.auth ) {
			window.location.replace("/RiskWatch/web/home.jsp");
		}
	} );
}

function logout() {
	$.getJSON( "/RiskWatch/Logout" ).done(function( data ) {
		
		if ( data.session == false ) {
			window.location.replace("/RiskWatch/index.html");
		}
	} );
}

function formatNumber(num, dps) {
	if (num == null) return "n/a";
	dps = dps | 0;
	strNum = num.toFixed(dps);
	while (/(\d+)(\d{3})/.test(strNum.toString())){
		strNum = strNum.toString().replace(/(\d+)(\d{3})/, '$1'+','+'$2');
	}
	strNum = strNum.toString().replace("-", "");
	if (num >= 0) {
		return strNum;
	}
	else {
		strNum = "<span class='negative'>" + "(" + strNum + ")" + "</span>";
		return strNum;
	}
}

function formatYesNo(yn) {
	return (yn ? "<span class='negative'>Yes</span>" : "No" );
}

function formatDate(dt) {
	if (dt == "1990-01-01T00:00:00.000Z") return "";
	return new Date(dt).toLocaleDateString();
}

function formatEmail(email) {
	return "<a href=\"mailto:" + email + "\">" + email + "</a>";
}

function formatPhone(phone) {
	return "<a href=\"tel:" + phone + "\">" + phone + "</a>";
}

function formatAccount(acctCode) {
	return "<a href=\"#\" onclick=\"$.cookie('accountCode', '" + acctCode + "'); window.location = '/RiskWatch/web/summary.jsp'; \" >" + acctCode + "</a>";
}

function formatCash(ccy) {
	return "<a href=\"#\" onclick=\"$.cookie('ccy', '" + ccy + "'); window.location = '/RiskWatch/web/cashTrans.jsp'; \" >" + ccy + "</a>";
}

function formatProdTrades(inst) {
	return "<a href=\"#\" onclick=\"$.cookie('inst', '" + inst + "'); window.location = '/RiskWatch/web/trades.jsp'; \" >" + inst + "</a>";
}

function formatOrg(org) {
	return "<a href=\"#\" onclick=\"$.cookie('org', '" + org + "'); $.cookie('acctGroup', null); window.location = '/RiskWatch/web/wlSummary.jsp'; \" >" + org + "</a>";
}

function formatAcctGroup(org, acctGroup) {
	return "<a href=\"#\" onclick=\"$.cookie('org', '" + org + "'); $.cookie('acctGroup', '" + acctGroup + "'); window.location = '/RiskWatch/web/wlSummary.jsp'; \" >" + acctGroup + "</a>";
}

function addNote(acctCode, noteText) {
	$.ajax({
		url: "/RiskWatch/AccountNotes",
		data: { action: "add", accountCode: acctCode, note: noteText }
	}).done(function(msg) {
		console.log(msg);
		feedback('success', 'Note added', 'Your new note has been added.');
	}).fail(function(msg) {
		feedback('danger', 'Oops', 'There was an issue with your request.  Please try again later.');
	});
}

function sendMail(channel, mailType, acctCode) {
	// mailType: Positions / Margin Call / Low FE
	// channel: SMS / Email
	$.ajax({
		url: "/RiskWatch/SendMail",
		data: { accountCode: acctCode, channel: channel, mailType: mailType }
	}).done(function(msg) {
		console.log(msg);
		if (msg.success)
			feedback('success', channel + ' sent', 'Your new ' + mailType + ' ' + channel + ' has been sent.');
		else
			feedback('danger', 'Oops', 'There was an issue with your request.  Please try again later.');
	}).fail(function(msg) {
		feedback('danger', 'Oops', 'There was an issue with your request.  Please try again later.');
	});
}

function post(path, params, method) {
    method = method || "post"; // Set method to post by default if not specified.

    // The rest of this code assumes you are not using a library.
    // It can be made less wordy if you use one.
    var form = document.createElement("form");
    form.setAttribute("method", method);
    form.setAttribute("action", path);

    for(var key in params) {
        if(params.hasOwnProperty(key)) {
            var hiddenField = document.createElement("input");
            hiddenField.setAttribute("type", "hidden");
            hiddenField.setAttribute("name", key);
            hiddenField.setAttribute("value", params[key]);

            form.appendChild(hiddenField);
         }
    }

    document.body.appendChild(form);
    form.submit();
}

function urlParam(name){
    var results = new RegExp('[\?&amp;]' + name + '=([^&amp;#]*)').exec(window.location.href);
    if (results != null) {
    	return results[1] || 0;
    }
    return null;
}
