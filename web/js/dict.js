
$(document).ready(function(){
    $('#loadingDiv').hide();
    
    $("#search").click(function(){
         $('#loadingDiv').show();
        event.preventDefault();
       $.ajax({
            type: "POST",
            url: 'Api',
            dataType: 'json',
            success: function(resp) {
                console.log(resp);
                $("#result").html(""); 
                var result="";
                if(resp.length=== 0){
                    $("#result").html("<section>No matching word found :(</section>");
                    $('#loadingDiv').fadeOut();
                }else{
                
                 $.each(resp, function(key,value) { 
                     $('#loadingDiv').fadeOut();
                        if(value['wordtype']===""){
                            result = result+ '<section><span class="word">'+value['word']+' </span> : <span class="desc">'+value['definition']+'</span></section>';
                        }
                        else
                             result = result+ '<section><span class="word">'+value['word']+' </span><span class="grammer"> ['+value['wordtype']+' ]</span> : <span class="desc">'+value['definition']+'</span></section>';
                });
                $("#result").html(result);
            }
        }
        });
    });
});

            