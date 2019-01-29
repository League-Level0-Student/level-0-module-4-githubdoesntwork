void setup(){
       size(800,800);

}

void draw(){
PImage face= loadImage("happy face.png");
face.resize(800,800);
background(face);
fill(255,255,255);
ellipse(285,270,100,160);
if(mouseX<260 && mouseY<250 ){
  fill(0,0,0);
ellipse(260,250,50,70);
}else if(mouseY<250 && mouseX>310){
    fill(0,0,0);
ellipse(310,250,50,70);
}else if(mouseX>310 && mouseY>290){
    fill(0,0,0);
ellipse(310,290,50,70);
}else if(mouseX<260 && mouseY>290){
    fill(0,0,0);
ellipse(260,290,50,70);
}else if(mouseX>260 && mouseX<310 && mouseY>250 && mouseY<290){
    fill(0,0,0);
ellipse(mouseX,mouseY,50,70);
}
}