document.write("<p>問1</p>");

function circle(r,pie=3.14){
    return "半径"+r+"cmの円の面積は、"+ r*r*pie +"cmです";
}

document.write(circle(5));
document.write("<br>");
document.write(circle(7));
document.write("<br>");
document.write(circle(10));


document.write("<p>問2</p>");

function totalprice(group,adult,child){
    return group+"グループの合計金額は、"+(adult*500+child*200)+"円です。" ;
}

document.write(totalprice("A",2,4));
document.write("<br>");
document.write(totalprice("B",1,5));
document.write("<br>");
document.write(totalprice("C",3,7));