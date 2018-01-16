for(var a=1; a<=5; a++){
    for(var b=1; b<=5; b++){
    document.write("★")
    }
    document.write("<br>")
}

for(var c=1; c<=25; c++){
    if(c%5==1){
        document.write("☆")
    }else{document.write("★")}
    if(c%5==0){document.write("<br>")}
}