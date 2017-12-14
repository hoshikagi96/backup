document.write("<p>問5</p>");

for(var h=1; h<=3; h++){
    for(var i=1; i<=4; i++)
        document.write("★");
    document.write("<br>");
}

document.write("<p>問6</p>");

var j=1;
while(j<=3){
    document.write("★☆★");
    j++;
    document.write("<br>");
}

document.write("<p>問7</p>");

for(var k=1; k<=5; k++){
    for(var l=3; l<=7; l++){
        if(l%2==1){
            document.write("★");
        }else{
            document.write("☆");
        }
    }
    document.write("<br>");
}

document.write("<p>問8</p>");

for(var m=1; m<=5; m++){
    for(var n=1; n<=m; n++){
        document.write("★");
    }
    document.write("<br>");
}
