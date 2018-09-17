var filter = {
    "content":"/posts/body/",
    "title":"/posts/title/",
    "author":"/posts/author/",
    "date": "/posts/date/",
    "range":"/posts/date/"
};

function hideAndShow() {
    let selected = $("#select").val();
    if (selected == "date" || selected == "range"){
        $("#date").show();
        $("#time").show();
        $("#searchInput").hide();
        if(selected == "range") {
            $("#date-2").show();
            $("#time-2").show();
        }else{
            $("#date-2").hide();
            $("#time-2").hide();
        }
    }else {
        $("#date").hide();
        $("#time").hide();
        $("#date-2").hide();
        $("#time-2").hide();
        $("#searchInput").show();
    }
}

function validateInput() {
    let parameter = $("#searchInput").val();
    if(parameter == ""){
        return false;
    }else{
        return true;
    }
}

function validateDate() {
    let fromdate = $("#date").val();
    let fromtime = $("#time").val();
    let from = fromdate+" "+fromtime+":00";
    let to = fromdate+" "+fromtime+":59";
    if( fromdate == "" || fromtime == ""){
        return false;
    }else if(Date.parse(from) > Date.parse(to)){
        return false;
    }return true;
}

function validateRange() {
    let fromdate = $("#date").val();
    let todate = $("#date-2").val();
    let fromtime = $("#time").val();
    let totime = $("#time-2").val();
    let from = fromdate+" "+fromtime+":00";
    let to = todate+" "+totime+":00";
    console.log(from);
    console.log(to);
    if( fromdate == "" || todate == "" || fromtime == "" || totime == ""){
        return false;
    }else if(Date.parse(from) > Date.parse(to)){
        return false;
    }return true;
}

$(document).ready(function () {
        hideAndShow();
        $("#searchForm").submit(function (event) {
            var selected = $("#select").val();
            var path = filter[selected];
            var parameter = $("#searchInput").val();
            if( selected == "date" && validateDate() ){
                var fromdate = $("#date").val();
                var fromtime = $("#time").val();
                var from = fromdate+" "+fromtime+":00";
                var to = fromdate+" "+fromtime+":59";
                window.location.href = path + from+"/"+to;
                return false;

            }else if(selected == "range" && validateRange()){
                var fromdate = $("#date").val();
                var todate = $("#date-2").val();
                var fromtime = $("#time").val();
                var totime = $("#time-2").val();
                var from = fromdate+" "+fromtime+":00";
                var to = todate+" "+totime+":00";
                window.location.href = path + from+"/"+to;
                return false;
            }else if(validateInput()){
                console.log(selected);
                console.log(path);
                window.location.href = path + parameter;
                return false;
            }else{
                return false;
            }
        });

    $("#select").on('change', function (e) {
        hideAndShow();
    });


});