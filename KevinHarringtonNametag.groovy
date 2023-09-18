
CSG text = CSG.text("Kevin!",5)

CSG rotatedText = text.rotz(90)

double distanceyCenter = rotatedText.getCenterY()

println "Center of Word "+distanceyCenter

CSG centeredText  = rotatedText.movey(-distanceyCenter)

double width = 30
double depth= 70
double height =3
double widthOfText = centeredText.getTotalY()+4.0

double scale = depth/widthOfText

CSG scaledText = centeredText.scaley(scale)

double distanceInX = scaledText.getCenterX()
CSG textCenteredInX = scaledText.movex(-distanceInX)

println "Scale for the text "+scale
println "Total text width is "+widthOfText
println "Width is "+width
println "Height is "+height
println "depth is "+depth

CSG nameTagBase = new Cube(width,depth,height).toCSG()

return [nameTagBase,textCenteredInX]