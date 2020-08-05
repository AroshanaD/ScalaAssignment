object Assignment6 {
  import scala.math.sqrt
  import scala.math.pow
  
  def main(args:Array[String])={

    case class Point(a:Int,b:Int){

      def x : Int = a;
      def y : Int = b;

      def +(z:Point) = Point(this.x + z.x, this.y + z.y)

      def move(dx:Int=0,dy:Int=0) = Point(this.x + dx, this.y + dy)
      
      def distance(z:Point): Double = sqrt(pow(this.x - z.x,2) + pow(this.y - z.y,2))

      def invert = Point(this.y, this.x)

    }

    var p1 = Point(1,2)
    var p2 = Point(2,3)
    
    // add p1 and p3
    println(p1+p2)
    //move p2 (2,3) 
    p2 = p2.move(2,3)
    println(p2)
    //distance of p2 from p1
    println(p1.distance(p2))
    //invert p1
    println(p1.invert)
  }
}
