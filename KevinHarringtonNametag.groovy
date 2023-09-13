import eu.mihosoft.vrl.v3d.*;
import javafx.scene.text.Font;

Font font = new Font("Arial",  30);

CSG text = CSG.unionAll(
	TextExtrude.text((double)2,"Kevin!",font).collect{
	    it.rotx(180)
	    .toZMin()
     }
)

double width = 30
double depth= 70
double height =3

println "Width is "+width
println "Height is "+height
println "depth is "+depth

CSG nameTagBase = new Cube(width,depth,height).toCSG()

return [nameTagBase,text]